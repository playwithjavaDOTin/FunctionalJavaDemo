package util;

import functionalJava.bean.EmployeeBean;

import java.util.List;

public class EmployeeUtil {
    public static List<EmployeeBean> getAllEmployeeList(){

        EmployeeBean e1=new EmployeeBean("Raj","Patna","Development","SSE",140000);
        EmployeeBean e2=new EmployeeBean("Raj","Bangalore","Development","SSE",160000);
        EmployeeBean e3=new EmployeeBean("Amit","Delhi","Development","SSE",110000);
        EmployeeBean e4=new EmployeeBean("Jawed","Patna","R&D","SSE",240000);
        EmployeeBean e5=new EmployeeBean("Jawed","Bangalore","Development","SSE",140000);
        EmployeeBean e6=new EmployeeBean("Jawed","Delhi","R&D","SSE",340000);
        EmployeeBean e7=new EmployeeBean("Abhinash","Bangalore","Development","SSE",140000);
/*
        EmployeeBean e8=new EmployeeBean("Rahul","Patna","HR","SSE",220000);
        EmployeeBean e9=new EmployeeBean("Pandu","Chennai","Support","SSE",160000);
        EmployeeBean e10=new EmployeeBean("Mohit","Bangalore","Development","Architect",440000);

        EmployeeBean e11=new EmployeeBean("Ashish","Bangalore","Development","SSE",190000);
        EmployeeBean e12=new EmployeeBean("Aayan","Delhi","R&D","Architect",540000);
        EmployeeBean e13=new EmployeeBean("Amresh","Bangalore","Development","SSE",123000);
        EmployeeBean e14=new EmployeeBean("Akash","Delhi","Development","SSE",110000);
        EmployeeBean e15=new EmployeeBean("Ajay","Delhi","Development","SSE",4000);
*/

        //List<EmployeeBean> list =List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15);
        List<EmployeeBean> list =List.of(e1,e2,e3,e4,e5,e6,e7);
        return list;
    }
}
