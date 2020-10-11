package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.DiscountRepository;
import com.restaurant.models.DiscountDto;
import com.restaurant.service.DiscountService;

@Service
@Transactional
public class DiscountServiceImpl implements DiscountService {

	private DiscountRepository repo;

	public DiscountServiceImpl(DiscountRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public DiscountDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<DiscountDto> findByFood(Integer food_id) {
		return etm_col.apply(repo.findByFood(food_id));
	}

	@Override
	public List<DiscountDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public DiscountDto save(DiscountDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public DiscountDto update(DiscountDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
