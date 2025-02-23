package javapackage;

import java.io.File;
import java.util.Date;

public class LastMlodified {
    public static void main(String[] args) {
        File file = new File("D:/Krishnaveni/React.txt");

        if (file.exists()) {
            System.out.println("Last modified: " + new Date(file.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
    }
}
