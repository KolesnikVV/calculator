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
    @GetMapping(path = "/minus")
    public String minus (@RequestParam("num1")  int num1, @RequestParam("num2") int num2) {
        return calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam("num1")  int num1, @RequestParam("num2") int num2) {

        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide (@RequestParam("num1")  int num1, @RequestParam("num2") int num2) {
        return calculatorService.divide(num1, num2);
    }
}
