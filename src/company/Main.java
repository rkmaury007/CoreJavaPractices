package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        //System.out.println(IntStream.range(1, 11).count());
        IntStream.range(3,4).forEach(System.out::println);
        //IntStream.iterate(6,n->n+1).limit(10).forEach(System.out::println);
        //IntStream.empty().forEach(System.out::println);
        IntStream.rangeClosed(5,10).forEach(System.out::println);
        System.out.println(IntStream.rangeClosed(2,3).average());
        IntStream.range(1,7).limit(3).forEach(System.out::println);
        long l = IntStream.range(1,9).count();
        System.out.println(l);
        System.out.println(LongStream.range(3,7).anyMatch(n->n+1==6));
        System.out.println(LongStream.range(3,3).allMatch(h->h==1.5));
        System.out.println("=======================");
        System.out.println(LongStream.range(3,9).max());
        System.out.println(LongStream.range(3,7).count());
        //LongStream l1 = LongStream.iterate(5, n->n+1).limit(10).skip(6);
        LongStream l1 = LongStream.iterate(5, n->n+1).limit(10).skip(6);
        System.out.println(l1.count());
        //
        A b=new B();
        b.aa();
    }
    public Optional<Student> getStudent(){
        Optional<Student> st=Optional.ofNullable(new Student());
        st=null;
        return st;
    }
    private List Employees;
    public List getEmployees() {
        //initialize only when required
        if(null == Employees) {
            Employees = new ArrayList();
        }
        return Employees;
    }
}
class A{
    public static void aa(){
        System.out.println("1111");
    }
}
class B extends A{
    public static void aa(){
        System.out.println("2222");
    }
}

class Test {
    static int x = 1;
    public static void main(String[] args) {
        int x = 0;
        System.out.print("x=" + x);
        System.out.println(", Test.x=" + Test.x);
    }
}
interface Poet {
    default void write() {
        System.out.println("Poet's default method");
    }
}
interface Writer {
    default void write() { System.out.println("Writer's default method");
    }
}
class Multitalented implements Poet, Writer{
    @Override
    public void write(){
        System.out.println("Writing stories now days"); }

    public static void main(String args[]){
        Multitalented john = new Multitalented();
        john.write(); // which write method to call, from Poet // or, from Writer } }
    }
}
