package com.springCalculator.Calculator;
//
    public class CalculatorService {
public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
        }

public String addition(Integer num1, Integer num2) {
    if (num1 != null & num2 != null) {
        return "Error";
    }
        int addition = num1 + num2;
        return num1 + "+" + num2 + "=" + addition;
    }


//        String helloCalculator();
//
//        String addition (int num1, int num2);
//
//        String minus(int num1, int num2);
//
//        String multiply(int num1, int num2);
//
//        String divide(int num1, int num2);
}
