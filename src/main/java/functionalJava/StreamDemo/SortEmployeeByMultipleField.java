package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeByMultipleField {
    public static void main(String[] args) {

        List<EmployeeBean> employeeList = EmployeeUtil.getAllEmployeeList();
        System.out.println("Before Sorting ::");
        employeeList.forEach(System.out::println);


        List<EmployeeBean> sortedEMpDataNaturalOrder=employeeList.stream()
                .sorted(Comparator.comparing(EmployeeBean::getName))
                .collect(Collectors.toList());
        System.out.println("After Sorting :: Natural Order ::>");
        sortedEMpDataNaturalOrder.forEach(System.out::println);


        List<EmployeeBean> sortByNameAndCity=employeeList.stream()
                .sorted(Comparator.comparing(EmployeeBean::getName)
                        .thenComparing(EmployeeBean::getCity))
                .collect(Collectors.toList());
        System.out.println("After Sorting :: By Name & City ::>");
        sortByNameAndCity.forEach(System.out::println);

        List<EmployeeBean> sortByNameAndCityReverse=employeeList.stream()
                .sorted(Comparator.comparing(EmployeeBean::getName)
                        .thenComparing(EmployeeBean::getCity).reversed())
                .collect(Collectors.toList());
        System.out.println("After Sorting ::By Name & City :: Reverse Order ::>");
        sortByNameAndCityReverse.forEach(System.out::println);
    }
}
