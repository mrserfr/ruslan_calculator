package com.company.Main;

public class Main {
    private Printer printer = new Printer();
    private InputManager inputManager = new InputManager();
    private Calculator calculator = new Calculator();

    public static void main(String[] args) {
        new Main().doCalculation();
    }

    private void doCalculation() {
        int a1 = inputManager.askForArgument();
        int b2 = inputManager.askForArgument();
        String operator = inputManager.askForOperator();
        int result = calculator.calculate(a1, b2, operator);
        printer.printNumber(result);
    }
}
