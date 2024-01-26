package controll;

import model.Corf;
import model.Customer;
import model.Fruit;
import view.View;

import java.util.ArrayList;

public class Controll {
    private View view;
    private ArrayList<Fruit> fruit;
    private ArrayList<Customer> cus;
    private ArrayList<Corf> co;
    public Controll(){
        this.view = new View();
        this.fruit=new ArrayList<>();
        this.cus=new ArrayList<>();
        this.co=new ArrayList<>();
    }
    public void run() {

        while (true) {
            view.menu();
            switch (view.getInt("Enter your choise:", 1, 4)) {
                case 1: {
                    create();
                    break;
                }
                case 2: {
                    vieworder();
                    break;
                }
                case 3:{
                    shoping();
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
            }
        }
    }

    private void shoping() {
        displayFruit();
        String name=view.getString("your select:");
        for (Fruit fr:fruit){
            if (name.equalsIgnoreCase(fr.getName())){
                int quan=view.getInt("enter quantity:",1,fr.getQuantity());
                fr.setQuantity(fr.getQuantity()-quan);
                String nameuse =view.getString("Enter your name");
                if(checkuse(nameuse)){
                    cus.add(new Customer(nameuse));
                }
                co.add(new Corf(nameuse,name,quan,fr.getPrice(),(fr.getPrice()*quan)));
                return;
            }
        }
    }

    private boolean checkuse(String nameuse) {
        if (cus==null){
            return true;
        }
       for (Customer c:cus){
           if (c.getName().equalsIgnoreCase(nameuse)){
                return false;
           }
       }
       return true;
    }

    public void displayFruit() {
        System.out.println("List of Fruit");
        System.out.println("Item  Fruit Name   Origin   Price");
        for (Fruit f : fruit) {
            System.out.println( f.getId()+"   "+ f.getName()+"   "+ f.getOrigin()+"   "+ f.getPrice());
        }
    }


    private void vieworder() {
        view.order(cus,co);
    }

    private void create() {
            int id=0;
            while (!checkId( id =view.getInt("Enter ID:",0,100000))){
                id=view.getInt("Plese enter ID again:",0,100000);
            }
            String name=view.getString("Enter name ");
            int quantity=view.getInt("Enter quantity:",0,100000);
            int price=view.getInt("Enter price:",0,10000);
            String origin=view.getString("Enter origin");
            fruit.add(new Fruit(id,quantity,price,name,origin));

    }
    private boolean checkId(int id){
        if (fruit==null){
            return true;
        }
        for (Fruit fr:fruit){
            if (fr.getId()==id){
                return false;
            }
        }
        return true;
    }
}
