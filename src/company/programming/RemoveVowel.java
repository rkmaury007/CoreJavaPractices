package company.programming;

public class RemoveVowel {
    public static void main(String[] args) {
        String s1="get the work done, IF IS NOT GETTING COMPLETED BY YOU";
        char c[] = s1.toCharArray();
        String s3=s1.replaceAll("[aeiouAEIOU]","");
        System.out.println(s3);
        String s2="";
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' ||
                    c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {

            }else{
                s2= s2+c[i];
            }
        }
        System.out.println(s2);
    }
}
