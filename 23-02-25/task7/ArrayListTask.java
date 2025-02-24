package generics;

	import java.util.*;

	class ArrayListTask {
	    public static void addColors() {
	        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
	        System.out.println(colors);
	    }

	    public static void iterateList() {
	        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
	        for (int num : nums) System.out.print(num + " ");
	        System.out.println();
	    }

	    public static void insertFirst() {
	        List<String> list = new ArrayList<>(Arrays.asList("B", "C", "D"));
	        list.add(0, "A");
	        System.out.println(list);
	    }

	    public static void retrieveElement() {
	        List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry");
	        System.out.println(list1.get(1)); 
	    }

	    public static void updateElement() {
	        List<String> list2 = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
	        list2.set(1, "Updated");
	        System.out.println(list2);
	    }

	    public static void removeThird() {
	        List<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
	        list3.remove(2);
	        System.out.println(list3);
	    }

	    public static void searchElement() {
	        List<String> list4 = Arrays.asList("X", "Y", "Z");
	        System.out.println(list4.contains("Y") ? "Found" : "Not Found");
	    }

	    public static void sortList() {
	        List<String> list5 = new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));
	        Collections.sort(list5);
	        System.out.println(list5);
	    }

	    public static void copyList() {
	        List<String> list6 = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
	        List<String> list7 = new ArrayList<>(list6);
	        System.out.println(list7);
	    }

	    public static void shuffleList() {
	        List<Integer> n = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	        Collections.shuffle(n);
	        System.out.println(n);
	    }

	    public static void main(String[] args) {
	        addColors();
	        iterateList();
	        insertFirst();
	        retrieveElement();
	        updateElement();
	        removeThird();
	        searchElement();
	        sortList();
	        copyList();
	        shuffleList();
	    }
	}


