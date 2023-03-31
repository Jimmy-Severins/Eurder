package com.switchfully.Order;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

    private final OrderMapper orderMapper;

    private final OrderRepository  orderRepository;

    public OrderService(OrderMapper orderMapper, OrderRepository orderRepository) {
        this.orderMapper = orderMapper;
        this.orderRepository = orderRepository;
    }

    public List<OrderDTO> getAllOrders() {
        return orderMapper.mapToDTO(orderRepository.getOrders());
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = orderMapper.mapToDomain(orderDTO);
        orderRepository.addOrder(order);
        return orderMapper.mapToDTO(order);
    }
}
