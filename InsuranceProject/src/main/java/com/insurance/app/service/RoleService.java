package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import com.insurance.app.model.Role;

public interface RoleService {
    
    Optional<Role> getRoleById(int role_id);

    List<Role> getRoles();

}
