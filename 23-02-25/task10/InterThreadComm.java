package generics;

class SharedResource {
    private boolean available = false;

    public synchronized void produce() {
        while (available) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Produced an item.");
        available = true;
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Consumed an item.");
        available = false;
        notify();
    }
}

class Producer extends Thread {
    private final SharedResource resource;
    public Producer(SharedResource res) { this.resource = res; }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.produce();
        }
    }
}

class Consumer extends Thread {
    private final SharedResource resource;
    public Consumer(SharedResource res) { this.resource = res; }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.consume();
        }
    }
}

public class InterThreadComm{
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new Producer(resource).start();
        new Consumer(resource).start();
    }
}
