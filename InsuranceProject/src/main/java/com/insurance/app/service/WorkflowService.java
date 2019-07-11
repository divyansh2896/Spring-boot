package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import com.insurance.app.model.Workflow;

public interface WorkflowService {
    Optional<Workflow> getWorkflowById(int workflow_id);

    List<Workflow> getWorkflow();

  
}

