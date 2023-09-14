package functionalJava.predefFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxDemo {
    public static void main(String[] args) {
        Integer []ac={22,229,44,99,55,11,110};
        int max=Arrays.stream(ac).mapToInt(x->x).max().getAsInt();
        int min= Arrays.stream(ac).mapToInt(x->x).min().getAsInt();
        System.out.println("MAX : "+max);
        System.out.println("MIN : "+min);


        String names[][]={{"Raj","Mahi"},{"Bikash","Rana"},{"Abhinash","Rajiv"}};


        List<String> nameList=  Arrays.stream(names)
                .flatMap(x-> Arrays.stream(x))
                .collect(Collectors.toList());


        System.out.println(nameList);
    }
}
