package functionalJava.StreamDemo;


import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<Integer> num1=List.of(9,2,3);
        List<Integer> num2=List.of(4,5,6);
        List<List<Integer>> lists=List.of(num1,num2);
        System.out.println(lists);

        List<Integer> finalList=lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(finalList);

        List<Integer> num3=List.of(9,2,3);
        List<Integer> num4=List.of(4,5,6);
        List<List<Integer>> lists1=List.of(num3,num4);
        lists.stream()
                //.flatMap(List::stream) // Method Reference
                .flatMap(x->x.stream());  //lambda Expression

        Stream<Integer> l1=num1.stream();
        Stream<Integer> l2=num2.stream();
        Stream<Integer> finalStrm=Stream.concat(l1,l2);



        String names[][]={{"Raj","Mahi"},{"Bikash","Rana"},{"Abhinash","Rajiv"}};

        List<String> nameList=  Arrays.stream(names)
                .flatMap(x-> Arrays.stream(x))
                .collect(Collectors.toList());

       // System.out.println(nameList);



        List<Integer> num5=Arrays.asList(1, 2, 3);
        List<Integer> num6=Arrays.asList(4, 5);
        List<Integer> num7=Arrays.asList(6, 7, 8);

        List<List<Integer>> rr=List.of(num5,num6,num7);
        rr.stream().flatMapToInt(x->x.stream().mapToInt(Integer::intValue)).forEach(System.out::println);




        List<EmployeeBean> empList=AppUtil.getEmpList();

        List<String> empNameList=empList.stream()
                .map(EmployeeBean::getName).collect(Collectors.toList());


       empNameList.forEach(System.out::println);


       List<String> empEmailList=AppUtil.getEmpList()
                .stream()
                .map(x->x.getName()).collect(Collectors.toList());

        empNameList.forEach(System.out::println);


        int []ab={11,13,15,17,181,19,20,21,23,24,25,26,27,28};


        int num8=Arrays.stream(ab).findAny().getAsInt();
        System.out.println("Find Any :: "+num8);




        List<EmployeeBean> empList1= AppUtil.getEmpList();

        EmployeeBean employeeBean=empList1.stream()
                .max(Comparator.comparing(EmployeeBean::getSalary)).get();

        System.out.println(employeeBean);


        OptionalDouble salary=empList1.stream()
                .mapToDouble(EmployeeBean::getSalary)
                .max();
        System.out.println(salary.getAsDouble());

    }
}
