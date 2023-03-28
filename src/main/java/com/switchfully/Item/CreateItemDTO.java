package com.switchfully.Item;

public class CreateItemDTO {
    private String name;
    private String description;
    private double price;
    private int amount;

    private int id = 0;

    public CreateItemDTO(String name, String description, double price, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAmount() {
        return amount;
    }

    public void setId(int id){
        this.id = id;
    }
}
