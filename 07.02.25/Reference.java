public class Reference {
    static void modifyValues(int num, int[] arr) {
        num = num + 10;
        arr[0] = arr[0] + 10;
    }

    public static void main(String[] args) {
        int number = 5;
        int[] numbersArray = {1, 2, 3};

        System.out.println("Before method call:");
        System.out.println("Integer: " + number);
        System.out.print("Array: ");
        for (int n : numbersArray) {
            System.out.print(n + " ");
        }
        System.out.println();
        modifyValues(number, numbersArray);

        System.out.println("\nAfter method call:");
        System.out.println("Integer: " + number);
        System.out.print("Array: ");
        for (int n : numbersArray) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
