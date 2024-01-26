package view;

import model.Corf;
import model.Customer;

import java.util.ArrayList;
import java.util.Scanner;
public class View {
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("model.Fruit shop system ");
        System.out.println("1.Create Fruit");
        System.out.println("2.View order ");
        System.out.println("3.Shoping (buyer)");
        System.out.println("4.Exit");

    }
    public String getString(String mes) {
        System.out.print(mes);
        return sc.nextLine();
    }
    public int getInt(String promt, int m, int n) {
        int a;
        do {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
                a = m - 1;
            }
        } while (a < m || a > n);
        return a;
    }


    public void order(ArrayList<Customer> cus, ArrayList<Corf> co) {

        for (Customer cu:cus){
            System.out.println("model.Customer: "+cu.getName());
            System.out.printf("%-10s %-10s %-10s %-10s%n", "Product", "Quantity", "Price", "Amount");
            for (Corf c:co){
                if (cu.getName().equalsIgnoreCase(c.getName())){
                    System.out.println(c);
                }
            }

        }
    }

}
