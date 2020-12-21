package com.epam.LSP.goodPractice;

import java.math.BigDecimal;

public class WithdrawableAccount extends Account {

    @Override
    protected void deposit(BigDecimal amount) {
        // some code
    }

    protected void withdraw(BigDecimal amount) {
        // some code
    }
}
