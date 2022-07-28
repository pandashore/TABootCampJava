package com.bootcampexcercise.Module7.Activity;

public class ArithmeticExceptionActivity {
    //TODO: 1 - Type main method
    public static void main(String[] args) {

        //TODO: 2  Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0
        ArithmeticExceptionActivity ATA = new ArithmeticExceptionActivity();
        ATA.catchMe(10, 0);
        ATA.catchMe(10, 2);
    }

        void catchMe(int num1, int num2) {
            //The following code results in an Exception.
            //TODO: 3 - Identify the exception and write code to handle this exception.
            try {
                int result = num1 / num2;
                    System.out.println("The result is :" + result);

            }catch (ArithmeticException arithmeticException){
                System.out.println("Cannot divide by 0");
                    //TODO: 4 - After handling the exception, write a finally block which
                    //prints a message "Thank you for using this program."
                }finally {
                    System.out.println("Thank you for using this program.");
                }

        }
}
