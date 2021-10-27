package com.system.dms.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.dms.entity.Car;
import com.system.dms.entity.Order;
import com.system.dms.exception.DbRequestException;
import com.system.dms.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> listAll(){
        return orderMapper.selectList(new QueryWrapper<>());
    }

    public IPage<Order> paging(Integer page, Integer rows) {
        Page p = new Page(page, rows);
        Page order = orderMapper.selectPage(p, new QueryWrapper<Order>());
        return order;
    }

    @Transactional
    public void addOrder(Order order) {
        try {
            orderMapper.insert(order);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new DbRequestException("E01", "Database insert error");
        }
    }

    @Transactional
    public void deleteOrder(Integer id) {
        try {
            orderMapper.deleteById(id);
        } catch (Exception e) {
            throw new DbRequestException("E02", "Database delete error");
        }
    }

    @Transactional
    public void updateOrder(Order order) {
        try {
            Order org = orderMapper.selectById(order.getId());
            org.setId(order.getId());
            org.setName(order.getName());
            org.setOrigin(order.getOrigin());
            org.setDestination(order.getDestination());
            org.setCar_license(order.getCar_license());
            org.setProduct_weight(order.getProduct_weight());
            org.setStatus(order.getStatus());
        } catch (Exception e) {
            throw new DbRequestException("E03", "Database update error");
        }
    }



}
