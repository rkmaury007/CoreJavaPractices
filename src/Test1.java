import java.io.IOException;

public class Test1 {
    void m() throws IOException {
        throw new IOException("device error");
    }

    public static void main(String args[]){
        try {
            Test1 obj = new Test1();
            obj.m();
        }catch (Exception e){
           e.printStackTrace();
        }
        System.out.println("normal flow");
    }
}
