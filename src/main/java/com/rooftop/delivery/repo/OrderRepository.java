package com.rooftop.delivery.repo;

import com.rooftop.delivery.entity.Order;

public interface OrderRepository { // extends JpaRepository<Order, Integer> {

    Order getOrder(int orderTime, int deliveryTime);

}
