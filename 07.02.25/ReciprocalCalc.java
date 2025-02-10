import java.util.Scanner;
import java.util.InputMismatchException;
    public class ReciprocalCalc {
        public static void processInput() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number to calculate its reciprocal: ");

            try {
                double number = sc.nextDouble();
                if (number == 0) {
                    throw new ArithmeticException("Cannot calculate the reciprocal of zero.");
                }

                double reciprocal = 1 / number;
                System.out.println("The reciprocal of " + number + " is: " + reciprocal);
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
            }
            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                sc.close();
            }
        }
        public static void main(String[] args) {

            processInput();
        }
    }
