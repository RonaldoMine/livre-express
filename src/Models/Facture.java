package Models;

import java.util.Date;

public class Facture {

    private int numFact;
    private String detailsAchat;
    private int nbreAchat;
    private int qte;
    private int prixPayer;
    private int codeCom;
    private Date dateFacture;

    public Facture(int numeroF, String detailsA, int nbreA, int qteA, int prixP, int codeC, Date dateF) {
        this.numFact = numeroF;
        this.detailsAchat = detailsA;
        this.nbreAchat = nbreA;
        this.qte = qteA;
        this.prixPayer = prixP;
        this.codeCom = codeC;
        this.dateFacture = dateF;
    }

    public Facture() {
    }
    

    public int getNumeroFact() {
        return numFact;
    }

    public String getDetailsAchat() {
        return detailsAchat;
    }

    public int getNbreAchat() {
        return nbreAchat;
    }

    public int getQte() {
        return qte;
    }

    public int getPrixPayer() {
        return prixPayer;
    }

    public int getCodeCom() {
        return codeCom;
    }

    public Date getDateFact() {
        return dateFacture;
    }

}
