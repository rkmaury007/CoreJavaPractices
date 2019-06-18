public class Main {
    public void check(int e) throws ValueCheck{
        if(e<18){
            throw new ValueCheck("Value is less than 18");
        }else{
            System.out.println("This has been checked");
        }
    }
    public static void main(String[] args) {
        try {
            new Main().check(42);
        }catch (Exception r){
            r.printStackTrace();
        }
        System.out.println("Hello World!");
    }
}

class ValueCheck extends Exception{
    public ValueCheck(String s){
        super(s);
    }
}
/*
class Rew{
    public static void test(int i,Object j){

    }
    public static void test(Object i,Object j){

    }
    public void tester(){
        test(1,3);
    }
}
*/
