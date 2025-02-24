package generics;

import java.util.*;

class LinkedListTask {
    public static void appendEnd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.addLast("C");
        System.out.println(list);
    }

    public static void iterateAll() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30));
        for (int num : list) System.out.print(num + " ");
        System.out.println();
    }

    public static void iterateFromPos() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        Iterator<String> itr = list.listIterator(1);
        while (itr.hasNext()) System.out.print(itr.next() + " ");
        System.out.println();
    }

    public static void reverseIterate() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("X", "Y", "Z"));
        Iterator<String> itr = list.descendingIterator();
        while (itr.hasNext()) System.out.print(itr.next() + " ");
        System.out.println();
    }

    public static void insertAtPos() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "C"));
        list.add(1, "B");
        System.out.println(list);
    }

    public static void insertFirstLast() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);
    }

    public static void insertFront() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Front");
        System.out.println(list);
    }

    public static void insertEnd() {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("End");
        System.out.println(list);
    }

    public static void insertAtPosition() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("One", "Three"));
        list.add(1, "Two");
        System.out.println(list);
    }

    public static void getFirstLast() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(5, 10, 15, 20));
        System.out.println("First: " + list.getFirst() + ", Last: " + list.getLast());
    }

    public static void main(String[] args) {
        appendEnd();
        iterateAll();
        iterateFromPos();
        reverseIterate();
        insertAtPos();
        insertFirstLast();
        insertFront();
        insertEnd();
        insertAtPosition();
        getFirstLast();
    }
}

