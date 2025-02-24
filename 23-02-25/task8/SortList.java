package generics;

import java.util.List;
import java.util.stream.Collectors;
class SortList {
    public static void main(String[] args) {
        List<String> words = List.of("banana", "apple", "cherry");
        List<String> asc = words.stream().sorted().collect(Collectors.toList());
        List<String> desc = words.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Ascending: " + asc);
        System.out.println("Descending: " + desc);
    }
}

