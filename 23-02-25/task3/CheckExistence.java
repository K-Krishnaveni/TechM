package javapackage;

import java.io.File;

public class CheckExistence {
    public static void main(String[] args) {
        File file = new File("D:\\\\Krishnaveni"); 

        if (file.exists()) {
            System.out.println("File/Directory exists.");
        } else {
            System.out.println("Does not exist.");
        }
    }
}

