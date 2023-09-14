package functionalJava.groupByDemo;

import functionalJava.bean.EmployeeBean;
import functionalJava.bean.EmployeeMappedBean;
import util.AppUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByMaping {

    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("########## Input Data ############### ");
        empList.forEach(System.out::println);

        //Using Method Reference,you can do the same using Lambda Expression also
        Map<String,List<EmployeeMappedBean>> mappedData=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        Collectors.mapping(GroupByMaping::mapEmpData,
                                Collectors.toList())));
        //System.out.println("###########  AFTER MAPPING  ###########");
       // System.out.println("## Mapped Data:: "+mappedData);



        Map<String,List<String>> mappedData1=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        Collectors.mapping(EmployeeBean::getName,
                                Collectors.toList())));
       // System.out.println("###########  AFTER MAPPING  ###########");
        //System.out.println("## Mapped Data:: "+mappedData1);

        Map<String, Set<String>> mappedData2=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        TreeMap::new,
                        Collectors.mapping(EmployeeBean::getName,
                                Collectors.toSet())));

         //System.out.println("###########  AFTER MAPPING  ###########");
         //System.out.println("## Mapped Data:: "+mappedData2);


        Map<String, Set<EmployeeBean>> mappedData3=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity,
                        TreeMap::new,
                        Collectors.toSet()));

        System.out.println("###########  AFTER MAPPING  ###########");
        System.out.println("## Mapped Data:: "+mappedData3);



    }
    public static EmployeeMappedBean mapEmpData(EmployeeBean e){
        EmployeeMappedBean data=new EmployeeMappedBean();
        data.setName(e.getName());
        data.setCity(e.getCity());
        return data;
    }
}


