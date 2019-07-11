package com.insurance.app.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
 
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import org.springframework.stereotype.Component;
 

 
// Spring jpa jars.
@Entity
@Table(name= "Role")
 
// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class Role implements Serializable{
	
	@Id
	@Column(name="role_id")
	private int role_id;
	private String role_name;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + "]";
	}
	
	

}
