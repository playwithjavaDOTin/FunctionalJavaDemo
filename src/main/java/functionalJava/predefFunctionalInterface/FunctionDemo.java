package functionalJava.predefFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<Integer,Integer> multiplyNumByTwo=(x)->x*2;

        Integer i=multiplyNumByTwo.apply(10);
        System.out.println("NUM: "+i);

        Function<String,Integer> findLenOfStr=(x)->x.length();
        Integer len= findLenOfStr.apply("Raj");
        System.out.println("LEN: "+len);


        Function<Integer,Integer> findSqr=(x)->x*x;
        Integer sqr= findSqr.apply(12);
        System.out.println("Square: "+sqr);


        BiFunction<String,String,Integer> getLengthOfTwoString=(x,y)->x.length()+y.length();
        Integer strLen=getLengthOfTwoString.apply("Raj","Mohan");
        System.out.println(" STR Length: "+strLen);

    }
}
