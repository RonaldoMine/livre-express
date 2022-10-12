package Views;

import App.Application;
import Controller.LivraisonController;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
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

public final class GesCom_Livraison extends javax.swing.JPanel {

    LivraisonController lc = new LivraisonController();
    String tableDB = "livraison";
    String requeteLivraisonAll = "Select * from " + tableDB;

    public GesCom_Livraison() {
        initComponents();
        lc.AffichageData(requeteLivraisonAll, table);
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
        codeFourText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        butAjout = new javax.swing.JButton();
        butModif = new javax.swing.JButton();
        butSupp = new javax.swing.JButton();
        butActu = new javax.swing.JButton();
        codeProdText = new javax.swing.JTextField();
        dateLivText = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        radioCodeFour = new javax.swing.JRadioButton();
        radioCodeProd = new javax.swing.JRadioButton();
        radioDateLiv = new javax.swing.JRadioButton();
        butRecherche = new javax.swing.JButton();
        textRechercher = new javax.swing.JTextField();
        dateRecherche = new com.toedter.calendar.JDateChooser();
        butExportation = new javax.swing.JButton();
        butVisual = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 707));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete_pan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des Livraisons");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Back_50px.png"))); // NOI18N
        back.setToolTipText("Page Fournisseur");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Forward_50px_1.png"))); // NOI18N
        next.setToolTipText("Page Facture");
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
            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(entete_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 120));

        Formulaire.setBackground(new java.awt.Color(0, 0, 0));
        Formulaire.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Code Fournisseur");
        Formulaire.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 23));

        codeFourText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        codeFourText.setForeground(new java.awt.Color(51, 51, 51));
        codeFourText.setBorder(null);
        codeFourText.setCaretColor(new java.awt.Color(51, 51, 51));
        codeFourText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeFourTextMouseClicked(evt);
            }
        });
        codeFourText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeFourTextKeyTyped(evt);
            }
        });
        Formulaire.add(codeFourText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 266, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Code Produit");
        Formulaire.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 121, 23));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date de livraison");
        Formulaire.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 121, 30));

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
        Formulaire.add(butAjout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

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
        Formulaire.add(butModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

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
        Formulaire.add(butSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        butActu.setBackground(new java.awt.Color(51, 51, 51));
        butActu.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        butActu.setForeground(new java.awt.Color(255, 255, 255));
        butActu.setText("Actualiser");
        butActu.setFocusPainted(false);
        butActu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butActuMouseClicked(evt);
            }
        });
        Formulaire.add(butActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        codeProdText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        codeProdText.setForeground(new java.awt.Color(51, 51, 51));
        codeProdText.setBorder(null);
        codeProdText.setCaretColor(new java.awt.Color(51, 51, 51));
        codeProdText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeProdTextMouseClicked(evt);
            }
        });
        codeProdText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeProdTextKeyTyped(evt);
            }
        });
        Formulaire.add(codeProdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 266, 30));

        dateLivText.setBackground(new java.awt.Color(255, 255, 255));
        dateLivText.setAutoscrolls(true);
        dateLivText.setDateFormatString("d-MM-yyyy");
        dateLivText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateLivText.setMaxSelectableDate(new java.util.Date(253370764897000L));
        dateLivText.setMinSelectableDate(new java.util.Date(-62135769503000L));
        Formulaire.add(dateLivText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 270, 30));

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
                "Code Fournisseur", "Code Produit", "Date de livraison", "Quantite livrée"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        Formulaire.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 778, 348));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rechercher par :");
        Formulaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        buttonGroup1.add(radioCodeFour);
        radioCodeFour.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCodeFour.setForeground(new java.awt.Color(51, 51, 51));
        radioCodeFour.setSelected(true);
        radioCodeFour.setText("Code Fournisseur");
        radioCodeFour.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioCodeFourFocusGained(evt);
            }
        });
        Formulaire.add(radioCodeFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        buttonGroup1.add(radioCodeProd);
        radioCodeProd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCodeProd.setForeground(new java.awt.Color(51, 51, 51));
        radioCodeProd.setText("Code Produit");
        radioCodeProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioCodeProdMouseClicked(evt);
            }
        });
        Formulaire.add(radioCodeProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        buttonGroup1.add(radioDateLiv);
        radioDateLiv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioDateLiv.setForeground(new java.awt.Color(51, 51, 51));
        radioDateLiv.setText("Date de livraison");
        radioDateLiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDateLivMouseClicked(evt);
            }
        });
        Formulaire.add(radioDateLiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

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
        Formulaire.add(butRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 160, -1));

        textRechercher.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        Formulaire.add(textRechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 357, 30));

        dateRecherche.setBackground(new java.awt.Color(255, 255, 255));
        dateRecherche.setDateFormatString("d-MM-yyyy");
        Formulaire.add(dateRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 237, 30));

        butExportation.setBackground(new java.awt.Color(51, 51, 51));
        butExportation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butExportation.setForeground(new java.awt.Color(255, 255, 255));
        butExportation.setText("Exporter la table Livraison sous Excel");
        butExportation.setToolTipText("");
        butExportation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExportation.setFocusPainted(false);
        butExportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExportationMouseClicked(evt);
            }
        });
        Formulaire.add(butExportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 440, 40));

        butVisual.setBackground(new java.awt.Color(51, 51, 51));
        butVisual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butVisual.setForeground(new java.awt.Color(255, 255, 255));
        butVisual.setText("Ouvrir un fichier  contenant une table Livraison");
        butVisual.setToolTipText("");
        butVisual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVisual.setFocusPainted(false);
        butVisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butVisualMouseClicked(evt);
            }
        });
        Formulaire.add(butVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 440, 40));

        jPanel1.add(Formulaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 590));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
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
        GesCom_Menu.four.setSize(1280, 707);
        GesCom_Menu.four.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.four);
    }//GEN-LAST:event_backMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        GesCom_Menu.fact.setSize(1280, 707);
        GesCom_Menu.fact.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.fact);
    }//GEN-LAST:event_nextMouseClicked

    private void butAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAjoutMouseClicked
        if (!getCodeFourText().equals("")) {
            codeFourText.setBackground(Color.green);
        } else if (getCodeFourText().equals("")) {
            codeFourText.setBackground(Color.red);
        }
        if (!getCodeProdText().equals("")) {
            codeProdText.setBackground(Color.green);
        } else if (getCodeProdText().equals("")) {
            codeProdText.setBackground(Color.red);
        }
        if (getDateText() != null) {
            dateLivText.setBackground(Color.green);
        } else if (getDateText() == null) {
            dateLivText.setBackground(Color.red);
        }
        if (!getCodeFourText().equals("") && !getCodeProdText().equals("") && getDateText() != null) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous Ajouter cet element?", "Ajout", choix, JOptionPane.WARNING_MESSAGE);
            SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
            String date = spf.format(getDateText());
            String query = "INSERT INTO " + tableDB + "  VALUES ('" + getCodeFourText() + "','" + getCodeProdText() + "','" + date + "')";
            if (result == 0) {
                Application.getDB().executeUpdate(query);
                lc.AffichageData(requeteLivraisonAll, table);
                Reinitialiser();
            } else {
                codeFourText.setBackground(Color.WHITE);
                codeProdText.setBackground(Color.WHITE);
                dateLivText.setBackground(Color.WHITE);
            }
        }

    }//GEN-LAST:event_butAjoutMouseClicked

    private void butModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butModifMouseClicked
        if (!getCodeFourText().equals("")) {
            codeFourText.setBackground(Color.green);
        } else if (getCodeFourText().equals("")) {
            codeFourText.setBackground(Color.red);
        }
        if (!getCodeProdText().equals("")) {
            codeProdText.setBackground(Color.green);
        } else if (getCodeProdText().equals("")) {
            codeProdText.setBackground(Color.red);
        }
        if (getDateText() != null) {
            dateLivText.setBackground(Color.green);
        } else if (getDateText() == null) {
            dateLivText.setBackground(Color.red);
        }
        if (!getCodeFourText().equals("") && !getCodeProdText().equals("") && getDateText() != null) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la modification?", "Modification", choix, JOptionPane.WARNING_MESSAGE);
            SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
            String date = spf.format(getDateText());
            String query = "UPDATE  " + tableDB + " SET  codeFour='" + getCodeFourText() + "',  codeProd='" + getCodeProdText() + "', dateLivraison='" + date + "' WHERE  codeFour =" + getCodeFourText();
            if (result == 0) {
                Application.getDB().executeUpdate(query);
                lc.AffichageData(requeteLivraisonAll, table);
                Reinitialiser();
            }
        } else {
            codeFourText.setBackground(Color.WHITE);
            codeProdText.setBackground(Color.WHITE);
            dateLivText.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_butModifMouseClicked

    private void butSuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSuppMouseClicked
        if (!getCodeFourText().equals("")) {
            codeFourText.setBackground(Color.green);
        } else if (getCodeFourText().equals("")) {
            codeFourText.setBackground(Color.red);
        }
        if (!getCodeFourText().equals("") && !getCodeProdText().equals("") && getDateText() != null) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la suppression?", "Suppresion", choix, JOptionPane.WARNING_MESSAGE);
            String query2 = "DELETE FROM  " + tableDB + "  WHERE codeFour = " + getCodeFourText();
            if (result == 0) {
                Application.getDB().executeUpdate(query2);
                lc.AffichageData(requeteLivraisonAll, table);
                Reinitialiser();
            }
        } else {
            codeFourText.setBackground(Color.WHITE);
            codeProdText.setBackground(Color.WHITE);
            dateLivText.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_butSuppMouseClicked

    private void butActuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butActuMouseClicked
        lc.AffichageData(requeteLivraisonAll, table);
    }//GEN-LAST:event_butActuMouseClicked

    private void butRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butRechercheMouseClicked
        String requeteLivraisonRecher;
        String codeF = "codeFour";
        String codeP = "codeProd";
        String date = "dateLivraison";
        if (getRechercherText().length() > 0 || dateRecherche.getDate() != null) {
            if (radioCodeFour.isSelected() == true && textRechercher.isEnabled()) {
                requeteLivraisonRecher = "Select * from " + tableDB + " where " + codeF + " LIKE '%" + getRechercherText() + "%'";
                lc.AffichageData(requeteLivraisonRecher, table);
            }
            if (radioCodeProd.isSelected() == true && textRechercher.isEnabled()) {
                requeteLivraisonRecher = "Select * from " + tableDB + " where " + codeP + " LIKE '%" + getRechercherText() + "%'";
                lc.AffichageData(requeteLivraisonRecher, table);
            }
            if (radioDateLiv.isSelected() == true && dateRecherche.isEnabled()) {
                SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
                String dateF = spf.format(dateRecherche.getDate());
                requeteLivraisonRecher = "Select * from " + tableDB + " where " + date + "='" + dateF + "'";
                lc.AffichageData(requeteLivraisonRecher, table);
            }

        } else {
            textRechercher.setBackground(Color.red);
        }
    }//GEN-LAST:event_butRechercheMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Reinitialiser();
        int i = table.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        codeFourText.setText(mode.getValueAt(i, 0).toString());
        codeProdText.setText(mode.getValueAt(i, 1).toString());
        dateLivText.setDate((Date) mode.getValueAt(i, 2));
    }//GEN-LAST:event_tableMouseClicked

    private void radioCodeFourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioCodeFourFocusGained
        textRechercher.setEnabled(true);
        dateRecherche.setEnabled(false);
    }//GEN-LAST:event_radioCodeFourFocusGained

    private void radioCodeProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioCodeProdMouseClicked
        textRechercher.setEnabled(true);
        dateRecherche.setEnabled(false);
    }//GEN-LAST:event_radioCodeProdMouseClicked

    private void radioDateLivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDateLivMouseClicked
        dateRecherche.setEnabled(true);
        textRechercher.setEnabled(false);
    }//GEN-LAST:event_radioDateLivMouseClicked

    private void textRechercherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRechercherKeyTyped
        int limit = 3;
        if (textRechercher.getText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP uniquement les numeros ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_textRechercherKeyTyped

    private void textRechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRechercherMouseClicked
        textRechercher.setBackground(Color.white);
    }//GEN-LAST:event_textRechercherMouseClicked

    private void codeFourTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeFourTextKeyTyped
        int limit = 3;
        if (getCodeFourText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP uniquement les numeros ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_codeFourTextKeyTyped

    private void codeProdTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeProdTextKeyTyped
        int limit = 3;
        if (getCodeProdText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP uniquement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_codeProdTextKeyTyped

    private void codeFourTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeFourTextMouseClicked
        codeFourText.setBackground(Color.WHITE);
    }//GEN-LAST:event_codeFourTextMouseClicked

    private void codeProdTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeProdTextMouseClicked
        codeProdText.setBackground(Color.WHITE);
    }//GEN-LAST:event_codeProdTextMouseClicked

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
            WritableSheet mySheet = myexcel.createSheet("Feuille des Livraisons", 0);
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
            Logger.getLogger(GesCom_Livraison.class.getName()).log(Level.SEVERE, null, ex);
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

    //lES METHODES
    //les getteur
    public String getCodeFourText() {
        return codeFourText.getText();
    }

    public String getCodeProdText() {
        return codeProdText.getText();
    }

    public Date getDateText() {
        return dateLivText.getDate();
    }

    public String getRechercherText() {
        return textRechercher.getText();
    }

    //Reinitialisation
    public void Reinitialiser() {
        codeFourText.setText("");
        codeProdText.setText("");
        dateLivText.setDate(null);
        codeFourText.setBackground(Color.WHITE);
        codeProdText.setBackground(Color.WHITE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulaire;
    private javax.swing.JLabel back;
    private javax.swing.JButton butActu;
    private javax.swing.JButton butAjout;
    private javax.swing.JButton butExportation;
    private javax.swing.JButton butModif;
    private javax.swing.JButton butRecherche;
    private javax.swing.JButton butSupp;
    private javax.swing.JButton butVisual;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codeFourText;
    private javax.swing.JTextField codeProdText;
    private com.toedter.calendar.JDateChooser dateLivText;
    private com.toedter.calendar.JDateChooser dateRecherche;
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
    private javax.swing.JRadioButton radioCodeFour;
    private javax.swing.JRadioButton radioCodeProd;
    private javax.swing.JRadioButton radioDateLiv;
    private javax.swing.JTable table;
    private javax.swing.JTextField textRechercher;
    // End of variables declaration//GEN-END:variables
}
