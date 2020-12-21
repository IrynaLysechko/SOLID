package com.epam.LSP.badPractice;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new FixedTermDepositAccount();
        account.deposit(new BigDecimal(1000.9));

        // Exception
        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService(account);
        bankingAppWithdrawalService.withdraw(new BigDecimal(1000.0));
    }
}
