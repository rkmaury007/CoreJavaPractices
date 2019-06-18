package datastructure;

public class PalindromWithRecursion {
    public static void main(String[] args) {
        System.out.println("Is it: "+ isPalindrom("madam"));
    }
    private static boolean isPalindrom(String s){
        String reverse=reverse(s);
        if(s.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }
    public static String reverse(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
}
