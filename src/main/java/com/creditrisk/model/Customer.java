package com.creditrisk.model;

import java.math.BigDecimal;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;
    private String employmentStatus;
    private BigDecimal annualIncome;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getEmploymentStatus() { return employmentStatus; }
    public void setEmploymentStatus(String employmentStatus) { this.employmentStatus = employmentStatus; }
    public BigDecimal getAnnualIncome() { return annualIncome; }
    public void setAnnualIncome(BigDecimal annualIncome) { this.annualIncome = annualIncome; }
}
