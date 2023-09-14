package functionalJava.bean;

public class Student{
    String name;
    String email;
    Integer studentId;

    public Student(String name, String email, Integer studentId) {
        this.name = name;
        this.email = email;
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return "java8.Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}