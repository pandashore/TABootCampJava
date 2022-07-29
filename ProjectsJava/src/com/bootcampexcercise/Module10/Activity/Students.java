package com.bootcampexcercise.Module10.Activity;

import com.bootcampexcercise.Module10.Activity.Person;

public class Students extends Person {

    private String schoolName;

    public String getschoolName() {
        return schoolName;
    }

    public void setschoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study in Colombia University");
    }

}
