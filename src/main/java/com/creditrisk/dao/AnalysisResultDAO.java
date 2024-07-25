package com.creditrisk.dao;

import com.creditrisk.model.AnalysisResult;
import com.creditrisk.util.DatabaseConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnalysisResultDAO {
    public void addAnalysisResult(AnalysisResult analysisResult) {
        String query = "INSERT INTO AnalysisResults (customer_id, risk_level, recommendation) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, analysisResult.getCustomerId());
            stmt.setString(2, analysisResult.getRiskLevel());
            stmt.setString(3, analysisResult.getRecommendation());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Other CRUD operations
}
