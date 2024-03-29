package view;

import java.util.Scanner;

public class View {
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public void displayEquation(double x1, double x2) {
        System.out.println("Equation solutions: x1 = " + x1 + ", x2 = " + x2);
    }

    public void displayEvenOddSquare(double c) {
        System.out.println("x="+c);

    }


    public void displaymes(double num,String mes) {
        System.out.println(num+mes);
    }
}
