public class Convertitore {

    int convertiBinarioDecimale(String binario){

        int decimale = 0;

        for (int i = binario.length()-1; i >= 0; i--) {
            char cifra_char = binario.charAt(i); //binario[i]
            int cifra = Character.getNumericValue(cifra_char);
            if(cifra != 0 && cifra != 1){
                return -1; // ritorno specifico per segnalare errore
            } else if(cifra == 1){
                decimale += Math.pow(2, binario.length()-1-i );
            }
        }

        return decimale;
    }

}
