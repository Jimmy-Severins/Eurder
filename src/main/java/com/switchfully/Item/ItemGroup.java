package com.switchfully.Item;

import java.time.LocalDate;

public class ItemGroup {

    private final Item item;
    private int amount;
    private LocalDate dateOfOrder;
    private LocalDate shippingDate;
    private double totalPrice;

    public ItemGroup(Item item, int amount) {
        this.item = item;
        this.amount = amount;
        this.dateOfOrder = LocalDate.now();
        this.shippingDate = calculateShippingDate();
        this.totalPrice = item.getPrice() * amount;
    }
    public boolean isAvailable(){
        int amountInStock = item.getStockAmount();
        return amountInStock >= amount;
    }

    public LocalDate calculateShippingDate(){
        if(isAvailable()){
            return dateOfOrder.plusDays(1);
        } else {
            return dateOfOrder.plusDays(7);
        }
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
    public LocalDate getShippingDate() {
        return shippingDate;
    }
}
