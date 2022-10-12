package Views;

import App.Application;
import Controller.FactureController;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public final class GesCom_Facture extends javax.swing.JPanel {

    FactureController fc = new FactureController();
    String tableDB = "facture";
    String requeteFactAll = "Select * from " + tableDB;

    public GesCom_Facture() {
        initComponents();
        fc.AffichageData(requeteFactAll, table);
        fc.rempliSelect(comboClient);
        entete_pan.setBackground(new Color(0, 0, 0, 200));
        Formulaire.setBackground(new Color(0, 0, 0, 200));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        entete_pan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Formulaire = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        butActu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        numeroText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateText = new com.toedter.calendar.JDateChooser();
        butFacturer = new javax.swing.JButton();
        butSupp = new javax.swing.JButton();
        butEnregistre = new javax.swing.JButton();
        butVisual = new javax.swing.JButton();
        radioNum = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        radioDetails = new javax.swing.JRadioButton();
        radioCodeC = new javax.swing.JRadioButton();
        butRecherche = new javax.swing.JButton();
        textRechercher = new javax.swing.JTextField();
        radioNbr = new javax.swing.JRadioButton();
        dateRechercher = new com.toedter.calendar.JDateChooser();
        radioPrix = new javax.swing.JRadioButton();
        radioDate = new javax.swing.JRadioButton();
        radioQte = new javax.swing.JRadioButton();
        butFacture = new javax.swing.JButton();
        comboClient = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 707));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete_pan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des Factures");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Back_50px.png"))); // NOI18N
        back.setToolTipText("Page Livraison");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout entete_panLayout = new javax.swing.GroupLayout(entete_pan);
        entete_pan.setLayout(entete_panLayout);
        entete_panLayout.setHorizontalGroup(
            entete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entete_panLayout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1237, Short.MAX_VALUE))
        );
        entete_panLayout.setVerticalGroup(
            entete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(entete_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 120));

        Formulaire.setBackground(new java.awt.Color(0, 0, 0));
        Formulaire.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Client");
        Formulaire.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 30));

        butActu.setBackground(new java.awt.Color(51, 51, 51));
        butActu.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butActu.setForeground(new java.awt.Color(255, 255, 255));
        butActu.setText("Actualiser");
        butActu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butActu.setFocusPainted(false);
        butActu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butActuMouseClicked(evt);
            }
        });
        Formulaire.add(butActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numero");
        Formulaire.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        numeroText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numeroText.setForeground(new java.awt.Color(51, 51, 51));
        numeroText.setBorder(null);
        numeroText.setCaretColor(new java.awt.Color(51, 51, 51));
        numeroText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numeroTextMouseClicked(evt);
            }
        });
        numeroText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTextKeyTyped(evt);
            }
        });
        Formulaire.add(numeroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 310, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Facture");
        Formulaire.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 30));

        dateText.setDateFormatString("d-MM-yyyy");
        Formulaire.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 310, 30));

        butFacturer.setBackground(new java.awt.Color(51, 51, 51));
        butFacturer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        butFacturer.setForeground(new java.awt.Color(255, 255, 255));
        butFacturer.setText("FACTURER LE CLIENT");
        butFacturer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butFacturer.setFocusPainted(false);
        butFacturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFacturerMouseClicked(evt);
            }
        });
        Formulaire.add(butFacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 430, 60));

        butSupp.setBackground(new java.awt.Color(51, 51, 51));
        butSupp.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butSupp.setForeground(new java.awt.Color(255, 255, 255));
        butSupp.setText("Supprimer");
        butSupp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSupp.setFocusPainted(false);
        butSupp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butSuppMouseClicked(evt);
            }
        });
        Formulaire.add(butSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        butEnregistre.setBackground(new java.awt.Color(51, 51, 51));
        butEnregistre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butEnregistre.setForeground(new java.awt.Color(255, 255, 255));
        butEnregistre.setText("Exporter les Factures d'une journée sous Excel");
        butEnregistre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butEnregistre.setFocusPainted(false);
        butEnregistre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butEnregistreMouseClicked(evt);
            }
        });
        butEnregistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnregistreActionPerformed(evt);
            }
        });
        Formulaire.add(butEnregistre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 420, 40));

        butVisual.setBackground(new java.awt.Color(51, 51, 51));
        butVisual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butVisual.setForeground(new java.awt.Color(255, 255, 255));
        butVisual.setText("Visualiser les Factures d'une journée");
        butVisual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVisual.setFocusPainted(false);
        butVisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butVisualMouseClicked(evt);
            }
        });
        Formulaire.add(butVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 420, 40));

        buttonGroup1.add(radioNum);
        radioNum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioNum.setForeground(new java.awt.Color(51, 51, 51));
        radioNum.setSelected(true);
        radioNum.setText("Numero");
        radioNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioNumFocusGained(evt);
            }
        });
        Formulaire.add(radioNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(634, 732));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(634, 732));

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Details des Achats", "Nombre de Produits achetés", "Quantité Total de Produits", "Prix a payer", "Code Client", "Date Facture"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.setGridColor(new java.awt.Color(204, 204, 255));
        table.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(3);
            table.getColumnModel().getColumn(2).setPreferredWidth(5);
            table.getColumnModel().getColumn(5).setPreferredWidth(5);
            table.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        Formulaire.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 820, 344));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rechercher par :");
        Formulaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        buttonGroup1.add(radioDetails);
        radioDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioDetails.setForeground(new java.awt.Color(51, 51, 51));
        radioDetails.setText("Details");
        radioDetails.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioDetailsFocusGained(evt);
            }
        });
        Formulaire.add(radioDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        buttonGroup1.add(radioCodeC);
        radioCodeC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCodeC.setForeground(new java.awt.Color(51, 51, 51));
        radioCodeC.setText("Code Commande");
        radioCodeC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioCodeCFocusGained(evt);
            }
        });
        Formulaire.add(radioCodeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, -1));

        butRecherche.setBackground(new java.awt.Color(51, 51, 51));
        butRecherche.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butRecherche.setForeground(new java.awt.Color(255, 255, 255));
        butRecherche.setText("Rechercher");
        butRecherche.setFocusPainted(false);
        butRecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butRechercheMouseClicked(evt);
            }
        });
        Formulaire.add(butRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, -1));

        textRechercher.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Formulaire.add(textRechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 334, 30));

        buttonGroup1.add(radioNbr);
        radioNbr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioNbr.setForeground(new java.awt.Color(51, 51, 51));
        radioNbr.setText("Nombre");
        radioNbr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioNbrFocusGained(evt);
            }
        });
        Formulaire.add(radioNbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));
        Formulaire.add(dateRechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, 300, 32));

        buttonGroup1.add(radioPrix);
        radioPrix.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioPrix.setForeground(new java.awt.Color(51, 51, 51));
        radioPrix.setText("Prix");
        Formulaire.add(radioPrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        buttonGroup1.add(radioDate);
        radioDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioDate.setForeground(new java.awt.Color(51, 51, 51));
        radioDate.setText("Date Facture");
        radioDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioDateFocusGained(evt);
            }
        });
        Formulaire.add(radioDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        buttonGroup1.add(radioQte);
        radioQte.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioQte.setText("Quantite");
        Formulaire.add(radioQte, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        butFacture.setBackground(new java.awt.Color(51, 51, 51));
        butFacture.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butFacture.setForeground(new java.awt.Color(255, 255, 255));
        butFacture.setText("Facture du client");
        butFacture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFactureMouseClicked(evt);
            }
        });
        Formulaire.add(butFacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        comboClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selectionner le client" }));
        Formulaire.add(comboClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 310, 30));

        jPanel1.add(Formulaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        GesCom_Menu.liv.setSize(1280, 707);
        GesCom_Menu.liv.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.liv);
    }//GEN-LAST:event_backMouseClicked

    private void butRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butRechercheMouseClicked
        String requeteFactRecher;
        String num = "numFact";
        String details = "detailAchat";
        String nbr = "nbreAchat";
        String qte = "qteProdTotal";
        String prix = "prixPayer";
        String codC = "codeCom";
        String date = "dateFacture";
        if (getRechercherText().length() > 0 || dateRechercher.getDate() != null) {
            if (radioNum.isSelected() == true && textRechercher.isEnabled()) {
                requeteFactRecher = "Select * from " + tableDB + " where " + num + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFactRecher, table);
            }
            if (radioDetails.isSelected() == true && textRechercher.isEnabled()) {
                requeteFactRecher = "Select * from " + tableDB + " where " + details + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFactRecher, table);
            }
            if (radioNbr.isSelected() == true && textRechercher.isEnabled()) {
                requeteFactRecher = "Select * from " + tableDB + " where " + nbr + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFactRecher, table);
            }
            if (radioQte.isSelected() == true && textRechercher.isEnabled()) {
                requeteFactRecher = "Select * from " + tableDB + " where " + qte + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFactRecher, table);
            }
            if (radioPrix.isSelected() == true && textRechercher.isEnabled()) {
                requeteFactRecher = "Select * from " + tableDB + " where " + prix + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFactRecher, table);
            }
            if (radioCodeC.isSelected() == true && textRechercher.isEnabled()) {
                requeteFactRecher = "Select * from " + tableDB + " where " + codC + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFactRecher, table);
            }
            if (radioDate.isSelected() == true && dateRechercher.isEnabled()) {
                SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
                String dateF = spf.format(dateRechercher.getDate());
                requeteFactRecher = "Select * from " + tableDB + " where " + date + "='" + dateF + "'";
                fc.AffichageData(requeteFactRecher, table);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saisir les informations a rechercher", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butRechercheMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Reinitialiser();
        int i = table.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        numeroText.setText(mode.getValueAt(i, 0).toString());
        comboClient.setSelectedIndex((int) mode.getValueAt(i, 5));
        dateText.setDate((Date) mode.getValueAt(i, 6));
    }//GEN-LAST:event_tableMouseClicked

    private void radioNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioNumFocusGained
        textRechercher.setEnabled(true);
        dateRechercher.setEnabled(false);
    }//GEN-LAST:event_radioNumFocusGained

    private void radioDetailsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioDetailsFocusGained
        textRechercher.setEnabled(true);
        dateRechercher.setEnabled(false);
    }//GEN-LAST:event_radioDetailsFocusGained

    private void radioNbrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioNbrFocusGained
        textRechercher.setEnabled(true);
        dateRechercher.setEnabled(false);
    }//GEN-LAST:event_radioNbrFocusGained

    private void radioCodeCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioCodeCFocusGained
        textRechercher.setEnabled(true);
        dateRechercher.setEnabled(false);
    }//GEN-LAST:event_radioCodeCFocusGained

    private void radioDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioDateFocusGained
        dateRechercher.setEnabled(true);
        textRechercher.setEnabled(false);
    }//GEN-LAST:event_radioDateFocusGained

    private void butFacturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFacturerMouseClicked
        if (!getNumeroText().equals("")) {
            numeroText.setBackground(Color.green);
        } else if (getNumeroText().equals("")) {
            numeroText.setBackground(Color.red);
        }
        if (comboClient.getSelectedIndex() != 0) {
            comboClient.setBackground(Color.green);
        } else if (comboClient.getSelectedIndex() == 0) {
            comboClient.setBackground(Color.red);
        }
        if (getDateText() != null) {
            dateText.setBackground(Color.green);
        } else if (getDateText() == null) {
            dateText.setBackground(Color.red);
        }
        if (!getNumeroText().equals("") && comboClient.getSelectedIndex() != 0 && getDateText() != null) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous facturer ce client?", "Facture", choix, JOptionPane.WARNING_MESSAGE);
            if (result == 0) {
                int compteurCom = 0;
                int compteurProd = 0;
                int qteProduiAch = 0;
                String nomProduitAchete = "";
                String nomCli = "";
                String querySelectCom = "SELECT codeCom from commande where codeCli = " + comboClient.getSelectedIndex();
                String querySelectCli = "SELECT NomCli from client where CodeCli = " + comboClient.getSelectedIndex();
                ResultSet rst1 = null;
                ResultSet rst2 = null;
                ResultSet rst3 = null;
                double prixCount = 0;
                double prixTotal = 0;
                try {
                    rst3 = Application.getDB().executeQuery(querySelectCli);
                    while (rst3.next()) {
                        String nomClient = rst3.getString("NomCli");
                        nomCli = nomClient;
                        ResultSet rst = Application.getDB().executeQuery(querySelectCom);
                        while (rst.next()) {
                            compteurCom++;
                            int codeCo = rst.getInt("codeCom");
                            String querySelectCodeProdQte = "SELECT codeProd , qteCom from referer where codeCom = " + codeCo;
                            rst1 = Application.getDB().executeQuery(querySelectCodeProdQte);
                            System.out.println("Requete 1 : codeCom " + codeCo);
                            while (rst1.next()) {
                                compteurProd++;
                                int codeProd = rst1.getInt("codeProd");
                                int qteCom = rst1.getInt("qteCom");
                                qteProduiAch += qteCom;
                                System.out.println("Requete 2 :codeProd " + codeProd + "\tqteCom " + qteCom + "\tqte total de poduit achetés " + qteProduiAch + "\n");
                                String querySelectPrix = "SELECT prixProd , nomProd , marqueProd from produit where codeProd = " + codeProd;
                                rst2 = Application.getDB().executeQuery(querySelectPrix);
                                while (rst2.next()) {
                                    int prix = rst2.getInt("prixProd");
                                    String nom = rst2.getString("nomProd");
                                    String marq = rst2.getString("marqueProd");
                                    prixCount = (double) prix * qteCom;
                                    nomProduitAchete += " (" + qteCom + ") " + nom + " (" + marq + ") , ";
                                    System.out.println("Requete d :prix conteur " + prixCount);
                                    prixTotal += prixCount;
                                }
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Facture du client N° " + comboClient.getSelectedIndex()
                            + "\n Nom du client                         : " + nomCli
                            + "\nCommandes passées          :  " + compteurCom
                            + "\nNoms des Produits Achetés  :  " + nomProduitAchete
                            + "\nNombre de produits achetés :  " + compteurProd
                            + "\nQuantité total de produits :  " + qteProduiAch
                            + "\nPrix à Payer                               :  " + prixTotal + " FCFA", "Facture N°" + getNumeroText(), JOptionPane.INFORMATION_MESSAGE);
                    SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = spf.format(getDateText());
                    String queryInsert = "INSERT INTO  " + tableDB + "  VALUES ('" + getNumeroText() + "','" + nomProduitAchete + "',  '" + compteurProd + "',  '" + qteProduiAch + "',  '" + prixTotal + "',  '" + comboClient.getSelectedIndex() + "',  '" + date + "'   )";
                    Application.getDB().executeUpdate(queryInsert);
                    fc.AffichageData(requeteFactAll, table);
                    Reinitialiser();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {
                    try {
                        rst1.close();
                        rst2.close();
                        rst3.close();
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else {
                numeroText.setBackground(Color.WHITE);
                dateText.setBackground(Color.WHITE);
                comboClient.setBackground(Color.WHITE);
            }

        }

    }//GEN-LAST:event_butFacturerMouseClicked

    private void butActuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butActuMouseClicked
        fc.AffichageData(requeteFactAll, table);
        fc.rempliSelect(comboClient);
    }//GEN-LAST:event_butActuMouseClicked

    private void butSuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSuppMouseClicked
        if (!getNumeroText().equals("")) {
            numeroText.setBackground(Color.green);
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la suppression?", "Annulation", choix, JOptionPane.WARNING_MESSAGE);
            String query2 = "DELETE FROM  " + tableDB + "  WHERE numFact = " + getNumeroText();
            if (result == 0) {
                Application.getDB().executeUpdate(query2);
                fc.AffichageData(requeteFactAll, table);
                Reinitialiser();
            }
        } else if (getNumeroText().equals("")) {
            numeroText.setBackground(Color.red);
        }

    }//GEN-LAST:event_butSuppMouseClicked

    private void butVisualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butVisualMouseClicked
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Ouvrir un fichier");
            chooser.showOpenDialog(this);
            File file = chooser.getSelectedFile();
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_butVisualMouseClicked

    private void numeroTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTextKeyTyped
        int limit = 3;
        if (getNumeroText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP seulement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_numeroTextKeyTyped

    private void numeroTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroTextMouseClicked
        numeroText.setBackground(Color.WHITE);
    }//GEN-LAST:event_numeroTextMouseClicked

    private void butFactureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFactureMouseClicked
        if (comboClient.getSelectedIndex() !=0) {
            comboClient.setBackground(Color.green);
            int compteurCom = 0;
            int compteurProd = 0;
            int qteProduiAch = 0;
            String nomProduitAchete = "";
            String nomCli = "";
            String querySelectCom = "SELECT codeCom from commande where codeCli = " + comboClient.getSelectedIndex();
            String querySelectCli = "SELECT NomCli from client where CodeCli = " + comboClient.getSelectedIndex();
            ResultSet rst1 = null;
            ResultSet rst2 = null;
            ResultSet rst3 = null;
            double prixCount = 0;
            double prixTotal = 0;
            try {
                rst3 = Application.getDB().executeQuery(querySelectCli);
                while (rst3.next()) {
                    String nomClient = rst3.getString("NomCli");
                    nomCli = nomClient;
                    ResultSet rst = Application.getDB().executeQuery(querySelectCom);
                    while (rst.next()) {
                        compteurCom++;
                        int codeCo = rst.getInt("codeCom");
                        String querySelectCodeProdQte = "SELECT codeProd , qteCom from referer where codeCom = " + codeCo;
                        rst1 = Application.getDB().executeQuery(querySelectCodeProdQte);
                        System.out.println("Requete 1 : codeCom " + codeCo);
                        while (rst1.next()) {
                            compteurProd++;
                            int codeProd = rst1.getInt("codeProd");
                            int qteCom = rst1.getInt("qteCom");
                            qteProduiAch += qteCom;
                            System.out.println("Requete 2 :codeProd " + codeProd + "\tqteCom " + qteCom + "\tqte total de poduit achetés " + qteProduiAch + "\n");
                            String querySelectPrix = "SELECT prixProd , nomProd , marqueProd from produit where codeProd = " + codeProd;
                            rst2 = Application.getDB().executeQuery(querySelectPrix);
                            while (rst2.next()) {
                                int prix = rst2.getInt("prixProd");
                                String nom = rst2.getString("nomProd");
                                String marq = rst2.getString("marqueProd");
                                prixCount = (double) prix * qteCom;
                                nomProduitAchete += " (" + qteCom + ") " + nom + " (" + marq + ") , ";
                                System.out.println("Requete d :prix conteur " + prixCount);
                                prixTotal += prixCount;
                            }
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "\n Nom du client                         : " + nomCli
                        + "\nCommandes passées          :  " + compteurCom
                        + "\nNoms des Produits Achetés  :  " + nomProduitAchete
                        + "\nNombre de produits achetés :  " + compteurProd
                        + "\nQuantité total de produits :  " + qteProduiAch
                        + "\nPrix à Payer                               :  " + prixTotal + " FCFA", "Facture N°" + comboClient.getSelectedIndex(), JOptionPane.INFORMATION_MESSAGE);

                comboClient.setBackground(Color.white);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rst1.close();
                    rst2.close();
                    rst3.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else if (comboClient.getSelectedIndex() ==0) {
            comboClient.setBackground(Color.red);
        }


    }//GEN-LAST:event_butFactureMouseClicked

    private void butEnregistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEnregistreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butEnregistreActionPerformed

    private void butEnregistreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butEnregistreMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Enregistrer sous un format Excel");
        chooser.showSaveDialog(this);
        File f = chooser.getSelectedFile();
        ArrayList<Label> labEntete = new ArrayList<>();
        ArrayList<Label> labContenu = new ArrayList<>();
        int k = 0;
        try {
            WritableWorkbook myexcel = Workbook.createWorkbook(f);
            WritableSheet mySheet = myexcel.createSheet("Feuille des Factures", 0);
            for (int i = 0; i < table.getColumnCount(); i++) {
                labEntete.add(i, new Label(i, 0, table.getColumnName(i)));
            }
            for (int i = 0; i < labEntete.size(); i++) {
                mySheet.addCell(labEntete.get(i));
            }
            for (int j = 0; j < table.getRowCount(); j++) {
                k++;
                for (int i = 0; i < table.getColumnCount(); i++) {
                    labContenu.add(i, new Label(i, k, table.getValueAt(j, i).toString()));
                }
            }
            for (int i = 0; i < labContenu.size(); i++) {
                mySheet.addCell(labContenu.get(i));
            }
            myexcel.write();
            myexcel.close();
            JOptionPane.showMessageDialog(null, "Enregistrement effectué");
        } catch (IOException ex) {
            Logger.getLogger(GesCom_Commande.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(GesCom_Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butEnregistreMouseClicked

    //LES METHODES
    //les getteurs pour le contenu des champs de textes
    public String getNumeroText() {
        return numeroText.getText();
    }

    public Date getDateText() {
        return dateText.getDate();
    }

    public String getRechercherText() {
        return textRechercher.getText();
    }

    //Reinitialisation
    public void Reinitialiser() {
        numeroText.setText("");
        comboClient.setSelectedIndex(0);
        dateText.setDate(null);
        numeroText.setBackground(Color.WHITE);
        dateText.setBackground(Color.WHITE);
        comboClient.setBackground(Color.WHITE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulaire;
    private javax.swing.JLabel back;
    private javax.swing.JButton butActu;
    private javax.swing.JButton butEnregistre;
    private javax.swing.JButton butFacture;
    private javax.swing.JButton butFacturer;
    private javax.swing.JButton butRecherche;
    private javax.swing.JButton butSupp;
    private javax.swing.JButton butVisual;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboClient;
    private com.toedter.calendar.JDateChooser dateRechercher;
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JPanel entete_pan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numeroText;
    private javax.swing.JRadioButton radioCodeC;
    private javax.swing.JRadioButton radioDate;
    private javax.swing.JRadioButton radioDetails;
    private javax.swing.JRadioButton radioNbr;
    private javax.swing.JRadioButton radioNum;
    private javax.swing.JRadioButton radioPrix;
    private javax.swing.JRadioButton radioQte;
    private javax.swing.JTable table;
    private javax.swing.JTextField textRechercher;
    // End of variables declaration//GEN-END:variables
}
