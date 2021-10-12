package com.system.dms.controller;


import com.system.dms.entity.Car;
import com.system.dms.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/car")
    @ResponseBody
    public Map list(){
        List<Car> cars = carService.listAll();
        HashMap map = new HashMap();
        map.put("cars",cars);
        return map;

    }





}
