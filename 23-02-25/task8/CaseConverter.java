package generics;

import java.util.List;
import java.util.stream.Collectors;

class CaseConverter {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        List<String> upper = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lower = words.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}

