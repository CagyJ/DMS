package com.system.dms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigInteger;

@TableName("dms.car")
public class Car {
    @TableId
    private BigInteger id;

    @TableField("car_license")
    private String car_license;

    @TableField("driver_name")
    private String driver_name;

    @TableField("driver_phonenumber")
    private int driver_phonenumber;

    @TableField("status")
    private String status;

    @TableField("driver_address")
    private String driver_address;

    @TableField("driver_id_number")
    private String driver_idnumber;

    public Car(){

    }

    public Car(BigInteger id, String car_license, String driver_name, int driver_phonenumber, String status, String driver_address, String driver_idnumber) {
        this.id = id;
        this.car_license = car_license;
        this.driver_name = driver_name;
        this.driver_phonenumber = driver_phonenumber;
        this.status = status;
        this.driver_address = driver_address;
        this.driver_idnumber = driver_idnumber;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCar_license() {
        return car_license;
    }

    public void setCar_license(String car_license) {
        this.car_license = car_license;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public int getDriver_phonenumber() {
        return driver_phonenumber;
    }

    public void setDriver_phonenumber(int driver_phonenumber) {
        this.driver_phonenumber = driver_phonenumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDriver_address() {
        return driver_address;
    }

    public void setDriver_address(String driver_address) {
        this.driver_address = driver_address;
    }

    public String getDriver_idnumber() {
        return driver_idnumber;
    }

    public void setDriver_idnumber(String driver_idnumber) {
        this.driver_idnumber = driver_idnumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", car_license='" + car_license + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", driver_phonenumber=" + driver_phonenumber +
                ", status='" + status + '\'' +
                ", driver_address='" + driver_address + '\'' +
                ", driver_idnumber='" + driver_idnumber + '\'' +
                '}';
    }
}
