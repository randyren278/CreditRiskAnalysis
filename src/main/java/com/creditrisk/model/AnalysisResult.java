package com.creditrisk.model;

import java.sql.Timestamp;

public class AnalysisResult {
    private int id;
    private int customerId;
    private String riskLevel;
    private String recommendation;
    private Timestamp analysisDate;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }
    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }
    public Timestamp getAnalysisDate() { return analysisDate; }
    public void setAnalysisDate(Timestamp analysisDate) { this.analysisDate = analysisDate; }
}
