package com.bootcampexcercise.module5.activity.Abstraction;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double sideA;
    private double sideB;
    private double area;
    private double perimeter;


    public Rectangle(){
        System.out.println("I am a rectangle");
    }

    @Override
    public double calculateArea() {
        return (sideA*sideB);
    }

    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double calculatePerimeter() {
        return (sideA + sideB)*2;
    }


}
