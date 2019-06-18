package company.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        charFreq("globantindiaprivatelimited");
    }
    public static void charFreq(String s){
        char c[]=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(Character c1:c){
            if(hm.containsKey(c1)){
                hm.put(c1,hm.get(c1)+1);
            }else {
                hm.put(c1,1);
            }
        }
        //Set<Map.Entry<Character,Integer>> entrySet=hm.keySet().iterator();
        Iterator<Map.Entry<Character,Integer>> iterator=hm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character,Integer> sd=iterator.next();
            if(sd.getValue() >1)
            System.out.println(sd.getKey() + " :: "+ sd.getValue());
        }
        Map<Character, Long> frequency =
                s.chars()
                        .mapToObj(c2 -> (char)c2)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency.keySet()+"::" +frequency.values());

        Map<Character, Integer> frequency1 =
                s.chars()
                        .mapToObj(c2 -> (char)c2)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c2 -> 1)));
        System.out.println(frequency1.values());

        Map<Character, Integer> frequencies = s.chars().boxed()
                .collect(Collectors.toMap(
                        // key = char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,         // 1 occurence
                        Integer::sum)); // counting
        System.out.println("Frequencies:\n" + frequencies);
    }
}
