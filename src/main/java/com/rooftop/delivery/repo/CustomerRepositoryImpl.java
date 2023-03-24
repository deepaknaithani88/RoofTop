package com.rooftop.delivery.repo;

import com.rooftop.delivery.entity.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer getCustomer(int customerId, String name) {
        return Customer.builder()
                .customerId(customerId)
                .name(name)
                .build();
    }

}
