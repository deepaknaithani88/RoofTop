package com.rooftop.delivery.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Setter
@Getter
@Builder
public class Order {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    private Integer orderTime;
    private Integer deliveryTime;
    private boolean isOrderPlaced;
}
