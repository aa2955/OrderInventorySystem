package com.example.inventory_service.kafka;

import com.example.inventory_service.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "orders", groupId = "inventory-group")
    public void consume(Order order) {
        System.out.println("📦 InventoryService - Order received:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Product ID: " + order.getProductId());
        System.out.println("Quantity: " + order.getQuantity());

        // Simulate inventory update logic here
        System.out.println("✅ Inventory updated for product " + order.getProductId());
    }
}
