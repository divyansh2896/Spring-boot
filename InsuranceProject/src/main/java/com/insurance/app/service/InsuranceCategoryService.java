package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import com.insurance.app.model.InsuranceCategory;

public interface InsuranceCategoryService {

    Optional<InsuranceCategory> getInsuranceCategoryById(int insurance_id);

    List<InsuranceCategory> getInsuranceCategory();
    
    InsuranceCategory updateInsurance(InsuranceCategory updateinsurance);

}