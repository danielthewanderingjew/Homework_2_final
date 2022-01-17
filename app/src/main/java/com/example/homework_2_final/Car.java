package com.example.homework_2_final;

import java.io.Serializable;

public class Car implements Serializable {

    private int Photo;
    private String Brand;
    private String Model;
    private String Year;
    private String Price;

    public int getImage() { return Photo; }
    public String getBrand() { return Brand;}
    public String getModel() { return Model;}
    public String getYear() {return Year;}
    public String getPrice() {return Price;}

    public Car(int photo, String brand, String model, String year, String price)
    {
        this.Photo = photo;
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.Price = price;
    }

}
