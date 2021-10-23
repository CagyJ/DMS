package com.system.dms.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.system.dms.entity.Car;
import com.system.dms.exception.DbRequestException;
import com.system.dms.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    @ResponseBody
    public Map all(){
        List<Car> cars = carService.listAll();
        HashMap map = new HashMap();
        map.put("cars",cars);
        return map;
    }

    @PostMapping("/list")
    @ResponseBody
    public IPage<Car> list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        if (page == null) {
            page = 1;
        }
        if (rows == null) {
            rows = 5;
        }
        IPage<Car> cars = carService.paging(page, rows);
        return cars;
    }

    @PostMapping("/add")
    @ResponseBody
    public Map addCar(Car car, Integer curPage, Integer pageSize, RedirectAttributes attr) {
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
