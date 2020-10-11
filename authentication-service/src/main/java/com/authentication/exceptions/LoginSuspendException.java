package com.authentication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Login has been suspended", code = HttpStatus.FORBIDDEN)
public class LoginSuspendException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 119655897670504436L;

	private String errorCode;

	private String message;

	private String description;

	public LoginSuspendException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginSuspendException(String errorCode, String message, String description) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.description = description;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
