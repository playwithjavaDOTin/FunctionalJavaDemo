package functionalJava.methodReference;

public class MethodReferenceDemo {
    public static int m2(){
        System.out.println("#### Calling m2() method");
        return 11;
    }

    public static void main(String[] args) {

        //lets call m2() method from MethodReferenceDemo
        MethodReferenceDemo.m2();

        //lets class m1() from MethodReferenceDemoService using Lambda
        MethodReferenceDemoService service=()-> System.out.println("#### Calling m1() method");
        service.m1();

        // Here i have provided implementation of m1() ,but i dont want to provide any implementation for m1()
        //i just want to use the existing m2() method implementation for m1()

        MethodReferenceDemoService referenceDemoService=MethodReferenceDemo::m2;
        referenceDemoService.m1();
    }
}
