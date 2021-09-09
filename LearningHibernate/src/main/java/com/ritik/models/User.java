package com.ritik.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "User_table")
public class User {
	
	@Id
	private int id;
	@Column(name="name_column")
	private Name name;
	private String username;
	@ManyToMany(mappedBy = "users")
//	@JoinTable(name = "User_vechicles", joinColumns = @JoinColumn(name="User_Id"), inverseJoinColumns =@JoinColumn(name="vehicle_id"))
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + "]";
	}
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
