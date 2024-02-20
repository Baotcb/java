package view;

import java.util.Scanner;

public class WorkerView {
    private Scanner scanner;

    public WorkerView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Worker Management System");
        System.out.println("1.Worker");
        System.out.println("2. Increase Salary");
        System.out.println("3. Decrease Salary");
        System.out.println("4. Show Adjusted Salary Worker Information");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
    }

    public String getInput(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine().trim();
    }

    public double getDoubleInput(String message) {
        System.out.print(message + ": ");
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }



    public int getIntInput(String mess) {
        System.out.println(mess + ": ");
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

}
