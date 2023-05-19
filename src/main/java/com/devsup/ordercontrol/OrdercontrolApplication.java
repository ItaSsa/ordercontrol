package com.devsup.ordercontrol;

import com.devsup.ordercontrol.entities.Order;
import com.devsup.ordercontrol.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsup"})
public class OrdercontrolApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(OrdercontrolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034,150.00,20.00);
		System.out.println(orderService.total(order));
	}
}
