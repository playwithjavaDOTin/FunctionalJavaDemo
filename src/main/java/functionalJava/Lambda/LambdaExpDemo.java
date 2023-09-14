package functionalJava.Lambda;

import functionalJava.service.AddTwoNumbers;

public class LambdaExpDemo {

    public static void main(String[] args) {


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers() {
            @Override
            public int addNumbers(int num1, int num2) {
                return (num1 + num2);
            }
        };

        int sum =addTwoNumbers.addNumbers(10,12);
        System.out.println("SUM :: "+sum);


        // With Lambda Expression:
        AddTwoNumbers num2=(x,y)->(x+y);

        int result2=num2.addNumbers(20,30);
        System.out.println(result2);
    }
}
