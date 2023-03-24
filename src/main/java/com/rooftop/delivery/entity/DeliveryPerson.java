package com.rooftop.delivery.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Setter
@Getter
@Builder
public class DeliveryPerson {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer deliveryPersonId;
    private String name;
    private Integer busyTime;
}
