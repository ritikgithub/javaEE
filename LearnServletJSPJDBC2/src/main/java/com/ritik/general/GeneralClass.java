package com.ritik.general;

public class GeneralClass {
	private Boolean status;
	private String message;
	public GeneralClass(Boolean status,String message) {
		this.status = status;
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}	
};
