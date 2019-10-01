

/**
 * ThreadIncrement
 */
public class ThreadIncrement extends Thread {
    Contador cont;

    public ThreadIncrement(Contador cont) {
        this.cont = cont;
    }

    @Override
    public void run() {
        while(true){
        this.cont.increment();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}