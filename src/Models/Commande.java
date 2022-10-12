package Models;

import java.util.Date;

public class Commande {

    private int code;
    private Date date;
    private int numero;

    public Commande(int cod, Date dat, int num) {
        this.code = cod;
        this.date = dat;
        this.numero = num;
    }

    public Commande() {
    }
    

    public int getCode() {
        return code;
    }

    public Date getDate() {
        return date;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
