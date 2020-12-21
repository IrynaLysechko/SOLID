package com.epam.OPC.goodPractice;

public class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    public Division(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double perform() {
        if (right != 0) {
            result = left / right;
        }
        return result;
    }
}
