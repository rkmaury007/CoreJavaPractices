package company;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        ls.add(new Student("QW",12,"BHO"));
        ls.add(new Student("FGM",9000,"GUR"));
        ls.add(new Student("AZ",3455,"CHN"));
        ls.add(new Student("DC",2000,"AHM"));
        ls.add(new Student("RG",54444,"JAM"));
        ls.add(new Student("UT",1000,"LKO"));
        ls.parallelStream().forEach(s->process(s));
    }
    public static void process(Student student){
        System.out.println(student);
    }
}
