package com.assiduous.gym.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.dcs.common.constant.CommonConstant;
import com.dcs.validation.annotation.Validate;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "gst")
public class GstDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5725492165917930218L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("gst_no")
	@Validate(regex = CommonConstant.RegexPatternConstant.GST_REGEX)
	private String gstNo;

	@JsonProperty("remark")
	private String remark;

	@JsonProperty("gym")
	private CommonDto gymDto;

	@JsonProperty("active")
	private boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CommonDto getGymDto() {
		return gymDto;
	}

	public void setGymDto(CommonDto gymDto) {
		this.gymDto = gymDto;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
