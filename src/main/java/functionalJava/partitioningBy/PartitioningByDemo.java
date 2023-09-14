package functionalJava.partitioningBy;

import functionalJava.bean.EmployeeBean;
import util.AppUtil;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDemo {
    public static void main(String[] args) {
        List<EmployeeBean> empList= AppUtil.getEmpList();
        System.out.println("######  Input Data ######");
        empList.forEach(System.out::println);

        Map<Boolean,List<EmployeeBean>> empMap =empList.stream()
                .collect(Collectors.partitioningBy(x->x.getSalary()>70000));
        System.out.println("### Result :: "+empMap);
    }
}
