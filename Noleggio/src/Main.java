import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Noleggio noleggio = new Noleggio();

        System.out.println("Inserisci il modello: ");
        String modello = scanner.nextLine();

        System.out.println("Inserisci l'anno: ");
        int anno = scanner.nextInt();

        System.out.println("Inserisci la velocità massima: ");
        int velocitaMassima = scanner.nextInt();

        System.out.println("Inserisci il prezzo del noleggio: ");
        double prezzoNoleggio = scanner.nextDouble();

        Veicolo veicolo = new Veicolo(modello, anno, velocitaMassima, prezzoNoleggio);


        boolean flag = noleggio.inserisciVeicolo(veicolo);


        if(flag==false){
            System.out.println("Il noleggio è pieno.");
        }
    }
}