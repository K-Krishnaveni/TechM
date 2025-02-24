package javapackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FnfEx {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        System.out.println("File read successfully.");
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found!");
        }
    }
}
