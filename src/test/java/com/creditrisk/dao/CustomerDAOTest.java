package com.creditrisk.dao;

import com.creditrisk.model.Customer;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CustomerDAOTest {
    @Test
    public void testAddCustomer() {
        CustomerDAO dao = new CustomerDAO();
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setAge(30);
        customer.setAddress("123 Main St");
        customer.setEmploymentStatus("Employed");
        customer.setAnnualIncome(new BigDecimal("75000"));

        dao.addCustomer(customer);
        // Add assertions to verify customer was added
    }
}
