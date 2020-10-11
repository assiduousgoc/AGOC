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
@Table(name = "orders")
@DynamicUpdate
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5872550036164304927L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Column(name = "order_no", nullable = false, length = 20, unique = true)
	private String orderNo;

	@Column(name = "order_date", nullable = false)
	private Date orderDate;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "restaurant_id", nullable = false, referencedColumnName = "id")
	private Restaurant restaurant;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
