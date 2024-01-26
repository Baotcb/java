
package views;

import controllers.ManageCountries;
import controllers.Validation;

public class MainMenu extends Menu{
    Validation val = new Validation();
    ManageCountries mc = new ManageCountries();
    
    public MainMenu(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:              
                System.out.println("ADD COUNTRY");
                System.out.print("Country code: ");
                String code = val.inputString();
                System.out.print("Country name: ");
                String name = val.inputString();
                
                float area;
                while (true) {                    
                    System.out.print("Total area: ");
                    area = val.inputFloat();
                    if (area <= 0) {
                        System.out.println("Re-enter");
                    } else {
                        break;
                    }
                }
                
                System.out.print("Country terrain: ");
                String terrain = val.inputString();
                mc.addCountry(code, name, area, terrain);
                System.out.println("ADD SUCCESS!!");
                break;
            
            case 2:
                mc.printAlreadyIn();
                break;
            case 3:
                System.out.println("==== SEARCH ====");
                name = val.inputString();
                mc.search(name);
                break;
            case 4:
                mc.sort();
                break;
        }
    }
    
}
