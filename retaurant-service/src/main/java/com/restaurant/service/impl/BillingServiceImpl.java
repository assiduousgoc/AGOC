package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.dao.BillingRepository;
import com.restaurant.models.BillingDto;
import com.restaurant.service.BillingService;

@Service
@Transactional
public class BillingServiceImpl implements BillingService {

	private BillingRepository repo;

	public BillingServiceImpl(BillingRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public BillingDto findById(Integer id) {
		return etm.apply(repo.findById(id).orElseThrow(() -> new RuntimeException()));
	}

	@Override
	public List<BillingDto> findByOrderId(Integer order_id) {
		return etm_col.apply(repo.findByOrderId(order_id));
	}

	@Override
	public List<BillingDto> findByOrderNo(String order_no) {
		return etm_col.apply(repo.findByOrderNo(order_no));
	}

	@Override
	public List<BillingDto> findAll() {
		return etm_col.apply(repo.findAll());
	}

	@Override
	public BillingDto save(BillingDto dto) {
		return etm.apply(repo.save(mte.apply(dto)));
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
