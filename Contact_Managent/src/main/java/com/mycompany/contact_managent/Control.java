/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contact_managent;

import java.util.ArrayList;

/**
 *
 * @author Quocb
 */
public class Control {
    private ArrayList<Contact> con;
    private View view;
    private int id=0;

    public Control() {
        this.con=new ArrayList<>();
        this.view=new View();
    }
    public void run(){
        while (true){
        view.menu();
        switch (view.getInt("Enter your choise ",1,4)){
            case 1:
                add();
                break;
            case 2:
                display();
                break;
            case 3:
                delete();
                break;
            case 4:
                System.exit(0);
        }
        }
    }

    public void add(){
        id++;
        String name=view.getString("Enter name");
        String gr=view.getString("Enter group ");
        String add=view.getString("Enter add ");
        String phone=view.getString("Enter phone");
        con.add(new Contact(id,name,gr,add,phone));
    }
    public void display() {

        System.out.println("ID\tName\t\t\tGroup\tAddress\tPhone");

            for (Contact contact : con) {
                System.out.printf("%d\t%-25s%-15s%-15s%n",
                        contact.getId(),
                        contact.getName(),
                        contact.getGroup(),
                        contact.getAdd(),
                        contact.getPhone());
        }
    }
    public void delete(){
        int check=view.getInt("Enter ID", -1000000, 1000000);
       
        for (Contact c:con){
            if (c.getId()==check){
                con.remove(c);
                return;
            }
        }
        System.out.println("ID not found");
        
    }
    
}
