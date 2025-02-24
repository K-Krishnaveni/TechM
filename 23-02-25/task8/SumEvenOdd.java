package generics;

import java.util.List;

class SumEvenOdd {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        int evenSum = nums.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        int oddSum = nums.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).sum();
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}
