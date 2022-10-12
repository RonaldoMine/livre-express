package Views;

import App.Application;
import Controller.ClientController;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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

public final class GesCom_Client extends javax.swing.JPanel {

    String tableDB = "client";
    String requeteClientAll = "Select * from " + tableDB;
    ClientController cc = new ClientController();

    public GesCom_Client() {
        initComponents();
        cc.AffichageData(requeteClientAll, table);
        entete_pan.setBackground(new Color(0, 0, 0, 200));
        Formulaire.setBackground(new Color(0, 0, 0, 200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butGrupCli = new javax.swing.ButtonGroup();
        total = new javax.swing.JPanel();
        entete_pan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        Formulaire = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adresseText = new javax.swing.JTextField();
        butAjout = new javax.swing.JButton();
        butModif = new javax.swing.JButton();
        butSupp = new javax.swing.JButton();
        butAffich = new javax.swing.JButton();
        telephoneText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        radioCode = new javax.swing.JRadioButton();
        radioNom = new javax.swing.JRadioButton();
        radioEmail = new javax.swing.JRadioButton();
        radioAdresse = new javax.swing.JRadioButton();
        textCherche = new javax.swing.JTextField();
        radioTel = new javax.swing.JRadioButton();
        butExportation = new javax.swing.JButton();
        butVisual = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        total.setBackground(new java.awt.Color(51, 51, 51));
        total.setPreferredSize(new java.awt.Dimension(1280, 707));
        total.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete_pan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des Clients");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Back_50px.png"))); // NOI18N
        back.setToolTipText("Page d'Accueil");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Forward_50px_1.png"))); // NOI18N
        next.setToolTipText("Page Commande");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        entete_panLayout.setVerticalGroup(
            entete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        total.add(entete_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

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
        jLabel3.setText("Telephone");
        Formulaire.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 121, 30));

