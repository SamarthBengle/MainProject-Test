package com.sootup.test;

/**
 * Main class for SootUp-Test project
 * This demonstrates the main project structure.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to SootUp-Test!");
        System.out.println("This project demonstrates automatic example synchronization.");

        String[] examples = {
                "helloworld - Basic Hello World example",
                "calculator - Simple Calculator example"
        };

        System.out.println("\nAvailable examples:");
        for (String example : examples) {
            System.out.println("  - " + example);
        }

        System.out.println("\nNew examples will be automatically synced to SootUp-Examples-Test!");
    }
}