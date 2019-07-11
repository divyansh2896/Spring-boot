package com.insurance.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.app.model.ApplicationPolicy;
@Repository
public interface ApplicationPolicyDao extends JpaRepository<ApplicationPolicy,Integer>
{

}
