package com.devsup.ordercontrol.services;

import com.devsup.ordercontrol.entities.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {

    @Test
    void total() {
        Order order = new Order(1034,150.00,20.00);
        OrderService orderService = new OrderService();
        assertEquals(150,orderService.total(order));
    }
}