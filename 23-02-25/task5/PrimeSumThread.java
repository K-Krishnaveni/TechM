package javapackage;

class PrimeSumThread extends Thread {
    private int start, end, sum = 0;

    PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) sum += i;
        }
    }

    public int getSum() {
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        int limit = 50;
        PrimeSumThread t1 = new PrimeSumThread(1, limit / 2);
        PrimeSumThread t2 = new PrimeSumThread(limit / 2 + 1, limit);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Prime Sum: " + (t1.getSum() + t2.getSum()));
    }
}
