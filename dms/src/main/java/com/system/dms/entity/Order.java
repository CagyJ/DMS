package com.system.dms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("dms.order")
public class Order {

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    @TableField("origin")
    private String origin;//起点

    @TableField("destination")
    private String destination;

    @TableField("car_license")
    private String car_license;

    @TableField("product_weight")
    private double product_weight;

    @TableField("status")
    private String status;

    public Order(){

    }

    public Order(Long id,String name,String origin,String destination,String car_license,double product_weight,String status){
        this.id=id;
        this.name=name;
        this.origin=origin;
        this.destination=destination;
        this.car_license=car_license;
        this.product_weight=product_weight;
        this.status=status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCar_license() {
        return car_license;
    }

    public void setCar_license(String car_license) {
        this.car_license = car_license;
    }

    public double getProduct_weight() {
        return product_weight;
    }

    public void setProduct_weight(double product_weight) {
        this.product_weight = product_weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", car_license='" + car_license + '\'' +
                ", product_weight=" + product_weight +
                ", status='" + status + '\'' +
                '}';
    }
}
