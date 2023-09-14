package functionalJava.bean;


import java.util.Objects;

public class EmployeeBean {
    String name;
    String city;
    String dept;
    String desig;
    Integer salary;

    public EmployeeBean(String name, String city, String dept, String desig, int salary) {
        this.name = name;
        this.city = city;
        this.dept = dept;
        this.desig = desig;
        this.salary = salary;
    }

    public EmployeeBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBean that = (EmployeeBean) o;
        return name.equals(that.name) && city.equals(that.city) && dept.equals(that.dept) && desig.equals(that.desig) && salary.equals(that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, dept, desig, salary);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", dept='" + dept + '\'' +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }
}
