
    import java.util.Scanner;

    public class Trailing_zero_fact {
        public static int countTrailingZeroes(int n) {
            int count = 0;
            while (n >= 5) {
                count += n / 5;
                n /= 5;
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            scanner.close();

            int result = countTrailingZeroes(num);
            System.out.println("Trailing zeroes in " + num + "! = " + result);
        }
    }


