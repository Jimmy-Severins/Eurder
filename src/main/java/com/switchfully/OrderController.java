package com.switchfully;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/create")
    public OrderDTO createOrder(@RequestBody CreateOrderDTO createOrderDTO) {
        return orderService.createOrder(createOrderDTO);
    }
}
