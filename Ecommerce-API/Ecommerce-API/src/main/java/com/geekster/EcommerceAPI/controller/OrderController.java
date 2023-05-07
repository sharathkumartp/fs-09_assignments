package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/order")
    public String saveAddress(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping(value = "/get-order")
    public Order getOrder(@RequestParam Integer oderId){
        return orderService.getOder(oderId);
    }
}
