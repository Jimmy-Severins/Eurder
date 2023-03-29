package com.switchfully;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrderRepository {
    private List<Order> orderList;
    public OrderRepository(List<Order> orderList) {
        this.orderList = orderList;
    }
    public void addOrder(Order order){
        orderList.add(order);
    }
    public List<Order> getOrderList() {
        return orderList;
    }
}
