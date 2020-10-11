package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.RestaurantMenuRepository;
import com.restaurant.models.RestaurantMenuDto;
import com.restaurant.service.RestaurantMenuService;

@Service
@Transactional
public class RestaurantMenuServiceImpl implements RestaurantMenuService {

	private RestaurantMenuRepository repo;

	public RestaurantMenuServiceImpl(RestaurantMenuRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public RestaurantMenuDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<RestaurantMenuDto> findByRestaurant(Integer res_id) {
		return etm_col.apply(repo.findByRestaurant(res_id));
	}

	@Override
	public List<RestaurantMenuDto> findByFood(Integer food_id) {
		return etm_col.apply(repo.findByFood(food_id));
	}

	@Override
	public List<RestaurantMenuDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<RestaurantMenuDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public RestaurantMenuDto save(RestaurantMenuDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public RestaurantMenuDto update(RestaurantMenuDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
