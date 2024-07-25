package com.creditrisk.dao;

import com.creditrisk.model.Customer;
import com.creditrisk.util.DatabaseConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {
    public void addCustomer(Customer customer) {
        String query = "INSERT INTO Customer (name, age, address, employment_status, annual_income) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, customer.getName());
            stmt.setInt(2, customer.getAge());
            stmt.setString(3, customer.getAddress());
            stmt.setString(4, customer.getEmploymentStatus());
            stmt.setBigDecimal(5, customer.getAnnualIncome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Other CRUD operations
}
