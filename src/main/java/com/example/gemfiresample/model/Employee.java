/**
 * 
 */
package com.example.gemfiresample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

/**
 * @author vcvr
 *
 */
@Region("employees")
public class Employee {
    
    @Id
    private Long id;
    
    private String name;
    private String position;
    private double salary;
    private String address;
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }
    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
