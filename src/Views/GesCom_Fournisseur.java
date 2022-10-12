package Views;

import App.Application;
import Controller.FournisseurController;
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

public final class GesCom_Fournisseur extends javax.swing.JPanel {

    FournisseurController fc = new FournisseurController();
    String tableDB = "fournisseur";
    String requeteFourAll = "Select * from " + tableDB;

    public GesCom_Fournisseur() {
        initComponents();
        fc.AffichageData(requeteFourAll, table);
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
        emailText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        butAjout = new javax.swing.JButton();
        butModif = new javax.swing.JButton();
        butSup = new javax.swing.JButton();
        butActual = new javax.swing.JButton();
        telText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        adresseText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        radioCode = new javax.swing.JRadioButton();
        radioNom = new javax.swing.JRadioButton();
        radioEmail = new javax.swing.JRadioButton();
        textRecherche = new javax.swing.JTextField();
        radioTel = new javax.swing.JRadioButton();
        radioAdresse = new javax.swing.JRadioButton();
        butExportation = new javax.swing.JButton();
        butExportation1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 707));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete_pan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des Fournisseurs");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Back_50px.png"))); // NOI18N
        back.setToolTipText("Page Reference");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Forward_50px_1.png"))); // NOI18N
        next.setToolTipText("Page Livraison");
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
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        butSup.setBackground(new java.awt.Color(51, 51, 51));
        butSup.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butSup.setForeground(new java.awt.Color(255, 255, 255));
        butSup.setText("Supprimer");
        butSup.setFocusPainted(false);
        butSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butSupMouseClicked(evt);
            }
        });
        Formulaire.add(butSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        butActual.setBackground(new java.awt.Color(51, 51, 51));
        butActual.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butActual.setForeground(new java.awt.Color(255, 255, 255));
        butActual.setText("Actualiser");
        butActual.setFocusPainted(false);
        butActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butActualMouseClicked(evt);
            }
        });
        Formulaire.add(butActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        telText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        telText.setForeground(new java.awt.Color(51, 51, 51));
        telText.setBorder(null);
        telText.setCaretColor(new java.awt.Color(51, 51, 51));
        telText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telTextMouseClicked(evt);
            }
        });
        telText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telTextKeyTyped(evt);
            }
        });
        Formulaire.add(telText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 266, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Code");
        Formulaire.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 121, 23));

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

        adresseText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adresseText.setForeground(new java.awt.Color(51, 51, 51));
        adresseText.setBorder(null);
        adresseText.setCaretColor(new java.awt.Color(51, 51, 51));
        adresseText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adresseTextMouseClicked(evt);
            }
        });
        adresseText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adresseTextKeyTyped(evt);
            }
        });
        Formulaire.add(adresseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 266, 30));

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
                "Numero", "Nom", "Telephone", "Email", "Adresse"
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

        Formulaire.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 770, 348));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rechercher par :");
        Formulaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 160, -1));

        buttonGroup1.add(radioCode);
        radioCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCode.setForeground(new java.awt.Color(51, 51, 51));
        radioCode.setSelected(true);
        radioCode.setText("Code");
        Formulaire.add(radioCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        buttonGroup1.add(radioNom);
        radioNom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioNom.setForeground(new java.awt.Color(51, 51, 51));
        radioNom.setText("Nom");
        Formulaire.add(radioNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        buttonGroup1.add(radioEmail);
        radioEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioEmail.setForeground(new java.awt.Color(51, 51, 51));
        radioEmail.setText("Email");
        Formulaire.add(radioEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, -1, -1));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textRechercheMouseEntered(evt);
            }
        });
        textRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRechercheKeyTyped(evt);
            }
        });
        Formulaire.add(textRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 770, 30));

        buttonGroup1.add(radioTel);
        radioTel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioTel.setForeground(new java.awt.Color(51, 51, 51));
        radioTel.setText("Telephone");
        Formulaire.add(radioTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, -1));

        buttonGroup1.add(radioAdresse);
        radioAdresse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioAdresse.setText("Adresse");
        Formulaire.add(radioAdresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        butExportation.setBackground(new java.awt.Color(51, 51, 51));
        butExportation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butExportation.setForeground(new java.awt.Color(255, 255, 255));
        butExportation.setText("Exporter la table Fournisseurs sous Excel");
        butExportation.setToolTipText("");
        butExportation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExportation.setFocusPainted(false);
        butExportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExportationMouseClicked(evt);
            }
        });
        Formulaire.add(butExportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 440, 40));

        butExportation1.setBackground(new java.awt.Color(51, 51, 51));
        butExportation1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butExportation1.setForeground(new java.awt.Color(255, 255, 255));
        butExportation1.setText("Ouvrir un fichier  contenant une table Fournisseurs");
        butExportation1.setToolTipText("");
        butExportation1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExportation1.setFocusPainted(false);
        butExportation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExportation1MouseClicked(evt);
            }
        });
        Formulaire.add(butExportation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 440, 40));

        jPanel1.add(Formulaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 590));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setMaximumSize(new java.awt.Dimension(634, 732));
        jPanel3.setMinimumSize(new java.awt.Dimension(634, 732));
        jPanel3.setPreferredSize(new java.awt.Dimension(788, 695));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 270, 450));

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        GesCom_Menu.ref.setSize(1280, 707);
        GesCom_Menu.ref.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.ref);
    }//GEN-LAST:event_backMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        GesCom_Menu.liv.setSize(1280, 707);
        GesCom_Menu.liv.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.liv);
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
            telText.setBackground(Color.green);
        } else if (getNumeroText().equals("")) {
            telText.setBackground(Color.red);
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
                fc.AffichageData(requeteFourAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                nomText.setBackground(Color.WHITE);
                telText.setBackground(Color.WHITE);
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
            telText.setBackground(Color.green);
        } else if (getNumeroText().equals("")) {
            telText.setBackground(Color.red);
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
            String query = "UPDATE  " + tableDB + " SET  codeFour='" + getCodeText() + "',nomFour='" + getNomText() + "',  telFour='" + getNumeroText() + "',  emailFour='" + getEmailText() + "',  adresseFour='" + getAdresseText() + "' WHERE  codeFour =" + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query);
                fc.AffichageData(requeteFourAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                nomText.setBackground(Color.WHITE);
                telText.setBackground(Color.WHITE);
                emailText.setBackground(Color.WHITE);
                adresseText.setBackground(Color.WHITE);
            }
        }

    }//GEN-LAST:event_butModifMouseClicked

    private void butSupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSupMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la suppression?", "Suppresion", choix, JOptionPane.WARNING_MESSAGE);
            String query2 = "DELETE FROM  " + tableDB + "  WHERE codeFour = " + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query2);
                fc.AffichageData(requeteFourAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
            }
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }

    }//GEN-LAST:event_butSupMouseClicked

    private void butActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butActualMouseClicked
        fc.AffichageData(requeteFourAll, table);
    }//GEN-LAST:event_butActualMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Reinitialiser();
        int i = table.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        codeText.setText(mode.getValueAt(i, 0).toString());
        nomText.setText(mode.getValueAt(i, 1).toString());
        telText.setText(mode.getValueAt(i, 2).toString());
        emailText.setText(mode.getValueAt(i, 3).toString());
        adresseText.setText(mode.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void textRechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRechercheKeyTyped
        String requeteFourRecher;
        String code = "codeFour";
        String nom = "nomFour";
        String tel = "telFour";
        String email = "emailFour";
        String adresse = "adresseFour";
        if (getRechercherText().length() > 0) {
            if (radioCode.isSelected() == true) {
                requeteFourRecher = "Select * from " + tableDB + " where " + code + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFourRecher, table);

            }
            if (radioNom.isSelected() == true) {
                requeteFourRecher = "Select * from " + tableDB + " where " + nom + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFourRecher, table);
            }
            if (radioTel.isSelected() == true) {
                requeteFourRecher = "Select * from " + tableDB + " where " + tel + " LIKE '%" + getRechercherText();
                fc.AffichageData(requeteFourRecher, table);
            }
            if (radioEmail.isSelected() == true) {
                requeteFourRecher = "Select * from " + tableDB + " where " + email + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFourRecher, table);
            }
            if (radioAdresse.isSelected() == true) {
                requeteFourRecher = "Select * from " + tableDB + " where " + adresse + " LIKE '%" + getRechercherText() + "%'";
                fc.AffichageData(requeteFourRecher, table);
            }
        } else {
            fc.AffichageData(requeteFourAll, table);
        }
    }//GEN-LAST:event_textRechercheKeyTyped

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
        int limit = 30;
        if (getNomText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_nomTextKeyTyped

    private void telTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telTextKeyTyped
        int limit = 9;
        if (getNumeroText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP seulement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_telTextKeyTyped

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
            JOptionPane.showMessageDialog(null, "SVP Uniquement les lettres", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adresseTextKeyTyped

    private void codeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeTextMouseClicked
        codeText.setBackground(Color.WHITE);
    }//GEN-LAST:event_codeTextMouseClicked

    private void nomTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextMouseClicked
        nomText.setBackground(Color.WHITE);
    }//GEN-LAST:event_nomTextMouseClicked

    private void telTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telTextMouseClicked
        telText.setBackground(Color.WHITE);
    }//GEN-LAST:event_telTextMouseClicked

    private void emailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseClicked
        emailText.setBackground(Color.WHITE);
    }//GEN-LAST:event_emailTextMouseClicked

    private void adresseTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adresseTextMouseClicked
        adresseText.setBackground(Color.WHITE);
    }//GEN-LAST:event_adresseTextMouseClicked

    private void textRechercheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRechercheMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textRechercheMouseEntered

    private void textRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRechercheMouseClicked
        textRecherche.setText("");
    }//GEN-LAST:event_textRechercheMouseClicked

    private void textRechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRechercheFocusGained
        textRecherche.setText("");
    }//GEN-LAST:event_textRechercheFocusGained

    private void textRechercheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRechercheFocusLost
        textRecherche.setText("Rechercher par categorie");
    }//GEN-LAST:event_textRechercheFocusLost

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
            WritableSheet mySheet = myexcel.createSheet("Feuille des Fournisseurs", 0);
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
            Logger.getLogger(GesCom_Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getNumeroText() {
        return telText.getText();
    }

    public String getEmailText() {
        return emailText.getText();
    }

    public String getAdresseText() {
        return adresseText.getText();
    }

    public String getRechercherText() {
        return textRecherche.getText();
    }

    //Reinitialisation
    public void Reinitialiser() {
        codeText.setText("");
        nomText.setText("");
        telText.setText("");
        emailText.setText("");
        adresseText.setText("");
        codeText.setBackground(Color.WHITE);
        nomText.setBackground(Color.WHITE);
        telText.setBackground(Color.WHITE);
        emailText.setBackground(Color.WHITE);
        adresseText.setBackground(Color.WHITE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulaire;
    private javax.swing.JTextField adresseText;
    private javax.swing.JLabel back;
    private javax.swing.JButton butActual;
    private javax.swing.JButton butAjout;
    private javax.swing.JButton butExportation;
    private javax.swing.JButton butExportation1;
    private javax.swing.JButton butModif;
    private javax.swing.JButton butSup;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel next;
    private javax.swing.JTextField nomText;
    private javax.swing.JRadioButton radioAdresse;
    private javax.swing.JRadioButton radioCode;
    private javax.swing.JRadioButton radioEmail;
    private javax.swing.JRadioButton radioNom;
    private javax.swing.JRadioButton radioTel;
    private javax.swing.JTable table;
    private javax.swing.JTextField telText;
    private javax.swing.JTextField textRecherche;
    // End of variables declaration//GEN-END:variables
}
