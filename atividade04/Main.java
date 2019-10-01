

/**
 * Garantir acesso à seção crítica para no máximo N threads.
 * Faça um código que possibilite que N threads estejam na seção crítica simultaneamente.
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Contador cont = new Contador(3);

        ThreadIncrement t1 = new ThreadIncrement(cont);
        ThreadIncrement t2 = new ThreadIncrement(cont);
        ThreadIncrement t3 = new ThreadIncrement(cont);
        ThreadIncrement t4 = new ThreadIncrement(cont);
        ThreadIncrement t5 = new ThreadIncrement(cont);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}