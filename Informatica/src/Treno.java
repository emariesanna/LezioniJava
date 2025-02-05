/*

ESERCIZIO TRENO
Si crei una classe treno caratterizzata dalla tipologia (Locale, Intercity, ecc..),
dal numero di vagoni e  dal numero massimo di persone per vagone (uguale per ogni vagone).
E' necessario, inoltre, sapere in ogni istante il numero di posti liberi e di posti occupati
per vagone.
Prevedere, oltre al costruttore, i metodi:
- Salire: che consente di fra salire un certo numero di passeggeri in un vagone
- Scendere: che consente di fra scendere un certo numero di persone da un vagone
- totalePasseggeri: che calcola e restituisce il totale dei passeggeri a bordo del treno
- mediaPasseggeriPerVagone: calcola e restituisce il numero medio di passeggeri per vagone
- stampa: stampa i dati del treno e il numero dei passeggeri per ogni vagone

____________________________________________________________________|
|
|    Treno
|
--------------------------------------------------------------------|
|
|   + tipo: String
|   + vagoni: int
|   + max_persone: int
|   + posti_liberi: int[]
|   + posti_occupati: int[]
|
--------------------------------------------------------------------|
|
|   + Treno(tipo: String, vagoni: int, max_persone: int, posti_liberi: int, posti_occupati: int)
|   + salire(persone_salite: int, vagone: int): void
|   + scendere(persone_scese: int, vagone: int): void
|   + totalePasseggeri(): int
|   + mediaPasseggeriPerVagone(): double
|   + stampa(): void
|
--------------------------------------------------------------------|

 */


public class Treno {
    public String tipo;
    public int vagoni;
    public int max_persone;
    public int[] posti_liberi;
    public int[] posti_occupati;

    public Treno(String tipo, int vagoni, int max_persone, int[] posti_liberi,
                 int[] posti_occupati){
        this.tipo = tipo;
        this.vagoni = vagoni;
        this.max_persone = max_persone;
        this.posti_liberi = posti_liberi;
        this.posti_occupati = posti_occupati;
    }

    public void salire(int persone_salite, int vagone){
        this.posti_liberi[vagone-1] -= persone_salite;
        this.posti_occupati[vagone-1] += persone_salite;
    }

    public void scendere(int persone_scese, int vagone){
        this.posti_liberi[vagone-1] += persone_scese;
        this.posti_occupati[vagone-1] -= persone_scese;
    }

    public int totalePasseggeri() {
        int passeggeri_totali = 0;
        for (int i = 0; i < this.vagoni; i++) {
            passeggeri_totali += this.posti_occupati[i];
        }
        return passeggeri_totali;
    }

    public double mediaPasseggeriPerVagone() {

        double media_passeggeri = (double)this.totalePasseggeri()/this.vagoni;

        return media_passeggeri;
    }

    public void stampa() {
        int passeggeri_totali = this.totalePasseggeri();
        double media_passeggeri = this.mediaPasseggeriPerVagone();

        System.out.println("Il treno e' di tipo " + this.tipo + ".");
        System.out.println("Il treno ha " + this.vagoni + " vagoni.");
        System.out.println("Ogni vagone ospita al massimo " + this.max_persone + " persone.");
        for (int i = 0; i < this.vagoni; i++) {
            System.out.println("Il vagone " + (i+1) + " ha " + this.posti_liberi[i] +
                    " posti liberi e " + this.posti_occupati[i] + " posti occupati.");
        }
        System.out.println("Il treno ha in totale " + passeggeri_totali + " passeggeri.");
        System.out.println("Il treno ha una media di " + media_passeggeri + " passeggeri per vagone.");
    }




    public static void main(String[] args) {
        int[] posti_liberi = new int[6];
        int[] posti_occupati = new int[6];

        for(int i=0; i<6; i++){
            posti_liberi[i] = 60;
            posti_occupati[i] = 0;
        }

        Treno treno = new Treno("Intercity", 6, 60,
                posti_liberi, posti_occupati);

        treno.salire(10, 1);
        treno.salire(50, 2);
        treno.salire(40, 3);
        treno.salire(30, 4);
        treno.salire(10, 5);
        treno.salire(25, 6);

        treno.scendere(5, 1);
        treno.scendere(5, 2);
        treno.scendere(5, 3);
        treno.scendere(5, 4);
        treno.scendere(5, 5);
        treno.scendere(5, 6);

        treno.stampa();
    }

}
