package com.bootcampexcercise.Module10.Activity6;


import com.bootcampexcercise.Module10.Activity6.Bike;
import com.bootcampexcercise.Module10.Activity6.Car;

public class InterfaceActivityClass {

    public static void main(String arg[]) {

        Bike B = new Bike();

        Car C = new Car();
         B.start();
         C.start();

         B.stop();
         C.stop();

    }
}
