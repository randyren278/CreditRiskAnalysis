package com.creditrisk.dao;

import com.creditrisk.model.CreditHistory;
import com.creditrisk.util.DatabaseConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreditHistoryDAO {
    public void addCreditHistory(CreditHistory creditHistory) {
        String query = "INSERT INTO CreditHistory (customer_id, credit_score, total_debt, missed_payments) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, creditHistory.getCustomerId());
            stmt.setInt(2, creditHistory.getCreditScore());
            stmt.setBigDecimal(3, creditHistory.getTotalDebt());
            stmt.setInt(4, creditHistory.getMissedPayments());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Other CRUD operations
}
