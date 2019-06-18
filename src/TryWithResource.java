import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream(new File("C://er.txt"));
        FileReader fr=new FileReader("C:rd.txt")) {
            System.out.println("");
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("123");
    }
}
