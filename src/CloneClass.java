public class CloneClass implements Cloneable{
    int i=10;
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneClass cc=new CloneClass();
        System.out.println(cc.i);
        System.out.println(((CloneClass)cc.clone()).i);
    }
}
