package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.CustomerRepository;
import com.restaurant.models.CustomerDto;
import com.restaurant.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository repo;

	public CustomerServiceImpl(CustomerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public CustomerDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public CustomerDto findByMob(Long mob) {
		return etm.apply(repo.findByMob(mob).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<CustomerDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<CustomerDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public CustomerDto save(CustomerDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public CustomerDto update(CustomerDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
