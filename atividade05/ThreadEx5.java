

/**
 * ThreadEx5
 */
public class ThreadEx5 extends Thread {

    Barramento barramento;

    public ThreadEx5(Barramento barramento) {
        this.barramento = barramento;
    }

    @Override
    public void run() {
        while (true) {
            barramento.increment();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }    
    }
    
}