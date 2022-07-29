package com.bootcampexcercise.Module10.Activity;

import com.bootcampexcercise.module5.activity.Person_I;

public class Employee extends Person {

    private double salary;
    private String company;
    private String jobTitle;

    public Employee() {System.out.println("");}


    public int getSalary() {
        return (int) salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getCompany() {
        return company;
    }
    public void setCompany(String Company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

   @Override
    public void introduce() {
        super.introduce();
        System.out.println("My name is Tom and I am 28 years old and I work as JuniorSalesManager in SuperDuper and my salary is 1300");
    }

    }
