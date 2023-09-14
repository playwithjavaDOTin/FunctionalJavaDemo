package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<EmployeeBean> empData = EmployeeUtil.getAllEmployeeList();

        List<EmployeeBean> employeeBeansList=empData.stream()
                .collect(Collectors.toUnmodifiableList());

        Set<EmployeeBean> employeeBeansSet=empData.stream()
                .collect(Collectors.toUnmodifiableSet());

        Map<String,Integer> empMap =empData.stream()
                .collect(Collectors.toMap(x->x.getName(),y->y.getSalary()));

        Map<String,Integer> empMap1 = empData.stream()
                .collect(Collectors.toUnmodifiableMap(x->x.getName(),y->y.getSalary()));





                // Create a list of integers
                List<Integer> numbers = Stream.of(10,20,30,40)
                        .collect(Collectors.toList());

                // Use collectingAndThen to get the sum of all integers in the list
                int sum = numbers.stream()
                        .collect(Collectors.collectingAndThen(
                                Collectors.summingInt(x->x.intValue()),
                                result -> {
                                    System.out.println("Transforming result Data: " + result);
                                    return result * result;
                                }
                        ));

                System.out.println("Final result Data: " + sum);


        Long avgSal=EmployeeUtil.getAllEmployeeList().stream()
                .collect(Collectors.collectingAndThen(Collectors.averagingInt(x->x.getSalary()),x->x.longValue()*3));
        System.out.println("average salary ::"+avgSal);


        Map<String,List<EmployeeBean>> employeeBeanMap=EmployeeUtil.getAllEmployeeList().stream()
                .collect(Collectors.groupingBy(x->x.getCity()));
        System.out.println("map data :: "+employeeBeanMap);

        Map<String,Map<String,List<EmployeeBean>>> groupByCityAndDesig=EmployeeUtil.getAllEmployeeList().stream()
                .collect(Collectors.groupingBy(x->x.getCity(),Collectors.groupingBy(y->y.getDesig())));
        System.out.println("map data :: "+groupByCityAndDesig);


        Map<String,Long> integerMap=EmployeeUtil.getAllEmployeeList().stream()
                .collect(Collectors.groupingBy(x->x.getCity(),Collectors.counting()));

        System.out.println(integerMap);





    }
}
