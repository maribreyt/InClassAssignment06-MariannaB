package com.example.android.inclass06_mariannab;

import java.io.Serializable;

/**
 * Created by maribreyt on 2/28/18.
 */

public class Car implements Serializable {

    String model;
    int year;
    String color;
    Boolean automatic;

    public Car(String model, int year, String color, Boolean automatic) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.automatic = automatic;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

    public String toString() {
        return "Model: " + model + "\nYear: " + year + "\nColor: " + color + "\nAutomatic: " + automatic;
    }
}
