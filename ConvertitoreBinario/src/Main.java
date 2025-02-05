public class Main {
    public static void main(String[] args) {

        Finestra finestra = new Finestra();

        Convertitore convertitore = new Convertitore();
        int decimale = convertitore.convertiBinarioDecimale("01001011");

        System.out.println("Decimale: " + decimale);

        // Configurazione della finestra
        finestra.setTitle("La mia interfaccia grafica"); // Imposta un titolo
        finestra.setSize(400, 600); // Imposta la dimensione della finestra
        finestra.setLocationRelativeTo(null); // Centra la finestra sullo schermo
        finestra.setVisible(true); // Rende visibile la finestra
    }
}