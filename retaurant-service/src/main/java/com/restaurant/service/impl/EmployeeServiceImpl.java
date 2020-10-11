package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.EmployeeRepository;
import com.restaurant.models.EmployeeDto;
import com.restaurant.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository repo;

	public EmployeeServiceImpl(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public EmployeeDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public EmployeeDto findByMob(Long mob) {
		return etm.apply(repo.findByMob(mob).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public EmployeeDto findByEmail(String email) {
		return etm.apply(repo.findByEmail(email).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<EmployeeDto> findByDept(Integer dept_id) {
		return etm_col.apply(repo.findByDept(dept_id));
	}

	@Override
	public List<EmployeeDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public EmployeeDto save(EmployeeDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public EmployeeDto update(EmployeeDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
