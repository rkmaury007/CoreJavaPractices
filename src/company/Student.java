package company;

import java.util.stream.Stream;

public class Student {
    private String name;
    private Integer salary;
    private String city;

    public Student(String name, Integer salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
