package com.ritik.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Embeddable
public class Laptop {
//	@Id
	private int lid;
	public int getLid() {
		return lid;
	}
//	@ManyToMany
//	private List<Student> students = new ArrayList<Student>();
	
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLapt_name() {
		return lapt_name;
	}
//	@Override
//	public String toString() {
//		return "Laptop [lid=" + lid + ", students=" + students + ", lapt_name=" + lapt_name + "]";
//	}
	public void setLapt_name(String lapt_name) {
		this.lapt_name = lapt_name;
	}
	
	private String lapt_name;
	
//	public List<Student> getStudents() {
//		return students;
//	}
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
	
	
}
