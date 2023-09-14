package functionalJava.StreamDemo;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class TestDemo {
    public static void main(String[] args) {


      Stream<Integer> num=Stream.of(11,12,13,1,2,3,4,5,6,7,8,9,10);
      System.out.println(num.min((i1,i2)->-i1.compareTo(i2)).get());

      IntStream ii=IntStream.of(1,2,3,5,88,33,111,454,2,42);
        System.out.println(ii.max().getAsInt() );

       var a= Stream.of(11,12,13,1,2,3,4,5,6,7,8,9,10).toArray(Integer[]::new);

       int ar[]={1,2,4,6,8,5,1,11,88,33,2,13,1,55};
        Integer min= Arrays.stream(ar).min().getAsInt();
        System.out.println(min);





    }
}




class EmpTest{
    String name;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "java8.EmpTest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}