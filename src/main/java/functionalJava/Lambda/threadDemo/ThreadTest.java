package functionalJava.Lambda.threadDemo;

public class ThreadTest {
    public static void main(String[] args) {

        ThreadDemo threadDemo=new ThreadDemo();
        Thread t1=new Thread(threadDemo);
        t1.start();
    }
}
