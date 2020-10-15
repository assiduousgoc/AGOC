package com.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "order_details")
@DynamicUpdate
public class OrderDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6132310029885285774L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "food_id", nullable = false, referencedColumnName = "id")
	private FoodItem foodItem;

	@ManyToOne
	@JoinColumn(name = "restaurant_id", nullable = false, referencedColumnName = "id")
	private Restaurant restaurant;

	@Column(name = "qty", nullable = false)
	private Integer qty;

	@Column(name = "amount", nullable = false)
	private Float amount;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id")
	private Order order;

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(Integer id) {
		super();
		this.id = id;
	}

	public OrderDetail(FoodItem foodItem, Restaurant restaurant, Integer qty, Float amount) {
		super();
		this.foodItem = foodItem;
		this.restaurant = restaurant;
		this.qty = qty;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FoodItem getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderDetail withOrder(Order order) {
		this.order = order;
		return this;
	}

}
