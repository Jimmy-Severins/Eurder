package com.switchfully.Item;

public class ItemGroup {

    private final Item item;
    private int amount;

    public ItemGroup(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }
    public boolean isAvailable(){
        int amountInStock = item.getStockAmount();
        return amountInStock >= amount;
    }
    public double calculatePrice(){
        return item.getPrice() * amount;
    }
}
