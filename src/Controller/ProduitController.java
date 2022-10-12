/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Client;
import Models.Produit;
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
public class ProduitController extends Produit {

    ResultSet rst;

    public ProduitController() {
        super();
    }
    //Recuperation des données de la BD

    public ArrayList<Produit> recup(String query) {
        ArrayList<Produit> data = new ArrayList<>();
        try {
            rst = Application.getDB().executeQuery(query);
            Produit p;
            while (rst.next()) {
                p = new Produit(rst.getInt("codeProd"), rst.getString("nomProd"), rst.getString("marqueProd"), rst.getInt("prixProd"), rst.getInt("qteEnStock"));
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
        ArrayList<Produit> data = recup(query);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        mode.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getCodeProd();
            row[1] = data.get(i).getNomProd();
            row[2] = data.get(i).getMarqProd();
            row[3] = data.get(i).getPrixProd();
            row[4] = data.get(i).getQteStock();
            mode.addRow(row);
        }
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new CellObjectRenderer(table));
        }
    }

}
