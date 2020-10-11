package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.PaymentTypeRepository;
import com.restaurant.models.PaymentTypeDto;
import com.restaurant.service.PaymentTypeService;

@Service
@Transactional
public class PaymentTypeServiceImpl implements PaymentTypeService {

	private PaymentTypeRepository repo;

	public PaymentTypeServiceImpl(PaymentTypeRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public PaymentTypeDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<PaymentTypeDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<PaymentTypeDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public PaymentTypeDto save(PaymentTypeDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public PaymentTypeDto update(PaymentTypeDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
