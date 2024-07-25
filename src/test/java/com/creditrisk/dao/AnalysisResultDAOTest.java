package com.creditrisk.dao;

import com.creditrisk.model.AnalysisResult;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnalysisResultDAOTest {
    @Test
    public void testAddAnalysisResult() {
        AnalysisResultDAO dao = new AnalysisResultDAO();
        AnalysisResult analysisResult = new AnalysisResult();
        analysisResult.setCustomerId(1);
        analysisResult.setRiskLevel("Low");
        analysisResult.setRecommendation("No action needed");

        dao.addAnalysisResult(analysisResult);
        // Add assertions to verify analysis result was added
    }
}
