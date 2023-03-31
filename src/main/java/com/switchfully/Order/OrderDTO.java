package com.switchfully.Order;

import com.switchfully.Customer.Customer;
import com.switchfully.Item.ItemGroup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderDTO {

    private List<ItemGroup> orderList = new ArrayList<>();
    private Customer customer;
    private double totalPrice;
    private LocalDate dateOfOrder;
    private LocalDate shippingDate;
    private UUID id;

    public OrderDTO (List<ItemGroup> orderList, Customer customer, double totalPrice, LocalDate dateOfOrder, LocalDate shippingDate, UUID id) {
        this.orderList = orderList;
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.dateOfOrder = dateOfOrder;
        this.shippingDate = shippingDate;
        this.id = id;
    }

    public List<ItemGroup> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<ItemGroup> orderList) {
        this.orderList = orderList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
