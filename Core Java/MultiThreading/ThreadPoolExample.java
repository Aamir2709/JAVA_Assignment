import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable {
    private String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is being processed by " + Thread.currentThread().getName());
        try {
            // Simulating some task execution time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskName + " completed");
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Creating a fixed-size thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submitting tasks to the thread pool
        for (int i = 1; i <= 10; i++) {
            Runnable task = new Task("Task " + i);
            executor.execute(task);
        }

        // Shutting down the thread pool gracefully
        executor.shutdown();

        // Check if the thread pool has completely terminated
        while (!executor.isTerminated()) {
            try {
                // Wait for the termination of all threads
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Additional information after the thread pool is terminated
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
        System.out.println("Thread Pool Stats:");
        System.out.println("   Core Pool Size: " + threadPoolExecutor.getCorePoolSize());
        System.out.println("   Maximum Pool Size: " + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("   Active Threads: " + threadPoolExecutor.getActiveCount());
        System.out.println("   Completed Tasks: " + threadPoolExecutor.getCompletedTaskCount());
    }
}
