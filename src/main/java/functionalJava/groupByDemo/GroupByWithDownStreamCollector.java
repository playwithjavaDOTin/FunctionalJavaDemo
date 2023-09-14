package functionalJava.groupByDemo;

import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByWithDownStreamCollector {

    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("########## Existing Data ############### ");
        empList.forEach(System.out::println);

        //Using Method Reference,you can do the same using Lambda Expression also
        Map<String,Integer> empMap=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        Collectors.summingInt(EmployeeBean::getSalary)));
        System.out.println("# City wise Total Salary :: "+empMap);

        Map<String,Integer> empMap1=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getDesig,
                        Collectors.summingInt(EmployeeBean::getSalary)));
        System.out.println("# Desig wise Total Salary  :: "+empMap1);

        Map<String, IntSummaryStatistics> empMap2=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        Collectors.summarizingInt(EmployeeBean::getSalary)));
        System.out.println("# City wise Salary Summary:: "+empMap);

        Map<String,Double> empMap3=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        Collectors.averagingInt(EmployeeBean::getSalary)));
        System.out.println("# City wise Avg Salary :: "+empMap);

        Map<String,Long> empMap4=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        Collectors.counting()));
        System.out.println("# City wise Employee Count :: "+empMap);

        Map<String, Optional<EmployeeBean>> empMap5=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        Collectors.maxBy(Comparator.comparing(EmployeeBean::getSalary))));
        System.out.println("# City wise MAX Salary Employee :: "+empMap);
    }
}


