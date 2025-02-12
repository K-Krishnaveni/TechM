import java.io.*;
class EmployeeDetail implements Serializable {
    int eno;
    String ename;
    transient String email;

     EmployeeDetail(int eno, String ename, String email) {
        this.eno = eno;
        this.ename = ename;
        this.email = email;
    }
}
  public class Employee {
      public static void main(String args[]) {
          try {
              EmployeeDetail e1 = new EmployeeDetail(100, "Krish", "krish@gmail.com");
              FileOutputStream fout = new FileOutputStream("f1.txt");
              ObjectOutputStream out = new ObjectOutputStream(fout);
              out.writeObject(e1);
              out.flush();
              out.close();
              System.out.println("Serialization Success!");
          } catch (IOException e) {
              System.out.println("Serialization Error: " + e);
          }
          try {
              ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
              EmployeeDetail e2 = (EmployeeDetail) in.readObject();
              in.close(); // Closing stream

              System.out.println("Deserialized Student: " + e2.eno + " " + e2.ename);

          } catch (IOException | ClassNotFoundException e) {
              System.out.println("Deserialization Error: " + e);
          }
      }
  }
