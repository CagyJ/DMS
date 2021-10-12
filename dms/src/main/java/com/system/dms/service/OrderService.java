package com.system.dms.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.dms.entity.Order;
import com.system.dms.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> listAll(){
        return orderMapper.selectList(new QueryWrapper<>());
    }



}
