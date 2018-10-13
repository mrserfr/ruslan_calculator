package com.company.Main;
import java.util.Scanner;



public class Calculator {
    public int calculate(int a1, int b2, String operator) {
        switch(operator) {
            case "+":
                return a1 + b2;
            case"/":
                return a1 / b2;
            case"*":
                return a1 * b2;
            case"-":
                return a1 - b2;
            default:
                throw new IllegalArgumentException();
        }
    }
}