// Define a custom thread by extending the Thread class
class MyThread extends Thread {
    // Override the run method to specify the code that the thread will execute
    public void run() {
        // Print values in a loop
        for (int i = 0; i < 5; i++) {
            // Print the thread ID and the current value
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

// Main class to demonstrate thread basics
class ThreadBasicExample {
    public static void main(String[] args) {
        // Create an instance of the custom thread class
        MyThread t1 = new MyThread();
        // Start the first thread
        t1.start();

        // Create another instance of the custom thread class
        MyThread t2 = new MyThread();
        // Start the second thread
        t2.start();
    }
}
