package com.insurance.app.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;



// Spring jpa jars.
@Entity
@Table(name = "User")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class User implements Serializable{

	@Id
	@Column(name = "user_id")
	private int user_id;
	private String name;
	private String email;
	private String password;
	private String city;
	private String state;
	private String address;
	private Date doB;
	private int mob_no;
	private int role_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDoB() {
		return doB;
	}

	public void setDoB(Date doB) {
		this.doB = doB;
	}

	public int getMob_no() {
		return mob_no;
	}

	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password + ", city="
				+ city + ", state=" + state + ", address=" + address + ", doB=" + doB + ", mob_no=" + mob_no
				+ ", role_id=" + role_id + "]";
	}

}
