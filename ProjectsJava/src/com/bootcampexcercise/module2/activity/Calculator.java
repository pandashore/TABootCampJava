package com.bootcampexcercise.module2.activity;

public class Calculator {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        int[] nums = {1, 2, 3, 4};

        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Divide - " + divide(x, y));

    }

    private static int subtract(int x, int y) {
        //TODO implement subtraction
        int diff = x - y;
        return diff;

    }

    private static int divide(int x, int y) {
        int divValue = x / y;
        if (x == 0 && y == 0) {
            //TODO complete the code so message is printed that dividing 0 with 0 is not possible
            System.out.println("Dividing 0 with 0 is not possible");
        } else if (y == 0) {
            //TODO complete the code so message is printed that division by 0 is not possible
            System.out.println("Division by 0 is not possible");
        } else if (x == 0) {
            //TODO complete the code so message is printed that division by 0 is not possible
            System.out.println("Division by 0 is not possible");
        } else {
            //TODO complete the code so that division is done
            return divValue;
        }
            return x / y;
        
    }

}