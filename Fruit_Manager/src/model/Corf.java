package model;

public class Corf {
    private String name;
    private String nameFruit;
    private int quantity;
    private int price;
    private int amount;

    public Corf(String name, String nameFruit, int quantity, int price, int amount) {
        this.name = name;
        this.nameFruit = nameFruit;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String toString() {
        System.out.printf("%-10s %-10d %-10d %-10d%n", nameFruit, quantity, price, amount);
        return "";
    }

}