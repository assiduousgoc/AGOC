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
@Table(name = "order_status")
@DynamicUpdate
public class OrderStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3024156240804814431L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "status_id", nullable = false, referencedColumnName = "id")
	private Status status;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id")
	private Order order;

	public OrderStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderStatus(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
