package com.switchfully.Item;

public class UpdateItemDTO {

    private final String name;
    private final String description;
    private final double price;
    private final int amount;

    public UpdateItemDTO(String name, String description, double price, int amount) {
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
}
