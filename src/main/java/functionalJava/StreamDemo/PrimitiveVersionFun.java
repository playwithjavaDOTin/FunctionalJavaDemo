package functionalJava.StreamDemo;

import functionalJava.bean.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveVersionFun {
    public static void main(String[] args) {

/*

        Function<Integer,Integer> getSqr=(i)->i*i;
       // System.out.println(getSqr.apply(10));

        IntFunction<Integer> getSqr1=(i)->i*i;
       // System.out.println(getSqr1.apply(20));

        ToIntFunction<String> getInt=(x)->x.length(); // you can do the same using simple function as well.
        //System.out.println(getInt.applyAsInt("Raj"));

        Integer []a={11,22,33,44,55,66,77};

        IntToLongFunction f=(x)->x*x;
        Arrays.stream(a).mapToLong(x->f.applyAsLong(x)).forEach(System.out::println);

        ToDoubleFunction<Integer> en=(b)->b-0.5;
        Arrays.stream(a).mapToDouble(x->x-0.1);


        Supplier<Double> getDouble=()-> Math.random();
        System.out.println(getDouble.get());

        DoubleSupplier d=()->Math.random();
        System.out.println(d.getAsDouble());

        DoubleUnaryOperator ff=(dd)->dd+10.6;

*/




        ArrayList l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Stream<Integer> intStr1=l.stream();
        intStr1.forEach(System.out::println);


        ArrayList ll=new ArrayList<>();
        ll.add("Raj");
        ll.add("Mahesh");
        ll.add("seema");
        Stream<String> StringStream=ll.stream();
        StringStream.forEach(System.out::println);



        Stream<Integer> intStr= Stream.of(1,2,3,4);
        Stream<String> strStream= Stream.of("Raj","Mohan","sohan");
        Stream<Double> doubleStr= Stream.of(10.1,21.1,32.1,41.2);
        Stream<Boolean> boolStr= Stream.of(Boolean.TRUE,Boolean.FALSE);


        Stream.Builder<Integer> strBuilder=Stream.builder();
        Stream<Integer> sst=strBuilder
                .add(1)
                .add(2)
                .add(3).build();


        Stream.Builder<String> strBuilder1=Stream.builder();
        Stream<String> sst1=strBuilder1
                .add("Ram")
                .add("Shyam")
                .add("Mohan").build();

        // using iterate method

        Stream.iterate(2,x->x*2)
                .limit(10)
                .forEach(p->System.out.println(p));


        Supplier<Double> doubleSupplier=()->Math.random();
        Stream.generate(doubleSupplier).limit(5).forEach(System.out::println);

        Supplier<String> strSupplier=()->"Ram";
       Stream.generate(strSupplier).limit(5).forEach(System.out::println);


       int a[]={1,2,3,4};
       IntStream intStream=Arrays.stream(a);
       intStream.forEach(System.out::println);


       ArrayList<Integer> intData=new ArrayList<>();
        intData.add(1);
        intData.add(2);
        intData.add(3);
       Stream<Integer> intStream1=intData.stream();



        Student stud1=new Student("Raj","Raj@gmail.com",1);
        Student stud2=new Student("Mohit","Mohit@gmail.com",2);
        Student stud3=new Student("Heera","Heera@gmail.com",3);

        List<Student> studentList= List.of(stud1,stud2,stud3);
        Stream<Student> studentStream=studentList.stream();
        studentStream.forEach(System.out::println);









    }
}

