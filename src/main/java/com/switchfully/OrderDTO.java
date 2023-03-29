package com.switchfully;

import com.switchfully.Item.ItemGroup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderDTO {

    private List<ItemGroup> orderList = new ArrayList<>();

    private LocalDate orderDate;
    private LocalDate shippingDate;
    private double totalPrice;
    private UUID orderId;

    public OrderDTO(Order order) {
        this.orderList = order.getOrderList();
        this.orderDate = order.getOrderDate();
        this.shippingDate = order.getShippingDate();
        this.totalPrice = order.getTotalPrice();
        this.orderId = order.getOrderId();
    }

    public List<ItemGroup> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<ItemGroup> orderList) {
        this.orderList = orderList;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
}
