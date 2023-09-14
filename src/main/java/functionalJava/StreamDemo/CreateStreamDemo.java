package functionalJava.StreamDemo;

import functionalJava.bean.Employee;
import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;
import util.EmployeeUtility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamDemo {
    public static void main(String[] args) {
        List<Employee> employeeList =EmployeeUtility.getEmployeeList();
        Stream<Employee> employeeStreamSequential=employeeList.stream();
        Stream<Employee> employeeStreamParallel=employeeList.stream();

        //print stream value- using Lambda
        System.out.println("### Sequential Stream");
        employeeStreamSequential.forEach(x->System.out.println(x));

        //print stream value-using Method Referense
        System.out.println("### Parallel Stream");
        employeeStreamParallel.forEach(System.out::println);


        //Filter Employee Data
        List<EmployeeBean> employeeBeans=EmployeeUtil.getAllEmployeeList();

        List<EmployeeBean> employeeFilteredData=employeeBeans.stream()
                .filter(x->x.getSalary()>70000)
                .filter(y->y.getName().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("#########  Filtered data:");

        employeeFilteredData.forEach(System.out::println);

    }
}
