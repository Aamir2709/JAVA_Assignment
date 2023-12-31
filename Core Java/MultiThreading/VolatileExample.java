class SharedResource {
    // Using volatile to ensure visibility across threads
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
    }

    public boolean isFlag() {
        return flag;
    }
}

class WriterThread extends Thread {
    private SharedResource sharedResource;

    public WriterThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Writer Thread is setting the flag to true.");
        sharedResource.setFlag();
        try {
            // Simulate some processing time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Writer Thread has completed.");
    }
}

class ReaderThread extends Thread {
    private SharedResource sharedResource;

    public ReaderThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        // Continuously check the flag until it becomes true
        while (!sharedResource.isFlag()) {
            // Do nothing until the flag is set
        }
        System.out.println("Reader Thread detected the change in flag.");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating a writer thread
        WriterThread writerThread = new WriterThread(sharedResource);

        // Creating a reader thread
        ReaderThread readerThread = new ReaderThread(sharedResource);

        // Starting both threads
        writerThread.start();
        readerThread.start();

        try {
            // Waiting for both threads to finish
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
