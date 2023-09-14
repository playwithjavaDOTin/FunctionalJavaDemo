package functionalJava.groupByDemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("########## Existing Data ############### ");
        empList.forEach(System.out::println);

        //Using Method Reference,you can do the same using Lambda Expression also
        Map<String,List<EmployeeBean>> empMap=empList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getCity));

          /*  Map<String,List<EmployeeBean>> empMap=empList.stream()
                .collect(Collectors.groupingBy(x->x.getCity()));*/

        System.out.println("# MAP Data:: "+empMap);
    }



/*
    public static void covertInJSON(Object obj){
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonData=mapper.writeValueAsString(obj);
            // System.out.println("#DATA :: "+jsonData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
*/

   // }
}


