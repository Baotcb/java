/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contact_managent;

import java.util.Scanner;

/**
 *
 * @author Quocb
 */
public class View {
    private Scanner sc;
    public View() {
        sc = new Scanner(System.in);
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
    public String getString(String mes) {
        System.out.print(mes);
        
        return sc.nextLine();
    }
    public void menu(){
        System.out.println("=======Contact Program=========");
        System.out.println("1.ADD");
        System.out.println("2.DisPlay ");
        System.out.println("3.Delete ");
        System.out.println("4.Exit");
    }
    
}
