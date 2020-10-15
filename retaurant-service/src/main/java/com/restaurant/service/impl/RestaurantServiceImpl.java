package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.RestaurantRepository;
import com.restaurant.models.RestaurantDto;
import com.restaurant.service.RestaurantService;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

	private RestaurantRepository repo;

	public RestaurantServiceImpl(RestaurantRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public RestaurantDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public RestaurantDto findByPhone(String phone) {
		return etm.apply(repo.findByPhone(phone).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public RestaurantDto findByMob(Long mob) {
		return etm.apply(repo.findByMob(mob).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public RestaurantDto findByEmail(String email) {
		return etm.apply(repo.findByEmail(email).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<RestaurantDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<RestaurantDto> findByPincode(String pincode) {
		return etm_col.apply(repo.findByPincode(pincode));
	}

	@Override
	public List<RestaurantDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public RestaurantDto save(RestaurantDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public RestaurantDto update(RestaurantDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
