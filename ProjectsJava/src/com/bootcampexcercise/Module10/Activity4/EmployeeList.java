package com.bootcampexcercise.Module10.Activity4;
import java.util.ArrayList;
import java.util.List;
import com.bootcampexcercise.Module10.Activity2.Employee;

public class EmployeeList {
    public static void main(String[] arg) {

        Employee eOne = new Employee("Painter", 3000, "SuperDuper");
        Employee employeeTwo = new Employee("Nurse", 1500, "Hospitalia");
       Employee employeeThree = new Employee("Butcher", 3000, "Landmarket");
        Employee employeeFour = new Employee("Dancer", 2600, "Academy");
        Employee employeeFive = new Employee("Veterinar", 1900, "VetTech");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(eOne);
        employeeList.add(employeeTwo);
        employeeList.add(employeeThree);
        employeeList.add(employeeFour);
        employeeList.add(employeeFive);


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
