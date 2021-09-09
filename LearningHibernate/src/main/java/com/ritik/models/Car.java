package com.ritik.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQuery;

@Entity
//@NamedQuery(name = "Car.ByColor", query = "select name,color  from Car where color=:color")
@NamedNativeQuery(name = "Car", query = "select * from car", resultClass = Car.class)
public class Car {
	@Id @GeneratedValue
	private int id;
	private String name;
	private String color;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
