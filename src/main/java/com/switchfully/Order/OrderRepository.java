package com.switchfully.Order;

import com.switchfully.Customer.Customer;
import com.switchfully.Order.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
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
    public Object getAllOrders() {
        return orders;
    }
}

