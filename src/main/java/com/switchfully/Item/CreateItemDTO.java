package com.switchfully.Item;

import java.util.UUID;

public class CreateItemDTO {
    private String name;
    private String description;
    private double price;
    private int amount;

    private UUID uuid;

    private int id = 0;

    public CreateItemDTO(String name, String description, double price, int amount, UUID uuid) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.uuid = uuid;
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
