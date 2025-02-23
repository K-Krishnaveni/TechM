package javapackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadPlainText {
    public static void main(String[] args) {
        File file = new File("C:/Users/test.txt"); // Change path

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
