package com.springCalculator.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService = new CalculatorService();

    @GetMapping
    public String helloCalculator(){
        return calculatorService.helloCalculator();
    }
    @GetMapping(path = "/plus")
    public String addition(@RequestParam("num1")  int num1, @RequestParam("num2") int num2) {
            return calculatorService.addition(num1, num2);
    }
}
