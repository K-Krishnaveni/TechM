package generics;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class ReverseList {
    public static <T> List<T> reverse(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return copy;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3);
        System.out.println(reverse(nums)); 
    }
}
