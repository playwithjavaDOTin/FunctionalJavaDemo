package functionalJava.defaultMethod;

public class CalculatorServiceDemo {
    public static void main(String[] args) {
        CalculatorServiceImpl service=new CalculatorServiceImpl();

        int sum=service.multiplyTwoNumbers(10,20);
        System.out.println("SUM :: "+sum);
    }
}
