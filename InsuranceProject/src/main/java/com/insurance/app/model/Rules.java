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
@Table(name = "Rules")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class Rules implements Serializable{

	@Id
	@Column(name = "rule_id")

	private int rule_id;
	private String description;

	public int getRule_id() {
		return rule_id;
	}

	public void setRule_id(int rule_id) {
		this.rule_id = rule_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Rules [rule_id=" + rule_id + ", description=" + description + "]";
	}

}
