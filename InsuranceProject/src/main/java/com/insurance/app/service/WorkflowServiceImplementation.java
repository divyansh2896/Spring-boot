package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.dao.WorkflowDao;
import com.insurance.app.model.Workflow;

@Service
public class WorkflowServiceImplementation implements WorkflowService{

    @Autowired
    WorkflowDao dao;
    
    @Override
    public List<Workflow> getWorkflow() {
        
        return dao.findAll();
    }

    @Override
    public Optional<Workflow> getWorkflowById(int workflow_id) {
        return dao.findById(workflow_id);
    }

    
}
