package Models;

import App.Application;
import java.sql.ResultSet;

public class Client {

    private int code;
    private String nom;
    private int numero;
    private String email;
    private String adresse;

    public Client(int cod, String name, int num, String mail, String adres) {
        this.code = cod;
        this.nom = name;
        this.numero = num;
        this.email = mail;
        this.adresse = adres;
    }

    public Client() {
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public static ResultSet search(String codeCli, String nomCli, String telephoneCli, String emailCLi, String adressseCli) {
        String textType = "", textIdCost = "", textDebut = "", textFin = "";
        String where = " WHERE 1=1";
        //System.out.println("Erreur");
        if (!nomCli.isEmpty()) {
            textType = " AND type = " + nomCli;
        }
        if (!telephoneCli.isEmpty()) {
            textIdCost = " AND libelle = " + telephoneCli + "";
        }
        if (!emailCLi.isEmpty()) {
            textDebut = " AND created_at >= " + emailCLi;
        }
        if (!adressseCli.isEmpty()) {
            textFin = " AND idCost <= " + adressseCli;
        }
        String selectAll = "SELECT * FROM client" + where + textType + textIdCost + textDebut + textFin;
        return Application.getDB().executeQuery(selectAll);
    }
}
