import java.util.Scanner;

public class Noleggio {
    Veicolo[] veicoli;

    Noleggio(){
        this.veicoli = new Veicolo[10];
    }

    boolean inserisciVeicolo(Veicolo veicolo){
        boolean flag = false;
        for(int i = 0; i<10; i++){
            if (this.veicoli[i] == null) {
                this.veicoli[i] = veicolo;
                flag = true;
                break;
            }
        }
        return flag;
    }

    double calcoloCosto(String modello, int giorni){
        for(int i = 0; i<10; i++){
            Veicolo veicolo = this.veicoli[i];
            if (veicolo.getModello() == modello) {
                return veicolo.calcoloCosto(giorni);
            }
        }
        return -1;
    }
}
