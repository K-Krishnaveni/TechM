import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java_io_4 {

    // Method to create a folder with 3 files
    static void createFolderWith3Files() {
        File folder = new File("folder1");
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Folder 'folder1' created successfully.");
        } else {
            System.out.println("Folder 'folder1' already exists.");
        }

        createFile("folder1", "file1.txt");
        createFile("folder1", "file2.txt");
        createFile("folder1", "file3.txt");
    }

    // Method to create a folder with 4 files
    static void createFolderWith4Files() {
        File folder = new File("folder2");
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Folder 'folder2' created successfully.");
        } else {
            System.out.println("Folder 'folder2' already exists.");
        }

        createFile("folder2", "fileA.txt");
        createFile("folder2", "fileB.txt");
        createFile("folder2", "fileC.txt");
        createFile("folder2", "fileD.txt");
    }

    // Method to create 3 separate files
    static void createThreeSeparateFiles() {
        createFile("", "fileX.txt");
        createFile("", "fileY.txt");
        createFile("", "fileZ.txt");
    }

    // Helper method to create a file in a specified folder
    static void createFile(String folderName, String fileName) {
        try {
            File file;
            if (!folderName.isEmpty()) {
                file = new File(folderName, fileName);
            } else {
                file = new File(fileName);
            }

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating file: " + fileName);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option to create files:");
        System.out.println("1 - Create 1 folder with 3 files");
        System.out.println("2 - Create 1 folder with 4 files");
        System.out.println("3 - Create 3 separate files");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 1:
                createFolderWith3Files();
                break;
            case 2:
                createFolderWith4Files();
                break;
            case 3:
                createThreeSeparateFiles();
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }
}
