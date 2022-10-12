package Models;

import java.util.Date;

public class Livraison {

    private int codeFour;
    private int codeProd;
    private Date dateLiv;
    private int qteLiv;

    public Livraison(int codeF, int codeP, Date dateL, int qteL) {
        this.codeFour = codeF;
        this.codeProd = codeP;
        this.dateLiv = dateL;
        this.qteLiv = qteL;
    }

    public Livraison() {
    }
    
    public int getQteLiv() {
        return qteLiv;
    }

    public int getCodeFour() {
        return codeFour;
    }

    public int getCodeProd() {
        return codeProd;
    }

    public Date getDateLiv() {
        return dateLiv;
    }

}
