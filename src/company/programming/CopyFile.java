package company.programming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("E:/SourceFile.txt");
        File destFile = new File("E:/DestFile.txt");
        try(FileInputStream inStream=new FileInputStream(sourceFile);
            FileOutputStream outStream = new FileOutputStream(destFile)){
            byte[] buffer=new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) != -1){
                outStream.write(buffer,0,length);
            }
        }
        System.out.println("Success");
    }
}
