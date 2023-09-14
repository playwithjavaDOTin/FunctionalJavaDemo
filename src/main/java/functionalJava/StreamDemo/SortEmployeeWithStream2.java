package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeWithStream2 {
    public static void main(String[] args) {

        List<EmployeeBean> employeeList = EmployeeUtil.getAllEmployeeList();
        System.out.println("Before Sorting ::");
        employeeList.forEach(x->System.out.println(x));

        List<EmployeeBean> sortedEMpDataNaturalOrder=employeeList.stream()
                .sorted(Comparator.comparing(e->e.getName()))
                .collect(Collectors.toList());
        System.out.println("After Sorting :: Natural Order ::>");
        sortedEMpDataNaturalOrder.forEach(x->System.out.println(x));

        List<EmployeeBean> sortedEMpDataReverseOrder=employeeList.stream()
                .sorted((a,b)->a.getName().compareTo(b.getName()))
                        .collect(Collectors.toList());

        System.out.println("After Sorting :: Reverse Order ::>");
        sortedEMpDataNaturalOrder.forEach(x->System.out.println(x));
    }
}
