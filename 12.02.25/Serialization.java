import java.io.*;

// Student class must implement Serializable
class Student implements Serializable {
    int rno;
    String name;

    // Constructor to initialize Student object
    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}

public class Serialization {
    public static void main(String[] args) {
        // Serialization: Writing the object to a file
        try {
            // Creating the object
            Student s1 = new Student(211, "Ravi");

            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);
            out.flush();
            out.close(); // Closing stream

            System.out.println("Serialization Success!");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e);
        }

        // Deserialization: Reading the object from the file
        try {
            // Creating stream to read the object

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));

            // Reading the object
            Student s = (Student) in.readObject();
            in.close(); // Closing stream

            System.out.println("Deserialized Student: " + s.rno + " " + s.name);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e);
        }
    }
}
