class ThreadThree1 extends Thread {
    public void run() {
        System.out.println(" From Thread3 statement 1");
        System.out.println(" From Thread3 statement 2");
        System.out.println(" From Thread3 statement 3");
        System.out.println(" From Thread3 statement 4");
        System.out.println(" From Thread3 statement 5");
    }
}
class ThreadRunnableOne implements Runnable{
    public void run(){
        System.out.println("From ThreadRunnableOne statement1");
        System.out.println("From ThreadRunnableOne line 2");
    }

}
class ThreadRunnableTwo implements Runnable{
    public void run(){
        System.out.println("From ThreadRunnableTwo statement1");
        System.out.println("From ThreadRunnableTwo line 2");
        System.out.println("From ThreadRunnableTwo line 3");
    }
}
public class ThreadThree{
    public static void main(String[] args) {

        ThreadThree1 t1 = new ThreadThree1();
        ThreadThree1 t2 = new ThreadThree1();
        ThreadThree1 t3 = new ThreadThree1();


        t1.start();
        t2.start();
        t3.start();


        ThreadRunnableOne t4 = new ThreadRunnableOne();
        Thread t5 = new Thread(t4);
        t5.start();

        ThreadRunnableTwo runnableTwo = new ThreadRunnableTwo();
        Thread t6 = new Thread(runnableTwo);
        Thread t7 = new Thread(runnableTwo);

        t6.start();
        t7.start();
    }
}