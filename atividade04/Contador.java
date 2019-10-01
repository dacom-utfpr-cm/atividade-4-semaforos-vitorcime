

import java.util.concurrent.Semaphore;

/**
 * Contador
 */
public class Contador {

    int number;
    Semaphore semaphore;

    public Contador(int numThreads){
        this.semaphore = new Semaphore(numThreads);
        this.number = 0;

    }

    public void increment() {
        try {
            this.semaphore.acquire();
        } catch (Exception e) {
            System.out.println("Erro para adquirir o semaforo");
        }
        this.number++;
        System.out.println(number);
        this.semaphore.release();
    }
}