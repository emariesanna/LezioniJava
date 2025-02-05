/*
    Creare una classe per gestire oggetti di tipo auto.
    Un auto è caratterizzata dalla targa, dal modello, dalla capacità del serbatoio,
    dal quantitativo di carburante presente nel serbatoio e dal consumo di carburante
    per ogni km.

    Oltre al costruttore prevedere i metodi che consentano di:
    - versare un tot di carburante nel serbatoio
    - effettuare un viaggio specificando la sua lunghezza in km. Il viaggio è possibile
    solo se c'è carburante a sufficienza
    - stampa dati dell'auto

    L'applicazione prevede anche oggetti di tipo distributore che sono caratterizzati
    dalla città, dal proprietario, dalla capacità della cisterna, dal livello del
    carburante in essa presente e dal suo costo al litro.
    Prevedere, oltre al costruttore i metodi che consentano di:
    - effettuare un rifornimento ad una certa auto specificando l'importo che
        si intende rifornire. Nel caso la cisterna non contenga carburante a sufficienza
        il rifornimento non può avvenire
    - riempi cisterna: consente di riempire completamente la cisterna quando serve
    - stampa: stampa i dati della cistera

    Nel main creare uin distributore a Bergamo, Sandro, capacità 10000, con 5000 litri
    presenti e prezzo 2€/litro
     e un'auto targa;NF708KJ, "audi A6", cap. serbatoio:80 litri, consumo 11Litri/Km e,
     attraverso un menù prevedere le seguenti voci:
    1 - effettua rifornimento
    2 - effettua viaggio
    3 - riempi cisterna
    4 - stampa dati auto
    5 - fine
*/

/*
    1. Definire le classi
    2. Definire i campi
    3. Definire il costruttore
    4. Definire i metodi
        a. se hanno logica di successo o fallimento, restituire feedback per utente con println
         e feedback per il programma con ritorno booleano
    5. Scrivere una classe main per testare i metodi
        a. Creazione di un oggetto appartenente alla classe
        b. Acquisizione di eventuali valori in input da tastiera
        c. Chiamata ai metodi dell'oggetto creato
    6. Completare il main sostituendo le chiamate ai metodi con un menu a scelta multipla
 */

class Auto {
    String targa;
    String modello;
    double capacita;        // litri
    double carburante;      // litri
    double consumo;         // litri/km

    Auto(String targa, String modello, double capacita, double carburante, double consumo){
        this.targa = targa;
        this.modello = modello;
        this.capacita = capacita;
        this.carburante = carburante;
        this.consumo = consumo;
    }

    boolean rifornimento(double aggiunta){
        if(aggiunta <= capacita - carburante){
            carburante += aggiunta;
            System.out.println("Rifornimento effettuato, nuovo livello di carburante: " + carburante + " litri.\n");
            return true;
        } else{
            System.out.println("Rifornimento non effettuato, capacità disponibile " + (capacita - carburante) + " litri.\n");
            return false;
        }
    }

    boolean viaggio(double lunghezza){
        double carburante_necessario = lunghezza*consumo;
        if(carburante_necessario <= carburante){
            carburante -= carburante_necessario;
            System.out.println("Viaggio effettuato, nuovo livello di carburante: " + carburante + " litri.\n");
            return true;
        } else {
            System.out.println("Viaggio non effettuato, carburante necessario: " + carburante_necessario + " litri.\n");
            return false;
        }
    }

    void stampa(){
        System.out.println("La targa dell'auto è " + targa);
        System.out.println("Il modello dell'auto è " + modello);
        System.out.println("La capacita del serbatoio è " + capacita + " l");
        System.out.println("Il carburante attuale è " + carburante + " l");
        System.out.println("Il consumo dell'auto è " + consumo + " l/km");
    }

}
