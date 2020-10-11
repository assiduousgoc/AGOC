package com.authentication.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "user_roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "role_name" }) })
@DynamicUpdate
public class UserRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4129458558187775666L;

	private Integer id;

	private String roleName;

	private String description;

	private Set<Users> users;

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRole(Integer id) {
		super();
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "role_name", nullable = false, length = 25)
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}

}
