

/**
*   Após n threads sincronizarem em um ponto em comum, um trecho específico (ponto crítico) pode
*   ser executado por cada uma delas.
*   Faça um código que possibilite barrar N threads em um ponto específico de execução e, após todas
*   alcançarem o ponto, todas devem executar o trecho de código após esse ponto.
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Barramento barramento = new Barramento(3);

        ThreadEx5 t1 = new ThreadEx5(barramento);
        ThreadEx5 t2 = new ThreadEx5(barramento);
        ThreadEx5 t3 = new ThreadEx5(barramento);
        ThreadEx5 t4 = new ThreadEx5(barramento);
        ThreadEx5 t5 = new ThreadEx5(barramento);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}