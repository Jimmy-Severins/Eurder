package com.switchfully.Customer;

import com.switchfully.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        Customer customer = order.getCustomer();
        if (getOrderByCustomer(customer) == null) {
            orders.add(order);
        } else {
            Order order1 = getOrderByCustomer(customer);
            order1.addOrder(order.getItemGroup());
            order.setCustomer();
            order.setItemGroup();
            order.setTotalPrice();
            order.setId();
            order.setShippingDate();
            order.setDateOfOrder();
        }
    }

    public List<Order> getOrders() {
        return orders;
    }
    public static Order getOrderByCustomer(Customer customer){
        for (Order order : orders) {
            if(order.getCustomer().equals(customer)){
                return order;
            }
        }
        return null;
    }


}

