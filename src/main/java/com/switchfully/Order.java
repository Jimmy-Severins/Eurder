package com.switchfully;

import com.switchfully.Customer.Customer;
import com.switchfully.Customer.OrderRepository;
import com.switchfully.Item.Item;
import com.switchfully.Item.ItemGroup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Order {
    private List<ItemGroup> orderList = new ArrayList<>();
    private Customer customer;
    private double totalPrice;
    private LocalDate dateOfOrder;
    private LocalDate shippingDate;
    private UUID id;

    public Order(ItemGroup itemGroup, Customer customer) {
        this.customer = customer;
        this.dateOfOrder = LocalDate.now();
        this.shippingDate = itemGroup.getShippingDate();
        this.totalPrice = itemGroup.getTotalPrice();
        this.id = UUID.randomUUID();
        orderList.add(itemGroup);
    }
    public void addOrder(ItemGroup itemGroup) {
        orderList.add(itemGroup);
        this.shippingDate = returnOrdershippingDate();
        this.totalPrice = calculateTotalPrice();
    }
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (ItemGroup itemGroup : orderList) {
            totalPrice += itemGroup.getTotalPrice();
        }
        return totalPrice;
    }
    public LocalDate returnOrdershippingDate() {
        LocalDate shippingDate = LocalDate.now().plusDays(1);
        for (ItemGroup itemgroup : orderList) {
            if (shippingDate.isBefore(itemgroup.getShippingDate())) {
                shippingDate = itemgroup.getShippingDate();
            }
        }
        return shippingDate;
    }
    public Customer getCustomer() {
        return customer;
    }
    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public ItemGroup getItemGroup(){
        return orderList.get(0);
    }

    public void setCustomer() {
        this.customer = null;
    }

    public void setItemGroup() {
        this.orderList = null;
    }
    public void setTotalPrice(){
        this.totalPrice =0;
    }
    public void setShippingDate(){
        this.shippingDate = null;
    }
    public void setId(){
        this.id = null;
    }
    public void setDateOfOrder(){
        this.dateOfOrder = null;
    }
}


