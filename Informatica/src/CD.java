public class CD {
    //campi
    public int codice;
    public String titolo;
    public String autore;
    public double costo;
    public int ntracce;
    public int traccia;

    //costruttore
    public CD(int codice, String titolo, String autore, double costo, int ntracce, int traccia) {
        this.codice=codice;
        this.titolo=titolo;
        this.autore=autore;
        this.costo=costo;
        this.ntracce=ntracce;
        this.traccia=traccia;
    }

    // getter e setter
    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getNtracce() {
        return ntracce;
    }

    public void setNtracce(int ntracce) {
        this.ntracce = ntracce;
    }

    public int getTraccia() {
        return traccia;
    }

    public void setTraccia(int traccia) {
        this.traccia = traccia;
    }

    // metodo per scegliere una traccia
    public boolean scegliTraccia(int traccia) {
        if (traccia > 0 && traccia <= ntracce) {
            this.traccia = traccia;
            return true;
        } else {
            return false;
        }
}








}