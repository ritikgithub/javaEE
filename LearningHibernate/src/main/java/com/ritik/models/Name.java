package com.ritik.models;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
	
	private String firstname;
	private String lastname;

	@Override
	public String toString() {
		return "Name [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
