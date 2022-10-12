/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Commande;
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
public class CommandeController extends Commande {

    ResultSet rst;

    public CommandeController() {
        super();
    }

    public ArrayList<Commande> recup(String query) {
        ArrayList<Commande> data = new ArrayList<>();
        try {
            rst = Application.getDB().executeQuery(query);
            Commande p;
            while (rst.next()) {
                p = new Commande(rst.getInt("codeCom"), rst.getDate("dateCom"), rst.getInt("codeCli"));
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
        ArrayList<Commande> data = recup(query);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        mode.setRowCount(0);
        Object[] row = new Object[3];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getCode();
            row[1] = data.get(i).getDate();
            row[2] = data.get(i).getNumero();
            mode.addRow(row);
        }
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new CellObjectRenderer(table));
        }
    }

    public void rempliSelect(JComboBox liste) {
        String requete = "SELECT * FROM client ORDER BY CodeCli ASC";
        try {
            rst = Application.getDB().executeQuery(requete);
            while (rst.next()) {
                liste.addItem(rst.getString("NomCli"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
