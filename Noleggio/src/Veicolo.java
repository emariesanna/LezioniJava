public class Veicolo {
    private String modello;
    private int anno;
    private int velocitaMassima;
    private double prezzoNoleggio; // prezzo al giorno

    Veicolo(String modello, int anno, int velocitaMassima, double prezzoNoleggio){
        this.modello = modello;
        this.anno = anno;
        this.velocitaMassima = velocitaMassima;
        this.prezzoNoleggio = prezzoNoleggio;
    }

    String getModello(){
        return this.modello;
    }

    int getAnno(){
        return this.anno;
    }

    int getVelocitaMassima(){
        return this.velocitaMassima;
    }

    double getPrezzoNoleggio(){
        return this.prezzoNoleggio;
    }

    double calcoloCosto(int giorni){
        double costoTotale;
        costoTotale = this.prezzoNoleggio * giorni;
        return costoTotale;
    }

    void visualizzaDati(){
        System.out.println("Il modello è: " + this.modello);
        System.out.println("L'anno è: " + this.anno);
        System.out.println("La velocita massima è: " + this.velocitaMassima);
        System.out.println("Il prezzo del noleggio è: " + this.prezzoNoleggio);
    }
}
