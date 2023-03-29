package com.switchfully;

import com.switchfully.Item.ItemGroup;

import java.time.LocalDate;
import java.util.List;

public class CreateOrderDTO {

    private List<ItemGroup> orderList;
    private LocalDate orderDate;
    private LocalDate shippingDate;
    private double totalPrice;

    public CreateOrderDTO(List<ItemGroup> orderList, LocalDate orderDate, LocalDate shippingDate, double totalPrice) {
        this.orderList = orderList;
        this.orderDate = orderDate;
        this.shippingDate = shippingDate;
        this.totalPrice = totalPrice;
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
