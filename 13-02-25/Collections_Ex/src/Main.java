import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws Exception {
       ArrayListThread athread = new ArrayListThread();
       LinkedListThread lthread = new LinkedListThread();
       VectorThread vthread = new VectorThread();
       StackThread sthread = new StackThread();

       athread.start();
       athread.join();
       lthread.start();
       lthread.join();
       vthread.start();
       vthread.join();
       sthread.start();
       sthread.join();

    }
}
class ArrayListThread extends Thread{
    public void run() {
        System.out.println("Arraylist");
        System.out.println("-----------------------------");
        List<Integer> list1 = new ArrayList<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println("The given list is:" + list1);
        System.out.println("Number of elements in the list: " + list1.size());

        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());

        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);
        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}
class LinkedListThread extends Thread{
    public void run(){
        System.out.println("Linkedlist");
        System.out.println("-----------------------------");
        List<Integer> list1 = new LinkedList<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println("The given list is:" + list1);
        System.out.println("Number of elements in the list: " + list1.size());

        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());

        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);
        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());

    }
}
class VectorThread extends Thread{
    public void run() {
        System.out.println("Vector");
        System.out.println("-----------------------------");
        List<Integer> list1 = new Vector<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println("The given list is:" + list1);
        System.out.println("Number of elements in the list: " + list1.size());

        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());

        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);
        list1.remove(2);//Removing element by its index
        list1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}
class StackThread extends Thread{
    public void run() {
        System.out.println("Stack");
        System.out.println("-----------------------------");
        List<Integer> list1 = new Stack<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println("The given list is:" + list1);
        System.out.println("Number of elements in the list: " + list1.size());

        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());

        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);
        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}