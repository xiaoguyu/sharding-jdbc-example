package com.javaedit.controller;

import com.javaedit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjw
 * @description: 订单controller
 * @title: OrderController
 * @date 2022/7/5 16:52
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/list")
    public Object list() {
        return orderService.list();
    }

    @GetMapping("/buy")
    public Object buy() {
        orderService.buy("g111", 3);
        return "success";
    }
}
