public class Main {
    public static void main(String[] args) {
        int maxSize = 5;
        int[] buffer = new int[maxSize];
        Semaforo liberi = new Semaforo(maxSize); // Spazi vuoti
        Semaforo occupati = new Semaforo(0);    // Spazi pieni
        new Produttore(buffer, maxSize, liberi, occupati).start();
        new Consumatore(buffer, maxSize, liberi, occupati).start();
    }
}