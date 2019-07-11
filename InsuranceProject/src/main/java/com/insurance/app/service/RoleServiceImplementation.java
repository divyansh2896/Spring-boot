package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.dao.RoleDao;
import com.insurance.app.model.Role;

@Service
public class RoleServiceImplementation implements RoleService {

    @Autowired
    RoleDao dao;

    public Optional<Role> getRoleById(int role_id) {
        return dao.findById(role_id);
    }

    public List<Role> getRoles() {
        return dao.findAll();
    }

}
