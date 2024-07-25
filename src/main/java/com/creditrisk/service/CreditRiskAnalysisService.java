package com.creditrisk.service;

import com.creditrisk.dao.CustomerDAO;
import com.creditrisk.dao.CreditHistoryDAO;
import com.creditrisk.dao.AnalysisResultDAO;
import com.creditrisk.model.AnalysisResult;
import com.creditrisk.model.Customer;
import com.creditrisk.model.CreditHistory;

import java.util.List;

public class CreditRiskAnalysisService {
    private CustomerDAO customerDAO;
    private CreditHistoryDAO creditHistoryDAO;
    private AnalysisResultDAO analysisResultDAO;

    public CreditRiskAnalysisService() {
        this.customerDAO = new CustomerDAO();
        this.creditHistoryDAO = new CreditHistoryDAO();
        this.analysisResultDAO = new AnalysisResultDAO();
    }

    public void analyzeCustomerRisk(int customerId) {
        Customer customer = customerDAO.getCustomerById(customerId);
        List<CreditHistory> creditHistories = creditHistoryDAO.getCreditHistoriesByCustomerId(customerId);

        // Perform risk analysis logic here
        String riskLevel = "Low";  // Placeholder
        String recommendation = "No action needed";  // Placeholder

        AnalysisResult result = new AnalysisResult();
        result.setCustomerId(customerId);
        result.setRiskLevel(riskLevel);
        result.setRecommendation(recommendation);

        analysisResultDAO.addAnalysisResult(result);
    }
}
