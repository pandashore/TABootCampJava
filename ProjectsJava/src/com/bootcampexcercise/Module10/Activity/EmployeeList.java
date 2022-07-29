package com.bootcampexcercise.Module10.Activity;

import java.util.ArrayList;
import java.util.List;
import com.bootcampexcercise.Module10.Activity.Employee;

public class EmployeeList {

    public static void main(String[] args) {


        Employee one = new Employee(1500, "HospitalComp", "Nurse");
        Employee employeeTWO = new Employee(2500, "HospitalComp", "Police");
        Employee employeeTHREE = new Employee(1000, "HospitalComp", "Dancer");
        Employee employeeFOUR = new Employee(3500, "HospitalComp", "Painter");
        Employee employeeFIVE = new Employee(4000, "HospitalComp", "Singer");


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(one);
        employeeList.add(employeeTWO);
        employeeList.add(employeeTHREE);
        employeeList.add(employeeFOUR);
        employeeList.add(employeeFIVE);


        double salary = 0;

        for (Employee employee : employeeList) {
            double loopSalary = employee.getSalary();

            if (loopSalary > salary) {
                salary = loopSalary;
            }

        }
        System.out.println("The Employee whose salary is the highest is :" + salary);

    }
}
