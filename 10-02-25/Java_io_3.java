import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Java_io_3 {
    static void bufferMethod() throws IOException {
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the input:");
        String s = r.readLine();
        System.out.println("The given input:" + s);
    }

     void iScannerMethod() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input string :");
        String word = s.nextLine();
        System.out.println("You entered string " + word);

        System.out.println("Enter the input integer :");
        int number = s.nextInt();
        System.out.println("You entered integer " + number);

        System.out.println("Enter the input float :");
        float decimal = s.nextFloat();
        System.out.println("You entered float " + decimal);
    }
    public static void main(String args[]) throws IOException{
        bufferMethod();
        Java_io_3 ref=new Java_io_3();
        ref.iScannerMethod();
    }
}