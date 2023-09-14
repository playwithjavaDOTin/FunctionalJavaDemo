package functionalJava.Lambda.comparableDemo;

import functionalJava.bean.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableDemoWithLambda {
    public static void main(String[] args) {
        Comparable<Employee> c=(e1)->e1.getName().compareTo(e1.getName());

        Employee e1=new Employee(1,"Ishan","ishan@gmail.com");
        Employee e2=new Employee(1,"Mohan","mohan@gmail.com");
        Employee e3=new Employee(1,"Shyam","shyam@gmail.com");
        Employee e4=new Employee(1,"Shivansh","shivansh@gmail.com");

        List<Employee> ee=new ArrayList<>();
        ee.add(e1);
        ee.add(e2);
        ee.add(e3);

/*        //Using Comparable Interface- for Natural order
        Collections.sort(ee);
        ee.forEach(System.out::println );*/


        //for Reverse Order of Sorting
        //Collections.sort(ee,(x,y)->y.getName().compareTo(x.getName()));
       // ee.forEach(System.out::println );

/*        //for Reverse Order of Sorting
        Collections.sort(ee,(x,y)->-x.getName().compareToIgnoreCase(y.getName()));
        ee.forEach(System.out::println );*/


      List<Employee> employeeList=  ee.stream()
                .sorted(Comparator.comparing(x->x.getName()))
                .collect(Collectors.toList());

      employeeList.forEach(System.out::println);


    }
}
