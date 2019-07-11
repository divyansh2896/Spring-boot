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
@Table(name = "Workflow")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate

public class Workflow implements Serializable{

	@Id
	@Column(name = "workflow_id")
	private int workflow_id;
	private int application_id;
	private String assigned_to;
	private String comment;
	private Date creation_time;
	private Date updation_time;

}
