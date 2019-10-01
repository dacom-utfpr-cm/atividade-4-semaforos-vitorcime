package atividade07;

import java.util.concurrent.Semaphore;

/**
 * Fila
 */
public class Fila {
    Semaphore semaphore1;
    Semaphore semaphore2;

    public Fila() {
        this.semaphore1 = new Semaphore(0);
        this.semaphore2 = new Semaphore(0);

    }

    public void semaphore1() {
        this.semaphore1.release();

        try {
            this.semaphore2.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}