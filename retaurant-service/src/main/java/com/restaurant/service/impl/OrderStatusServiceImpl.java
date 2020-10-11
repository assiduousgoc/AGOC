package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.OrderStatusRepository;
import com.restaurant.models.OrderStatusDto;
import com.restaurant.service.OrderStatusService;

@Service
@Transactional
public class OrderStatusServiceImpl implements OrderStatusService {

	private OrderStatusRepository repo;

	public OrderStatusServiceImpl(OrderStatusRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public OrderStatusDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<OrderStatusDto> findByOrder(Integer order_id) {
		return etm_col.apply(repo.findByOrder(order_id));
	}

	@Override
	public List<OrderStatusDto> findByStatus(Integer status_id) {
		return etm_col.apply(repo.findByStatus(status_id));
	}

	@Override
	public List<OrderStatusDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public OrderStatusDto save(OrderStatusDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public OrderStatusDto update(OrderStatusDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
