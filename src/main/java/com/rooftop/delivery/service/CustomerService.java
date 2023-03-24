package com.rooftop.delivery.service;

import com.rooftop.delivery.entity.Customer;
import com.rooftop.delivery.entity.DeliveryPerson;
import com.rooftop.delivery.entity.Order;
import com.rooftop.delivery.repo.CustomerRepository;

import java.util.Optional;

public class CustomerService {

    private CustomerRepository customerRepository;
    private OrderService orderService;

    private int numberOfCustomerOrders;
    private int[][] orderTimeAndDeliveryTime;

    public CustomerService(int numberOfCustomerOrders, int[][] orderTimeAndDeliveryTime, int deliveryBoys, CustomerRepository customerRepository) {
        this.numberOfCustomerOrders = numberOfCustomerOrders;
        this.orderTimeAndDeliveryTime = orderTimeAndDeliveryTime;
        this.customerRepository = customerRepository;
        this.orderService = new OrderService(new DeliveryPerson[deliveryBoys]);
    }

    public Customer getCustomer(int customerId, String name) {
        return customerRepository.getCustomer(customerId, name);
    }

    public void buildOrderForCustomersAndDeliverConfirmedOrders() {
        for (int i = 0; i < numberOfCustomerOrders; i++) {
            Customer customer = getCustomer(i, "C" + (i + 1));
            Order order = orderService.getOrder(orderTimeAndDeliveryTime[i][0], orderTimeAndDeliveryTime[i][1]);
            customer.setOrder(order);
            Optional<DeliveryPerson> deliveryPerson = orderService.getDeliveryBoyAssignedForOrder(order);
            if (deliveryPerson.isEmpty()) {
                System.out.println(customer.getName() + " - No Food :-(");
            } else {
                System.out.println(customer.getName() + " - " + deliveryPerson.get().getName());
            }
        }
    }
}
