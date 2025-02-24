package generics;

import java.util.List;
import java.util.stream.Collectors;

class RemoveDupli {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> unique = nums.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Elements: " + unique);
    }
}
