package com.insurance.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.app.model.Workflow;

@Repository
public interface WorkflowDao extends JpaRepository<Workflow, Integer> {

   
}