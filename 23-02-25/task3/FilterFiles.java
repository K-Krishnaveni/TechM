package javapackage;

import java.io.File;

public class FilterFiles {
    public static void main(String[] args) {
        File dir = new File("D:\\Krishnaveni"); 
        String ext = ".txt"; 
        File[] files = dir.listFiles((d, name) -> name.endsWith(ext));
        if (files != null) {
            System.out.println("Files with extension " + ext + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
