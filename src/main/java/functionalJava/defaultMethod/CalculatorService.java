package functionalJava.defaultMethod;

public interface CalculatorService {
    public int addTwoNumbers(int a,int b);

    default  int multiplyTwoNumbers(int a,int b){
        return a+b;
    }
}
