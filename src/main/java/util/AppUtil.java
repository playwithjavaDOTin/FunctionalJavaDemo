package util;

import functionalJava.bean.EmployeeBean;

import java.util.ArrayList;
import java.util.List;

public class AppUtil {

    public static List<EmployeeBean> getEmpList(){
        EmployeeBean e1=new EmployeeBean("Raj","Patna","R&D","SSE",50000);
        EmployeeBean e2=new EmployeeBean("Mohan","Mumbai","Software","SE",60000);
        EmployeeBean e3=new EmployeeBean("Salman","Bangalore","R&D","Manager",70000);
        EmployeeBean e4=new EmployeeBean("Amir","Bangalore","Gov","Arch",80000);
        EmployeeBean e5=new EmployeeBean("Dharam","Patna","Railway","SSE",90000);
        List<EmployeeBean> employeeBeans=new ArrayList<>();
        employeeBeans.add(e1);
        employeeBeans.add(e2);
        employeeBeans.add(e3);
        employeeBeans.add(e4);
        employeeBeans.add(e5);
        return employeeBeans;
    }
}
