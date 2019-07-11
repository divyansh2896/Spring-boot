package com.insurance.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.insurance.app.model.BasePlan;
@Repository
public interface BasePlanDao extends JpaRepository<BasePlan,Integer>
{

}
