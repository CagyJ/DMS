package com.system.dms.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.system.dms.entity.Order;
import com.system.dms.exception.DbRequestException;
import com.system.dms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public Map list() {
        List<Order> orders = orderService.listAll();
        HashMap map=new HashMap();
        map.put("orders",orders);
        return map;
    }

    @GetMapping("/find")
    @ResponseBody
    public Map find(Integer id) {
        Order order = orderService.find(id);
        HashMap map = new HashMap();
        map.put("order", order);
        return map;
    }

    @PostMapping("/list")
    @ResponseBody
    public IPage<Order> list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        if (page == null) {
            page = 1;
        }
        if (rows == null) {
            rows = 5;
        }
        IPage<Order> order = orderService.paging(page, rows);
        return order;
    }

    @PostMapping("/add")
    @ResponseBody
    public Map addCar(Order order, Integer curPage, Integer pageSize, RedirectAttributes attr) {
        Map result = new HashMap();
        try {
            orderService.addOrder(order);
            result.put("code", "1");
            result.put("message", "success");
        } catch (DbRequestException e) {
            result.put("code", e.getCode());
            result.put("message", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @PostMapping("/delete")
    @ResponseBody
    public Map deleteCar(Integer id) {
        Map result = new HashMap();
        try {
            orderService.deleteOrder(id);
            result.put("code", "1");
            result.put("message", "success");
        } catch (DbRequestException e) {
            result.put("code", e.getCode());
            result.put("message", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

}
