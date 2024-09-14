package com.example.Mahesh.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class mobile {
    @Id
    private int mobileId;
    private String mobileName;
    private String mobileSeries;
    private int mobileManufactureDate;

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileSeries() {
        return mobileSeries;
    }

    public void setMobileSeries(String mobileSeries) {
        this.mobileSeries = mobileSeries;
    }

    public int getMobileManufactureDate() {
        return mobileManufactureDate;
    }

    public void setMobileManufactureDate(int mobileManufactureDate) {
        this.mobileManufactureDate = mobileManufactureDate;
    }
}
