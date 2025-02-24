package generics;

import java.util.List;

class FindIndex {
    public static <T> int findFirst(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> words = List.of("Myntra", "Meesho", "Ajio");
        System.out.println(findFirst(words, "Meesho")); 
    }
}
