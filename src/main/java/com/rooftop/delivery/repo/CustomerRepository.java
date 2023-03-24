package com.rooftop.delivery.repo;

import com.rooftop.delivery.entity.Customer;

public interface CustomerRepository { // extends JpaRepository<Customer, Integer> {

    Customer getCustomer(int customerId, String name);

}
