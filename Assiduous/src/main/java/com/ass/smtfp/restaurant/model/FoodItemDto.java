package com.ass.smtfp.restaurant.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
public class FoodItemDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1092862330108012064L;

	private Integer id;

	private String name;

	private String desc;

	private Integer qty;

	private Float unitPrice;

	private String uri;

	private FoodTypeDto foodType;

	public FoodItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItemDto(Integer id) {
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public FoodTypeDto getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodTypeDto foodType) {
		this.foodType = foodType;
	}

}
