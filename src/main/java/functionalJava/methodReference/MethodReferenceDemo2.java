package functionalJava.methodReference;

public class MethodReferenceDemo2 {
    public static Integer m2(){
        System.out.println("#### Calling m2() method");
        return 12;
    }

    public static void main(String[] args) {

        //lets call m2() method from MethodReferenceDemo
        MethodReferenceDemo2.m2();

        //lets class m1() from MethodReferenceDemoService using Lambda
        MethodReferenceDemoService3 service=()-> 11l;
        Long num= (long) service.m1();
        System.out.println("Call using Lambda : "+num);

        // Here i have provided implementation of m1() ,but i dont want to provide any implementation for m1()
        //i just want to use the existing m2() method implementation for m1()

        MethodReferenceDemoService3 referenceDemoService= MethodReferenceDemo2::m2;
        referenceDemoService.m1();
    }
}
