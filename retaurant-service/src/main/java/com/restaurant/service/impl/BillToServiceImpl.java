package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.BillToRepository;
import com.restaurant.models.BillToDto;
import com.restaurant.service.BillToService;

@Service
@Transactional
public class BillToServiceImpl implements BillToService {

	private BillToRepository repo;

	public BillToServiceImpl(BillToRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public BillToDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<BillToDto> findByBilling(Integer billing_id) {
		return etm_col.apply(repo.findByBilling(billing_id));
	}

	@Override
	public List<BillToDto> findByOrderNo(String order_no) {
		return etm_col.apply(repo.findByOrderNo(order_no));
	}

	@Override
	public List<BillToDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public BillToDto save(BillToDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public BillToDto update(BillToDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
