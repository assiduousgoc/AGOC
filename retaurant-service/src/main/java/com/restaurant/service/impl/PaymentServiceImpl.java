package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.PaymentRepository;
import com.restaurant.enm.OrderStatusType;
import com.restaurant.models.PaymentDto;
import com.restaurant.service.OrderService;
import com.restaurant.service.PaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	private PaymentRepository repo;

	private OrderService o_service;

	public PaymentServiceImpl(PaymentRepository repo, OrderService o_service) {
		super();
		this.repo = repo;
		this.o_service = o_service;
	}

	@Override
	public PaymentDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<PaymentDto> findByOrder(Integer order_id) {
		return etm_col.apply(repo.findByOrder(order_id));
	}

	@Override
	public List<PaymentDto> findByBilling(Integer bill_id) {
		return etm_col.apply(repo.findByBilling(bill_id));
	}

	@Override
	public List<PaymentDto> findByCustomer(Integer cust_id) {
		return etm_col.apply(repo.findByCustomer(cust_id));
	}

	@Override
	public List<PaymentDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public PaymentDto save(PaymentDto dto) {
		o_service.update_status(dto.getOrder().getId(), OrderStatusType.CONFIRM);
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public PaymentDto update(PaymentDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
