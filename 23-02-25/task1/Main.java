package javapackage;

import java.util.Arrays;

class Main {
    public static int[] copyAlternativeElements(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0]; // Handle empty array

        int size = (arr.length + 1) / 2; // Calculate new array size
        int[] result = new int[size];

        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int[] alternativeElements = copyAlternativeElements(arr);
        System.out.println("Alternative Elements: " + Arrays.toString(alternativeElements));
    }
}
