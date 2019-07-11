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
@Table(name= "Base_plan")
 
// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class BasePlan implements Serializable{
	
	@Id
	@Column(name="baseplan_id")
	private int baseplan_id;
	private int insurance_id;
	private int sum_assured;
	private int max_age;
	private int min_age;
	private int max_dependents;
	private String description;
	public int getInsurance_id() {
		return insurance_id;
	}
	public void setInsurance_id(int insurance_id) {
		this.insurance_id = insurance_id;
	}
	public int getBaseplan_id() {
		return baseplan_id;
	}
	public void setBaseplan_id(int baseplan_id) {
		this.baseplan_id = baseplan_id;
	}
	public int getSum_assured() {
		return sum_assured;
	}
	public void setSum_assured(int sum_assured) {
		this.sum_assured = sum_assured;
	}
	public int getMax_age() {
		return max_age;
	}
	public void setMax_age(int max_age) {
		this.max_age = max_age;
	}
	public int getMin_age() {
		return min_age;
	}
	public void setMin_age(int min_age) {
		this.min_age = min_age;
	}
	public int getMax_dependents() {
		return max_dependents;
	}
	public void setMax_dependents(int max_dependents) {
		this.max_dependents = max_dependents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "BasePlan [insurance_id=" + insurance_id + ", baseplan_id=" + baseplan_id + ", sum_assured="
				+ sum_assured + ", max_age=" + max_age + ", min_age=" + min_age + ", max_dependents=" + max_dependents
				+ ", description=" + description + "]";
	}
	
	
	
	
	

}
