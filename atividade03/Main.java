package atividade03;

/**
*  Garantir acesso exclusivo à seção crítica.
*  Faça um código que possibilite que 2 ou mais threads realizem o incremento de um contador. Faça a
*  exclusão mútua com semáforo
 */

public class Main {

    public static void main(String[] args) {
        Contador cont = new Contador();
        Thread_Increment t1 = new Thread_Increment(cont);
        Thread_Increment t2 = new Thread_Increment(cont);
        Thread_Increment t3 = new Thread_Increment(cont);

        t1.start();
        t2.start();
        t3.start();
    }
}