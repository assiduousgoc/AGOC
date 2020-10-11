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
@Table(name = "preparings")
@DynamicUpdate
public class Preparing implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3616594000105039912L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "food_id", nullable = false, referencedColumnName = "id")
	private FoodItem foodItem;

	@ManyToOne
	@JoinColumn(name = "chef_id", nullable = false, referencedColumnName = "id")
	private Chef chef;

	public Preparing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preparing(Integer id) {
		super();
		this.id = id;
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

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

}
