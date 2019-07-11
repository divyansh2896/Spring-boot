package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import com.insurance.app.model.BasePlan;

public interface BasePlanService {
    
    Optional<BasePlan> getBasePlanById(int baseplan_id);

    List<BasePlan> getBasePlans();

}