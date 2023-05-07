package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    public String saveOrder(Order order) {
        return "save Order";
    }

    public Order getOder(Integer orderId) {
        if(orderRepo.findById(orderId).isPresent())
            return orderRepo.findById(orderId).get();
        else
            return null;
    }
}
