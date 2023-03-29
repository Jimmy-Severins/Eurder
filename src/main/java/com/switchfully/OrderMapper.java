package com.switchfully;

import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public CreateOrderDTO toDTO(Order order){
        return new CreateOrderDTO(order.getOrderList(), order.getOrderDate(), order.getShippingDate(), order.getTotalPrice());
    }

    public Order mapToOrder(CreateOrderDTO createOrderDTO){
        Order order = new Order();
        order.setOrderList(createOrderDTO.getOrderList());
        order.setOrderDate(createOrderDTO.getOrderDate());
        order.setShippingDate(createOrderDTO.getShippingDate());
        order.setTotalPrice(createOrderDTO.getTotalPrice());
        return order;
    }

    public OrderDTO mapToOrderDTO(Order order){
        OrderDTO orderDTO = new OrderDTO(order);
        orderDTO.setOrderList(order.getOrderList());
        orderDTO.setOrderDate(order.getOrderDate());
        orderDTO.setShippingDate(order.getShippingDate());
        orderDTO.setTotalPrice(order.getTotalPrice());
        orderDTO.setOrderId(order.getOrderId());
        return orderDTO;
    }
}
