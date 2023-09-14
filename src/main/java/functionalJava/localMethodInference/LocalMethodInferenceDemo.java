package functionalJava.localMethodInference;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.stream.Collectors;

public class LocalMethodInferenceDemo {
    public static void main(String[] args) {

        var employeeBeanList =EmployeeUtil.getAllEmployeeList();
        System.out.println("####  employeeBeanList  :: "+employeeBeanList);

        var filteredEmpList=employeeBeanList.stream()
                .map(EmployeeBean::getName)
                .collect(Collectors.toList());
        System.out.println("##  filteredEmpList  ## "+filteredEmpList);

        var groupByName=employeeBeanList.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getName));
        System.out.println("## groupByName  :: "+groupByName);


        var partitionData=employeeBeanList.stream()
                .collect(Collectors.partitioningBy(x->x.getName().startsWith("A")));
        System.out.println("### partitionData :: "+partitionData);
    }
}
