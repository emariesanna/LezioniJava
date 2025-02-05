/*
Il semaforo conta quanti thread possono ancora accedere alla risorsa condivisa
Il semaforo è pieno se è a 0
P è la funzione che i thread usano per verificare che il semaforo non sia pieno e, nel caso, riempirlo
    (riducendo il suo valore di 1)
V è la funzione che i thread usano, quando hanno finito di usare la risorsa condivisa, per "svuotare" il semaforo
    (incrementando il suo valore di 1)
 */

// Semaforo personalizzato
class Semaforo{
    // campi
    private int valore;

    // costruttore
    public Semaforo(int valoreIniziale) {
        this.valore = valoreIniziale;
    }

    // metodi
    synchronized public void P() {
        while (valore == 0) { // semaforo rosso
            try {
                wait(); // Aspetta che il valore diventi positivo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valore--; // Occupa una risorsa
    }

    synchronized public void V() {
        valore++; // Libera una risorsa
        notify(); // Risveglia un thread in attesa
    }
}