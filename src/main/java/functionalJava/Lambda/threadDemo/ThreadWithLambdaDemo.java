package functionalJava.Lambda.threadDemo;

public class ThreadWithLambdaDemo {
    public static void main(String[] args) {

        Runnable r=()-> System.out.println("Thread is Running ...");
        r.run();
    }
}
