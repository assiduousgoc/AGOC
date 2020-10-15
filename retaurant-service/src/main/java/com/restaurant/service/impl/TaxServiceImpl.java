package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.TaxRepository;
import com.restaurant.models.TaxDto;
import com.restaurant.service.TaxService;

@Service
@Transactional
public class TaxServiceImpl implements TaxService {

	private TaxRepository repo;

	public TaxServiceImpl(TaxRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public TaxDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<TaxDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<TaxDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public TaxDto save(TaxDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public TaxDto update(TaxDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
