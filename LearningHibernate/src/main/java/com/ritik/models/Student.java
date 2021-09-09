package com.ritik.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;






@Entity
public class Student {
	@Id
	private int rollno;
	private String stud_name;
	
	@ElementCollection
	private List<Laptop> laptops = new ArrayList<Laptop>();
	public int getRollno() {
		return rollno;
	}
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stud_name=" + stud_name + ", laptops=" + laptops + "]";
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	
	public String getName() {
		return stud_name;
	}
	public void setName(String stud_name) {
		this.stud_name = stud_name;
	}
	

	
	
	

}
