package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import com.insurance.app.model.Dependent;


public interface DependentService {
    Optional<Dependent> getDependentById(int dependent_id);

    List<Dependent> getDependents();

    Dependent addNewDependent(Dependent adddependent);

    Dependent updateDependent(Dependent updatedependent);

    void deleteDependentById(int dependent_id);

    // void deleteAllDependents();

}
