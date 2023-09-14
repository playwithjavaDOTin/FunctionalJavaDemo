package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;


public class StreamDemoTest {
    public static void main(String[] args) {

        List<EmployeeBean> empData = EmployeeUtil.getAllEmployeeList();

        System.out.println("=================== filter Result With Single Filer ===================");
        List<EmployeeBean> filteredResultWithSingleFiler=filterEmpData(empData);
        filteredResultWithSingleFiler.forEach(x->System.out.println(x));

        System.out.println("=================== filter Result With Multiple Filer ===================");
        List<EmployeeBean> filteredResultWithMultipleFiler=filterEmpDataWithMultipleFilter(empData);
        filteredResultWithMultipleFiler.forEach(x->System.out.println(x));

    }

    public static List<EmployeeBean>  filterEmpData(List<EmployeeBean> empData){
        List<EmployeeBean> finalData=empData.stream()
                .filter(x->x.getName().startsWith("A"))
                .collect(Collectors.toList());
        return finalData;
    }

    public static List<EmployeeBean>  filterEmpDataWithMultipleFilter(List<EmployeeBean> empData){
        List<EmployeeBean> finalData=empData.stream()
                .filter(x->x.getName().startsWith("A"))
                .filter(y->y.getCity().equalsIgnoreCase("Bangalore"))
                .filter(z->z.getSalary()>80000)
                .collect(Collectors.toList());
        return finalData;
    }
}
