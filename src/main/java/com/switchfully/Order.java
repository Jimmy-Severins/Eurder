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
    private double totalPrice;

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

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setOrderList(List<ItemGroup> orderList) {
        this.orderList = orderList;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
