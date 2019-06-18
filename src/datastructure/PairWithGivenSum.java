package datastructure;

import java.util.HashMap;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int ar[]={2,3,7,8,1,5};
        getSum(ar,8);
        getHashSum(ar,9);
    }
    public static void getSum(int[]ar,int sum){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++)
                if(sum==ar[i]+ar[j]){
                    System.out.println(ar[i]+","+ar[j]);
            }
        }
    }
    public static void getHashSum(int[] ar,int sum){
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<ar.length;i++){
            if(hm.containsKey(sum-ar[i])){
                System.out.println("Pair is found at: "+hm.get(sum-ar[i])+" and "+i);
                //return;
            }
            hm.put(ar[i],i);
            //System.out.println(hm);
        }
    }
}
