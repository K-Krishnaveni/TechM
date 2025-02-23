package javapackage;

import java.io.File;

public class CheckPermissions {
    public static void main(String[] args) {
        File file = new File("D:\\Krishnaveni\\React.txt"); // Change path

        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }
}

