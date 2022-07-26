package com.bootcampexcercise.module2.activity;

public class AddWholeNum {

    public static void main(String args[]) {
        int sum = 0;
        for (int j = 50; j <= 100; j++) {
            sum = sum + j;
        }
        System.out.println("sum of first whole numbers is" + sum);
    }
}