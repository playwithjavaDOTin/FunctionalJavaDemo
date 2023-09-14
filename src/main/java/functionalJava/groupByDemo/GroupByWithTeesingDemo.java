package functionalJava.groupByDemo;

import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByWithTeesingDemo {

    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("### Input Data ##### ");
        empList.forEach(System.out::println);

        Map<String, Double> result = empList.stream()
                .collect(Collectors.teeing(
                        Collectors.averagingInt(EmployeeBean::getSalary),
                        Collectors.counting(),
                        (averageAge, count) -> {
                            Map<String, Double> map = new HashMap<>();
                            map.put("AverageEmployeeSalary", averageAge);
                            map.put("TotalEmployeeCount", (double) count);
                            return map;
                        }
                ));
        System.out.println("Result: "+result);
    }
}


