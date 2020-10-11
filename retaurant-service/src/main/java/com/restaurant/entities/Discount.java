package com.restaurant.entities;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "discounts")
@DynamicUpdate
public class Discount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6746628260793940600L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "amount", nullable = false, updatable = false)
	private Integer amount;

	@Column(name = "start")
	private Date start;

	@Column(name = "end")
	private Date end;

	@ManyToOne
	@JoinColumn(name = "item_id", nullable = false, referencedColumnName = "id")
	private FoodItem foodItem;

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Discount(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public FoodItem getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}

}
