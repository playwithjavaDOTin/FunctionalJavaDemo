package functionalJava.StreamDemo;

import functionalJava.bean.EmployeeBean;
import util.EmployeeUtil;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeDataWithoutStream {
    public static void main(String[] args) {
        List<EmployeeBean> empData = EmployeeUtil.getAllEmployeeList();
        List<EmployeeBean> resultList=new ArrayList<>();
        for(EmployeeBean employeeBean:empData){
            if(employeeBean.getName().startsWith("A")){
                System.out.println(employeeBean);
                resultList.add(employeeBean);
            }
        }
    }
}
