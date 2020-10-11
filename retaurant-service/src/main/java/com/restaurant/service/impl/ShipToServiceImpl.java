package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.ShipToRepository;
import com.restaurant.models.ShipToDto;
import com.restaurant.service.ShipToService;

@Service
@Transactional
public class ShipToServiceImpl implements ShipToService {

	private ShipToRepository repo;

	public ShipToServiceImpl(ShipToRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public ShipToDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<ShipToDto> findByBilling(Integer bill_id) {
		return etm_col.apply(repo.findByBilling(bill_id));
	}

	@Override
	public List<ShipToDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public ShipToDto save(ShipToDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public ShipToDto update(ShipToDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
