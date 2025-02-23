package javapackage;

import java.io.File;

public class CheckType {
    public static void main(String[] args) {
        File file = new File("D:\\Krishnaveni\\SERVLET"); 

        if (file.isDirectory()) {
            System.out.println("It's a directory.");
        } else if (file.isFile()) {
            System.out.println("It's a file.");
        } else {
            System.out.println("Invalid path.");
        }
    }
}
