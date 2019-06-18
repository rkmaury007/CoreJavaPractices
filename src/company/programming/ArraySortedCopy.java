package company.programming;

import java.util.Arrays;

public class ArraySortedCopy {
    public static void main(String[] args) {
        int[] ar1={1,2,3,4};
        int ar2[]={5,6,7,8};
        int[] copy= new int[ar1.length+ar2.length];
        System.out.println(Arrays.toString(copy));
        //copy=Arrays.copyOf(ar2,ar2.length);
        System.out.println(Arrays.toString(copy));
        System.arraycopy(ar1, 0, copy, 0, ar1.length);
        System.arraycopy(ar2, 0, copy, ar1.length, ar2.length);
        System.out.println(Arrays.toString(copy));
    }
}
