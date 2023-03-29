package com.switchfully.Item;

import java.util.UUID;

public class Item {
    private final String name;
    private final String description;
    private final double price;
    private final int amount;
    private UUID uuid;

    private int id = 0;

    public Item(String name, String description, double price, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        uuid = UUID.randomUUID();
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

    public UUID getUuid() {
        return uuid;
    }

}
