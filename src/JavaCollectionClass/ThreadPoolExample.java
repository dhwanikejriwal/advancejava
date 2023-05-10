package JavaCollectionClass;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private int num;

    public WorkerThread(int j) {
        this.num = j;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) num= " + num);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}

    public class ThreadPoolExample {
        public static void main(String args[]) {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            for (int i = 0; i < 10; i++) {
                Runnable worker = new WorkerThread(i);
                executor.execute(worker);
            }
            executor.shutdown();

            while (!executor.isTerminated()) {
            }
            System.out.println("Finish all Threads");

        }
    }
