package functionalJava.StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(50);
        numList.add(30);
        numList.add(20);
        numList.add(10);
        numList.add(40);

      Comparator<Integer> naturalOrderComp=(a,b)->Integer.compare(a, b);
      Collections.sort(numList,naturalOrderComp);
      System.out.println("Natural Order :: "+numList);

      Comparator<Integer> reverseOrderComp=(a,b)->Integer.compare(b, a);
      Collections.sort(numList,reverseOrderComp);
      System.out.println("Reverse Order :: "+numList);

      //Simplify the above code:
      Collections.sort(numList,(a,b)->a.compareTo(b));
      Collections.sort(numList,(a,b)->b.compareTo(a));

      //using Method Reference to Simplify the above code
      Collections.sort(numList,Integer::compareTo);
      System.out.println("Sorted  :: "+numList);

      /*Note: You can use any of the above as per your preference*/
    }
}
