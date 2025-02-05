import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        // esperimento con le interfacce
        Finestra finestra = new Finestra();
        finestra.setTitle("La mia interfaccia grafica"); // Imposta un titolo
        finestra.setSize(400, 600); // Imposta la dimensione della finestra
        finestra.setLocationRelativeTo(null); // Centra la finestra sullo schermo
        finestra.setVisible(true); // Rende visibile la finestra
        // *****************************************************************************

        Scanner scanner = new Scanner(System.in);

        Auto auto_1 =
                new Auto("AA000AA", "Fiat Punto", 80, 60, 0.056);
        Distributore distributore =
                new Distributore("Bergamo", "Sandro", 10000, 5000, 1.8);

        int comando;

        do{
            System.out.println("""
                    Che cosa desideri fare?
                    1 - effettua rifornimento
                    2 - effettua viaggio
                    3 - riempi cisterna
                    4 - stampa dati auto
                    5 - stampa dati distributore
                    6 - fine""");
            comando = scanner.nextInt();

            switch(comando){
                case 1:
                    System.out.println("Quale importo vuoi inserire?\n");
                    double importo = scanner.nextFloat();
                    distributore.rifornimento(auto_1, importo);
                    break;
                case 2:
                    System.out.println("Qual è la lunghezza del viaggio?\n");
                    double lunghezza = scanner.nextFloat();
                    auto_1.viaggio(lunghezza);
                    break;
                case 3:
                    distributore.riempi_cisterna();
                    break;
                case 4:
                    auto_1.stampa();
                    break;
                case 5:
                    distributore.stampa();
                    break;
                case 6:
                    System.out.println("Uscita dal programma...\n");
                    break;
                default:
                    System.out.println("Comando non riconosciuto\n");
            }

        }while(comando != 6);
    }
}