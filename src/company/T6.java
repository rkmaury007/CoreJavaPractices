package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T6 {
    public static void main(String[] args) {
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum11 = numbers.stream().reduce(2, Integer::sum);
                //numbers.stream().reduce(1,(a,b)->a+b);
        System.out.println(sum11);*/
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
    }
}
