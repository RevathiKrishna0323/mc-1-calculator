package com.jap.calculator;

public class MathematicalCalculator {

    public int add(int num1, int num2) {
        int add = num1 + num2;
        return add;
    }

    public int subtract(int num1, int num2) {
        int subtract = num1 - num2;
        return subtract;
    }

    public int multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }

    public int divide(int num1, int num2) {
        //write the code and handle the ArithmeticException
        int divide;
        try {
            divide = num1 / num2;
        } catch (ArithmeticException exception) {
            throw new RuntimeException(exception);
        }
        return divide;
    }

    public int modulo(int num1, int num2) {
        int modulo = 0;
        try {
            modulo = num1 % num2;
        } catch (ArithmeticException exception) {
            throw new RuntimeException(exception);
        }
        return modulo;
    }
}
