package com.switchfully.CustomerTest;

import com.switchfully.Order.OrderRepository;
import com.switchfully.Item.Item;
import com.switchfully.Order.Order;
import org.junit.jupiter.api.Test;
import com.switchfully.Customer.Customer;

public class OrderTest {
    @Test
    void name() {
        Customer customer = new Customer("John", "Doe", "address", null, "phoneNumber");
        Customer customer1 = new Customer("Jann", "Doe", "address", null, "phoneNumber");

        Item item = new Item("name", "description", 10, 10);
        Item item2 = new Item("name2", "description2", 10, 1);
        Item item3 = new Item("name3", "description3", 10, 120);

        OrderRepository orderRepository = new OrderRepository();

        Order order = new Order(1, item, customer);
        orderRepository.addOrder(order);
        Order order1 = new Order(2, item2, customer);
        orderRepository.addOrder(order1);
        Order order2 = new Order(15, item3, customer1);
        orderRepository.addOrder(order2);

        System.out.println(orderRepository.getOrders());



    }
}
