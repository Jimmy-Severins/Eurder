package com.switchfully.Order;

import com.switchfully.Customer.Customer;
import com.switchfully.Customer.CustomerRepository;
import com.switchfully.Item.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    private final OrderMapper orderMapper;

    private final OrderRepository  orderRepository;
    private final CustomerRepository customerRepository;

    private final ItemService itemService;

    public OrderService(OrderMapper orderMapper, OrderRepository orderRepository, CustomerRepository customerRepository, ItemService itemService) {
        this.orderMapper = orderMapper;
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.itemService = itemService;
    }

    public List<OrderDTO> getAllOrders() {
        return orderMapper.mapToDTO(orderRepository.getOrders());
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = orderMapper.mapToDomain(orderDTO);
        orderRepository.addOrder(order);
        customerRepository.addCustomer(order.getCustomer());
        itemService.addItemUponCreatingOrder(orderDTO);
        return orderMapper.mapToDTO(order);
    }

    public List<OrderDTO> getOrdersByCustomerId(UUID id) {
        return orderMapper.mapToDTO(orderRepository.getOrdersByCustomerId(id));
    }

    public String generateReport(UUID customerId) {
        Customer customer = customerRepository.getCustomerById(customerId).orElse(null);
        List<Order> orders = orderRepository.getOrdersByCustomerId(customerId);
        return "Customer: " + customer.getFirstName() + " " + customer.getLastName() + " has ordered " + orders.size() + " items.";
    }
}
