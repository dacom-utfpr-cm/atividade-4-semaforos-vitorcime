package atividade03;

/**
 * Thread_Increment
 */
public class Thread_Increment extends Thread {
    Contador cont;

    public Thread_Increment(Contador cont) {
        this.cont = cont;
    }

    @Override
    public void run() {
        while (true) {
            cont.increment();
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}