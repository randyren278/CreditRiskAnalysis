package com.creditrisk.dao;

import com.creditrisk.model.CreditHistory;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CreditHistoryDAOTest {
    @Test
    public void testAddCreditHistory() {
        CreditHistoryDAO dao = new CreditHistoryDAO();
        CreditHistory creditHistory = new CreditHistory();
        creditHistory.setCustomerId(1);
        creditHistory.setCreditScore(700);
        creditHistory.setTotalDebt(new BigDecimal("15000"));
        creditHistory.setMissedPayments(2);

        dao.addCreditHistory(creditHistory);
        // Add assertions to verify credit history was added
    }
}
