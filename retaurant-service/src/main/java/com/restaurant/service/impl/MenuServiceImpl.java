package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.MenuRepository;
import com.restaurant.models.MenuDto;
import com.restaurant.service.MenuService;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

	private MenuRepository repo;

	public MenuServiceImpl(MenuRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public MenuDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<MenuDto> findByFood(Integer food_id) {
		return etm_col.apply(repo.findByFood(food_id));
	}

	@Override
	public List<MenuDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<MenuDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public MenuDto save(MenuDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public MenuDto update(MenuDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
