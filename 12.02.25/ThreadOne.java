public class ThreadOne extends Thread{

        public void run() {
            System.out.println("From ThreadOne!");
            System.out.println("From ThreadOne!");
            System.out.println("From ThreadOne!");
        }
    public static void main(String args[]){
        ThreadOne t1 = new ThreadOne();
        t1.start();
    }
}
