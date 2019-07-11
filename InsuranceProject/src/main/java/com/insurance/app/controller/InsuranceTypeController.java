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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.app.model.BasePlan;
import com.insurance.app.model.InsuranceCategory;
import com.insurance.app.model.User;
import com.insurance.app.service.BasePlanService;
import com.insurance.app.service.InsuranceCategoryService;

@RestController
@RequestMapping(value = "insurance")
public class InsuranceTypeController {

    // For getting the category of the Insurance

    @Autowired
    InsuranceCategoryService service;

    @GetMapping
    public List<InsuranceCategory> getInsuranceCategory() {
        System.out.println(this.getClass().getSimpleName() + " - Get all insurance service is invoked.");
        return service.getInsuranceCategory();
    }

    @GetMapping(value = "/{insurance_id}")
    public InsuranceCategory getInsuranceCategoryById(@PathVariable int insurance_id) throws Exception {
        System.out.println(this.getClass().getSimpleName() + " - Get insurance details by id is invoked.");

        Optional<InsuranceCategory> insurance = service.getInsuranceCategoryById(insurance_id);
        if (!insurance.isPresent())
            throw new Exception("Could not find insurance with id- " + insurance_id);

        return insurance.get();
    }

    //@PutMapping(value = "/{insurance_id}")
     @RequestMapping(value = "/{insurance_id}", method = RequestMethod.PUT)
    public InsuranceCategory updateInsurance(@RequestBody InsuranceCategory updateinsurance, @PathVariable int insurance_id) throws Exception {
        System.out.println(this.getClass().getSimpleName() + " - Update user details by id is invoked.");


        updateinsurance.setInsurance_id(insurance_id);
        return service.updateInsurance(updateinsurance);
    }

    // For getting the Base plan of the Insurance

     
     
     
     
     @Autowired
     BasePlanService ser;

     @GetMapping(value="/baseplan")
     public List<BasePlan> getBasePlans() {
         System.out.println(this.getClass().getSimpleName() + " - Get all baseplan service is invoked.");
         return ser.getBasePlans();
     }

     @GetMapping(value = "/baseplan/{baseplan_id}")
     public BasePlan getBasePlanById(@PathVariable int baseplan_id) throws Exception {
         System.out.println(this.getClass().getSimpleName() + " - Get baseplan details by id is invoked.");

         Optional<BasePlan> plan = ser.getBasePlanById(baseplan_id);
         if (!plan.isPresent())
             throw new Exception("Could not find insurance with id- " + baseplan_id);

         return plan.get();
     }
 
     
}