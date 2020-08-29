package com.ass.smtfp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.ass.client.config.DateDSerializer;
import com.ass.smtfp.enums.Gender;
import com.ass.smtfp.enums.SubscriptionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "trainee")
public class TraineeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9011393133388155156L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("first_name")
	@NotNull
	private String firstName;

	@JsonProperty("last_name")
	@NotNull
	private String lastName;

	@JsonProperty("email")
	@NotNull
	private String email;

	@JsonProperty("mob")
	@NotNull
	private Long mob;

	@JsonProperty("address")
	@NotNull
	private AddressDto addressDto;

	@JsonProperty("courses")
	private Set<CommonDto> coursesDto;

	@JsonProperty("cs")
	private Set<Integer> cs = new HashSet<>();

	@JsonProperty("branch")
	@NotNull
	private CommonDto branchDto;

	@JsonProperty("doj")
	@NotNull
	@JsonDeserialize(using = DateDSerializer.class)
	private Date doj;

	@JsonProperty("subscription_type")
	@NotNull
	private SubscriptionType subscriptionType;

	@JsonProperty("due_date")
	@JsonDeserialize(using = DateDSerializer.class)
	private Date dueDate;

	@JsonProperty("gender")
	@NotNull
	private Gender gender;

	@JsonProperty("profile_pic")
	private String profilePic;

	@JsonProperty("discount")
	private Double discount;

	@JsonProperty("active")
	private boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public Set<CommonDto> getCoursesDto() {
		return coursesDto;
	}

	public void setCoursesDto(Set<CommonDto> coursesDto) {
		this.coursesDto = coursesDto;
	}

	public Set<Integer> getCs() {
		return coursesDto != null ? coursesDto.stream().map(c -> c.getId()).collect(Collectors.toSet())
				: new HashSet<>();
	}

	public void setCs(Set<Integer> cs) {
		this.coursesDto = cs.size() > 0 ? cs.stream().map(c -> new CommonDto(c, null, null)).collect(Collectors.toSet())
				: null;
	}

	public CommonDto getBranchDto() {
		return branchDto;
	}

	public void setBranchDto(CommonDto branchDto) {
		this.branchDto = branchDto;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
