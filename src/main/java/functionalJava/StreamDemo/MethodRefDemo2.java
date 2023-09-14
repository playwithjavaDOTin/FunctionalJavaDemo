package functionalJava.StreamDemo;

public class MethodRefDemo2 {

    public void executeJob1(){
       for (int i=0;i<5;i++){
           System.out.println("###  Job Running :: "+i);
       }
    }

    public static void executeJob2(){
        for (int i=0;i<5;i++){
            System.out.println("===>  Job Running :: "+i);
        }
    }

    public MethodRefDemo2() {
        System.out.println("##############  running const");
    }

    public static void main(String[] args) {

        MethodRefDemoIntr r1 =MethodRefDemo2::executeJob2;
        r1.runMe();


        MethodRefDemoIntr2 r2= MethodRefDemo2::new;
        MethodRefDemo2 demo2=r2.runMe();



    }
}

interface MethodRefDemoIntr{
    public void runMe();
}

interface MethodRefDemoIntr2{
    public MethodRefDemo2 runMe();
}

