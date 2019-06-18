package company.programming;

public class HarshadOrNiven {
    public static boolean checkNum(int n){
        int a[]=Integer.toString(n).chars().map(c -> c-'0').toArray();
        int add=0;
        for (int i = 0; i < a.length; i++) {
            add = add+a[i];
        }
        if(n % add == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkNum(111));
    }
}
