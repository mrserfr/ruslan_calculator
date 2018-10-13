package com.company.Main;

import java.util.Scanner;
public class InputManager {
    private Printer printer = new Printer();
    private Scanner scanner = new Scanner(System.in);

    public int askForArgument() {
        printer.printNumberInputMessage();
        return scanner.nextInt();
    }
    public String askForOperator() {
        printer.printOperationMessage();
        return scanner.next();
    }
}
