package com.chloevie.gestionutilisateur.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chloevie.gestionutilisateur.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}