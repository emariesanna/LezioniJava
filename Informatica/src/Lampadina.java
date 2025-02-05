public class Lampadina {
    // Campi
    public boolean accesa; // true - accesa e false - spenta
    public int potenza;

    public Lampadina(boolean accesa, int potenza){
        this.accesa = accesa;
        this.potenza = potenza;
    }

    public static void main(String[] args){
        Lampadina lampadina = new Lampadina(false, 10);
    }
}