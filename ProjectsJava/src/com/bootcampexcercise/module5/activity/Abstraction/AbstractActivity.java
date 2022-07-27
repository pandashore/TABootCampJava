package com.bootcampexcercise.module5.activity.Abstraction;

public class AbstractActivity {
    public static void main(String args[]) {
        // set and Print color of rectangle
        // Give area of rectangle
        // Print perimeter of rectangle

        // set and Print color of circle
        // Give area of circle
        // Print perimeter of circle
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        System.out.println(rectangle.getColor());
        rectangle.setSideA(10);
        rectangle.setSideB(15);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        // set and Print color of circle
        Circle circle = new Circle();
        circle.setColor("Green");
        System.out.println(circle.getColor());
        // Give area of circle
        // Print perimeter of circle
        circle.setRadius(9);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }
}
