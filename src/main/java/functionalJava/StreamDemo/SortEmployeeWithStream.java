package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeWithStream {
    public static void main(String[] args) {

        List<EmployeeBean> employeeList = EmployeeUtil.getAllEmployeeList();
        System.out.println("Before Sorting ::");
        employeeList.forEach(System.out::println);

        List<EmployeeBean> sortedEMpDataNaturalOrder=employeeList.stream()
                .sorted(Comparator.comparing(EmployeeBean::getName))
                .collect(Collectors.toList());
        System.out.println("After Sorting :: Natural Order ::>");
        sortedEMpDataNaturalOrder.forEach(System.out::println);

        List<EmployeeBean> sortedEMpDataReverseOrder=employeeList.stream()
                .sorted(Comparator.comparing(EmployeeBean::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("After Sorting :: Reverse Order ::>");
        sortedEMpDataNaturalOrder.forEach(System.out::println);
    }
}
