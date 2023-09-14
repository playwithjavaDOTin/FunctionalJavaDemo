package functionalJava.defaultMethod;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int addTwoNumbers(int a, int b) {
        return (a+b);
    }

    @Override
    public int multiplyTwoNumbers(int a, int b) {
        return (a*b)*2;
    }
}
