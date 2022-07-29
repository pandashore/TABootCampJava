package com.bootcampexcercise.Module10.Activity;

import com.bootcampexcercise.Module10.Activity.Person;
import com.bootcampexcercise.Module10.Activity.Employee;
import com.bootcampexcercise.Module10.Activity.Students;



public class AbstractActivity {

    public static void main(String[] args) {

        Person pE = new Employee();
        pE.setAge(28);
        pE.setName("Tom");

        Person pS = new Students();
        pS.setAge(10);
        pS.setName("Diana");

        Employee eP = new Employee();
        eP.setAge(28);
        eP.setName("Tom");


        Employee e = new Employee();
        e.setSalary(1300);
        e.setjobTitle("JuniorSalesManager");
        e.setCompany("SuperDuper");

        Students s = new Students();
        s.setschoolName("Colombia");
        s.setAge(10);
        s.setName("Diana");

        System.out.println("Hello");
        System.out.println("Students Name         : " + pS.getName());
        System.out.println("Students Age          : " + pS.getAge());
        System.out.println("Students School Name  : " + s.getschoolName());

        System.out.println("Employee Name         : " + eP.getName());
        System.out.println("Employee Age          : " + eP.getAge());
        System.out.println("Employee Salary       : " + e.getSalary());
        System.out.println("Employee Title        : " + e.getJobTitle());
        System.out.println("Employee Company      : " + e.getCompany();

    }
}
