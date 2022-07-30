package com.bootcampexcercise.Module10.Activity1;

public abstract class Person {

    private String name;
    private int age;

    public Person() {
        this.name = "name";
        this.age = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void introduce();

}
