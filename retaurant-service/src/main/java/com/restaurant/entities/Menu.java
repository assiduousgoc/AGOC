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
@Table(name = "menus")
@DynamicUpdate
public class Menu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4124745627604200149L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@ManyToOne
	@JoinColumn(name = "food_id", nullable = false, referencedColumnName = "id")
	private FoodItem foodItem;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(Integer id) {
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

	public FoodItem getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}

}
