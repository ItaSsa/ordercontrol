package com.devsup.ordercontrol.services;

import com.devsup.ordercontrol.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippimentService shippimentService;

    public Double total(Order order){
        Double value_discount = (100 - order.getDiscount()) / 100;
        return (order.getBasic() * value_discount) + shippimentService.shipment(order);
    }
}
