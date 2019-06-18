package company;

import java.util.*;

public class Deadlock {
    //https://javarevisited.blogspot.com/2018/08/how-to-avoid-deadlock-in-java-threads.html
    public static void main(String []args){
        boolean anagram = checkForAnagram("saajay","jayasa");
        System.out.println(anagram);
    }
    public static boolean checkForAnagram(String s1,String s2){
        int a1=0,a2=0;
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
      /*  for(int i=0;i<c1.length;i++){
            a1= a1+c1[i];
        }
        for(int i=0;i<c2.length;i++){
            a2= a2+c2[i];
        }*/

        Arrays.sort(c1);
        Arrays.sort(c2);

        String str = c1.toString();
        String str2 = c2.toString();

        str.equals(str2);


        return a1==a2;
    }
}
