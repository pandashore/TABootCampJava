package com.bootcampexcercise.module2.activity;

public class IfElseExample {
    public static void main(String []args) {
        int j = 13;

        if (j > 13) {
            System.out.println("j is greater then 10");
        } else {
            System.out.println("j is less then 10");
        }

        int m = -55;
        if (m > 10) {
            System.out.println("j is greater then 10");
        } else if (m > -1) {
            System.out.println("else if");
        } else {
            System.out.println("Something");
        }
    }
}
