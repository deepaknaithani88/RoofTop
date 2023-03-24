package com.rooftop.delivery.repo;

import com.rooftop.delivery.entity.DeliveryPerson;

public class DeliveryPersonRepositoryImpl implements DeliveryPersonRepository {

    @Override
    public DeliveryPerson getDeliveryPerson(Integer deliveryPersonId, String name, Integer busyTime) {
        return DeliveryPerson.builder()
                .deliveryPersonId(deliveryPersonId)
                .name(name)
                .busyTime(busyTime)
                .build();
    }

}
