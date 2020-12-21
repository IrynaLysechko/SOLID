package com.epam.OPC.goodPractice;

import java.security.InvalidParameterException;

public class Calculator {

    public double calculate(CalculatorOperation calculatorOperation) {
        if (calculatorOperation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        return calculatorOperation.perform();
    }
}
