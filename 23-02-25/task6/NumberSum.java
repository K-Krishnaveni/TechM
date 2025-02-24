package generics;

import java.util.List;

class NumberSum {
    public static <T extends Number> int sumEvenOdd(List<T> list, boolean even) {
        return list.stream().mapToInt(Number::intValue).filter(n -> (n % 2 == 0) == even).sum();
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(sumEvenOdd(nums, true)); 
        System.out.println(sumEvenOdd(nums, false)); 
    }
}
