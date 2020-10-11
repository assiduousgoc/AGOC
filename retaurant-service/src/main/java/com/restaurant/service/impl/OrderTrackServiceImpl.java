package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.OrderTrackRepository;
import com.restaurant.models.OrderTrackDto;
import com.restaurant.service.OrderTrackService;

@Service
@Transactional
public class OrderTrackServiceImpl implements OrderTrackService {

	private OrderTrackRepository repo;

	public OrderTrackServiceImpl(OrderTrackRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public OrderTrackDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<OrderTrackDto> findByOrder(Integer order_id) {
		return etm_col.apply(repo.findByOrder(order_id));
	}

	@Override
	public List<OrderTrackDto> findByAssignTo(Integer emp_id) {
		return etm_col.apply(repo.findByAssignTo(emp_id));
	}

	@Override
	public List<OrderTrackDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public OrderTrackDto save(OrderTrackDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public OrderTrackDto update(OrderTrackDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
