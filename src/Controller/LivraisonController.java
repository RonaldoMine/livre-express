/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Fournisseur;
import Models.Livraison;
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
public class LivraisonController extends Livraison {

    ResultSet rst;

    public LivraisonController() {
        super();
    }
    //Recuperation des données de la BD
    public ArrayList<Livraison> recup(String query) {
        ArrayList<Livraison> data = new ArrayList<>();
        try {
            rst = Application.getDB().executeQuery(query);
            Livraison p;
            while (rst.next()) {
                p = new Livraison(rst.getInt("codeFour"), rst.getInt("codeProd"), rst.getDate("dateLivraison"), rst.getInt("qteLiv"));
                data.add(p);
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
        ArrayList<Livraison> data = recup(query);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        mode.setRowCount(0);
        Object[] row = new Object[4];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getCodeFour();
            row[1] = data.get(i).getCodeProd();
            row[2] = data.get(i).getDateLiv();;
            row[3] = data.get(i).getQteLiv();
            mode.addRow(row);
        }
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new CellObjectRenderer(table));
        }
    }

}
