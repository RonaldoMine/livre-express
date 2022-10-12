package Models;

/**
 *
 * @author MINE
 */
public class Produit {

    private int codeProd;
    private String nomProd;
    private String marqProd;
    private int prixProd;
    private int qteStock;

    public Produit(int code, String nom, String marq, int prix, int qte) {
        this.codeProd = code;
        this.nomProd = nom;
        this.marqProd = marq;
        this.prixProd = prix;
        this.qteStock = qte;
    }

    public Produit() {
    }

    public int getCodeProd() {
        return codeProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public String getMarqProd() {
        return marqProd;
    }

    public int getPrixProd() {
        return prixProd;
    }

    public int getQteStock() {
        return qteStock;
    }

}
