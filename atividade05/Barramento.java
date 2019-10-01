

import java.util.concurrent.Semaphore;

/**
 * Barramento
 */
public class Barramento {

    Semaphore semaphore;
    Semaphore mutex;

    int numThreads;
    int actThreads;

    int number;

    public Barramento(int numThreads) {
        this.actThreads = 0;
        this.number = 0;
        this.numThreads = numThreads;

        this.semaphore = new Semaphore(0);
        this.mutex = new Semaphore(1);
    }

    public void increment() {
        try {
            this.mutex.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.actThreads++;

        if (this.actThreads >= this.numThreads) {
            this.semaphore.release();
        }

        this.mutex.release();

        try {
            this.semaphore.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.number++;
        System.out.println(number);
    }
}