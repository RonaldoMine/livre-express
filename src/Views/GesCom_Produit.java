package Views;

import App.Application;
import Controller.ProduitController;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

public final class GesCom_Produit extends javax.swing.JPanel {

    ProduitController pc = new ProduitController();
    String tableDB = "produit";
    String requeteProduitAll = "Select * from " + tableDB;

    public GesCom_Produit() {
        initComponents();
        pc.AffichageData(requeteProduitAll, table);
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
        nomText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prixText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qteText = new javax.swing.JTextField();
        butAjout = new javax.swing.JButton();
        butModif = new javax.swing.JButton();
        butSupp = new javax.swing.JButton();
        butAffich = new javax.swing.JButton();
        marqText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        radioCode = new javax.swing.JRadioButton();
        radioNom = new javax.swing.JRadioButton();
        radioMarq = new javax.swing.JRadioButton();
        radioQte = new javax.swing.JRadioButton();
        textRechercher = new javax.swing.JTextField();
        radioPrix = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        butExportation = new javax.swing.JButton();
        butExportation1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 707));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete_pan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des Produits");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Back_50px.png"))); // NOI18N
        back.setToolTipText("Page Commande");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Forward_50px_1.png"))); // NOI18N
        next.setToolTipText("Page Reference");
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
                .addGap(0, 0, 0)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        entete_panLayout.setVerticalGroup(
            entete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(entete_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 120));

        Formulaire.setBackground(new java.awt.Color(0, 0, 0));
        Formulaire.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom");
        Formulaire.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 121, 30));

        nomText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nomText.setForeground(new java.awt.Color(51, 51, 51));
        nomText.setBorder(null);
        nomText.setCaretColor(new java.awt.Color(51, 51, 51));
        nomText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomTextMouseClicked(evt);
            }
        });
        nomText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomTextKeyTyped(evt);
            }
        });
        Formulaire.add(nomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 266, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marque");
        Formulaire.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 30));

        prixText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        prixText.setForeground(new java.awt.Color(51, 51, 51));
        prixText.setBorder(null);
        prixText.setCaretColor(new java.awt.Color(51, 51, 51));
        prixText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prixTextMouseClicked(evt);
            }
        });
        prixText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixTextKeyTyped(evt);
            }
        });
        Formulaire.add(prixText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 266, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prix");
        Formulaire.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 23));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantite En Stock");
        Formulaire.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 23));

        qteText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qteText.setForeground(new java.awt.Color(51, 51, 51));
        qteText.setBorder(null);
        qteText.setCaretColor(new java.awt.Color(51, 51, 51));
        qteText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qteTextMouseClicked(evt);
            }
        });
        qteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qteTextActionPerformed(evt);
            }
        });
        qteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qteTextKeyTyped(evt);
            }
        });
        Formulaire.add(qteText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 266, 30));

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
        Formulaire.add(butAjout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

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
        Formulaire.add(butModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        butSupp.setBackground(new java.awt.Color(51, 51, 51));
        butSupp.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butSupp.setForeground(new java.awt.Color(255, 255, 255));
        butSupp.setText("Supprimer");
        butSupp.setFocusPainted(false);
        butSupp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butSuppMouseClicked(evt);
            }
        });
        Formulaire.add(butSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

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
        Formulaire.add(butAffich, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        marqText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        marqText.setForeground(new java.awt.Color(51, 51, 51));
        marqText.setBorder(null);
        marqText.setCaretColor(new java.awt.Color(51, 51, 51));
        marqText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marqTextMouseClicked(evt);
            }
        });
        marqText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marqTextKeyTyped(evt);
            }
        });
        Formulaire.add(marqText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 266, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Code");
        Formulaire.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 121, 30));

        codeText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        codeText.setForeground(new java.awt.Color(51, 51, 51));
        codeText.setBorder(null);
        codeText.setCaretColor(new java.awt.Color(51, 51, 51));
        codeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeTextMouseClicked(evt);
            }
        });
        codeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeTextKeyTyped(evt);
            }
        });
        Formulaire.add(codeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 266, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rechercher par :");
        Formulaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        buttonGroup1.add(radioCode);
        radioCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCode.setForeground(new java.awt.Color(51, 51, 51));
        radioCode.setSelected(true);
        radioCode.setText("Code");
        Formulaire.add(radioCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        buttonGroup1.add(radioNom);
        radioNom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioNom.setForeground(new java.awt.Color(51, 51, 51));
        radioNom.setText("Nom");
        Formulaire.add(radioNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        buttonGroup1.add(radioMarq);
        radioMarq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioMarq.setForeground(new java.awt.Color(51, 51, 51));
        radioMarq.setText("Marque");
        Formulaire.add(radioMarq, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        buttonGroup1.add(radioQte);
        radioQte.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioQte.setForeground(new java.awt.Color(51, 51, 51));
        radioQte.setText("Quantité en stock");
        radioQte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQteActionPerformed(evt);
            }
        });
        Formulaire.add(radioQte, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        textRechercher.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textRechercher.setText("Rechercher par categorie");
        textRechercher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textRechercherFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textRechercherFocusLost(evt);
            }
        });
        textRechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRechercherMouseClicked(evt);
            }
        });
        textRechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRechercherKeyTyped(evt);
            }
        });
        Formulaire.add(textRechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 780, 30));

        buttonGroup1.add(radioPrix);
        radioPrix.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioPrix.setForeground(new java.awt.Color(51, 51, 51));
        radioPrix.setText("Prix");
        Formulaire.add(radioPrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

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
                "Code", "Nom", "Marque", "Prix", "Quantite en stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        Formulaire.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 778, 370));

        butExportation.setBackground(new java.awt.Color(51, 51, 51));
        butExportation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butExportation.setForeground(new java.awt.Color(255, 255, 255));
        butExportation.setText("Exporter la table Produits sous Excel");
        butExportation.setToolTipText("");
        butExportation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExportation.setFocusPainted(false);
        butExportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExportationMouseClicked(evt);
            }
        });
        Formulaire.add(butExportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 440, 40));

        butExportation1.setBackground(new java.awt.Color(51, 51, 51));
        butExportation1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butExportation1.setForeground(new java.awt.Color(255, 255, 255));
        butExportation1.setText("Ouvrir un fichier  contenant une table Produits");
        butExportation1.setToolTipText("");
        butExportation1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExportation1.setFocusPainted(false);
        butExportation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExportation1MouseClicked(evt);
            }
        });
        Formulaire.add(butExportation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 440, 40));

        jPanel1.add(Formulaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 590));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

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

    private void qteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qteTextActionPerformed

    private void radioQteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioQteActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        GesCom_Menu.com.setSize(1280, 707);
        GesCom_Menu.com.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.com);
    }//GEN-LAST:event_backMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        GesCom_Menu.ref.setSize(1280, 707);
        GesCom_Menu.ref.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.ref);
    }//GEN-LAST:event_nextMouseClicked

    private void butAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAjoutMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }
        if (!getNomText().equals("")) {
            nomText.setBackground(Color.green);
        } else if (getNomText().equals("")) {
            nomText.setBackground(Color.red);
        }
        if (!getMarqText().equals("")) {
            marqText.setBackground(Color.green);
        } else if (getMarqText().equals("")) {
            marqText.setBackground(Color.red);
        }
        if (!getPrixText().equals("")) {
            prixText.setBackground(Color.green);
        } else if (getPrixText().equals("")) {
            prixText.setBackground(Color.red);
        }
        if (!getQteText().equals("")) {
            qteText.setBackground(Color.green);
        } else if (getQteText().equals("")) {
            qteText.setBackground(Color.red);
        }
        if (!getCodeText().equals("") && !getNomText().equals("") && !getMarqText().equals("") && !getPrixText().equals("") && !getQteText().equals("")) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous Ajouter cet element?", "Ajout", choix, JOptionPane.WARNING_MESSAGE);
            String query1 = "INSERT INTO  " + tableDB + "  VALUES ('" + getCodeText() + "','" + getNomText() + "',  '" + getMarqText() + "',  '" + getPrixText() + "',  '" + getQteText() + "')";
            if (result == 0) {
                Application.getDB().executeUpdate(query1);
                pc.AffichageData(requeteProduitAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                nomText.setBackground(Color.WHITE);
                marqText.setBackground(Color.WHITE);
                prixText.setBackground(Color.WHITE);
                qteText.setBackground(Color.WHITE);
            }
        }

    }//GEN-LAST:event_butAjoutMouseClicked

    private void butModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butModifMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }
        if (!getNomText().equals("")) {
            nomText.setBackground(Color.green);
        } else if (getNomText().equals("")) {
            nomText.setBackground(Color.red);
        }
        if (!getMarqText().equals("")) {
            marqText.setBackground(Color.green);
        } else if (getMarqText().equals("")) {
            marqText.setBackground(Color.red);
        }
        if (!getPrixText().equals("")) {
            prixText.setBackground(Color.green);
        } else if (getPrixText().equals("")) {
            prixText.setBackground(Color.red);
        }
        if (!getQteText().equals("")) {
            qteText.setBackground(Color.green);
        } else if (getQteText().equals("")) {
            qteText.setBackground(Color.red);
        }
        if (!getCodeText().equals("") && !getNomText().equals("") && !getMarqText().equals("") && !getMarqText().equals("") && !getPrixText().equals("") && !getQteText().equals("")) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la modification?", "Modification", choix, JOptionPane.WARNING_MESSAGE);
            String query = "UPDATE  " + tableDB + " SET  codeProd='" + getCodeText() + "',nomProd='" + getNomText() + "',  marqueProd='" + getMarqText() + "',  prixProd='" + getPrixText() + "',  qteEnStock='" + getQteText() + "' WHERE  codeProd =" + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query);
                pc.AffichageData(requeteProduitAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                nomText.setBackground(Color.WHITE);
                marqText.setBackground(Color.WHITE);
                prixText.setBackground(Color.WHITE);
                qteText.setBackground(Color.WHITE);
            }
        }

    }//GEN-LAST:event_butModifMouseClicked

    private void butSuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSuppMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la suppression?", "Suppresion", choix, JOptionPane.WARNING_MESSAGE);
            String query2 = "DELETE FROM  " + tableDB + "  WHERE codeProd = " + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query2);
                pc.AffichageData(requeteProduitAll, table);
                Reinitialiser();
            }
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }

    }//GEN-LAST:event_butSuppMouseClicked

    private void butAffichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAffichMouseClicked
        pc.AffichageData(requeteProduitAll, table);
    }//GEN-LAST:event_butAffichMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Reinitialiser();
        int i = table.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        codeText.setText(mode.getValueAt(i, 0).toString());
        nomText.setText(mode.getValueAt(i, 1).toString());
        marqText.setText(mode.getValueAt(i, 2).toString());
        prixText.setText(mode.getValueAt(i, 3).toString());
        qteText.setText(mode.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void textRechercherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRechercherKeyTyped
        String requeteProdRecher;
        String code = "codeProd";
        String nom = "nomProd";
        String marq = "marqueProd";
        String prix = "prixProd";
        String qte = "qteEnStock";
        if (getRechercherText().length() > 0) {
            if (radioCode.isSelected() == true) {
                requeteProdRecher = "Select * from " + tableDB + " where " + code + " LIKE '%" + getRechercherText() + "%'";
                pc.AffichageData(requeteProdRecher, table);
            }
            if (radioNom.isSelected() == true) {
                requeteProdRecher = "Select * from " + tableDB + " where " + nom + " LIKE '%" + getRechercherText() + "%'";
                pc.AffichageData(requeteProdRecher, table);
            }
            if (radioMarq.isSelected() == true) {
                requeteProdRecher = "Select * from " + tableDB + " where " + marq + " LIKE '%" + getRechercherText() + "%'";
                pc.AffichageData(requeteProdRecher, table);
            }
            if (radioPrix.isSelected() == true) {
                requeteProdRecher = "Select * from " + tableDB + " where " + prix + " LIKE '%" + getRechercherText() + "%'";
                pc.AffichageData(requeteProdRecher, table);
            }
            if (radioQte.isSelected() == true) {
                requeteProdRecher = "Select * from " + tableDB + " where " + qte + " LIKE '%" + getRechercherText() + "%'";
                pc.AffichageData(requeteProdRecher, table);
            }
        } else {
            pc.AffichageData(requeteProduitAll, table);
        }
    }//GEN-LAST:event_textRechercherKeyTyped

    private void codeTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeTextKeyTyped
        int limit = 3;
        if (getCodeText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP uniquement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_codeTextKeyTyped

    private void nomTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTextKeyTyped
        int limit = 20;
        if (getNomText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_nomTextKeyTyped

    private void marqTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marqTextKeyTyped
        int limit = 30;
        if (getMarqText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_marqTextKeyTyped

    private void prixTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixTextKeyTyped
        int limit = 9;
        if (getPrixText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP seulement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_prixTextKeyTyped

    private void qteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qteTextKeyTyped
        int limit = 6;
        if (getQteText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP seulement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_qteTextKeyTyped

    private void codeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeTextMouseClicked
        codeText.setBackground(Color.WHITE);
    }//GEN-LAST:event_codeTextMouseClicked

    private void nomTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextMouseClicked
        nomText.setBackground(Color.WHITE);
    }//GEN-LAST:event_nomTextMouseClicked

    private void marqTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marqTextMouseClicked
        marqText.setBackground(Color.WHITE);
    }//GEN-LAST:event_marqTextMouseClicked

    private void prixTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prixTextMouseClicked
        prixText.setBackground(Color.WHITE);
    }//GEN-LAST:event_prixTextMouseClicked

    private void qteTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qteTextMouseClicked
        qteText.setBackground(Color.WHITE);
    }//GEN-LAST:event_qteTextMouseClicked

    private void textRechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRechercherMouseClicked
        textRechercher.setText("");
    }//GEN-LAST:event_textRechercherMouseClicked

    private void textRechercherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRechercherFocusGained
        textRechercher.setText("");
    }//GEN-LAST:event_textRechercherFocusGained

    private void textRechercherFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRechercherFocusLost
        textRechercher.setText("Rechercher par categorie");
    }//GEN-LAST:event_textRechercherFocusLost

    private void butExportationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butExportationMouseClicked
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
    }//GEN-LAST:event_butExportationMouseClicked

    private void butExportation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butExportation1MouseClicked
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Ouvrir un fichier");
            chooser.showOpenDialog(this);
            File file = chooser.getSelectedFile();
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_butExportation1MouseClicked
    //LES METHODES
    //les getteurs pour le contenu des champs de textes
    public String getCodeText() {
        return codeText.getText();
    }

    public String getNomText() {
        return nomText.getText();
    }

    public String getMarqText() {
        return marqText.getText();
    }

    public String getPrixText() {
        return prixText.getText();
    }

    public String getQteText() {
        return qteText.getText();
    }

    public String getRechercherText() {
        return textRechercher.getText();
    }

    //Reinitialisation
    public void Reinitialiser() {
        codeText.setText("");
        nomText.setText("");
        marqText.setText("");
        qteText.setText("");
        prixText.setText("");
        codeText.setBackground(Color.WHITE);
        nomText.setBackground(Color.WHITE);
        marqText.setBackground(Color.WHITE);
        qteText.setBackground(Color.WHITE);
        prixText.setBackground(Color.WHITE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulaire;
    private javax.swing.JLabel back;
    private javax.swing.JButton butAffich;
    private javax.swing.JButton butAjout;
    private javax.swing.JButton butExportation;
    private javax.swing.JButton butExportation1;
    private javax.swing.JButton butModif;
    private javax.swing.JButton butSupp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codeText;
    private javax.swing.JPanel entete_pan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marqText;
    private javax.swing.JLabel next;
    private javax.swing.JTextField nomText;
    private javax.swing.JTextField prixText;
    private javax.swing.JTextField qteText;
    private javax.swing.JRadioButton radioCode;
    private javax.swing.JRadioButton radioMarq;
    private javax.swing.JRadioButton radioNom;
    private javax.swing.JRadioButton radioPrix;
    private javax.swing.JRadioButton radioQte;
    private javax.swing.JTable table;
    private javax.swing.JTextField textRechercher;
    // End of variables declaration//GEN-END:variables
}
