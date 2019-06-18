package company.programming;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNon {
    public static char getFirstNonRepeatedChar(String str) {
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        /*for (Map.Entry<Character,Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) { return entry.getKey();
            }
        } throw new RuntimeException("didn't find any non repeated Character");*/
        for(Map.Entry<Character,Integer> e:counts.entrySet()){
            if(e.getValue()==1) return e.getKey();
        } throw new RuntimeException("Not");
    }

    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatedChar("adsdffgfgasasasa"));
    }
}
