package com.bootcampexcercise.Module7.Activity;

////Needs to be completed
////1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
   public static void main(String[] args) {
       // we need to create object our divide method is not static
        new ExceptionSequenceActivity().divide(10, 0);
    }

   void divide(int num1, int num2) {
        try {
           System.out.println(num1 / num2);
       } catch (ArithmeticException a) {
           System.out.println("Exception!!!");
       } catch (Exception e) {
            System.out.println("Division by zero is not allowed");
       }

    }
}
