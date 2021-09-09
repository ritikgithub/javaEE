package com.ritik.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int person_id;
	private String person_name;
	public int getPerson_id() {
		return person_id;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	
}
