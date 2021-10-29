package com.system.dms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("dms.car")
public class Car {

    @TableId
    private Long id;

    @TableField("car_license")
    private String carLicense;

    @TableField("driver_name")
    private String driverName;

    @TableField("driver_phonenumber")
    private Integer driverPhonenumber;

    @TableField("status")
    private String status;

    @TableField("driver_address")
    private String driverAddress;

    @TableField("driver_id_number")
    private String driverIdNumber;

    public Car() {
    }

    public Car(Long id, String carLicense, String driverName, Integer driverPhonenumber,
        String status, String driverAddress, String driverIdNumber) {
        this.id = id;
        this.carLicense = carLicense;
        this.driverName = driverName;
        this.driverPhonenumber = driverPhonenumber;
        this.status = status;
        this.driverAddress = driverAddress;
        this.driverIdNumber = driverIdNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getDriverPhonenumber() {
        return driverPhonenumber;
    }

    public void setDriverPhonenumber(Integer driverPhonenumber) {
        this.driverPhonenumber = driverPhonenumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    public String getDriverIdNumber() {
        return driverIdNumber;
    }

    public void setDriverIdNumber(String driverIdNumber) {
        this.driverIdNumber = driverIdNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", carLicense='" + carLicense + '\'' +
            ", driverName='" + driverName + '\'' +
            ", driverPhonenumber=" + driverPhonenumber +
            ", status='" + status + '\'' +
            ", driverAddress='" + driverAddress + '\'' +
            ", driverIdNumber='" + driverIdNumber + '\'' +
            '}';
    }
}
