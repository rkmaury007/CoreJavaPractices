package company.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentTest {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put(12,"AA");
        concurrentHashMap.put(2,"BB");
        concurrentHashMap.put(83,"CC");
        concurrentHashMap.put(44,"DD");
        concurrentHashMap.put(5,"EE");

        Iterator iterator=concurrentHashMap.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            concurrentHashMap.put(2,"ZZ");
        }
        System.out.println("=================================");
        Set<Integer> set=concurrentHashMap.keySet();
        for(Integer s:set){
            System.out.println(concurrentHashMap.get(s));
        }

        Iterator iterator1=concurrentHashMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashMap hm=new HashMap();
        hm.put(1,44);
        hm.put(3,66);
        System.out.println(hm);
        hm.remove(1);
        System.out.println(hm);
    }
}
