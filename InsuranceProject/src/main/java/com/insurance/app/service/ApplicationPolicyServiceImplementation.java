package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.dao.ApplicationPolicyDao;
import com.insurance.app.model.ApplicationPolicy;

@Service
public class ApplicationPolicyServiceImplementation implements ApplicationPolicyService {

    @Autowired
    ApplicationPolicyDao dao;

    public List<ApplicationPolicy> getApplications() {
        return dao.findAll();
    }

    public Optional<ApplicationPolicy> getApplicationById(int application_id) {
        return dao.findById(application_id);
    }

    public ApplicationPolicy addNewApplication(ApplicationPolicy addapplication) {
        return dao.save(addapplication);
    }

    public ApplicationPolicy updateApplication(ApplicationPolicy updateapplication) {
        return dao.save(updateapplication);
    }

    public void deleteApplicationById(int application_id) {
        dao.deleteById(application_id);

    }

}
