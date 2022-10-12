/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Mine
 */
public class Users {

    private String noms;
    private String login;
    private String password;
    private String profil;

    public Users() {
    }

    public Users(String noms, String profil, String login, String password) {
        this.noms = noms;
        this.profil = profil;
        this.login = login;
        this.password = password;
    }

    public Users(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
