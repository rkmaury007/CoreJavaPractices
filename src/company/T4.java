package company;

import java.util.*;

public class T4 {
    public static String getStudentNameBySalary(List<Student> studentList, int sal){
        Optional<Student> sl=Optional.empty();
        Optional<Student> optionalStudent = studentList.stream().filter(c-> c.getSalary() == sal).findFirst();
        //return optionalStudent.get().getName();
        //return optionalStudent.isPresent()? optionalStudent.get().getName() : "UNKNOWN";
        return optionalStudent.map(Student::getName).orElse("NOVALUE");
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ajay",100,"ALD"));
        studentList.add(new Student("Shyam",500,"VNS"));
        studentList.add(new Student("Daniel",800,"BLR"));
        studentList.add(new Student("Sam",400,"KOL"));
        studentList.add(new Student("Vinod",900,"KAN"));
        String studentName = getStudentNameBySalary(studentList,400);
        System.out.println(studentName);
    }
}
