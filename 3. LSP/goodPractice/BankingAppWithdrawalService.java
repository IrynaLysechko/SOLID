package com.epam.LSP.goodPractice;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private WithdrawableAccount withdrawableAccount = new WithdrawableAccount();

    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    public void withdraw(BigDecimal amount) {
        withdrawableAccount.withdraw(amount);
    }
}
