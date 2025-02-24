package javapackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoPositiveNum {
    public static void checkNumbers(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                scanner.close();
                throw new Exception("Positive number found: " + number);
            }
        }
        System.out.println("No positive numbers found.");
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            checkNumbers("React.txt");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
