/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contact_managent;

/**
 *
 * @author Quocb
 */
public class Contact {
    private int id;
    private String Name;
    
    private String Group;
    private String Add;
    private String phone;

    public Contact(int id, String Name,  String Group, String Add, String phone) {
        this.id = id;
        this.Name = Name;
       
        this.Group = Group;
        this.Add = Add;
        this.phone = phone;
    }
    
  

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Lastname
     */
   

    /**
     * @param Lastname the Lastname to set
     */
    

    /**
     * @return the Group
     */
    public String getGroup() {
        return Group;
    }

    /**
     * @param Group the Group to set
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * @return the Add
     */
    public String getAdd() {
        return Add;
    }

    /**
     * @param Add the Add to set
     */
    public void setAdd(String Add) {
        this.Add = Add;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return   + id + Name +  Group +  Add +  phone ;
    }
    
    
    
}
