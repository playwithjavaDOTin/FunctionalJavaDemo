package functionalJava.optionalDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalClassDemo {
    public static void main(String[] args) {
        List<EmployeeBean> employeeBeans =EmployeeUtil.getAllEmployeeList();
        Optional<List<EmployeeBean>> data=Optional.of(employeeBeans);

        EmployeeBean ee=new EmployeeBean();
        //System.out.println(ee.getName().equalsIgnoreCase("Raj"));

        Optional<EmployeeBean> employeeBean=Optional.of(ee);

        System.out.println(employeeBean.isPresent());
        // System.out.println(employeeBean.get().getName().startsWith("A"));

        //System.out.println(Optional.ofNullable(ee).get().getName().startsWith("A"));
        System.out.println(employeeBean.get()==null);
        System.out.println(Optional.ofNullable(ee).get()==null);

        Optional<String> optional = Optional.of("Raj");
        boolean isPresent = optional.isPresent(); // true

      /*  Optional<String> optional1 = Optional.of(null);
        boolean isPresent1 = optional1.isPresent(); //NullPointerException*/

        Optional<String> optional2 = Optional.ofNullable(null);
        boolean isPresent2 = optional2.isPresent(); // true


        Optional<String> optional3 = Optional.of("Raj");
        optional3.ifPresent(value -> System.out.println("Value: " + value));
/*

        Optional<String> optional4 = Optional.of(null);
        optional4.ifPresent(value -> System.out.println("Value: " + value));
*/

      /*  Optional<String> optional5 = Optional.ofNullable(null);
        optional5.ifPresent(value -> System.out.println("Value: " + value));*/


        Optional<EmployeeBean> optional6 = Optional.ofNullable(new EmployeeBean("Raj","Patna","Development","SSE",140000));
        optional6.ifPresent(value -> {
            if(value.getSalary()>50000){
                System.out.println(" Emp :"+value);
            }
        });

        Optional<List<EmployeeBean>> optional7 = Optional.ofNullable(EmployeeUtil.getAllEmployeeList());
        System.out.println("Input Data :: "+optional7.get());
        optional7.ifPresent(value -> {
            System.out.println("######### filtered data :");
            value.stream().filter(x->x.getSalary()>200000).collect(Collectors.toList())
                    .forEach(System.out::println);
        });



        Optional<String> optional8 = Optional.empty();
        String result = optional8.orElse("Raj");
        System.out.println(result);

        List<EmployeeBean> ll=new ArrayList<>();
        EmployeeBean employeeBean1=new EmployeeBean("Raj","Patna","Development","SSE",140000);
        List<EmployeeBean> defaultEmpList=new ArrayList<>();
        defaultEmpList.add(employeeBean1);

        System.out.println( Optional.empty()
                .orElse(defaultEmpList));


        Supplier<EmployeeBean> getEmpData=()->new EmployeeBean("Raj","Patna","Development","SSE",140000);
        Object employeeBean2=Optional.empty().orElseGet(getEmpData);
        System.out.println(employeeBean2);


        System.out.println("employeeBean3 : "+Optional.empty().orElse(getEmpData));

        //Optional.empty().orElseThrow();


 /*       Optional<String> optional9 = Optional.empty();
        String result1 = optional9.orElseThrow(() -> new NullPointerException("No Data Found"));

*/

        Optional<String> getVal=Optional.of("Raj");
        String name=getVal.get();
        System.out.println(name);

/*        Optional<Integer> optional10 = Optional.of(123);
        Optional<Integer> filtered = optional10.filter(value -> value > 888);
        System.out.println("## filtered "+filtered.get());*/

/*        Optional<Integer> optional11 = Optional.empty();
        Optional<Integer> filtered1 = optional11.filter(value -> value > 100);
        System.out.println("## filtered1 "+filtered1.get());*/

        Optional<String> optional12 = Optional.of("Raj");
        Optional<Integer> length = optional.map(value -> value.length());
        System.out.println(length.get());

       String empName= Optional.of(new EmployeeBean("Raj","Patna","Development","SSE",140000))
                .map(x->x.getName())
                .get();

        System.out.println("## empName "+empName);

        /*System.out.println( Optional.empty()
                .map(x->x.getClass())
                .get());
*/

        Optional<String> optional13 = Optional.of("Hello");
        Optional<Integer> data1 = optional13.flatMap(value -> Optional.of(value.length()));
        System.out.println(data1.get());





        EmployeeBean employeeBean3=new EmployeeBean("Raj","Patna","Development","SSE",140000);

        Optional.ofNullable(employeeBean3)
                .filter(y->y.getName().equalsIgnoreCase("Raj"))
                .map(x->x.getName())
                .ifPresent(System.out::println);



        Optional<Optional<String>> data12=Optional.of(Optional.of("Raj"));

        data12.map(x->x).ifPresent(System.out::println);

        data12.flatMap(x->x).ifPresent(System.out::println);

        Stream<EmployeeBean> empStreamSequential=EmployeeUtil.getAllEmployeeList()
                                                            .stream();

        Stream<EmployeeBean> empStreamParallel=EmployeeUtil.getAllEmployeeList()
                                                    .parallelStream();

    }
}
