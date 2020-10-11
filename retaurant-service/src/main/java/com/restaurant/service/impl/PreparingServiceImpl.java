package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.PreparingRepository;
import com.restaurant.models.PreparingDto;
import com.restaurant.service.PreparingService;

@Service
@Transactional
public class PreparingServiceImpl implements PreparingService {

	private PreparingRepository repo;

	public PreparingServiceImpl(PreparingRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public PreparingDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<PreparingDto> findByFood(Integer food_id) {
		return etm_col.apply(repo.findByFood(food_id));
	}

	@Override
	public List<PreparingDto> findByChef(Integer chef_id) {
		return etm_col.apply(repo.findByChef(chef_id));
	}

	@Override
	public List<PreparingDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public PreparingDto save(PreparingDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public PreparingDto update(PreparingDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
