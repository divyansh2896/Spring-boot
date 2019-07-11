package com.insurance.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.app.model.User;

@Repository
public interface InsuranceDao extends JpaRepository<User, Integer> {

}
