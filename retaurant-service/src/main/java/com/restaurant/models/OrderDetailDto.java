package com.restaurant.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class OrderDetailDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6132310029885285774L;

	private Integer id;

	private FoodItemDto foodItem;

	private RestaurantDto restaurantDto;

	private Integer qty;

	private Float amount;

	private OrderDto order;

	public OrderDetailDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetailDto(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FoodItemDto getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItemDto foodItem) {
		this.foodItem = foodItem;
	}

	public RestaurantDto getRestaurantDto() {
		return restaurantDto;
	}

	public void setRestaurantDto(RestaurantDto restaurantDto) {
		this.restaurantDto = restaurantDto;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

}
