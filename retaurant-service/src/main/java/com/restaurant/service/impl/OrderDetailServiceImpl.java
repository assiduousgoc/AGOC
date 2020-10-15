package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.OrderDetailRepository;
import com.restaurant.models.OrderDetailDto;
import com.restaurant.service.OrderDetailService;

@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService {

	private OrderDetailRepository repo;

	public OrderDetailServiceImpl(OrderDetailRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public OrderDetailDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<OrderDetailDto> findByFood(Integer food_id) {
		return etm_col.apply(repo.findByFood(food_id));
	}

	@Override
	public List<OrderDetailDto> findByOrder(Integer order_id) {
		return etm_col.apply(repo.findByOrder(order_id));
	}

	@Override
	public List<OrderDetailDto> findByOrder(String order_no) {
		return etm_col.apply(repo.findByOrder(order_no));
	}

	@Override
	public List<OrderDetailDto> findByRestaurant(Integer res_id) {
		return etm_col.apply(repo.findByRestaurant(res_id));
	}

	@Override
	public List<OrderDetailDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public OrderDetailDto save(OrderDetailDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public OrderDetailDto update(OrderDetailDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
