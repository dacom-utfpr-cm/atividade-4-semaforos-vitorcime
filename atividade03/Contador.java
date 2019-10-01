package atividade03;

import java.util.concurrent.Semaphore;

/**
 * Contador
 */
public class Contador {
    int number;
    Semaphore semaphore;

    public Contador() {
        this.number = 0;
        this.semaphore = new Semaphore(1);
    }

    public void increment() {
        try {
            this.semaphore.acquire();
        } catch (InterruptedException e) {
            System.out.println("Erro");
        }
        this.number++;
        System.out.println(number);
        this.semaphore.release();
    }

}