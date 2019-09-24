# Atividade - Semáforos

1. Sinalização

Enviar sinal para outra thread para indicar que um evento ocorreu.
Faça um código que uma thread t1 e t2 são inicializadas simultaneamente, mas a t2 pode somente continuar a execução após a sinalização de t1.

2. Rendezvous (Encontro)

Enviar sinalização para um ponto de encontro entre threads.Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa.

Exemplo:
t1:
- trecho1.1
- trecho1.2

t2:
- trecho2.1
- trecho2.2

thecho1.1 ocorre antes trecho2.2 e threcho2.1 ocorre antes de trecho1.2.

3.  Mutex (Exclusão Mútua)

Garantir acesso exclusivo à seção crítica.Faça um código que possibilite que 2 ou mais threads realizem o incremento de um contador. Faça aexclusão mútua com semáforo.

4. Multiplex

Garantir acesso à seção crítica para no máximo N threads.Faça um código que possibilite que N threads estejam na seção crítica simultaneamente.

5. Barreira

Após n threads sincronizarem em um ponto em comum, um trecho específico (ponto crítico) pode ser executado por cada uma delas.Faça um código que possibilite barrar N threads em um ponto específico de execução e, após todas alcançarem o ponto, todas devem executar o trecho de código após esse ponto.

6. Barreira Reusável

Threds em um laço executam uma série de passos e sincronizam em uma barreira a cada passo.Faça um código que implemente uma barreira reusável que feche a si própria após todas as threads passarem.

7. Fila

Semáforos podem ser usadas para representar uma fila.Faça um código que implemente duas filas (F1 e F2) com semáforos. As threads colocadas na F1 sópodem executar se tiver um par na F2. Nesse caso, ambas as threads na primeira fila são executadas.
