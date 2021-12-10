package com.system.dms.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.dms.entity.Car;
import com.system.dms.mapper.CarMapper;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CarServiceSmokeTest {

    @InjectMocks
    private CarService carService;

    @Mock
    private CarMapper carMapper;

    static Car getCar() {
        Car car = new Car();
        car.setId(10L);
        car.setCarLicense("a123");
        car.setDriverName("Jack");
        car.setDriverPhonenumber(1234);
        car.setStatus("free");
        car.setDriverAddress("China");
        car.setDriverIdNumber("a123");
        return car;
    }

    @Test
    void testNull(){
        assertThat(carService).isNotNull();
        assertThat(carMapper).isNotNull();
    }

    @Test
    void testListAll() {
        ArrayList<Car> list = new ArrayList<>();
        list.add(getCar());

        when(carMapper.selectList(new QueryWrapper<>()))
            .thenReturn(list.stream().toList());
        System.out.println( carMapper.selectList(new QueryWrapper<>()));
        List<Car> cars = carService.listAll();
        // TODO get empty, need to fix
    }

    @Test
    void testFindById() {
        Car car = getCar();

        when(carMapper.selectById(10))
            .thenReturn(car);

        Car res = carService.findById(10);

        assertThat(res)
            .isNotNull()
            .isEqualTo(car);
    }

    @Test
    void testFindByIdNull() {
        when(carMapper.selectById(10))
            .thenReturn(null);

        Car res = carService.findById(10);

        assertThat(res).isNull();
    }
}
