package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.StatusRepository;
import com.restaurant.models.StatusDto;
import com.restaurant.service.StatusService;

@Service
@Transactional
public class StatusServiceImpl implements StatusService {

	private StatusRepository repo;

	public StatusServiceImpl(StatusRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public StatusDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<StatusDto> findByName(String name) {
		return etm_col.apply(repo.findByName(name));
	}

	@Override
	public List<StatusDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public StatusDto save(StatusDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public StatusDto update(StatusDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
