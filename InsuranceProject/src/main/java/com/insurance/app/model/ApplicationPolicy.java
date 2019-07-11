package com.insurance.app.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.springframework.stereotype.Component;


// Spring jpa jars.
@Entity
@Table(name = "Application_policy")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class ApplicationPolicy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	
	@Column(name = "application_id")
	private int application_id;
	private int user_id;
	private String status;
	// private json details;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ApplicationPolicy [application_id=" + application_id + ", user_id=" + user_id + ", status=" + status
				+ "]";
	}

	/**
	 * public json getDetails() { return details; }
	 * 
	 * public void setDetails(json details) { this.details = details; }
	 */



}
