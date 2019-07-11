package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import com.insurance.app.model.ApplicationPolicy;


public interface ApplicationPolicyService {
    Optional<ApplicationPolicy> getApplicationById(int application_id);

    List<ApplicationPolicy> getApplications();

    ApplicationPolicy addNewApplication(ApplicationPolicy addapplication);

    ApplicationPolicy updateApplication(ApplicationPolicy updateapplication);

    void deleteApplicationById(int application_id);

    // void deleteAllUsers();

}
