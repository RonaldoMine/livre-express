/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import App.Application;
import Models.Client;
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
public class ClientController extends Client {

    ResultSet rst;

    public ClientController() {
        super();
    }
    //Recuperation des données de la BD

    public ArrayList<Client> recup(String query) {
        ArrayList<Client> data = new ArrayList<>();
        try {
            rst = Application.getDB().executeQuery(query);
            Client c;
            while (rst.next()) {
                c = new Client(rst.getInt("CodeCli"), rst.getString("NomCli"), rst.getInt("TelephoneCli"), rst.getString("EmailCli"), rst.getString("AdresseCli"));
                data.add(c);
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
        ArrayList<Client> data = recup(query);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        mode.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getCode();
            row[1] = data.get(i).getNom();
            row[2] = data.get(i).getNumero();
            row[3] = data.get(i).getEmail();
            row[4] = data.get(i).getAdresse();
            mode.addRow(row);
        }
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new CellObjectRenderer(table));
        }
    }

}
