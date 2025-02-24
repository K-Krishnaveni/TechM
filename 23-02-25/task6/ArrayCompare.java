package generics;

import java.util.Arrays;

class ArrayCompare {
    public static <T> boolean areEqual(T[] arr1, T[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Integer[] b = {1, 2, 3};
        System.out.println(areEqual(a, b)); 
    }
}

