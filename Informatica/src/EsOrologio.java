class Orologio{
    private int secondi;
    private int minuti;
    private int ore;

    public Orologio(){
        this.secondi = 0;
        this.minuti = 0;
        this.ore = 0;
    }

    public Orologio(int ore, int minuti, int secondi){
        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;
    }

    public void aggiornaOrologio(){
        this.secondi++;
        if(this.secondi==60){
            this.secondi = 0;
            this.minuti++;
            if(this.minuti==60){
                this.minuti = 0;
                this.ore++;
                if(this.ore==24){
                    this.ore = 0;
                }
            }
        }
    }

    public void stampaOrologio(){
        System.out.println(this.ore + ":" + this.minuti + ":" + this.secondi);
    }

}