package com.insurance.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.app.model.InsuranceCategory;
@Repository
public interface InsuranceCategoryDao extends JpaRepository<InsuranceCategory,Integer>
{

}

