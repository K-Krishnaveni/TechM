
import utility.Utility;
import java.util.Scanner;

 public class UtilityMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        int length = Utility.getLength(num);

        System.out.println("Length of the number: " + length);
    }
}

