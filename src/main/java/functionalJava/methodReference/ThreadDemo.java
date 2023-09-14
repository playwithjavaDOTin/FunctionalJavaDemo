package functionalJava.methodReference;

public class ThreadDemo {
    public static void main(String[] args) {

        Runnable r=()->{
            for (int i=1;i<10;i++){
                System.out.println("### Thread execution "+i);
            }
        };
        r.run();
    }
}
