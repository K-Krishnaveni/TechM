package javapackage;

import java.util.Arrays;

public class EqualsComparison {
	    public static void main(String args[]) {
	        Integer[] arr1 = {1, 2, 3};
	        Integer[] arr2 = {1, 2, 3};
	        System.out.println("equals() Result: " + Arrays.equals(arr1, arr2));
	        System.out.println("deepEquals() Result: " + Arrays.deepEquals(arr1, arr2));
	    }
	}

