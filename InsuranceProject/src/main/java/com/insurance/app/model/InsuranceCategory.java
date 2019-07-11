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
@Table(name= "Insurance_category")
 
// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class InsuranceCategory implements Serializable{
	
	@Id
	@Column(name="insurance_id")
	
	private int insurance_id;
	private String insurance_type;
	private String description;
	public int getInsurance_id() {
		return insurance_id;
	}
	public void setInsurance_id(int insurance_id) {
		this.insurance_id = insurance_id;
	}
	public String getInsurance_type() {
		return insurance_type;
	}
	public void setInsurance_type(String insurance_type) {
		this.insurance_type = insurance_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "InsuranceCategory [insurance_id=" + insurance_id + ", insurance_type=" + insurance_type
				+ ", description=" + description + "]";
	}
	

}
