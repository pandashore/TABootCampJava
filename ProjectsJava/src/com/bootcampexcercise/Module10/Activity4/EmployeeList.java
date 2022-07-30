package com.bootcampexcercise.Module10.Activity4;
import java.util.ArrayList;
import java.util.List;
import com.bootcampexcercise.Module10.Activity2.Employee;

public class EmployeeList {
    public static void main(String[] arg) {

        Employee eOne = new Employee("Painter", 3000, "SuperDuper");
        Employee eTwo = new Employee("Nurse", 1500, "Hospitalia");
        Employee eThree = new Employee("Butcher", 3000, "Landmarket");
        Employee eFour = new Employee("Dancer", 2600, "Academy");
        Employee eFive = new Employee("Veterinar", 1900, "VetTech");

        List<Employee> EmployeeList = new ArrayList<>();
        EmployeeList.add(eOne);
        EmployeeList.add(eTwo);
        EmployeeList.add(eThree);
        EmployeeList.add(eFour);
        EmployeeList.add(eFive);

        double salary = 2600;
        for (Employee e : EmployeeList) {
            double loopSalary = e.getSalary();

            if (loopSalary > salary) {
                salary = loopSalary;
            }
        }

        System.out.println("The Employee whose salary is the highest is :" + salary);

    }
}
