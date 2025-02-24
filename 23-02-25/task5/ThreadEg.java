package javapackage;

	class ThreadEg extends Thread {
	    public void run() {
	        System.out.println("Hello, Java!");
	    }

	    public static void main(String[] args) {
	        ThreadEg t = new ThreadEg();
	        t.start();
	    }
	}
