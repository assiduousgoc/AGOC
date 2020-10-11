package com.restaurant.service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.dcs.common.util.MapperInstance;
import com.restaurant.entities.Billing;
import com.restaurant.entities.Customer;
import com.restaurant.entities.Order;
import com.restaurant.entities.Payment;
import com.restaurant.entities.PaymentType;
import com.restaurant.models.BillingDto;
import com.restaurant.models.CustomerDto;
import com.restaurant.models.OrderDto;
import com.restaurant.models.PaymentDto;
import com.restaurant.models.PaymentTypeDto;

public interface PaymentService {

	PaymentDto findById(Integer id);

	List<PaymentDto> findByOrder(Integer order_id);

	List<PaymentDto> findByBilling(Integer bill_id);

	List<PaymentDto> findByCustomer(Integer cust_id);

	List<PaymentDto> findAll();

	PaymentDto save(PaymentDto dto);

	PaymentDto update(PaymentDto dto);

	void delete(Integer id);

	static Payment toEntity(PaymentDto dto) {
		Payment entity = new Payment();
		entity.setBill(MapperInstance.getModelMapper().map(dto.getBill(), Billing.class));
		entity.setCustomer(MapperInstance.getModelMapper().map(dto.getCustomer(), Customer.class));
		entity.setOrder(MapperInstance.getModelMapper().map(dto.getOrder(), Order.class));
		entity.setPayType(MapperInstance.getModelMapper().map(dto.getPayType(), PaymentType.class));
		MapperInstance.getModelMapper().map(dto, entity);
		return entity;
	}

	static PaymentDto toDto(Payment entity) {
		PaymentDto dto = new PaymentDto();
		dto.setBill(MapperInstance.getModelMapper().map(entity.getBill(), BillingDto.class));
		dto.setCustomer(MapperInstance.getModelMapper().map(entity.getCustomer(), CustomerDto.class));
		dto.setOrder(MapperInstance.getModelMapper().map(entity.getOrder(), OrderDto.class));
		dto.setPayType(MapperInstance.getModelMapper().map(entity.getPayType(), PaymentTypeDto.class));
		MapperInstance.getModelMapper().map(entity, dto);
		return dto;
	}

	Function<PaymentDto, Payment> mte = (dto) -> {
		return toEntity(dto);
	};

	Function<Payment, PaymentDto> etm = (en) -> {
		return toDto(en);
	};

	Function<List<PaymentDto>, List<Payment>> mte_col = (dto) -> {
		return dto.stream().map(d -> mte.apply(d)).collect(Collectors.toList());
	};

	Function<Iterable<Payment>, List<PaymentDto>> etm_col = (en) -> {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(en.iterator(), Spliterator.ORDERED), false)
				.map(d -> etm.apply(d)).collect(Collectors.toList());
	};

}
