package com.bootcampexcercise.module2.activity;

public class AddWholeNum {

    public static void main(String args[]) {
        // we want to perform sum of all whole numbers from 50 to 100//
        int sum = 0;
        for (int j = 50; j <= 100; j++) { //for loop repeats the action until the condition is true//
           //initial, number of counts, increment/decrement
            sum = sum + j;
        }
        System.out.println("sum of first whole numbers is" + sum);
    }
}