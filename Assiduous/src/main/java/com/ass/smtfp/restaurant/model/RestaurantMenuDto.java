package com.ass.smtfp.restaurant.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class RestaurantMenuDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4124745627604200149L;

	private Integer id;

	private String name;

	private FoodItemDto foodItem;

	private RestaurantDto restaurant;

	public RestaurantMenuDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantMenuDto(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FoodItemDto getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItemDto foodItem) {
		this.foodItem = foodItem;
	}

	public RestaurantDto getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantDto restaurant) {
		this.restaurant = restaurant;
	}

}