        emailText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(51, 51, 51));
        emailText.setBorder(null);
        emailText.setCaretColor(new java.awt.Color(51, 51, 51));
        emailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextMouseClicked(evt);
            }
        });
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextKeyTyped(evt);
            }
        });
        Formulaire.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 266, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        Formulaire.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 121, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Adresse");
        Formulaire.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 121, 30));

        adresseText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adresseText.setForeground(new java.awt.Color(51, 51, 51));
        adresseText.setBorder(null);
        adresseText.setCaretColor(new java.awt.Color(51, 51, 51));
        adresseText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adresseTextMouseClicked(evt);
            }
        });
        adresseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseTextActionPerformed(evt);
            }
        });
        adresseText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adresseTextKeyTyped(evt);
            }
        });
        Formulaire.add(adresseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 266, 30));

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
        butAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAjoutActionPerformed(evt);
            }
        });
        Formulaire.add(butAjout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

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
        Formulaire.add(butModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

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
        Formulaire.add(butSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

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
        Formulaire.add(butAffich, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        telephoneText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        telephoneText.setForeground(new java.awt.Color(51, 51, 51));
        telephoneText.setBorder(null);
        telephoneText.setCaretColor(new java.awt.Color(51, 51, 51));
        telephoneText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telephoneTextMouseClicked(evt);
            }
        });
        telephoneText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telephoneTextKeyTyped(evt);
            }
        });
        Formulaire.add(telephoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 266, 30));

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeTextKeyTyped(evt);
            }
        });
        Formulaire.add(codeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 266, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rechercher par :");
        Formulaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

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
                "Code", "Nom", "Telephone", "Email", "Adresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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

        Formulaire.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 760, 390));

        butGrupCli.add(radioCode);
        radioCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCode.setForeground(new java.awt.Color(51, 51, 51));
        radioCode.setText("Code");
        Formulaire.add(radioCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        butGrupCli.add(radioNom);
        radioNom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioNom.setForeground(new java.awt.Color(51, 51, 51));
        radioNom.setText("Nom");
        Formulaire.add(radioNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        butGrupCli.add(radioEmail);
        radioEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioEmail.setForeground(new java.awt.Color(51, 51, 51));
        radioEmail.setText("Email");
        Formulaire.add(radioEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        butGrupCli.add(radioAdresse);
        radioAdresse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioAdresse.setForeground(new java.awt.Color(51, 51, 51));
        radioAdresse.setText("Adresse");
        radioAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdresseActionPerformed(evt);
            }
        });
        Formulaire.add(radioAdresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        textCherche.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textCherche.setText("Rechercher par categorie");
        textCherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textChercheFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textChercheFocusLost(evt);
            }
        });
        textCherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textChercheMouseClicked(evt);
            }
        });
        textCherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textChercheKeyTyped(evt);
            }
        });
        Formulaire.add(textCherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 760, 30));

        butGrupCli.add(radioTel);
        radioTel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioTel.setForeground(new java.awt.Color(51, 51, 51));
        radioTel.setText("Telephone");
        Formulaire.add(radioTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        butExportation.setBackground(new java.awt.Color(51, 51, 51));
        butExportation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butExportation.setForeground(new java.awt.Color(255, 255, 255));
        butExportation.setText("Exporter la table Clients sous Excel");
        butExportation.setToolTipText("");
        butExportation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExportation.setFocusPainted(false);
        butExportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExportationMouseClicked(evt);
            }
        });
        Formulaire.add(butExportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 440, 40));

        butVisual.setBackground(new java.awt.Color(51, 51, 51));
        butVisual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butVisual.setForeground(new java.awt.Color(255, 255, 255));
        butVisual.setText("Ouvrir une table Clients");
        butVisual.setToolTipText("");
        butVisual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVisual.setFocusPainted(false);
        butVisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butVisualMouseClicked(evt);
            }
        });
        Formulaire.add(butVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 440, 40));

        total.add(Formulaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 100, 1280, 610));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        total.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adresseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseTextActionPerformed
        adresseText.setBackground(Color.WHITE);
    }//GEN-LAST:event_adresseTextActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Visibilite(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.fact.setVisible(false);

    }//GEN-LAST:event_backMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        GesCom_Menu.com.setSize(1280, 707);
        GesCom_Menu.com.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.com);
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
        if (!getNumeroText().equals("")) {
            telephoneText.setBackground(Color.green);
        } else if (getNumeroText().equals("")) {
            telephoneText.setBackground(Color.red);
        }
        if (!getEmailText().equals("")) {
            emailText.setBackground(Color.green);
        } else if (getEmailText().equals("")) {
            emailText.setBackground(Color.red);
        }
        if (!getAdresseText().equals("")) {
            adresseText.setBackground(Color.green);
        } else if (getAdresseText().equals("")) {
            adresseText.setBackground(Color.red);
        }
        if (!getCodeText().equals("") && !getNomText().equals("") && !getNumeroText().equals("") && !getEmailText().equals("") && !getAdresseText().equals("")) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous Ajouter cet element?", "Ajout", choix, JOptionPane.WARNING_MESSAGE);
            String query1 = "INSERT INTO  " + tableDB + "  VALUES ('" + getCodeText() + "','" + getNomText() + "',  '" + getNumeroText() + "',  '" + getEmailText() + "',  '" + getAdresseText() + "')";
            if (result == 0) {
                Application.getDB().executeUpdate(query1);
                cc.AffichageData(requeteClientAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                nomText.setBackground(Color.WHITE);
                telephoneText.setBackground(Color.WHITE);
                emailText.setBackground(Color.WHITE);
                adresseText.setBackground(Color.WHITE);
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
        if (!getNumeroText().equals("")) {
            telephoneText.setBackground(Color.green);
        } else if (getNumeroText().equals("")) {
            telephoneText.setBackground(Color.red);
        }
        if (!getEmailText().equals("")) {
            emailText.setBackground(Color.green);
        } else if (getEmailText().equals("")) {
            emailText.setBackground(Color.red);
        }
        if (!getAdresseText().equals("")) {
            adresseText.setBackground(Color.green);
        } else if (getAdresseText().equals("")) {
            adresseText.setBackground(Color.red);
        }
        if (!getCodeText().equals("") && !getNomText().equals("") && !getNumeroText().equals("") && !getEmailText().equals("") && !getAdresseText().equals("")) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la modification?", "Modification", choix, JOptionPane.WARNING_MESSAGE);
            String query = "UPDATE  " + tableDB + " SET  CodeCli='" + getCodeText() + "',NomCli='" + getNomText() + "',  TelephoneCli='" + getNumeroText() + "',  EmailCli='" + getEmailText() + "',  AdresseCli='" + getAdresseText() + "' WHERE  CodeCli =" + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query);
                cc.AffichageData(requeteClientAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                nomText.setBackground(Color.WHITE);
                telephoneText.setBackground(Color.WHITE);
                emailText.setBackground(Color.WHITE);
                adresseText.setBackground(Color.WHITE);
            }
        }

    }//GEN-LAST:event_butModifMouseClicked

    private void butSuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSuppMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la suppression?", "Suppresion", choix, JOptionPane.WARNING_MESSAGE);
            String query2 = "DELETE FROM  " + tableDB + "  WHERE CodeCli = " + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query2);
                cc.AffichageData(requeteClientAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
            }
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }

    }//GEN-LAST:event_butSuppMouseClicked

    private void butAffichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAffichMouseClicked
        cc.AffichageData(requeteClientAll, table);
    }//GEN-LAST:event_butAffichMouseClicked

    private void butAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAjoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butAjoutActionPerformed

    private void radioAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAdresseActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Reinitialiser();
        int i = table.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        codeText.setText(mode.getValueAt(i, 0).toString());
        nomText.setText(mode.getValueAt(i, 1).toString());
        telephoneText.setText(mode.getValueAt(i, 2).toString());
        emailText.setText(mode.getValueAt(i, 3).toString());
        adresseText.setText(mode.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void textChercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textChercheKeyTyped
        String requeteClientRecher;
        String code = "CodeCli";
        String nom = "NomCli";
        String tel = "TelephoneCli";
        String email = "EmailCli";
        String adresse = "AdresseCli";
        if (getRechercherText().length() > 0) {
            if (radioCode.isSelected() == true) {
                requeteClientRecher = "Select * from " + tableDB + " where " + code + " LIKE '%" + getRechercherText() + "%'";
                cc.AffichageData(requeteClientRecher, table);
            }
            if (radioNom.isSelected() == true) {
                requeteClientRecher = "Select * from " + tableDB + " where " + nom + " LIKE '%" + getRechercherText() + "%'";
                cc.AffichageData(requeteClientRecher, table);
            }
            if (radioTel.isSelected() == true) {
                requeteClientRecher = "Select * from " + tableDB + " where " + tel + " LIKE '%" + getRechercherText() + "%'";
                cc.AffichageData(requeteClientRecher, table);
            }
            if (radioEmail.isSelected() == true) {
                requeteClientRecher = "Select * from " + tableDB + " where " + email + " LIKE '%" + getRechercherText() + "%'";
                cc.AffichageData(requeteClientRecher, table);
            }
            if (radioAdresse.isSelected() == true) {
                requeteClientRecher = "Select * from " + tableDB + " where " + adresse + " LIKE '%" + getRechercherText() + "%'";
                cc.AffichageData(requeteClientRecher, table);
            }
        } else {
            cc.AffichageData(requeteClientAll, table);
        }
    }//GEN-LAST:event_textChercheKeyTyped

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

    private void codeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextKeyPressed

    private void nomTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTextKeyTyped
        int limit = 30;
        if (getNomText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_nomTextKeyTyped

    private void telephoneTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telephoneTextKeyTyped
        int limit = 9;
        if (getNumeroText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP seulement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_telephoneTextKeyTyped

    private void emailTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyTyped
        int limit = 60;
        if ((evt.getKeyChar() == (char) KeyEvent.VK_SPACE) || (evt.getKeyChar() == (char) KeyEvent.VK_EQUALS)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Pas d'espace, ni d'egale", "Information", JOptionPane.ERROR_MESSAGE);
        }
        if (getEmailText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_emailTextKeyTyped

    private void adresseTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresseTextKeyTyped
        int limit = 20;
        if (getAdresseText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Seulement lettres", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adresseTextKeyTyped

    private void codeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeTextMouseClicked
        codeText.setBackground(Color.WHITE);
    }//GEN-LAST:event_codeTextMouseClicked

    private void nomTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextMouseClicked
        nomText.setBackground(Color.WHITE);
    }//GEN-LAST:event_nomTextMouseClicked

    private void telephoneTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telephoneTextMouseClicked
        telephoneText.setBackground(Color.WHITE);
    }//GEN-LAST:event_telephoneTextMouseClicked

    private void emailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseClicked
        emailText.setBackground(Color.WHITE);
    }//GEN-LAST:event_emailTextMouseClicked

    private void adresseTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adresseTextMouseClicked
        adresseText.setBackground(Color.WHITE);
    }//GEN-LAST:event_adresseTextMouseClicked

    private void textChercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textChercheMouseClicked
        textCherche.setText("");
    }//GEN-LAST:event_textChercheMouseClicked

    private void textChercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textChercheFocusGained
        textCherche.setText("");
    }//GEN-LAST:event_textChercheFocusGained

    private void textChercheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textChercheFocusLost
        textCherche.setText("Rechercher par categorie");
    }//GEN-LAST:event_textChercheFocusLost

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
    //LES METHODES
    //les getteurs pour le contenu des champs de textes

    public String getCodeText() {
        return codeText.getText();
    }

    public String getNomText() {
        return nomText.getText();
    }

    public String getNumeroText() {
        return telephoneText.getText();
    }

    public String getEmailText() {
        return emailText.getText();
    }

    public String getAdresseText() {
        return adresseText.getText();
    }

    public String getRechercherText() {
        return textCherche.getText();
    }

    //Reinitialisation
    public void Reinitialiser() {
        codeText.setText("");
        nomText.setText("");
        telephoneText.setText("");
        emailText.setText("");
        adresseText.setText("");
        codeText.setBackground(Color.WHITE);
        nomText.setBackground(Color.WHITE);
        telephoneText.setBackground(Color.WHITE);
        emailText.setBackground(Color.WHITE);
        adresseText.setBackground(Color.WHITE);
    }

    //Visiblilite des composants
    public void Visibilite(boolean v) {
        GesCom_Menu.panCli.setVisible(v);
        GesCom_Menu.panCom.setVisible(v);
        GesCom_Menu.panRef.setVisible(v);
        GesCom_Menu.panFour.setVisible(v);
        GesCom_Menu.panLiv.setVisible(v);
        GesCom_Menu.panProd.setVisible(v);
        GesCom_Menu.panFact.setVisible(v);
        GesCom_Menu.panBackgroung.setVisible(v);
        GesCom_Menu.imgBackgroung.setVisible(v);
    }

    //Execute une requete
    /*public void ExecuteRequete(String query, String message) {
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Données " + message + " avec succes");
            } else {
                JOptionPane.showMessageDialog(null, "Données non " + message + " une verification s'impose vant un nouvel essai");
            }

        } catch (Exception e) {
        } finally {
            try {
                st.close();
                rst.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulaire;
    private javax.swing.JTextField adresseText;
    private javax.swing.JLabel back;
    private javax.swing.JButton butAffich;
    private javax.swing.JButton butAjout;
    private javax.swing.JButton butExportation;
    private javax.swing.ButtonGroup butGrupCli;
    private javax.swing.JButton butModif;
    private javax.swing.JButton butSupp;
    private javax.swing.JButton butVisual;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField emailText;
    private javax.swing.JPanel entete_pan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel next;
    private javax.swing.JTextField nomText;
    private javax.swing.JRadioButton radioAdresse;
    private javax.swing.JRadioButton radioCode;
    private javax.swing.JRadioButton radioEmail;
    private javax.swing.JRadioButton radioNom;
    private javax.swing.JRadioButton radioTel;
    private javax.swing.JTable table;
    private javax.swing.JTextField telephoneText;
    private javax.swing.JTextField textCherche;
    private javax.swing.JPanel total;
    // End of variables declaration//GEN-END:variables
}
