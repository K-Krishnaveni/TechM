class ThreadTwo extends Thread {
        public void run() {
                System.out.println("From ThreadTwo!");
                System.out.println("From ThreadTwo!");
                System.out.println(10 / 0);
        }

        public static void main(String[] args) {
            ThreadTwo t1 = new ThreadTwo(); // Create thread object
            ThreadTwo t2 = new ThreadTwo(); // Create another thread object

            t1.start(); // Starts a new thread
            t2.start(); // Starts another new thread

            t1.run(); // Runs in the main thread (not a new thread)
        }
    }


