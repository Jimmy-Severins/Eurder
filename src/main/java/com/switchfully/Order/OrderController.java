package com.switchfully.Order;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = "application/json")
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json", produces = "application/json")
    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.createOrder(orderDTO);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = "application/json", path = "/customer/{id}")
    public String getOrdersByCustomerId(@PathVariable String id) {
        UUID customerId = UUID.fromString(id);
        return orderService.generateReport(customerId);
    }
}
