
package test;

import views.MainMenu;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"ADD COUNTRY ÌNFORMATION", "GET RECENTLY ENTER INFORMATION", "SEARCH INFORMATION BY NAME", "SORT INFORMATION BY ASCENDING ORDER", "EXIT"};
        new MainMenu("===== MAIN MENU =====", choices).run();
    }         
}
