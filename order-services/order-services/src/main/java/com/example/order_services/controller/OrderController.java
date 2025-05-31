package com.example.order_services.controller;

import com.example.order_services.kafka.OrderProducer;
import com.example.order_services.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderProducer orderProducer;

    @PostMapping
    public String placeOrder(@RequestBody Order order) {
        orderProducer.sendOrder(order);
        return "Order placed successfully!";
    }
}
