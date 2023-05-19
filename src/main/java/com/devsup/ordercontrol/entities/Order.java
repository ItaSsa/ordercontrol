package com.devsup.ordercontrol.entities;

public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }
}
