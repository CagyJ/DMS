package com.system.dms.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.dms.entity.Car;
import com.system.dms.exception.DbRequestException;
import com.system.dms.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarService {

    private CarMapper carMapper;

    @Autowired
    public void setCarMapper(CarMapper carMapper) {
      this.carMapper = carMapper;
    }

    public List<Car> listAll(){
        return carMapper.selectList(new QueryWrapper<>());
    }

    public IPage<Car> paging(Integer page, Integer rows) {
      Page p = new Page(page, rows);
      Page cars = carMapper.selectPage(p, new QueryWrapper<Car>());
      return cars;
    }

    @Transactional
    public void addCar(Car car) {
      try {
        carMapper.insert(car);
      } catch (Exception e) {
        System.out.println(e.getMessage());
        throw new DbRequestException("E01", "Database insert error");
      }
    }

    @Transactional
    public void deleteCar(Integer id) {
        try {
          carMapper.deleteById(id);
        } catch (Exception e) {
          throw new DbRequestException("E02", "Database delete error");
        }
    }

    @Transactional
    public void updateCar(Car car) {
      try {
        Car org = carMapper.selectById(car.getId());
        org.setId(car.getId());
        org.setCarLicense(car.getCarLicense());
        org.setDriverName(car.getDriverName());
        org.setDriverPhonenumber(car.getDriverPhonenumber());
        org.setStatus(car.getStatus());
        org.setDriverIdNumber(car.getDriverIdNumber());
        carMapper.updateById(org);
      } catch (Exception e) {
        throw new DbRequestException("E03", "Database update error");
      }
    }
}
