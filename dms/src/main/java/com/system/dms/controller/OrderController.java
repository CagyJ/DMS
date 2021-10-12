package com.system.dms.controller;


import com.system.dms.entity.Order;
import com.system.dms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    @ResponseBody
    public Map list(){
        List<Order> orders = orderService.listAll();
        HashMap map=new HashMap();
        map.put("orders",orders);
        return map;
    }

}
