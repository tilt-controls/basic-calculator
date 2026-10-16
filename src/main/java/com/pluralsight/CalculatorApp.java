package com.pluralsight;
import java.util.*;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare 2 number variables and ask for user input
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        System.out.println("Possible calculations:");
        // Display calculator options
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");

        // Choose multiplication option
        System.out.println("Please select and option:");
        System.out.println();
        System.out.println("Multiplication was selected!");
        System.out.println();

        System.out.println("Proccessing calculations...");

        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);



    }
}
