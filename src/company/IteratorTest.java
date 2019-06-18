package company;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {
    public static void main(String[] args) {
        List li=new ArrayList();
        li.add(52);
        li.add(92);
        li.add(12);
        li.add("Ajay");
        li.add(76);
        li.add('C');
        li.set(0,100);
        List nl=Collections.unmodifiableList(li);
        nl.add(22);
        //li.remove(2);
        Iterator<Integer> num=li.iterator();
        Iterator<Character> ch = Arrays.asList('Q','S','G','A','N','X','P','R').iterator();
        /*while(ch.hasNext()){
            while (num.hasNext()){
                System.out.println(num.next()+" and "+ch.next());
            }
        }*/
        //Spliterator and ForEachRemaning
        Spliterator sp=li.spliterator();
        System.out.println("Next Element Present? " +sp.tryAdvance(System.out::println));
        sp.forEachRemaining(System.out::println);
        System.out.println("=============================");
        List<String> progList = Arrays.asList("Java","Android","Python","C++");
        Spliterator<String> splitr = progList.spliterator();
        Spliterator<String> st = splitr.trySplit();
        splitr.forEachRemaining(System.out::println);
        System.out.println("Traversing the next half of the spliterator-");
        st.forEachRemaining(System.out::println);
    }
}
