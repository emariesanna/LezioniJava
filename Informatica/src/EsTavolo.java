class Gamba {
    private String materiale;
    private float diametro;
    private float altezza;

    public Gamba(String materiale, float diametro, float altezza) {
        this.materiale = materiale;
        this.diametro = diametro;
        this.altezza = altezza;
    }

    public String getMateriale() {
        return materiale;
    }

    public float getDiametro() {
        return diametro;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public void stampaGamba() {
        System.out.println("Materiale: " + materiale + ", Diametro: " + diametro + ", Altezza: " + altezza);
    }
}

class Piano {
    private String materiale;
    private float diametro;
    private float spessore;

    public Piano(String materiale, float diametro, float spessore) {
        this.materiale = materiale;
        this.diametro = diametro;
        this.spessore = spessore;
    }

    public String getMateriale() {
        return materiale;
    }

    public float getDiametro() {
        return diametro;
    }

    public float getSpessore() {
        return spessore;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void setSpessore(float spessore) {
        this.spessore = spessore;
    }

    public void stampaPiano() {
        System.out.println("Materiale: " + materiale + ", Diametro: " + diametro + ", Spessore: " + spessore);
    }
}

class Tavolo {
    private Gamba gamba;
    private Piano piano;
    private int n_gambe;

    public Tavolo(Gamba gamba, Piano piano, int n_gambe) {
        this.gamba = gamba;
        this.piano = piano;
        this.n_gambe = n_gambe;
    }

    public Gamba getGamba() {
        return gamba;
    }

    public Piano getPiano() {
        return piano;
    }

    public int getN_gambe() {
        return n_gambe;
    }

    public void setGamba(Gamba gamba) {
        this.gamba = gamba;
    }

    public void setPiano(Piano piano) {
        this.piano = piano;
    }

    public void setN_gambe(int n_gambe) {
        this.n_gambe = n_gambe;
    }

    public void stampaTavolo() {
        System.out.println("Gamba: ");
        gamba.stampaGamba();
        System.out.println("Piano: ");
        piano.stampaPiano();
        System.out.println("Numero di gambe: " + n_gambe);
    }
}