
package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import models.EastAsiaCountry;

public class ManageCountries {
    private ArrayList<EastAsiaCountry> clist;
    private ArrayList<EastAsiaCountry> temp = new ArrayList<>();
    
    public ManageCountries() {
        clist = new ArrayList<>();
        initiate();
    }
    
    private void initiate() {
        clist.add(new EastAsiaCountry("VN", "Viet Nam", 331212, "Mountain"));
        clist.add(new EastAsiaCountry("L", "Lao", 236800, "Mountain"));
        clist.add(new EastAsiaCountry("TL", "Thai Lan", 513120, "Mountain"));
        clist.add(new EastAsiaCountry("PL", "Philip", 300000, "Island"));
        clist.add(new EastAsiaCountry("ML", "Malay", 330803, "Island"));
        clist.add(new EastAsiaCountry("ID", "Indo", 1860360, "Island"));
        clist.add(new EastAsiaCountry("DTM", "Dong TiMor", 14874, "Island"));
        clist.add(new EastAsiaCountry("CPC", "Campuchia", 181035, "Mountain"));
        clist.add(new EastAsiaCountry("BRN", "Bruney", 5765, "Mountain"));
        clist.add(new EastAsiaCountry("SGP", "Singapore", 705, "Island"));
        clist.add(new EastAsiaCountry("MAM", "Myanmar", 676578, "Island"));
    }
    
    public void addCountry(String code, String name, float area, String terrain) {
        temp = new ArrayList<>();
        clist.add(new EastAsiaCountry(code, name, area, terrain));
        temp.add(new EastAsiaCountry(code, name, area, terrain));
    }
    
    public void printAlreadyIn() {
        if (temp.size() == 0) {
            System.out.println("No Information Is Added Recently");
        }
        for (EastAsiaCountry ec : temp) {
            System.out.println(ec);
        }
    }
    
    public void search(String name) {
        for (EastAsiaCountry a : clist) {
            if (a.getCountryName().equalsIgnoreCase(name)) {
                a.display();
                break;
            }
        }
    }
    
    public void sort() {
        ArrayList<EastAsiaCountry> tempList = new ArrayList<>();
        for (EastAsiaCountry ac : clist) {
            tempList.add(ac);
        }
        
        Collections.sort(tempList);
        for (EastAsiaCountry ac: tempList) {
            System.out.println(ac);
        }
    }
}
