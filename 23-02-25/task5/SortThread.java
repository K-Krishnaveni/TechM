package javapackage;

import java.util.Arrays;

class SortThread extends Thread {
    private int[] arr;

    SortThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        Arrays.sort(arr);
    }

    public static void main(String[] args) throws InterruptedException {
        int[] nums = {5, 3, 8, 1, 2};
        SortThread t = new SortThread(nums);
        t.start();
        t.join();
        System.out.println(Arrays.toString(nums));
    }
}
