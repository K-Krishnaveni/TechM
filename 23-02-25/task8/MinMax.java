package generics;

import java.util.List;

class MinMax {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 7, 2, 9, 5);
        int max = nums.stream().max(Integer::compare).orElse(-1);
        int min = nums.stream().min(Integer::compare).orElse(-1);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
