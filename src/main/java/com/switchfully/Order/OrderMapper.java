package com.switchfully.Order;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    public OrderDTO mapToDTO(Order order) {
        return new OrderDTO(order.getOrderList(), order.getCustomer(), order.getTotalPrice(), order.getDateOfOrder(), order.getShippingDate(), order.getId());
    }
    public List<OrderDTO> mapToDTO(List<Order> orderList) {
        return orderList.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public Order mapToDomain(OrderDTO orderDTO) {
        return new Order(orderDTO.getOrderList().get(0).getAmount(), orderDTO.getOrderList().get(0).getItem(), orderDTO.getCustomer());
    }
}
