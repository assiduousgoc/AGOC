package com.ass.smtfp.model;

import java.io.InputStream;

public class ResourceResult {

	private InputStream resource;

	private String resourceName;

	public ResourceResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceResult(InputStream resource, String resourceName) {
		super();
		this.resource = resource;
		this.resourceName = resourceName;
	}

	public InputStream getResource() {
		return resource;
	}

	public void setResource(InputStream resource) {
		this.resource = resource;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
}
