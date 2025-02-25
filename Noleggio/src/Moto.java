public class Moto extends Veicolo{
    private boolean cavalletto;

    Moto(String modello, int anno, int velocitaMassima, double prezzoNoleggio, boolean cavalletto){
        super(modello, anno, velocitaMassima, prezzoNoleggio);
        this.cavalletto = cavalletto;
    }

    boolean getCavalletto(){
        return this.cavalletto;
    }
}
