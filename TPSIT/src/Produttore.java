public class Produttore extends Thread{
    private int[] buffer;
    private int maxSize;
    private Semaforo liberi;
    private Semaforo occupati;
    private int indice;

    public Produttore(int[] buffer, int maxSize, Semaforo liberi, Semaforo occupati) {
        this.buffer = buffer;
        this.maxSize = maxSize;
        this.liberi = liberi;
        this.occupati = occupati;
        this.indice = 0;
    }

    @Override
    public void run() {

        // ciclo for per eseguire l'operazione di inserimento esattamente 10 volte
        for (int i = 0; i < 10; i++) {

            liberi.P(); // P - controllo che il semaforo non sia a 0 e nel caso lo riduco di 1

            // operazione di inserimento (in questo esempio è un semplice numero casuale)
            buffer[indice] = (int) (Math.random() * 100); // Inserisce il dato
            // ******

            indice = (indice + 1) % maxSize; // Incrementa l'indice in modo circolare

            occupati.V(); // V - incremento il semaforo di 1
        }
    }
}
