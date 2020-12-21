package com.epam.ISP.goodPractice;

public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}
