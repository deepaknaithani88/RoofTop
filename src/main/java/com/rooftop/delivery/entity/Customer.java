package com.rooftop.delivery.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Setter
@Getter
@Builder
public class Customer {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String name;
    private Order order;
}
