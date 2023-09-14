package functionalJava.StreamDemo;

public class EmployeeMethodRefDemo {
    static String getEmployeeName(){
        System.out.println("########## getEmployeeName called");
        return "RAJ";
    }

     String getEmployeeNameTest(){
        System.out.println("########## getEmployeeName called");
        return "Heera";
    }
    public static void main(String[] args) {
        Employee i= EmployeeMethodRefDemo::getEmployeeName;
        String name=i.getName();
        System.out.println(name);

        EmployeeMethodRefDemo m=new EmployeeMethodRefDemo();
        Employee i1=m::getEmployeeNameTest;
        String name1=i1.getName();
        System.out.println(name1);
    }
}


interface Employee{
    String getName();
}
