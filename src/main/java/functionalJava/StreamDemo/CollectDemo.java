package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {


        List<EmployeeBean> empData = EmployeeUtil.getAllEmployeeList();

        empData.stream()
                .filter(x->x.getName().startsWith("A"))
                .collect(Collectors.collectingAndThen(Collectors.toList(),List::copyOf));

        empData.stream()
                .filter(x->x.getName().startsWith("A"))
                .collect(Collectors.toUnmodifiableList());

  /*      Long l=empData.stream()
                .collect(Collectors.teeing(Collectors.minBy(Comparator.comparingInt(EmployeeBean::getSalary)), Collectors.maxBy(Comparator.comparingInt(EmployeeBean::getSalary)),(x,y)->(Function.identity())));
*/



        List<String> elements = List.of("a", "b", "c", "d", "e");
        // sequential stream - nothing to combine
        StringBuilder result = elements.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());

// parallel stream - combiner is combining partial results
        StringBuilder result1 = elements.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result1.toString());
    }
}


