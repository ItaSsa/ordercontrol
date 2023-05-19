package com.devsup.ordercontrol.services;

import com.devsup.ordercontrol.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippimentService {

    public Double shipment(Order order){

        if(order.getBasic()<100.00){
            return 20.00;
        }

        if(order.getBasic()>=100 && order.getBasic()<200.00){
            return 12.00;
        }

        return 0.00;
    }
}
