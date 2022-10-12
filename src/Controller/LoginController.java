/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chadj
 */
public class LoginController extends Users {

    public LoginController() {
        super();
    }

    public int checkLogin(Users user, boolean souvenir) {
        String sql = "";
        ResultSet rs = null;
        int retour = 0;
        int isLog = 0;
        sql = "SELECT * FROM utilisateur";
        ArrayList params = new ArrayList();
        params.add(user.getLogin());
        rs = Application.getDB().executeQuery(sql);
        try {
            retour = 2;
            while (rs.next()) {
                if (rs.getString("login").equals(user.getLogin())) {
                    if (rs.getString("password").equals(user.getPassword())) {
                        if (souvenir) {
                            isLog = rs.getInt("id");
                        }
                        Application.getDU().writeData(isLog, rs.getString("nom"), rs.getString("profil"));
                        retour = 1;
                    } else {
                        retour = 3;
                    }
                }
            }
        } catch (SQLException e) {
            retour = 4;
        }
        return retour;
    }

}
