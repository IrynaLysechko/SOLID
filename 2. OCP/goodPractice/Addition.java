package com.epam.OPC.goodPractice;

public class Addition implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double perform() {
        return result = left + right;
    }
}
