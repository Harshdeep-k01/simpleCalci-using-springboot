package com.simplecalculator.simplecalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyApplication {
    //add
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b){
        return a + b;
    }
    //sub
    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b){
        return a - b;
    }
    //multiply
    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b){
        return a * b;
    }
    //division
    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b){
        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
