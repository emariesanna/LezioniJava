public class Pilota extends Thread {
    private int id;
    private String nome;
    private String cognome;
    private int velocitaMassima;

    public Pilota(int id, String nome, String cognome, int velocitaMassima) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.velocitaMassima = velocitaMassima;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 17; i++) {
            System.out.println(id + "/" + nome + "/" + velocitaMassima);
        }
    }

    public int getVelocitaMassima() {
        return velocitaMassima;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Pilota p1 = new Pilota(1, "Mario", "Rossi", 320);
        Pilota p2 = new Pilota(2, "Luigi", "Bianchi", 350);

        p1.start();
        p2.start();

        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Pilota pilotaVeloce = (p1.getVelocitaMassima() > p2.getVelocitaMassima()) ? p1 : p2;
        System.out.println("Pilota con velocità massima più alta: " + pilotaVeloce.getNome());
    }
}
