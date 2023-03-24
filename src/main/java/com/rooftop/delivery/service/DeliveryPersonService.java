package com.rooftop.delivery.service;

import com.rooftop.delivery.entity.DeliveryPerson;
import com.rooftop.delivery.repo.DeliveryPersonRepository;
import com.rooftop.delivery.repo.DeliveryPersonRepositoryImpl;

public class DeliveryPersonService {
    private DeliveryPersonRepository deliveryPersonRepository = new DeliveryPersonRepositoryImpl();

    public DeliveryPerson getDeliveryPerson(Integer deliveryPersonId, String name, Integer busyTime) {
        return deliveryPersonRepository.getDeliveryPerson(deliveryPersonId, name, busyTime);
    }
}
