/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Fournisseur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mine
 */
public class FournisseurController extends Fournisseur {

    ResultSet rst;

    public FournisseurController() {
        super();
    }
    //Recuperation des données de la BD
    public ArrayList<Fournisseur> recup(String query) {
        ArrayList<Fournisseur> data = new ArrayList<>();
        try {
            rst = Application.getDB().executeQuery(query);
             Fournisseur f;
            while (rst.next()) {
                f = new Fournisseur(rst.getInt("codeFour"), rst.getString("nomFour"), rst.getInt("telFour"), rst.getString("emailFour"), rst.getString("adresseFour"));
                data.add(f);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        } finally {
            try {
                rst.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return data;
    }
    
    //Afficher la BD dans la table
    public void AffichageData(String query, JTable table) {
        ArrayList<Fournisseur> data = recup(query);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        mode.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getCodeFour();
            row[1] = data.get(i).getNomFour();
            row[2] = data.get(i).getTelFour();
            row[3] = data.get(i).getEmailFour();
            row[4] = data.get(i).getAdresseFour();
            mode.addRow(row);
        }
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new CellObjectRenderer(table));
        }
    }

}
