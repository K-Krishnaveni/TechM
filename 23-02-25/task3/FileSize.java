package javapackage;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("D:/Krishnaveni/React.txt"); 
        if (file.exists()) {
            long bytes = file.length();
            System.out.println("Size in Bytes: " + bytes);
            System.out.println("Size in KB: " + bytes / 1024);
            System.out.println("Size in MB: " + bytes / (1024 * 1024));
        } else {
            System.out.println("File does not exist.");
        }
    }
}

