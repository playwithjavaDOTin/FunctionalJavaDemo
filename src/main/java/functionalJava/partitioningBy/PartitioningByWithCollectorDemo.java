package functionalJava.partitioningBy;

import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByWithCollectorDemo {
    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("######  Input Data ######");
        empList.forEach(System.out::println);

        Map<Boolean,List<String>> empMap =empList.stream()
                .collect(Collectors.partitioningBy(x->x.getSalary()>70000,Collectors.mapping(EmployeeBean::getName,Collectors.toList())));
        System.out.println("### Result :: "+empMap);

        Map<Boolean,Long> empMap1 =empList.stream()
                .collect(Collectors.partitioningBy(x->x.getSalary()>70000,Collectors.counting()));
        System.out.println("### Count Of Employee :: "+empMap1);


        Map<Boolean,Integer> empMap2 =empList.stream()
                .collect(Collectors.partitioningBy(x->x.getSalary()>70000,Collectors.summingInt(EmployeeBean::getSalary)));
        System.out.println("### Sum Of Salary :: "+empMap2);

        Map<Boolean, IntSummaryStatistics> empMap3 =empList.stream()
                .collect(Collectors.partitioningBy(x->x.getSalary()>70000,Collectors.summarizingInt(EmployeeBean::getSalary)));
        System.out.println("### Summery :: "+empMap3);
    }
}
