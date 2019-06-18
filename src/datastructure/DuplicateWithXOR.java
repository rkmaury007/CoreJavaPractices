package datastructure;

public class DuplicateWithXOR {
    public static void main(String[] args) {
        int[] a={1,4,6,2,5,2};
        System.out.println(getDuplicate(a));
    }
    private static int getDuplicate(int[] a){
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
        }
        for(int i=1;i<a.length-1;i++){
            xor=xor^i;
        }
        return xor;
    }
}
