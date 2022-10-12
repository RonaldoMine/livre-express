package Models;

public class Fournisseur {

    private int codeFour;
    private String nomFour;
    private int telFour;
    private String emailFour;
    private String adresseFour;
    
    public Fournisseur(int codeF , String nomF , int telF , String emailF , String adresseF){
        this.codeFour = codeF;
        this.nomFour = nomF;
        this.telFour = telF;
        this.emailFour = emailF;
        this.adresseFour = adresseF;
    }

    public Fournisseur() {
    }
    
    public int getCodeFour() {
        return codeFour;
    }

    public String getNomFour() {
        return nomFour;
    }

    public int getTelFour() {
        return telFour;
    }

    public String getEmailFour() {
        return emailFour;
    }

    public String getAdresseFour() {
        return adresseFour;
    }
    
    
}
