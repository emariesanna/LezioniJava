public class Coda {
    Cliente[] clienti_in_coda;
    int numero_clienti; //quanti clienti ci sono in coda

    Coda(){
        this.clienti_in_coda = new Cliente[10];
        this.numero_clienti = 0;
    }

    boolean aggiungi_cliente(Cliente cliente){
        boolean flag;
        if (this.numero_clienti < 10){
            clienti_in_coda[numero_clienti] = cliente;
            numero_clienti++;
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }

    boolean rimuovi_cliente(){
        boolean flag;
        if (this.numero_clienti > 0){
            clienti_in_coda[0] = null;
            numero_clienti--;
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }

    // [][1][2][3][4][]
}
