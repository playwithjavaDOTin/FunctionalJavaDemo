package util;

import functionalJava.bean.Employee;

import java.util.List;

public class EmployeeUtility {

    public static List<Employee> getEmployeeList(){

        Employee e1=new Employee(1,"Ishan","ishan@gmail.com");
        Employee e2=new Employee(1,"Mohan","mohan@gmail.com");
        Employee e3=new Employee(1,"Shyam","shyam@gmail.com");
        Employee e4=new Employee(1,"Shivansh","shivansh@gmail.com");
        List employeeList=List.of(e1,e2,e3,e4);
       return employeeList;
    }
}
