package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<EmployeeBean> employeeList = EmployeeUtil.getAllEmployeeList();
        System.out.println("##############  Before Sorting  ##########");
        employeeList.forEach(System.out::println);
        List<EmployeeBean> employeeBeansObj= employeeList.stream()
                .sorted(Comparator.comparingDouble(EmployeeBean::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("### After Sorting:: reverse Order by Salary ###");
        employeeBeansObj.forEach(System.out::println);
    }
}
