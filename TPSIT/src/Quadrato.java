public class Quadrato extends Thread{
    //campi
    int id;
    int lato;
    double diagonale;

    //costruttore
    public Quadrato(int id, int lato){
        this.id = id;
        this.lato = lato;
    }

    //metodo run
    public void run() {
        this.diagonale = Math.sqrt(2 * lato * lato);
        System.out.println("Il quadrato " + id + " ha diagonale " + diagonale);
    }

    public static void main(String[] args) {
        //creo gli oggetti thread
        Quadrato quadrato1 = new Quadrato(1, 5);
        Quadrato quadrato2 = new Quadrato(2, 6);
        Quadrato quadrato3 = new Quadrato(3, 8);
        //eseguo i thread, le esecuzioni si diramano dal main
        quadrato1.start();
        quadrato2.start();
        quadrato3.start();
        //esecuzione della parte di main in parallelo ai thread
        try {
            //aspetto la fine dei thread, le esecuzioni si ricongiungono
            quadrato1.join();
            quadrato2.join();
            quadrato3.join();
        } catch (InterruptedException e) {

        }
        //esecuzione della parte di main che dipende dall'esito dei thread
    }
}
