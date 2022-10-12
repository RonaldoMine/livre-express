/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Facture;
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
public class FactureController extends Facture {

    ResultSet rst;

    public FactureController() {
        super();
    }
    //Recuperation des données de la BD

    public ArrayList<Facture> recup(String query) {
        ArrayList<Facture> data = new ArrayList<>();
        try {
            rst = Application.getDB().executeQuery(query);
            Facture f;
            while (rst.next()) {
                f = new Facture(rst.getInt("numFact"), rst.getString("detailAchat"), rst.getInt("nbreAchat"), rst.getInt("qteProdTotal"), rst.getInt("prixPayer"), rst.getInt("codeCli"), rst.getDate("dateFacture"));
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
        ArrayList<Facture> data = recup(query);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        mode.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getNumeroFact();
            row[1] = data.get(i).getDetailsAchat();
            row[2] = data.get(i).getNbreAchat();
            row[3] = data.get(i).getQte();
            row[4] = data.get(i).getPrixPayer();
            row[5] = data.get(i).getCodeCom();
            row[6] = data.get(i).getDateFact();
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
