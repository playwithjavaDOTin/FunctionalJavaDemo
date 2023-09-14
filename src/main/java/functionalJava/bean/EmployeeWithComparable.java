package functionalJava.bean;


import java.util.Objects;

public class EmployeeWithComparable implements Comparable<EmployeeWithComparable>{

   private Integer id;
   private String name;
   private String email;

    public EmployeeWithComparable(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeWithComparable that = (EmployeeWithComparable) o;
        return id.equals(that.id) && name.equals(that.name) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public int compareTo(EmployeeWithComparable e) {
        //String class implements Comparable(I) by default
        return this.name.compareTo(e.name);
    }

/*    @Override
// for reverse order
    public int compareTo(Employee e) {
        //String class implements Comparable(I) by default
        return -this.name.compareTo(e.name);
    }*/
}
