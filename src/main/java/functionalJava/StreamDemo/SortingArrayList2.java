package functionalJava.StreamDemo;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingArrayList2 {

    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(50);
        numList.add(30);
        numList.add(20);
        numList.add(10);
        numList.add(40);

        Comparator<Integer> naturalOrderComp=(a, b)->Integer.compare(a, b);
        numList.sort(naturalOrderComp);
        System.out.println("Natural Order : "+numList);

        Comparator<Integer> reverseOrderComp=(a,b)->Integer.compare(b, a);
        numList.sort(reverseOrderComp);
        System.out.println("Reverse Order : "+numList);

        //Simplify the code
        numList.sort((a, b)->Integer.compare(a, b));
        System.out.println("Natural Order:2 || "+numList);
        numList.sort((a,b)->Integer.compare(b, a));
        System.out.println("Reverse Order:2 || "+numList);

        //Using Method reference to simplify the code
        numList.sort(Integer::compareTo);
        System.out.println("Sorting Using Method Reference :: "+numList);
    }
}
