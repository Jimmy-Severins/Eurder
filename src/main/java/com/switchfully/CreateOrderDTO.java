package com.switchfully;

import com.switchfully.Item.ItemGroup;

import java.time.LocalDate;
import java.util.List;

public class CreateOrderDTO {

    private List<ItemGroup> orderList;
    private LocalDate orderDate;
    private LocalDate shippingDate;
    private double totalPrice;

    public CreateOrderDTO(Order order) {
        this.orderList = order.getOrderList();
        this.orderDate = order.getOrderDate();
        this.shippingDate = order.getShippingDate();
        this.totalPrice = order.getTotalPrice();
    }

    public List<ItemGroup> getOrderList() {
        return orderList;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
