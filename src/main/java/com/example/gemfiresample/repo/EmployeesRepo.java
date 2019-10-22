package com.example.gemfiresample.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gemfiresample.model.Employee;

@Repository
public interface EmployeesRepo extends CrudRepository<Employee, Long> {
}
