/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mine
 */
public class Database {

    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/gescom";
    private String username = "root";
    private String password = "";
    PreparedStatement pst;

    public Database(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver : " + ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(this.url, this.username, this.password);
        } catch (SQLException ex) {
            System.out.println("Connexion : " + ex.getMessage());
        }
    }

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver : " + ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(this.url, this.username, this.password);
        } catch (SQLException ex) {
            System.out.println("Connexion : " + ex.getMessage());
        }
    }

    public ResultSet prepare(String statement, ArrayList params) {
        ResultSet rs = null;
        try {
            pst = con.prepareStatement(statement);
            if (params.size() > 0) {
                for (int i = 0; i < params.size(); i++) {
                    pst.setString(i + 1, params.get(i).toString());
                }
            }
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public ResultSet executeQuery(String statement) {
        ResultSet rs = null;
        try {
            pst = con.prepareStatement(statement);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public int executeUpdate(String statement) {
        ResultSet rs = null;
        int rst = 0;
        try {
            rst = pst.executeUpdate(statement);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rst;
    }
    // aficher toutes les info d'une table

    public ResultSet querySelectAll(String table) {
        ResultSet rs = null;
        String sql = "SELECT * FROM " + table;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    //methode pour afficher toutes les tables sous une contraintes

    public ResultSet querySelectAll(String table, String columnDB, String etat) {
        ResultSet rs = null;
        String sql = "SELECT * FROM " + table + " WHERE " + columnDB + " LIKE '%" + etat + "%'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    //methode pour afficher une partie d'une table 
    public ResultSet querySelect(String[] nomColone, String nomTable) {
        ResultSet rs = null;
        int i;
        String sql = "SELECT ";
        for (i = 0; i <= nomColone.length - 1; i++) {
            sql += nomColone[i];
            if (i < nomColone.length - 1) {
                sql += ",";
            }
        }
        sql += " FROM " + nomTable;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public ResultSet querySelectPaginer(int nbr_ligne, String[] nomColonne, String nomTable) {
        ResultSet rs = null;
        int i;
        String sql = "SELECT ";
        for (i = 0; i <= nomColonne.length - 1; i++) {
            sql += nomColonne[i];
            if (i < nomColonne.length - 1) {
                sql += ",";
            }
        }
        sql += " FROM " + nomTable + " ORDER BY id DESC LIMITE 0, " + nbr_ligne;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    //methode pour afficher une partie d'une table 
    public ResultSet querySelectPart(String[] nomColone, String nomTable, String etat) {
        ResultSet rs = null;
        int j = 0;
        String sql = "SELECT ";
        for (int i = 0; i < nomColone.length; i++) {
            sql += nomColone[i];
            if (j < nomColone.length - 1) {
                sql += " , ";
            }
            j++;
        }
        sql += " FROM " + nomTable + " WHERE " + etat;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

}
