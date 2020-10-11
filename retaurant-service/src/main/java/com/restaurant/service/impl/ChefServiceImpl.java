package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.ChefRepository;
import com.restaurant.models.ChefDto;
import com.restaurant.service.ChefService;

@Service
@Transactional
public class ChefServiceImpl implements ChefService {

	private ChefRepository repo;

	public ChefServiceImpl(ChefRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public ChefDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<ChefDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<ChefDto> findByRestaurant(String res_id) {
		return etm_col.apply(repo.findByRestaurant(res_id));
	}

	@Override
	public List<ChefDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public ChefDto save(ChefDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public ChefDto update(ChefDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
