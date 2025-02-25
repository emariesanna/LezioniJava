public class Auto extends Veicolo{
    private int porte;

    Auto(String modello, int anno, int velocitaMassima, double prezzoNoleggio, int porte){
        super(modello, anno, velocitaMassima, prezzoNoleggio);
        this.porte = porte;
    }

    int getPorte(){
        return this.porte;
    }
}
