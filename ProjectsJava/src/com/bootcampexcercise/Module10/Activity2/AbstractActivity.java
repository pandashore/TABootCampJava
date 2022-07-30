package com.bootcampexcercise.Module10.Activity2;

public class AbstractActivity {
    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.setAge(28);
        employee.setName("TOM");
        employee.setSalary(2300);
        employee.setJobTitle("Painter");
        employee.setCompany("SuperDuper");

        Students student = new Students();
        student.setschoolName("Colombia");

        employee.introduce();
        student.introduce();


    }

}