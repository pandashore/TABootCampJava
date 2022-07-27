package com.bootcampexcercise.module5.activity.Abstraction;

public class Circle extends Shape {
    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double radius;
    private String color;
    private double area;
    private double perimeter;
    private static final double pi = 3.14;
    public Circle(){
        System.out.println("I am a circle");
    }
    //getter and setter for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (pi*(radius*radius));
    }

    @Override
    public double calculatePerimeter() {
        return pi*radius;
    }


}
