package com.bootcampexcercise.Module7.Activity;

//1 - extend this class from Exception class
public class CustomExceptionActivity extends Exception {

    //2 - Override getMessage() and provide the following message
    // "You are not allowed to use this program"
    public String getMessage() {
        return "You are not allowed to use this program";
    }


}
