package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.OrderRepository;
import com.restaurant.models.OrderDto;
import com.restaurant.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	private OrderRepository repo;

	public OrderServiceImpl(OrderRepository repo) {
		super();
		this.repo = repo;
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
	public List<OrderDto> findByRestaurant(Integer res_id) {
		return etm_col.apply(repo.findByRestaurant(res_id));
	}

	@Override
	public List<OrderDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public OrderDto save(OrderDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public OrderDto update(OrderDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
