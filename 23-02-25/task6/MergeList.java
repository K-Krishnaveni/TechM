package generics;

import java.util.List;
import java.util.ArrayList;

class MergeList {
    public static <T> List<T> mergeAlt(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int size = Math.max(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            if (i < list1.size()) result.add(list1.get(i));
            if (i < list2.size()) result.add(list2.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 3, 5);
        List<Integer> b = List.of(2, 4, 6, 8);
        System.out.println(mergeAlt(a, b)); 
    }
}

