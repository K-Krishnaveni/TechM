package javapackage;

import java.io.File;
import java.io.FileNotFoundException;

public class EmptyFile {
    public static void checkEmptyFile(String fileName) throws Exception {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found!");
        }

        if (file.length() == 0) {
            throw new Exception("File is empty!");
        }

        System.out.println("File is not empty.");
    }

    public static void main(String[] args) {
        try {
            checkEmptyFile("React.txt"); 
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

