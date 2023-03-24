package com.rooftop.delivery.repo;

import com.rooftop.delivery.entity.DeliveryPerson;

public interface DeliveryPersonRepository { // extends JpaRepository<DeliveryPerson, Integer> {

    DeliveryPerson getDeliveryPerson(Integer deliveryPersonId, String name, Integer busyTime);

}
