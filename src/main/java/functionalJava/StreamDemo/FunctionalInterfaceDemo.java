package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.AppUtil;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

      //create predicate
      Predicate<Integer> isEvenNumber=(x)->(x%2==0)?Boolean.TRUE:Boolean.FALSE;
      //create Integer Array
      Integer nums[]={1,2,3,4,5,6,7,8,9,10};
      Arrays.stream(nums)
              .filter(x->(x%2==0));


        Function<String,Integer> getStrLength=(x)->x.length();
        String a[]={"Ram","Shyam","Mohan","BhanuPratap"};
        Stream<Integer> data=Arrays.stream(a)
                .map(getStrLength)
                .limit(2);



        Integer num[]={1,2,3,4,5,6,7,8,9,10};
        boolean isALlEven=Arrays.stream(num)
                .allMatch(x->(x%2==0));
        //System.out.println(isALlEven);

        boolean isAnyEven=Arrays.stream(num)
                .anyMatch(x->(x%2==0));
       // System.out.println(isAnyEven);



        String names[]={"Ram","Shyam","Mohan","BhanuPratap"};
        List<String> collectNames=Arrays.stream(names)
                .collect(Collectors.toList());
       // System.out.println(collectNames);


        Set<String> collectNames1=Arrays.stream(names)
                .collect(Collectors.toSet());
        //System.out.println(collectNames);



        List<String> StudentNames=List.of("Raj","Heera","Mukesh");
        List<String> nameList = StudentNames.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        HashSet<String> nameSet = StudentNames.stream().collect(HashSet::new, HashSet::add, HashSet::addAll);
        // System.out.println(nameList);
        //System.out.println(nameSet);


      String userData[]={"Raj","Mahesh","Himesh"};
      ArrayList<String> l1=new ArrayList<>();
        for(String name:userData){
          ArrayList<String> l2=new ArrayList<>();
          l2.add(name);
          l1.addAll(l2);
        }




      Supplier<ArrayList<String>> getList=()->new ArrayList<>();
      Supplier<ArrayList<String>> getList1=ArrayList::new; //Constructor reference


      BiConsumer<ArrayList,String> biConsumer=(existingList,newElement)->existingList.add(newElement);
      BiConsumer<ArrayList,String> biConsumer1=ArrayList::add; //Method Reference


      BiConsumer<ArrayList<String>,ArrayList<String>> listBiConsumer1=(existingList,newList)->existingList.addAll(newList);
      BiConsumer<ArrayList<String>,ArrayList<String>> listBiConsumer2=ArrayList::addAll;

      List<String> stringArrayList=Arrays.stream(userData).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

      //System.out.println(stringArrayList);

      List<String> stringArrayList1=Arrays.stream(userData)
              .collect(()->new ArrayList<>(),(existingList,newElement)->existingList.add(newElement),(existingList,newList)->existingList.addAll(newList));
      //System.out.println(stringArrayList1);



      String emp1[]={"Raj","Mahesh"};
      String emp2[]={"Rajiv","Mukesh","Mukesh","Raj","Mahesh","Rajiv","Mukesh","Mukesh","Raj","Mahesh"};

      Stream<String> stringStream1=Arrays.stream(emp1);
      Stream<String> stringStream2=Arrays.stream(emp2);

     /* Stream<String> stringStream=Stream.concat(stringStream1,stringStream2);
      stringStream.forEach(System.out::println);*/






      int []ab={11,11,11,13,15,15,17,181,19,20,21,23,24,25,26,27,28};

      IntStream intStream=Arrays.stream(ab).sorted().distinct();
     // intStream.forEach(System.out::println);


      Integer []ac={22,229,44,99,55,11,110};
      List<Integer> numList1=Arrays.stream(ac).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
      List<Integer> numList2=Arrays.stream(ac).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
      System.out.println(numList1);
      System.out.println(numList2);




      int []ab1={11,11,25,26,28,4};


      IntStream intStream1=Arrays.stream(ab1).sorted().distinct();
      intStream1.forEach(System.out::println);





      int max=Arrays.stream(ac).mapToInt(x->x).max().getAsInt();
      int min=Arrays.stream(ac).mapToInt(x->x).min().getAsInt();
      System.out.println("MAX : "+max);
      System.out.println("MIN : "+min);

      int element[]={22,229,44,99,55,11,110};
      int minVal=Arrays.stream(element).min().getAsInt();
      int maxVal=Arrays.stream(element).max().getAsInt();
      System.out.println("MAX : "+maxVal);
      System.out.println("MIN : "+minVal);



      Arrays.stream(ac).skip(2).forEach(System.out::println);


      Arrays.stream(ac).distinct().sorted((t,u)->t.compareTo(u)).forEach(System.out::println);
      Arrays.stream(ac).distinct().sorted((t,u)->-t.compareTo(u)).forEach(System.out::println);
      Arrays.stream(ac).distinct().sorted((t,u)->u.compareTo(t)).forEach(System.out::println);






      int num1=Arrays.stream(ab).findAny().getAsInt();
      //System.out.println("Find Any :: "+num1);

      int num2=Arrays.stream(ab).findFirst().getAsInt();
      //System.out.println("Find First :: "+num2);


      Arrays.stream(ab).dropWhile(x->x%2!=0).forEach(System.out::println);

      Arrays.stream(ab).takeWhile(x->x%2!=0).forEach(System.out::println);


      // it will return list of Employee object
      List<EmployeeBean> empList= AppUtil.getEmpList();
      Optional<EmployeeBean> employeeBean=empList.stream().max(Comparator.comparingDouble(EmployeeBean::getSalary));
      System.out.println("Highest Salary Employee :: "+employeeBean);


      List<EmployeeBean> employeeBeansObj= empList.stream()
              .sorted(Comparator.comparingDouble(EmployeeBean::getSalary))
              .collect(Collectors.toList());
      employeeBeansObj.forEach(x-> System.out.println("Name:"+x.getName()+" ,Salary:"+x.getSalary()));

      List<EmployeeBean> employeeBeansObj1= empList.stream()
              .sorted(Comparator.comparingDouble(EmployeeBean::getSalary).reversed())
              .collect(Collectors.toList());
      employeeBeansObj1.forEach(x-> System.out.println("Name :"+x.getName()+" ,Salary :"+x.getSalary()));



      List<EmployeeBean> empByNameAndSalary=empList.stream()

              .sorted(Comparator.comparingDouble(EmployeeBean::getSalary).reversed())
              .sorted(Comparator.comparing(EmployeeBean::getName))
                            .collect(Collectors.toList());

      empByNameAndSalary.forEach(x->System.out.println("Name : "+x.getName()+", Salary : "+x.getSalary()));






      List<EmployeeBean> employeeBeans=empList.stream()
              .sorted(Comparator.comparingDouble(EmployeeBean::getSalary)).collect(Collectors.toList());

      employeeBeans.stream()
              .dropWhile(x->x.getSalary()<80000)
              .forEach(x-> System.out.println("## "+x.getName()+" "+x.getSalary()));

      employeeBeans.stream()
              .takeWhile(x->x.getSalary()<80000)
              .forEach(x-> System.out.println("## "+x.getName()+" "+x.getSalary()));






    }


}
