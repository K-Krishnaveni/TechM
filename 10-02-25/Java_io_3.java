import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Java_io_3 {
    static void inputBufferMethod() throws IOException
    {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the input:");
        // Reading data using readLine
        String s = r.readLine();

        // Printing the read line
        System.out.println("The given input:"+s);
    }
    static void inputScannerMethod()
    {
        // Using Scanner for Getting Input from User
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input string :");
        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);

        System.out.println("Enter the input integer :");
        int a = s.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter the input float :");
        float b = s.nextFloat();
        System.out.println("You entered float " + b);
    }