package com.system.dms.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.dms.entity.Car;
import com.system.dms.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarMapper carMapper;

    public List<Car> listAll(){
        return carMapper.selectList(new QueryWrapper<>());
    }




}
