package com.devsup.ordercontrol.services;

import com.devsup.ordercontrol.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippimentService {

    public Double shipment(Order order){

        Double ship = (order.getBasic()<100.00) 
        		? 20.00
        		: (order.getBasic()>=100 && order.getBasic()<200.00) 
        			? 12.00
        			:0.00;

        return ship;
    }
}
