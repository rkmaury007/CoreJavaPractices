package company;

import java.util.*;
import java.util.stream.Stream;

public class T1 {
    public static void main(String[] args) {
        List<Student> ls =new ArrayList<>();
        ls.add(new Student("RKM",new Integer(6000),"BLR"));
        ls.add(new Student("QWE",new Integer(2000),"MYS"));
        ls.add(new Student("FGM",new Integer(1000),"MUM"));
        ls.add(new Student("VYL",new Integer(8000),"VNS"));
        ls.add(new Student("AYZ",new Integer(8000),"DEL"));
        ls.add(new Student("AYZ",new Integer(3400),"DEL"));
        /*boolean s = ls.stream().mapToInt(n->n.getSalary()).noneMatch(n->n==6000);
        System.out.println(s);
        int s1 = ls.stream().mapToInt(n->n.getSalary()).sum();
        System.out.println(s1);*/
        //ls.stream().filter(n->n.getSalary() >4000).findFirst().ifPresent(System.out::println);
        //String val[]=new String[]{"3","8","12","32"};
        //Stream.of(val).mapToInt(Integer::parseInt).filter(n->n%2==0).forEach(System.out::println);
        System.out.println(ls);
        //Collections.sort(ls,new SalComparator().thenComparing(new NameComparator()));
        //Collections.sort(ls,(a1,a2) -> {return a1.getSalary()-a2.getSalary();});
        Set<Integer> hashSet=new HashSet<>();
        hashSet.add(22);
        hashSet.add(12);
        hashSet.add(44);
        Collections.sort(ls,new CustomMultiLevelSorting());
        System.out.println(ls);
        //Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls);
        System.out.println("TreeMap..............................................");
        TreeMap<Student,Integer> tm=new TreeMap<>(new SalComparator());
        tm.put(new Student("RKM",new Integer(6000),"BLR"),6000);
        tm.put(new Student("QWE",new Integer(2000),"MYS"),2000);
        tm.put(new Student("FGM",new Integer(1000),"MUM"),1000);
        tm.put(new Student("VYL",new Integer(8000),"VNS"),8000);
        tm.put(new Student("AYZ",new Integer(8000),"DEL"),8000);
        tm.put(new Student("AYZ",new Integer(3400),"DEL"),3400);
        Set<Student> set=tm.keySet();
        for(Student student:set){
            System.out.println(tm.get(student));
        }
    }
}


class SalComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getSalary()-o2.getSalary());
    }
}

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (int) o1.getName().compareTo(o2.getName());
    }
}

class CustomMultiLevelSorting implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        int compareName=s1.getName().compareTo(s2.getName());
        int compareSalary=s1.getSalary().compareTo(s2.getSalary());
        int compareCity=s1.getCity().compareTo(s2.getCity());
        if(compareName==0){
            return ((compareSalary==0) ? compareCity : compareSalary);
        }else
            return compareName;
    }
}

