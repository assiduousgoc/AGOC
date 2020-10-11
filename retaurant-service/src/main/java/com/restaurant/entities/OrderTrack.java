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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "order_tracks")
@DynamicUpdate
public class OrderTrack implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6595685729416889663L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;

	@Temporal(TemporalType.TIME)
	@Column(name = "estimated_time")
	private Date estimatedTime;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "assign_to", nullable = false, referencedColumnName = "id")
	private Employee assignTo;

	public OrderTrack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderTrack(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(Date estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Employee getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(Employee assignTo) {
		this.assignTo = assignTo;
	}

}
