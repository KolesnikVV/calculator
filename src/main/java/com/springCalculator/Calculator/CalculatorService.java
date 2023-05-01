package com.springCalculator.Calculator;
//
    public class CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
        }

    public String addition(Integer num1, Integer num2) {
        int addition = num1 + num2;
        return num1 + " + " + num2 + " = " + addition;
    }
    public String minus (Integer num1, Integer num2) {
        int addition = num1 - num2;
        return num1 + " - " + num2 + " = " + addition;
    }
    public String multiply (Integer num1, Integer num2) {

        int addition = num1 * num2;
        return num1 + " * " + num2 + " = " + addition;
    }
    public String divide (Integer num1, Integer num2) {
        if (num1 == null || num2 == null){
            return "Error";
        }
        if (num2 == 0){
            return "На 0 делить нельзя!";
        }
            int addition = num1 / num2;
            return num1 + " / " + num2 + " = " + addition;
    }

}

