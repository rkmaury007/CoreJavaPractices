import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {
        File f1=new File("C://Q.txt");
        try {
            FileInputStream fd = new FileInputStream(f1);
        }
        catch (FileNotFoundException | ArrayIndexOutOfBoundsException w){
            w.printStackTrace();
        }
        catch (IOException w){
            w.printStackTrace();
        }
        System.out.println("Test2");
    }
}
