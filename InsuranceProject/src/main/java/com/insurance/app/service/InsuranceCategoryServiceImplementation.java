package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.dao.InsuranceCategoryDao;
import com.insurance.app.model.InsuranceCategory;

@Service
public class InsuranceCategoryServiceImplementation implements InsuranceCategoryService {
    @Autowired
    InsuranceCategoryDao dao;

    public List<InsuranceCategory> getInsuranceCategory() {
        return dao.findAll();
    }

    // @Override
    public Optional<InsuranceCategory> getInsuranceCategoryById(int insurance_id) {

        return dao.findById(insurance_id);

    }

    // @Override
    public InsuranceCategory updateInsurance(InsuranceCategory updateinsurance) {

        return dao.save(updateinsurance);
    }

}
