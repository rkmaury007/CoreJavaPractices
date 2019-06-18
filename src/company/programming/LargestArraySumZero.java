package company.programming;

import java.util.Arrays;
import java.util.HashMap;

public class LargestArraySumZero {
    public static void main(String[] args) {
        int[] ar={2,-1,-5,1,2,-3,6};
        System.out.println(Arrays.toString(getLargestSum(ar)));
    }
    public static int[] getLargestSum(int ar[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum = 0;
        for(int i=0;i<=ar.length;i++){
            Integer oldIndex = hm.get(sum);
            if(oldIndex==null && i==ar.length){
                return null;
            }else if(oldIndex == null){
                hm.put(sum,i);
                sum = sum+ar[i];
            }else{
                return Arrays.copyOfRange(ar,oldIndex,i);
            }
        }
        return null;
    }
}
