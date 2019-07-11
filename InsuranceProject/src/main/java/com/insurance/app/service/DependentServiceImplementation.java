package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.dao.DependentDao;
import com.insurance.app.model.Dependent;

@Service
public class DependentServiceImplementation implements DependentService{

    @Autowired
    DependentDao dao;
    
    
    public Optional<Dependent> getDependentById(int dependent_id) {
        return dao.findById(dependent_id);
    }

        
    public List<Dependent> getDependents() {
        return dao.findAll();
    }

   
    public Dependent addNewDependent(Dependent adddependent) {
        return dao.save(adddependent);
    }

    
    public Dependent updateDependent(Dependent updatedependent) {
        return dao.save(updatedependent);
    }

    public void deleteDependentById(int dependent_id) {
        dao.deleteById(dependent_id);
    }

}
