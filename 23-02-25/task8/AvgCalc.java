package generics;

import java.util.List;

class AvgCalc {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        double avg = nums.stream().mapToInt(n -> n).average().orElse(0);
        System.out.println("Average: " + avg);
    }
}

