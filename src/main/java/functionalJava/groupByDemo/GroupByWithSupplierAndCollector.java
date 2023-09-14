package functionalJava.groupByDemo;

import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByWithSupplierAndCollector {

    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("########## Existing Data ############### ");
        empList.forEach(System.out::println);

        Map<String,Double> empMap=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        TreeMap::new,
                        Collectors.averagingInt(EmployeeBean::getSalary)
                ));

        System.out.println("# MAP Data:: "+empMap);
    }
}


