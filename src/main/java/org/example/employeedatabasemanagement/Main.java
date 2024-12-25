package org.example.employeedatabasemanagement;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        employeeData.deleteAllEmployees();

        Employee newEmployee1 = new Employee(0, "Jon", "Driver", 50000, new Date());
        employeeData.createEmployee(newEmployee1);

        Employee newEmployee2 = new Employee(0, "Sam", "Driver", 40000, new Date());
        employeeData.createEmployee(newEmployee2);

        Employee employee = employeeData.getEmployeeById(1);
        System.out.println(employee);

        List<Employee> employees = employeeData.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        if (employee != null) {
            employee.setSalary(40000);
            employeeData.updateEmployee(employee);
        }

        employeeData.deleteEmployee(1);
    }
}
