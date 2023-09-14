package functionalJava.Lambda.comparableDemo;

import functionalJava.bean.Employee;
import functionalJava.bean.EmployeeWithComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpComparableDemo {
    public static void main(String[] args) {
        EmployeeWithComparable e1=new EmployeeWithComparable(1,"Ishan","ishan@gmail.com");
        EmployeeWithComparable e2=new EmployeeWithComparable(1,"Mohan","mohan@gmail.com");
        EmployeeWithComparable e3=new EmployeeWithComparable(1,"Shyam","shyam@gmail.com");
        EmployeeWithComparable e4=new EmployeeWithComparable(1,"Shivansh","shivansh@gmail.com");

        List<EmployeeWithComparable> ee=new ArrayList<>();
        ee.add(e1);
        ee.add(e2);
        ee.add(e3);

        Collections.sort(ee);

        ee.forEach(System.out::println);
    }
}
