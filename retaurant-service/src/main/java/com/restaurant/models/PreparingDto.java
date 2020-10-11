package com.restaurant.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class PreparingDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3616594000105039912L;

	private Integer id;

	private FoodItemDto foodItem;

	private ChefDto chef;

	public PreparingDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreparingDto(Integer id) {
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

	public ChefDto getChef() {
		return chef;
	}

	public void setChef(ChefDto chef) {
		this.chef = chef;
	}

}
