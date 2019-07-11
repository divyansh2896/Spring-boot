package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.dao.BasePlanDao;
import com.insurance.app.model.BasePlan;

@Service
public class BasePlanServiceImplementation implements BasePlanService {

    @Autowired
    BasePlanDao dao;

    public Optional<BasePlan> getBasePlanById(int role_id) {
        return dao.findById(role_id);
    }

    public List<BasePlan> getBasePlans() {
        return dao.findAll();
    }

}