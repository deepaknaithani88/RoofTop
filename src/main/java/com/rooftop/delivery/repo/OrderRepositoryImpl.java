package com.rooftop.delivery.repo;

import com.rooftop.delivery.entity.Order;

public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public Order getOrder(int orderTime, int deliveryTime) {
        return Order
                .builder()
                .orderTime(orderTime)
                .deliveryTime(deliveryTime)
                .isOrderPlaced(false)
                .build();
    }

}
