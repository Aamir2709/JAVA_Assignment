class Counter {
    private int count = 0;

    // Increment method is synchronized, ensuring only one thread can execute it at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MethodSyncExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value: " + counter.getCount());
    }
}
