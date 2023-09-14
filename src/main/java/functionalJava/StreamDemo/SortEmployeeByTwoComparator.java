package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeByTwoComparator {
    public static void main(String[] args) {

        List<EmployeeBean> employeeList = EmployeeUtil.getAllEmployeeList();
        System.out.println("Before Sorting ::");
        employeeList.forEach(System.out::println);


        List<EmployeeBean> sortedEMpDataNaturalOrder=employeeList.stream()
                .sorted(Comparator.comparing(EmployeeBean::getName)
                        .thenComparingInt(EmployeeBean::getSalary).reversed())
                //.sorted(Comparator.comparingInt(EmployeeBean::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("After Sorting :: Name in Natural Order and Salary in Reverse Order ::>");
        sortedEMpDataNaturalOrder.forEach(System.out::println);



    }
}
