package com.insurance.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;



// Spring jpa jars.
@Entity
@Table(name = "Dependent")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class Dependent implements Serializable{
	@Id
	@Column(name = "dependent_id")

	private int dependent_id;
	private int user_id;
	private String dependent_name;
	private Date doB;
	private String city;
	private String state;
	private String address;
	private String relation;

	public int getDependent_id() {
		return dependent_id;
	}

	public void setDependent_id(int dependent_id) {
		this.dependent_id = dependent_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getDependent_name() {
		return dependent_name;
	}

	public void setDependent_name(String dependent_name) {
		this.dependent_name = dependent_name;
	}

	public Date getDoB() {
		return doB;
	}

	public void setDoB(Date doB) {
		this.doB = doB;
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

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public String toString() {
		return "Dependent [dependent_id=" + dependent_id + ", user_id=" + user_id + ", dependent_name=" + dependent_name
				+ ", doB=" + doB + ", city=" + city + ", state=" + state + ", address=" + address + ", relation="
				+ relation + "]";
	}

}
