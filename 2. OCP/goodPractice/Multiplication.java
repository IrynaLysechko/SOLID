package com.epam.OPC.goodPractice;

public class Multiplication implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    public Multiplication(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double perform() {
        return result = left * right;
    }
}
