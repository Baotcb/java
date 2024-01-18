import java.util.Scanner;
public class View {
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("Wellcome to student management   ");
        System.out.println("1.Create ");
        System.out.println("2.Find and Sort");
        System.out.println("3.Update and delete");
        System.out.println("4.Report");
        System.out.println("5.Exit");

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

}
