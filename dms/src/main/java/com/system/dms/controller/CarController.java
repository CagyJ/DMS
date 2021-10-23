package com.system.dms.controller;


import com.system.dms.entity.Car;
import com.system.dms.exception.DbRequestException;
import com.system.dms.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/all")
    @ResponseBody
    public Map list(){
        List<Car> cars = carService.listAll();
        HashMap map = new HashMap();
        map.put("cars",cars);
        return map;
    }

    @PostMapping("/add")
    @ResponseBody
    public Map addCar(Car car) {
        Map result = new HashMap();
        try {
            carService.addCar(car);
            result.put("code", "1");
            result.put("message", "success");
        } catch (DbRequestException e) {
            result.put("code", e.getCode());
            result.put("message", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @PostMapping("/edit")
    @ResponseBody
    public Map editCar(Car car) {
        Map result = new HashMap();
        try {
            carService.updateCar(car);
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
            carService.deleteCar(id);
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
