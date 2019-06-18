package company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataStructure {
    public static void main(String ss[]){
        List<Integer> al=new ArrayList();
        al.add(22);
        al.add(5);
        al.add(87);
        al.add(53);
        System.out.println(al);
        Collections.unmodifiableCollection(al);
        Collections.sort(al);
        System.out.println(al);
        al.stream().sorted().forEach(System.out::println);
        al.stream().filter(x-> x.equals(5)).findAny().ifPresent(System.out::println);
        System.out.println("=========");
        al.stream().findFirst().ifPresent(System.out::println);
        System.out.println("================");
        al.stream().filter(n->n.equals(22)).findAny().ifPresent(System.out::println);
        String s[] = new String[]{"Sinay","Ramesh","George","Sam"};
        Stream.of(s).filter(st->st.startsWith("a",1)).forEach(System.out::println);
        Arrays.stream(s).sorted().forEach(System.out::println);
        al.stream().map(n -> n*2).collect(Collectors.toList()).forEach(System.out::println);
    }
}
