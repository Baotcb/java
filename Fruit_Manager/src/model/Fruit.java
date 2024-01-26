package model;

public class Fruit {
    private int id;
    private int quantity;
    private int price;
    private String name;
    private String origin;

    public Fruit(int id, int quantity, int price, String name, String origin) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setName(String name) {
        this.name = name;
    }

}
