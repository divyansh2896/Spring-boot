package com.insurance.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.app.model.ApplicationPolicy;
import com.insurance.app.service.ApplicationPolicyService;

@RestController
@RequestMapping(value = "application")
public class ApplicationController {

    @Autowired
    ApplicationPolicyService service;

    @GetMapping
    public List<ApplicationPolicy> getApplications() {
        System.out.println(this.getClass().getSimpleName() + " - Get all applications service is invoked.");
        return service.getApplications();
    }

    @GetMapping(value = "/{application_id}")
    public ApplicationPolicy getApplicationById(@PathVariable int application_id) throws Exception {
        System.out.println(this.getClass().getSimpleName() + " - Get application details by id is invoked.");

        Optional<ApplicationPolicy> application = service.getApplicationById(application_id);
        if (!application.isPresent())
            throw new Exception("Could not find application with id- " + application_id);

        return application.get();
    }

   
    @PostMapping(value="/add")
    public ApplicationPolicy createApplication(@RequestBody ApplicationPolicy addapplication) {
        System.out.println(this.getClass().getSimpleName() + " - Create new application method is invoked.");

        return service.addNewApplication(addapplication);
    }

    @PutMapping(value = "/update/{application_id}")
  
    public ApplicationPolicy updateApplication(@RequestBody ApplicationPolicy updateapplication, @PathVariable int application_id) throws Exception {
        System.out.println(this.getClass().getSimpleName() + " - Update application details by id is invoked.");

        Optional<ApplicationPolicy> application = service.getApplicationById(application_id);
   
        updateapplication.setUser_id(application_id);
        return service.updateApplication(updateapplication);
    }

    @DeleteMapping(value="/delete/{application_id}")
    
    public void deleteApplicationById(@PathVariable int application_id) throws Exception {
        System.out.println(this.getClass().getSimpleName() + " - Delete user by id is invoked.");

        Optional<ApplicationPolicy> application = service.getApplicationById(application_id);
        if (!application.isPresent())
            throw new Exception("Could not find application with id- " + application_id);

        service.deleteApplicationById(application_id);
    }
}
