package com.creditrisk.model;

import java.math.BigDecimal;

public class CreditHistory {
    private int id;
    private int customerId;
    private int creditScore;
    private BigDecimal totalDebt;
    private int missedPayments;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public int getCreditScore() { return creditScore; }
    public void setCreditScore(int creditScore) { this.creditScore = creditScore; }
    public BigDecimal getTotalDebt() { return totalDebt; }
    public void setTotalDebt(BigDecimal totalDebt) { this.totalDebt = totalDebt; }
    public int getMissedPayments() { return missedPayments; }
    public void setMissedPayments(int missedPayments) { this.missedPayments = missedPayments; }
}
