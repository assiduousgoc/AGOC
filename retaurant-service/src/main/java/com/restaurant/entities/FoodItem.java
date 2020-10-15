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
@Table(name = "food_items")
@DynamicUpdate
public class FoodItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1092862330108012064L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "description", nullable = false, length = 200)
	private String desc;

	@Column(name = "qty", nullable = false, length = 100)
	private Integer qty;

	@Column(name = "u_price", nullable = false)
	private Float unitPrice;

	@Column(name = "uri", length = 200)
	private String uri;

	@ManyToOne
	@JoinColumn(name = "type_id", nullable = false, referencedColumnName = "id")
	private FoodType foodType;

	@ManyToOne
	@JoinColumn(name = "tax_id", nullable = false, referencedColumnName = "id")
	private Tax tax;

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItem(Integer id) {
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

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

}
