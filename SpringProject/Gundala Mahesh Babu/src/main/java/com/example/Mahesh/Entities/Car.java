package com.example.Mahesh.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    private int carId;
    private String carName;
    private String carModel;
    private int carCC;
    private int carManufacturerDate;

    public void setCarId(int carId){
        this.carId=carId;
    }
    public int getCarId(){
        return carId;
    }

    public void setCarName(String carName){
        this.carName=carName;
    }
    public String getCarName(){
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarCC() {
        return carCC;
    }

    public void setCarCC(int carCC) {
        this.carCC = carCC;
    }

    public int getCarManufacturerDate() {
        return carManufacturerDate;
    }

    public void setCarManufacturerDate(int carManufacturerDate) {
        this.carManufacturerDate = carManufacturerDate;
    }
}
