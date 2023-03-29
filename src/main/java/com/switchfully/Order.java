package com.switchfully;

import com.switchfully.Item.ItemGroup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class Order {

    private List<ItemGroup> orderList = new ArrayList<>();
    private LocalDate orderDate;
    private LocalDate shippingDate;
    private UUID orderId;

    public Order() {
        this.orderDate = LocalDate.now();
        this.orderId = UUID.randomUUID();
    }
    public void addItemGroup(ItemGroup itemGroup){
        orderList.add(itemGroup);
    }
    public List<ItemGroup> getOrderList() {
        return orderList;
    }
    public LocalDate calculateShippingDate(){
        boolean isAvailable = false;
        for (ItemGroup itemGroup : orderList) {
            if (itemGroup.isAvailable()){
                isAvailable = true;
            } else {
                isAvailable = false;
            }
        } if (isAvailable){
            shippingDate = orderDate.plusDays(1);
        } else {
            shippingDate = orderDate.plusDays(7);

        } return shippingDate;
    }
    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (ItemGroup itemGroup : orderList) {
            totalPrice += itemGroup.calculatePrice();
        } return totalPrice;
    }
}
