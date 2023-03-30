package com.switchfully.Item;

public class ItemGroup {

    private final Item item;
    private int amount;

    private double totalPrice;

    public ItemGroup(Item item, int amount) {
        this.item = item;
        this.amount = amount;
        this.totalPrice = item.getPrice() * amount;
    }
    public boolean isAvailable(){
        int amountInStock = item.getStockAmount();
        return amountInStock >= amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Item getItem() {
        return item;
    }
    public int getAmount() {
        return amount;
    }
}
