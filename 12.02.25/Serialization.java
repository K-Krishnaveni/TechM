import java.io.*;
class Student implements Serializable {
    int rno;
    String name;

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}

public class Serialization {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(211, "Ravi");
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);
            out.flush();
            out.close(); 
            System.out.println("Serialization Success!");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e);
        }
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();
            in.close();
            System.out.println("Deserialized Student: " + s.rno + " " + s.name);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e);
        }
    }
}
