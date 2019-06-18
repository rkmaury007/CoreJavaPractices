package company;

import java.util.*;
import java.util.stream.Stream;

public class T3 {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("Jae");
        ls.add("Sam");
        ls.add("Marry");
        ls.add("Pabolo");
        Stream<String> st=ls.stream();
        long c = st.distinct().count();
        //System.out.println(c);
        boolean b = ls.stream().noneMatch(w->w.contains("z"));
        boolean b1 = ls.stream().allMatch(w->w.contains("a"));
        boolean b2 = ls.stream().anyMatch(w->w.contains("p"));
        //System.out.println(b2);
        ls.stream().filter(v->v.startsWith("J")).findFirst().ifPresent(System.out::println);
        Optional<Student> student=new Main().getStudent();
        System.out.println(student);
        if(student.isPresent()){
            System.out.println(student.get().getSalary());
        }
    }
}
