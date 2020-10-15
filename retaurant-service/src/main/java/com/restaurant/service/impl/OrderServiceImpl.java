package com.restaurant.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.BillToRepository;
import com.restaurant.dao.BillingRepository;
import com.restaurant.dao.CustomerRepository;
import com.restaurant.dao.DiscountRepository;
import com.restaurant.dao.OrderDetailRepository;
import com.restaurant.dao.OrderRepository;
import com.restaurant.dao.ShipToRepository;
import com.restaurant.enm.OrderStatusType;
import com.restaurant.enm.PayType;
import com.restaurant.enm.TaxApplicationType;
import com.restaurant.entities.BillTo;
import com.restaurant.entities.Billing;
import com.restaurant.entities.Customer;
import com.restaurant.entities.FoodItem;
import com.restaurant.entities.Order;
import com.restaurant.entities.OrderDetail;
import com.restaurant.entities.Restaurant;
import com.restaurant.entities.ShipTo;
import com.restaurant.models.CustomerOrder;
import com.restaurant.models.OrderDto;
import com.restaurant.models.StockDto;
import com.restaurant.models.TaxDto;
import com.restaurant.service.OrderService;
import com.restaurant.service.StockService;
import com.restaurant.util.RestaurantUtil;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	private OrderRepository repo;

	private BillingRepository bill_repo;

	private BillToRepository bill_to_repo;

	private ShipToRepository ship_to_repo;

	private OrderDetailRepository order_detail_repo;

	private StockService stock_service;

	private CustomerRepository cust_repo;

	private DiscountRepository dis_repo;

	Semaphore sem = new Semaphore(1);

	public OrderServiceImpl(OrderRepository repo, BillingRepository bill_repo, BillToRepository bill_to_repo,
			ShipToRepository ship_to_repo, OrderDetailRepository order_detail_repo, StockService stock_service,
			CustomerRepository cust_repo, DiscountRepository dis_repo) {
		super();
		this.repo = repo;
		this.bill_repo = bill_repo;
		this.bill_to_repo = bill_to_repo;
		this.ship_to_repo = ship_to_repo;
		this.order_detail_repo = order_detail_repo;
		this.stock_service = stock_service;
		this.cust_repo = cust_repo;
		this.dis_repo = dis_repo;
	}

	@Override
	public OrderDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public OrderDto findByOrderNo(String order_no) {
		return etm.apply(repo.findByOrderNo(order_no).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<OrderDto> findByCustomer(Integer cust_id) {
		return etm_col.apply(repo.findByCustomer(cust_id));
	}

	@Override
	public List<OrderDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public OrderDto save(CustomerOrder dto, Long mob) throws Exception {
		sem.acquire(1);
		Customer cust = cust_repo.findByMob(mob).orElseThrow(() -> new RuntimeException());
		Map<Integer, Integer> food_id = dto.getOrder().stream()
				.collect(Collectors.toMap(o -> o.getItem_id(), o -> o.getQty()));
		List<OrderDetail> order_details = new ArrayList<>();
		Map<Integer, Integer> dran_stock = new HashMap<>();
		for (Map.Entry<Integer, Integer> map : food_id.entrySet()) {
			List<StockDto> stock = stock_service.findByFood(map.getKey(), true);
			Integer res_id = stock.stream().filter(s -> {
				String address1 = cust.getAddress1();
				String address2 = cust.getAddress2();
				String cust_pin = RestaurantUtil.findPincode(address1);
				if (dto.getShipTo() == 2)
					if (address2 != null && !address2.isEmpty())
						cust_pin = RestaurantUtil.findPincode(address2);

				String res_pin = RestaurantUtil.findPincode(s.getRestaurant().getAddress());
				dran_stock.put(s.getId(), map.getValue());
				return res_pin.equals(cust_pin);
			}).map(s -> s.getRestaurant().getId()).findFirst().orElse(stock.stream().map(s -> {
				dran_stock.put(s.getId(), map.getValue());
				return s.getRestaurant().getId();
			}).findFirst().get());
			Float price = stock.get(0).getFoodItem().getUnitPrice();
			TaxDto tax = stock.get(0).getFoodItem().getTaxDto();
			Float amount = price + (tax.getApplicationType().equals(TaxApplicationType.FLAT) ? tax.getValue()
					: (price * tax.getValue() / 100));
			order_details
					.add(new OrderDetail(new FoodItem(map.getKey()), new Restaurant(res_id), map.getValue(), amount));
		}
		Order order = new Order();
		order.setCustomer(cust);
		order.setOrderDate(new Date());
		if (dto.getPayType().equals(PayType.OTHER))
			order.setStatus(OrderStatusType.PENDING);
		else
			order.setStatus(OrderStatusType.CONFIRM);
		order.setOrderNo(getOrderNumber());
		Order result = repo.save(order);
		order_detail_repo.saveAll(order_details.stream().map(o -> o.withOrder(result)).collect(Collectors.toList()));
		Integer discount = dis_repo.findByItems(food_id.keySet());
		Float total = order_details.stream().map(o -> o.getAmount()).reduce(Float::sum).get();
		Billing billing = bill_repo.save(new Billing(total - discount, discount, new Date(), result));
		BillTo bill_to = new BillTo();
		bill_to.setBilling(billing);
		bill_to.setBillingAddress(cust.getAddress1());
		if (dto.getBillTo() == 2)
			bill_to.setBillingAddress(cust.getAddress2());
		ShipTo ship = new ShipTo();
		ship.setShipingAddress(cust.getAddress1());
		if (dto.getShipTo() == 2)
			ship.setShipingAddress(cust.getAddress2());
		ship.setBilling(billing);
		bill_to_repo.save(bill_to);
		ship_to_repo.save(ship);
		sem.release(1);
		return etm.apply(result);
	}

	@Override
	public OrderDto update(OrderDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public OrderDto update_status(Integer id, OrderStatusType status) {
		Order o = repo.findById(id).orElseThrow(() -> new RuntimeException());
		o.setStatus(status);
		return etm.apply(repo.save(o));
	}

}
