package com.bootcampexcercise.Module10.Activity2;

import com.bootcampexcercise.Module10.Activity1.Person;

public class Students extends Person {

    private String schoolName;

    public Students(){
        this.schoolName = "schoolName";
    }


    public String getschoolName() {
        return schoolName;
    }

    public void setschoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("I study in university " + getschoolName());

    }

}
