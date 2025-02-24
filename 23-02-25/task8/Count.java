package generics;

import java.util.List;

class Count {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "avocado", "cherry", "apricot");
        long count = words.stream().filter(w -> w.startsWith("a")).count();
        System.out.println("Words starting with 'a': " + count);
    }
}
