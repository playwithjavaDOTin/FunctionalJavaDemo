package functionalJava.privateMethod;

import functionalJava.bean.Student;

public interface StudentService {

    abstract Student getStudentData();

    default int getStudentPrivateData(int sid){
       int pass= getStudentAccPass(sid);
       //method  body
       return pass+12345;
    }

    private int getStudentAccPass(int sid){
        //method body
        return 123;
    }
}
