package com.rooftop.delivery;

import com.rooftop.delivery.repo.CustomerRepositoryImpl;
import com.rooftop.delivery.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RooftopApplication {

    public static void main(String[] args) {
        SpringApplication.run(RooftopApplication.class, args);
        int customerOrders = 6;
        int driverCount = 2;
        int[][] orderTimeAndTravelTime = new int[][]{{1, 10}, {4, 20}, {15, 5}, {22, 20}, {24, 10}, {25, 10}};
        CustomerService customerService = new CustomerService(customerOrders, orderTimeAndTravelTime, driverCount, new CustomerRepositoryImpl());
        customerService.buildOrderForCustomersAndDeliverConfirmedOrders();
    }
}

