class Distributore {
    String citta;
    String proprietario;
    double capacita; //capacità della cisterna
    double carburante; //carburante contenuto nella cisterna
    double costo; // euro/l

    Distributore(String citta, String proprietario, double capacita, double carburante, double costo){
        this.citta = citta;
        this.proprietario = proprietario;
        this.capacita = capacita;
        this.carburante = carburante;
        this.costo = costo;
    }

    // euro, (euro/litro) ---> litri
    // euro / (euro/litro) = litri

    // km, (litri/km) ---> litri
    // km * (litri/km) = litri

    // km, h ---> (km/h)
    // km / h = (km/h)

    boolean rifornimento(Auto auto, double importo){

        double carburante_comprato = importo / costo;

        if(carburante >= carburante_comprato){
            boolean flag = auto.rifornimento(carburante_comprato);
            if(flag){
                carburante -= carburante_comprato;
                System.out.println("Rifornimento effettuato, nuovo livello di carburante: " + carburante + " litri.\n");
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Rifornimento non effettuato, carburante disponibile " + carburante + " litri.\n");
            return false;
        }

    }

    void riempi_cisterna(){
        carburante = capacita;
        System.out.println("Cisterna riempita\n");
    }

    void stampa(){
        System.out.println("La città del distributore è " + citta);
        System.out.println("Il proprietario del distributore è " + proprietario);
        System.out.println("La capacita del distributore è " + capacita + " l");
        System.out.println("Il carburante attuale è " + carburante + " l");
        System.out.println("Il costo del carburante è " + costo + " euro/l");
    }


}
