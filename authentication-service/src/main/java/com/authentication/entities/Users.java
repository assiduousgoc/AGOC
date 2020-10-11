package com.authentication.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicUpdate;

import com.authentication.enm.UserType;
import com.authentication.loc.entities.Address;
import com.authentication.loc.entities.Location;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_name", "email" }),
		@UniqueConstraint(columnNames = { "mob" }) })
@DynamicUpdate
public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1760166461597746601L;

	private Integer id;

	private String userName;

	private String firstName;

	private String lastName;

	private String email;

	private String password;

	private Long mob;

	private Set<UserRole> roles;

	private Set<Module> modules;

	private Address address;

	private Location loc;

	private UserType userType;

	private String deviceId;

	private String imeiNo;

	private boolean active;

	private Integer updateBy;

	private Date updatedOn = new Date();

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Integer id) {
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

	@Column(name = "user_name", nullable = false, updatable = false, length = 50)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "first_name", nullable = false, length = 100)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 100)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 64)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "mob", nullable = false, length = 10)
	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "users_roles", joinColumns = {
			@JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", nullable = false, referencedColumnName = "id") })
	public Set<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<UserRole> roles) {
		this.roles = roles;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "users_modules", joinColumns = {
			@JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "module_id", nullable = false, referencedColumnName = "id") })
	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", nullable = false, referencedColumnName = "id")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@ManyToOne
	@JoinColumn(name = "l_id", referencedColumnName = "id")
	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "user_type", length = 20, nullable = false)
	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Column(name = "device_id", length = 50)
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "imei_no", length = 50)
	public String getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "updated_by", nullable = false, columnDefinition = "integer default 1")
	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Users withUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	@Column(name = "updated_on", nullable = false, columnDefinition = "datetime default CURRENT_TIMESTAMP")
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
