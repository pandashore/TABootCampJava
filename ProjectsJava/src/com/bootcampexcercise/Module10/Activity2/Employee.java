package com.bootcampexcercise.Module10.Activity2;

import com.bootcampexcercise.Module10.Activity1.Person;

public class Employee extends Person {

    private double salary;
    private String company;
    private String jobTitle;

    public Employee(String painter, int i, String superDuper) {
        this.salary = 0;
        this.company = "Company";
        this.jobTitle = "JobTitle";
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + getName());
        System.out.println("I am " + getAge() + " years old");
        System.out.println("I work as " + getJobTitle() + " in " + getCompany());
        System.out.println("My salary is " + getSalary());

    }
}