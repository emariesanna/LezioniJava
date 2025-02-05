/*

____________________________________________________________________|
|
|    NomeClasse
|
--------------------------------------------------------------------|
|
|   + campo_pubblico1: int
|   + campo_pubblico2: String
|   - campo_privato: float
|   - campo_privato2: boolean
|
--------------------------------------------------------------------|
|
|   + NomeClasse(campo_pubblico1: int, campo_pubblico2: String, campo_privato1: float, campo_privato2: boolean)
|   + setCampoPrivato1(campo_privato1: int): void
|   + getCampoPrivato1(): float
|   + setCampoPrivato2(campo_privato2: boolean): void
|   + getCampoPrivato2(): boolean
|   + metodoPubblico1(parametro1: int, parametro2: String): void
|   + metodoPubblico2(): boolean
|   - metodoPrivato1(parametro1: float, parametro2: float): float
|   - metodoPrivato2(): void
|
--------------------------------------------------------------------|

 */



public class NomeClasse {
    // Campi
    public int campo_pubblico1;
    public String campo_pubblico2;
    private float campo_privato1;
    private boolean campo_privato2;

    // Costruttore
    public NomeClasse(int campo_pubblico1, String campo_pubblico2, float campo_privato1, boolean campo_privato2) {
        this.campo_pubblico1 = campo_pubblico1;
        this.campo_pubblico2 = campo_pubblico2;
        this.campo_privato1 = campo_privato1;
        this.campo_privato2 = campo_privato2;
    }

    // setter e getter
    public void setCampoPrivato1(int campo_privato1) {
        this.campo_privato1 = campo_privato1;
    }

    public float getCampoPrivato1() {
        return this.campo_privato1;
    }

    public void setCampoPrivato2(boolean campo_privato2) {
        this.campo_privato2 = campo_privato2;
    }

    public boolean getCampoPrivato2() {
        return this.campo_privato2;
    }

    // Metodi
    public void metodoPubblico1(int parametro1, String parametro2) {
        //codice del metodo
    }

    public boolean metodoPubblico2() {
        //codice del metodo
        boolean risultato = true;
        return risultato;
    }

    private float metodoPrivato1(float parametro1, float parametro2) {
        //codice del metodo
        float risultato = parametro1 + parametro2;
        return risultato;
    }

    private void metodoPrivato2() {
        //codice del metodo
    }


    public static void main(String[] args) {
        // creazione di un oggetto della classe NomeClasse
        NomeClasse oggetto1 = new NomeClasse(1, "ciao", 2.0f, true);
        // chiamata ai metodi pubblici dell'oggetto
        oggetto1.metodoPubblico1(42, "hola");
        oggetto1.metodoPubblico2();
    }
}
