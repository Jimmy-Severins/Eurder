package com.switchfully;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    public OrderDTO createOrder(CreateOrderDTO createOrderDTO) {
        Order order = orderMapper.mapToOrder(createOrderDTO);
        orderRepository.addOrder(order);
        return orderMapper.mapToOrderDTO(order);
    }



}
