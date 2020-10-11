package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.StockRepository;
import com.restaurant.models.StockDto;
import com.restaurant.service.StockService;

@Service
@Transactional
public class StockServiceImpl implements StockService {

	private StockRepository repo;

	public StockServiceImpl(StockRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public StockDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<StockDto> findByFood(Integer food_id) {
		return etm_col.apply(repo.findByFood(food_id));
	}

	@Override
	public List<StockDto> findByRestaurant(Integer res_id) {
		return etm_col.apply(repo.findByRestaurant(res_id));
	}

	@Override
	public List<StockDto> findByFood(Integer food_id, boolean available) {
		return etm_col.apply(repo.findByFood(food_id, available));
	}

	@Override
	public List<StockDto> findByRestaurant(Integer res_id, boolean available) {
		return etm_col.apply(repo.findByRestaurant(res_id, available));
	}

	@Override
	public List<StockDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public StockDto save(StockDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public StockDto update(StockDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
