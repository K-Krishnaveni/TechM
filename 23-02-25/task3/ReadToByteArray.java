package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadToByteArray {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Krishnaveni/React.txt"); 
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        System.out.println("File read successfully.");
    }
}
