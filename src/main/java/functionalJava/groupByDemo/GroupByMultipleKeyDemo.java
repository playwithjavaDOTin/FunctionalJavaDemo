package functionalJava.groupByDemo;

import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByMultipleKeyDemo {

    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("########## Existing Data ############### ");
        empList.forEach(System.out::println);

        //Using Method Reference,you can do the same using Lambda Expression also
        Map<String,Map<String,List<EmployeeBean>>> empMap=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,Collectors.groupingBy(EmployeeBean::getDesig)));
        System.out.println("# MAP Data:: "+empMap);
    }
}


