/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Reference;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mine
 */
public class ReferenceController extends Reference {

    ResultSet rst;

    public ReferenceController() {
        super();
    }
    //Recuperation des données de la BD

    public ArrayList<Reference> recup(String query) {
        ArrayList<Reference> data = new ArrayList<>();
        try {
            rst = Application.getDB().executeQuery(query);
            Reference p;
            while (rst.next()) {
                p = new Reference(rst.getInt("codeCom"), rst.getInt("codeProd"), rst.getInt("qteCom"));
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
        ArrayList<Reference> data = recup(query);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        mode.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getCodeCom();
            row[1] = data.get(i).getCodeProd();
            row[2] = data.get(i).getQteCom();
            mode.addRow(row);

        }
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new CellObjectRenderer(table));
        }
    }

    public void rempliSelect(JComboBox liste, String table, String champ, String champ2) {
        String requete = "SELECT * FROM " + table;
        try {
            rst = Application.getDB().executeQuery(requete);
            while (rst.next()) {
                liste.addItem(rst.getString(champ) + " " + rst.getString(champ2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void rempliSelect2(JComboBox liste, String table, String champ) {
        String requete = "SELECT * FROM " + table;
        try {
            rst = Application.getDB().executeQuery(requete);
            while (rst.next()) {
                liste.addItem(rst.getString(champ));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
