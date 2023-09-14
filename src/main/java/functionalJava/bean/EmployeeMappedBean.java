package functionalJava.bean;


import java.util.Objects;

public class EmployeeMappedBean {
    String name;
    String city;


    public EmployeeMappedBean(String name, String city) {
        this.name = name;
        this.city = city;

    }


    public EmployeeMappedBean() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeMappedBean that = (EmployeeMappedBean) o;
        return name.equals(that.name) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }

    @Override
    public String toString() {
        return "EmployeeMappedBean{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
