package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.DepartmentRepository;
import com.restaurant.models.DepartmentDto;
import com.restaurant.service.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository repo;

	public DepartmentServiceImpl(DepartmentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public DepartmentDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public DepartmentDto findByCode(String code) {
		return etm.apply(repo.findByCode(code).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<DepartmentDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public DepartmentDto save(DepartmentDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public DepartmentDto update(DepartmentDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
