package company.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Ab {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("1",5);
        hm.put("11",95);
        hm.put("111",85);
        hm.put("1111",75);
        hm.put("11111",65);
        //Sort by value
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(System.out::println);

        //hm.remove(1);
        System.out.println(hm);
        Set<Map.Entry<String,Integer>> entrySet = hm.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            Integer val=entry.getValue();
            if (val > 75) {
                iterator.remove();
            }
        }
        System.out.println(hm);
    }
}
