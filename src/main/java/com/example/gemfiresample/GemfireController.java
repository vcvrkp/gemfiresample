package com.example.gemfiresample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.gemfire.GemfireTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gemfiresample.model.Customer;
import com.example.gemfiresample.model.Employee;
import com.example.gemfiresample.repo.EmployeesRepo;
import com.google.common.collect.Lists;

@RestController
@RequestMapping("/gemfire")
public class GemfireController {
    
    @Autowired
    EmployeesRepo empRepository;
    
    @Autowired
    GemfireTemplate customersTemplate;

    @GetMapping(path = "/employees")
    public List<Employee> employees() {
        Iterable<Employee> elements = empRepository.findAll();
        ArrayList<Employee> emps = Lists.newArrayList(elements );
        return emps;
    }

    @GetMapping(path = "/customers/{id}")
    public Customer customers(@PathVariable Long id) {
        Customer customer = customersTemplate.get(id);
        return customer;
    }
    
    @PostMapping(path = "/customers")
    public Customer customers(@RequestBody Customer customer) {
        customersTemplate.put(customer.getId(),customer);
        return customer;
    }

    @PostMapping(path = "/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        empRepository.save(employee);
        return employee;
    }
}
