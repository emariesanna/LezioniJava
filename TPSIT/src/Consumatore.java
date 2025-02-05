public class Consumatore extends Thread{
    private int[] buffer;
    private int maxSize;
    private Semaforo liberi;
    private Semaforo occupati;
    private int indice;

    public Consumatore(int[] buffer, int maxSize, Semaforo liberi, Semaforo occupati) {
        this.buffer = buffer;
        this.maxSize = maxSize;
        this.liberi = liberi;
        this.occupati = occupati;
        this.indice = 0;
    }

    @Override
    public void run() {

        // ciclo while per eseguire l'operazione di lettura indefinitamente
        while(true){

            occupati.P(); // P - controllo che il semaforo non sia a 0 e nel caso lo riduco di 1

            // operazione di lettura (in questo esempio è una semplice stampa a video)
            System.out.println(buffer[indice]); // Legge il dato
            // ******

            indice = (indice + 1) % maxSize; // Incrementa l'indice in modo circolare

            liberi.V(); // V - incremento il semaforo di 1
        }
    }
}
