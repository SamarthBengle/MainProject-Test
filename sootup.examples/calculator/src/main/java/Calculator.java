import java.util.Scanner;

/**
 * Calculator Example for MainProject-Test
 * This file will be automatically synced to MainProject-Examples-Test
 */
public class Calculator {

    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.demonstrateAutoSync();
        calc.runInteractiveDemo();
        calc.runAutomatedDemo();
    }

    /**
     * Show that this example was automatically synced
     */
    public void demonstrateAutoSync() {
        System.out.println("=== MainProject-Test Calculator Example ===");
        System.out.println("This example was automatically synced!");
        System.out.println("Demonstrates basic arithmetic operations.\n");
    }

    /**
     * Run an interactive calculator demo
     */
    public void runInteractiveDemo() {
        System.out.println("=== Interactive Calculator Demo ===");
        System.out.println("Enter two numbers and an operation (+, -, *, /)");
        System.out.println("Type 'exit' to skip interactive mode\n");

        System.out.print("First number (or 'exit'): ");
        String input = scanner.nextLine();

        if ("exit".equalsIgnoreCase(input.trim())) {
            System.out.println("Skipping interactive demo...\n");
            return;
        }

        try {
            double num1 = Double.parseDouble(input);
            System.out.print("Operation (+, -, *, /): ");
            String operation = scanner.nextLine().trim();
            System.out.print("Second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = performOperation(num1, num2, operation);
            System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
    }

    /**
     * Run automated demo with predefined calculations
     */
    public void runAutomatedDemo() {
        System.out.println("=== Automated Demo ===");

        double[][] testCases = {
                {10, 5, '+'},
                {15, 7, '-'},
                {6, 8, '*'},
                {20, 4, '/'}
        };

        for (double[] testCase : testCases) {
            try {
                double num1 = testCase[0];
                double num2 = testCase[1];
                char op = (char) testCase[2];

                double result = performOperation(num1, num2, String.valueOf(op));
                System.out.printf("%.1f %c %.1f = %.2f%n", num1, op, num2, result);

            } catch (Exception e) {
                System.out.println("Error in test case: " + e.getMessage());
            }
        }
    }

    /**
     * Perform arithmetic operation
     */
    public double performOperation(double num1, double num2, String operation) {
        switch (operation.toLowerCase()) {
            case "+":
            case "add":
                return add(num1, num2);
            case "-":
            case "subtract":
                return subtract(num1, num2);
            case "*":
            case "multiply":
                return multiply(num1, num2);
            case "/":
            case "divide":
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}