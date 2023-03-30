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
    private LocalDate shippingDate = LocalDate.now().plusDays(1);
    private UUID orderId;
    private double totalPrice;

    public Order() {
        this.orderDate = LocalDate.now();
        this.orderId = UUID.randomUUID();
    }

    public void addItemGroup(ItemGroup itemGroup) {
        orderList.add(itemGroup);
        totalPrice += itemGroup.getTotalPrice();
        shippingDate = calculateShippingDate(itemGroup);
    }

    public List<ItemGroup> getOrderList() {
        return orderList;
    }

    public LocalDate calculateShippingDate(ItemGroup itemGroup) {
        if ((itemGroup.getItem().getStockAmount() >= itemGroup.getAmount())&&(shippingDate.isBefore(orderDate.plusDays(7)))) {
            return orderDate.plusDays(1);
        } else {
            return orderDate.plusDays(7);
        }
    }

    public void calculateTotalPrice() {
        for (ItemGroup itemGroup : orderList) {
            totalPrice += itemGroup.getTotalPrice();
        }
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
