package com.bootcampexcercise.module5.activity.Abstraction;

import java.awt.geom.Area;

public abstract class Shape {
    public String color;
    private double area;
    private double perimeter;

    public Shape() {
    }

    //getter and setter for area and perimeter
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public abstract double calculateArea();
    public abstract double calculatePerimeter();


    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }

}
