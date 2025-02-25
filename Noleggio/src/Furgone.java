public class Furgone extends Veicolo{
    private int capacita;

    Furgone(String modello, int anno, int velocitaMassima, double prezzoNoleggio, int capacita){
        super(modello, anno, velocitaMassima, prezzoNoleggio);
        this.capacita = capacita;
    }

    int getCapacita(){
        return this.capacita;
    }
}
