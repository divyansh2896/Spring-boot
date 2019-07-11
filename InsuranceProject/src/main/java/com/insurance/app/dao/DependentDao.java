package com.insurance.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.insurance.app.model.Dependent;
@Repository
public interface DependentDao extends JpaRepository<Dependent,Integer>
{

}
