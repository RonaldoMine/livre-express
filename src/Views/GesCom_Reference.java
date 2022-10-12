package Views;

import App.Application;
import Controller.CellObjectRenderer;
import Controller.ReferenceController;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public final class GesCom_Reference extends javax.swing.JPanel {

    ReferenceController rc = new ReferenceController();
    String tableDB = "referer";
    String requeteReferenceAll = "Select * from " + tableDB;

    public GesCom_Reference() {
        initComponents();
        rc.AffichageData(requeteReferenceAll, table);
        rc.rempliSelect(comboProduit, "produit", "nomProd", "marqueProd");
        rc.rempliSelect2(comboCommande, "commande", "codeCom");        
        new CellObjectRenderer(table);
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
        next = new javax.swing.JLabel();
        Formulaire = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qteText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        butAjout = new javax.swing.JButton();
        butModif = new javax.swing.JButton();
        butSupp = new javax.swing.JButton();
        butAffich = new javax.swing.JButton();
        butEnregistre = new javax.swing.JButton();
        butVisual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        radioCom = new javax.swing.JRadioButton();
        radioProd = new javax.swing.JRadioButton();
        radioQte = new javax.swing.JRadioButton();
        textRecherche = new javax.swing.JTextField();
        comboProduit = new javax.swing.JComboBox<>();
        comboCommande = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 707));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete_pan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des References");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Back_50px.png"))); // NOI18N
        back.setToolTipText("Page Produit");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Forward_50px_1.png"))); // NOI18N
        next.setToolTipText("Page Fournisseur");
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout entete_panLayout = new javax.swing.GroupLayout(entete_pan);
        entete_pan.setLayout(entete_panLayout);
        entete_panLayout.setHorizontalGroup(
            entete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entete_panLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        entete_panLayout.setVerticalGroup(
            entete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(entete_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 120));

        Formulaire.setBackground(new java.awt.Color(0, 0, 0));
        Formulaire.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Code Commande");
        Formulaire.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 23));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Produit");
        Formulaire.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 121, 23));

        qteText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qteText.setForeground(new java.awt.Color(51, 51, 51));
        qteText.setBorder(null);
        qteText.setCaretColor(new java.awt.Color(51, 51, 51));
        qteText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qteTextMouseClicked(evt);
            }
        });
        qteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qteTextKeyTyped(evt);
            }
        });
        Formulaire.add(qteText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 280, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantité");
        Formulaire.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 121, 23));

        butAjout.setBackground(new java.awt.Color(51, 51, 51));
        butAjout.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butAjout.setForeground(new java.awt.Color(255, 255, 255));
        butAjout.setText("Ajouter");
        butAjout.setFocusPainted(false);
        butAjout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butAjoutMouseClicked(evt);
            }
        });
        Formulaire.add(butAjout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        butModif.setBackground(new java.awt.Color(51, 51, 51));
        butModif.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butModif.setForeground(new java.awt.Color(255, 255, 255));
        butModif.setText("Modifier");
        butModif.setFocusPainted(false);
        butModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butModifMouseClicked(evt);
            }
        });
        Formulaire.add(butModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        butSupp.setBackground(new java.awt.Color(51, 51, 51));
        butSupp.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butSupp.setForeground(new java.awt.Color(255, 255, 255));
        butSupp.setText("Annuler");
        butSupp.setFocusPainted(false);
        butSupp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butSuppMouseClicked(evt);
            }
        });
        Formulaire.add(butSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        butAffich.setBackground(new java.awt.Color(51, 51, 51));
        butAffich.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butAffich.setForeground(new java.awt.Color(255, 255, 255));
        butAffich.setText("Actualiser");
        butAffich.setFocusPainted(false);
        butAffich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butAffichMouseClicked(evt);
            }
        });
        Formulaire.add(butAffich, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        butEnregistre.setBackground(new java.awt.Color(51, 51, 51));
        butEnregistre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butEnregistre.setForeground(new java.awt.Color(255, 255, 255));
        butEnregistre.setText("Exporter les References de chaque commande de la journée");
        butEnregistre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butEnregistre.setFocusPainted(false);
        butEnregistre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butEnregistreMouseClicked(evt);
            }
        });
        Formulaire.add(butEnregistre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 490, 40));

        butVisual.setBackground(new java.awt.Color(51, 51, 51));
        butVisual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butVisual.setForeground(new java.awt.Color(255, 255, 255));
        butVisual.setText("Visualiser les References de chaque commandes  d'une journée");
        butVisual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVisual.setFocusPainted(false);
        butVisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butVisualMouseClicked(evt);
            }
        });
        Formulaire.add(butVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 40));

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
                "Code Commande", "Code Produit", "Quantité"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        Formulaire.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 660, 300));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rechercher par :");
        Formulaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        buttonGroup1.add(radioCom);
        radioCom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCom.setForeground(new java.awt.Color(51, 51, 51));
        radioCom.setSelected(true);
        radioCom.setText("Code Commande");
        Formulaire.add(radioCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        buttonGroup1.add(radioProd);
        radioProd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioProd.setForeground(new java.awt.Color(51, 51, 51));
        radioProd.setText("Code Produit");
        Formulaire.add(radioProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, -1));

        buttonGroup1.add(radioQte);
        radioQte.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioQte.setForeground(new java.awt.Color(51, 51, 51));
        radioQte.setText("Quantité");
        Formulaire.add(radioQte, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        textRecherche.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textRecherche.setText("Rechercher par categorie");
        textRecherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textRechercheFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textRechercheFocusLost(evt);
            }
        });
        textRecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRechercheMouseClicked(evt);
            }
        });
        textRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRechercheKeyTyped(evt);
            }
        });
        Formulaire.add(textRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 70, 660, 27));

        comboProduit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selectionner un produit" }));
        comboProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboProduitMouseClicked(evt);
            }
        });
        Formulaire.add(comboProduit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 68, 280, 30));

        comboCommande.setMaximumRowCount(10);
        comboCommande.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selectionner le code de la commande" }));
        comboCommande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboCommandeMouseClicked(evt);
            }
        });
        Formulaire.add(comboCommande, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 280, 30));

        jPanel1.add(Formulaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 590));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

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
        GesCom_Menu.prod.setSize(1280, 707);
        GesCom_Menu.prod.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.prod);
    }//GEN-LAST:event_backMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        GesCom_Menu.four.setSize(1280, 707);
        GesCom_Menu.four.setVisible(true);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.four);
    }//GEN-LAST:event_nextMouseClicked

    private void butAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAjoutMouseClicked
        if (comboCommande.getSelectedIndex() != 0) {
            comboCommande.setBackground(Color.green);
        } else if (comboCommande.getSelectedIndex() == 0) {
            comboCommande.setBackground(Color.red);
        }
        if (comboProduit.getSelectedIndex() != 0) {
            comboProduit.setBackground(Color.green);
        } else if (comboProduit.getSelectedIndex() == 0) {
            comboProduit.setBackground(Color.red);
        }
        if (!getQteText().equals("")) {
            qteText.setBackground(Color.green);
        } else if (getQteText().equals("")) {
            qteText.setBackground(Color.red);
        }
        if (comboCommande.getSelectedIndex() != 0 && comboProduit.getSelectedIndex() != 0 && !qteText.getText().equals("")) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous Ajouter cet element?", "Ajout", choix, JOptionPane.WARNING_MESSAGE);
            String queryInsert = "INSERT INTO  " + tableDB + "  VALUES ('" + comboCommande.getSelectedItem() + "','" + comboProduit.getSelectedIndex() + "',  '" + getQteText() + "')";
            if (result == 0) {
                try {
                    String querySelect = "SELECT qteEnStock from produit where codeProd = " + comboProduit.getSelectedIndex();
                    ResultSet rst = Application.getDB().executeQuery(querySelect);
                    while (rst.next()) {
                        int qteEnStock = rst.getInt("qteEnStock");
                        String getQteCom = qteText.getText();
                        int qteC = Integer.parseInt(getQteCom);
                        if (qteEnStock >= qteC) {
                            qteEnStock -= qteC;
                            System.out.println(qteEnStock);
                            String queryUp = "UPDATE produit SET qteEnStock = '" + qteEnStock + "' where codeProd ='" + comboProduit.getSelectedIndex() + "'";
                            Application.getDB().executeUpdate(queryUp);
                            Application.getDB().executeUpdate(queryInsert);
                            rc.AffichageData(requeteReferenceAll, table);
                            Reinitialiser();
                        } else if (qteEnStock == 0) {
                            JOptionPane.showMessageDialog(null, "Le stock du produit est finit ", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La quantite en stock est inferieure a celle commandée", "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException | NumberFormatException e) {
                }
            } else {
                comboCommande.setBackground(Color.WHITE);
                comboProduit.setBackground(Color.WHITE);
                qteText.setBackground(Color.WHITE);
            }
        }


    }//GEN-LAST:event_butAjoutMouseClicked

    private void butModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butModifMouseClicked
        if (comboCommande.getSelectedIndex() != 0) {
            comboCommande.setBackground(Color.green);
        } else if (comboCommande.getSelectedIndex() == 0) {
            comboCommande.setBackground(Color.red);
        }
        if (comboProduit.getSelectedIndex() != 0) {
            comboProduit.setBackground(Color.green);
        } else if (comboProduit.getSelectedIndex() == 0) {
            comboProduit.setBackground(Color.red);
        }
        if (!getQteText().equals("")) {
            qteText.setBackground(Color.green);
        } else if (getQteText().equals("")) {
            qteText.setBackground(Color.red);
        }
        if (comboCommande.getSelectedIndex() != 0 && comboProduit.getSelectedIndex() != 0 && !getQteText().equals("")) {
            int i = table.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String qteAVM = model.getValueAt(i, 2).toString();
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la modification?", "Modification", choix, JOptionPane.WARNING_MESSAGE);
            String queryUpdate = "UPDATE  " + tableDB + " SET  codeCom='" + comboCommande.getSelectedItem() + "',codeProd='" + comboProduit.getSelectedIndex() + "',  qteCom='" + getQteText() + "' WHERE  codeCom =" + comboCommande.getSelectedItem();
            if (result == 0) {
                try {
                    int qteModif;
                    String querySelect = "SELECT qteEnStock from produit where codeProd = " + comboProduit.getSelectedIndex();
                    ResultSet rst = Application.getDB().executeQuery(querySelect);
                    while (rst.next()) {
                        int qteEnStock = rst.getInt("qteEnStock");
                        int qteAvm = Integer.parseInt(qteAVM);
                        System.out.println(qteAvm);
                        String getQteCom = qteText.getText();
                        int qteC = Integer.parseInt(getQteCom);
                        System.out.println(qteC);
                        if (qteAvm > qteC) {
                            qteModif = qteAvm - qteC;
                            qteEnStock += qteModif;
                        } else {
                            qteModif = qteC - qteAvm;
                            qteEnStock -= qteModif;
                        }
                        System.out.println(qteEnStock);
                        if (qteEnStock >= 0) {
                            String queryUp = "UPDATE produit SET qteEnStock = '" + qteEnStock + "' where codeProd ='" + comboProduit.getSelectedIndex() + "'";
                            Application.getDB().executeUpdate(queryUp);
                            Application.getDB().executeUpdate(queryUpdate);
                            rc.AffichageData(requeteReferenceAll, table);
                            Reinitialiser();
                        } else {
                            JOptionPane.showMessageDialog(null, "La quantite en stock est inferieure a celle commandée", "Erreur", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                } catch (SQLException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                comboCommande.setBackground(Color.WHITE);
                comboProduit.setBackground(Color.WHITE);
                qteText.setBackground(Color.WHITE);
            }
        }

    }//GEN-LAST:event_butModifMouseClicked

    private void butSuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSuppMouseClicked
        if (comboCommande.getSelectedIndex() != 0) {
            comboCommande.setBackground(Color.green);
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer annulation de la commande des produit ?", "Annulation", choix, JOptionPane.WARNING_MESSAGE);
            String queryDelete = "DELETE  FROM  " + tableDB + "  WHERE referer.codeCom = " + comboCommande.getSelectedItem();
            if (result == 0) {
                try {
                    String querySelect = "SELECT qteEnStock from produit where codeProd = " + comboProduit.getSelectedIndex();
                    ResultSet rst = Application.getDB().executeQuery(querySelect);
                    while (rst.next()) {
                        int qteEnStock = rst.getInt("qteEnStock");
                        String getQteCom = qteText.getText();
                        int qteC = Integer.parseInt(getQteCom);
                        qteEnStock += qteC;
                        String queryUp = "UPDATE produit SET qteEnStock = '" + qteEnStock + "' where codeProd =" + comboProduit.getSelectedIndex();
                        Application.getDB().executeUpdate(queryUp);
                        Application.getDB().executeUpdate(queryDelete);
                        rc.AffichageData(requeteReferenceAll, table);
                        Reinitialiser();
                    }
                } catch (SQLException | NumberFormatException e) {
                }
            } else {
                comboCommande.setBackground(Color.WHITE);
                comboProduit.setBackground(Color.WHITE);
                qteText.setBackground(Color.WHITE);
            }
        } else if (comboCommande.getSelectedIndex() == 0) {
            comboCommande.setBackground(Color.red);
        }

    }//GEN-LAST:event_butSuppMouseClicked

    private void butAffichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAffichMouseClicked
        rc.AffichageData(requeteReferenceAll, table);
        rc.rempliSelect(comboProduit, "produit", "nomProd", "marqueProd");
    }//GEN-LAST:event_butAffichMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Reinitialiser();
        int i = table.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        comboCommande.setSelectedItem(mode.getValueAt(i, 0).toString());
        comboProduit.setSelectedIndex((int) mode.getValueAt(i, 1));
        qteText.setText(mode.getValueAt(i, 2).toString());
    }//GEN-LAST:event_tableMouseClicked

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
            WritableSheet mySheet = myexcel.createSheet("Feuille des Clients", 0);
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
        } catch (IOException | WriteException ex) {
            Logger.getLogger(GesCom_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butEnregistreMouseClicked

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

    private void textRechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRechercheKeyTyped
        String requeteCommandeRecher;
        String codeC = "codeCom";
        String codeP = "codeProd";
        String qteC = "qteCom";
        int limit = 6;
        if (textRecherche.getText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP uniquement les numeros ", "Information", JOptionPane.ERROR_MESSAGE);

        }
        if (getRechercherText().length() > 0) {
            if (radioCom.isSelected() == true) {
                requeteCommandeRecher = "Select * from " + tableDB + " where " + codeC + " LIKE '%" + getRechercherText() + "%'";
                rc.AffichageData(requeteCommandeRecher, table);
            }
            if (radioProd.isSelected() == true) {
                requeteCommandeRecher = "Select * from " + tableDB + " where " + codeP + " LIKE '%" + getRechercherText() + "%'";
                rc.AffichageData(requeteCommandeRecher, table);
            }
            if (radioQte.isSelected() == true) {
                requeteCommandeRecher = "Select * from " + tableDB + " where " + qteC + " LIKE '%" + getRechercherText() + "%'";
                rc.AffichageData(requeteCommandeRecher, table);
            }

        } else {
            rc.AffichageData(requeteReferenceAll, table);
        }
    }//GEN-LAST:event_textRechercheKeyTyped

    private void textRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRechercheMouseClicked
        textRecherche.setText("");
    }//GEN-LAST:event_textRechercheMouseClicked

    private void qteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qteTextKeyTyped
        int limit = 3;
        if (getQteText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP uniquement les numeros ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_qteTextKeyTyped

    private void qteTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qteTextMouseClicked
        qteText.setBackground(Color.white);
    }//GEN-LAST:event_qteTextMouseClicked

    private void textRechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRechercheFocusGained
        textRecherche.setText("");
    }//GEN-LAST:event_textRechercheFocusGained

    private void textRechercheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRechercheFocusLost
        textRecherche.setText("Rechercher par categorie");
    }//GEN-LAST:event_textRechercheFocusLost

    private void comboProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboProduitMouseClicked
        comboProduit.setBackground(Color.WHITE);
    }//GEN-LAST:event_comboProduitMouseClicked

    private void comboCommandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCommandeMouseClicked
        comboCommande.setBackground(Color.WHITE);
    }//GEN-LAST:event_comboCommandeMouseClicked
    //LES METHODES
    //les getteurs pour le contenu des champs de textes
    public String getQteText() {
        return qteText.getText();
    }

    public String getRechercherText() {
        return textRecherche.getText();
    }

    //Reinitialisation
    public void Reinitialiser() {
        comboCommande.setSelectedIndex(0);
        comboProduit.setSelectedIndex(0);
        qteText.setText("");
        comboCommande.setBackground(Color.WHITE);
        comboProduit.setBackground(Color.WHITE);
        qteText.setBackground(Color.WHITE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulaire;
    private javax.swing.JLabel back;
    private javax.swing.JButton butAffich;
    private javax.swing.JButton butAjout;
    private javax.swing.JButton butEnregistre;
    private javax.swing.JButton butModif;
    private javax.swing.JButton butSupp;
    private javax.swing.JButton butVisual;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboCommande;
    private javax.swing.JComboBox<String> comboProduit;
    private javax.swing.JPanel entete_pan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel next;
    private javax.swing.JTextField qteText;
    private javax.swing.JRadioButton radioCom;
    private javax.swing.JRadioButton radioProd;
    private javax.swing.JRadioButton radioQte;
    private javax.swing.JTable table;
    private javax.swing.JTextField textRecherche;
    // End of variables declaration//GEN-END:variables
}
