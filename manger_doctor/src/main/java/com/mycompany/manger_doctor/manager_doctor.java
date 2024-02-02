

import java.util.ArrayList;
import java.util.Scanner;

public class manager_doctor {
    public static void main(String[] args) {
     
        Manager man=new Manager();
        Control con=new Control(man);
        con.run();
        
        }
    }
