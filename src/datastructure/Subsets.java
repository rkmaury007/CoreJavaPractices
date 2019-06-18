package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {

    public static void main(String[] args) {
        Set s=new HashSet();
        s.add(2);
        s.add(9);
        s.add(5);
        System.out.println(powerSet(s));
        int a[]={9,5,1,2,3};
        subsetByLogical(a);
    }

    public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }

    static void subsetByLogical(int a[])
    {
        int n = a.length;
        for (int i = 0; i < (1<<n); i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                    System.out.print(a[j] + " ");
            System.out.println("}");
        }
    }
}
