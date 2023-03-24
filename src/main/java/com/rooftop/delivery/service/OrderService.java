package com.rooftop.delivery.service;

import com.rooftop.delivery.entity.DeliveryPerson;
import com.rooftop.delivery.entity.Order;
import com.rooftop.delivery.repo.OrderRepository;
import com.rooftop.delivery.repo.OrderRepositoryImpl;

import java.util.Objects;
import java.util.Optional;

public class OrderService {

    private OrderRepository orderRepository = new OrderRepositoryImpl();
    private DeliveryPersonService deliveryPersonService = new DeliveryPersonService();
    private DeliveryPerson[] deliveryPerson;

    OrderService(DeliveryPerson[] deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public Order getOrder(int orderTime, int deliveryTime) {
        return orderRepository.getOrder(orderTime, deliveryTime);
    }

    public Optional<DeliveryPerson> getDeliveryBoyAssignedForOrder(Order order) {
        for (int j = 0; j < deliveryPerson.length; j++) {
            DeliveryPerson dp = deliveryPerson[j];
            if (Objects.isNull(dp)) {
                dp = deliveryPersonService
                        .getDeliveryPerson(j, "D" + (j + 1), order.getOrderTime() + order.getDeliveryTime());
                deliveryPerson[j] = dp;
                order.setOrderPlaced(true);
            } else {
                if (order.getOrderTime() >= dp.getBusyTime()) {
                    dp.setBusyTime(order.getOrderTime() + order.getDeliveryTime());
                    order.setOrderPlaced(true);
                }
            }
            if (order.isOrderPlaced()) {
                return Optional.of(dp);
            }
        }
        return Optional.empty();
    }
}
