package Views;

import App.Application;
import Controller.CommandeController;
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

public final class GesCom_Commande extends javax.swing.JPanel {

    CommandeController cc = new CommandeController();
    String tableDB = "commande";
    String requeteCommandeAll = "Select * from " + tableDB;

    public GesCom_Commande() {
        initComponents();
        cc.AffichageData(requeteCommandeAll, table);
        cc.rempliSelect(comboClient);
        entete_pan.setBackground(new Color(0, 0, 0, 200));
        Formulaire.setBackground(new Color(0, 0, 0, 200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        totalPan = new javax.swing.JPanel();
        entete_pan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        Formulaire = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        butAjout = new javax.swing.JButton();
        butModif = new javax.swing.JButton();
        butSupp = new javax.swing.JButton();
        butAffich = new javax.swing.JButton();
        dateText = new com.toedter.calendar.JDateChooser();
        butExportation = new javax.swing.JButton();
        butVisual = new javax.swing.JButton();
        textRecherche = new javax.swing.JTextField();
        Rechercher = new javax.swing.JButton();
        radioCode = new javax.swing.JRadioButton();
        radioNumCli = new javax.swing.JRadioButton();
        radioDate = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        dateRecherche = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        comboClient = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        totalPan.setBackground(new java.awt.Color(51, 51, 51));
        totalPan.setPreferredSize(new java.awt.Dimension(1280, 707));
        totalPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete_pan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des Commandes");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Back_50px.png"))); // NOI18N
        back.setToolTipText("Page Client");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Forward_50px_1.png"))); // NOI18N
        next.setToolTipText("Page Produit");
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
            .addComponent(next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(entete_panLayout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        totalPan.add(entete_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 120));

        Formulaire.setBackground(new java.awt.Color(0, 0, 0));
        Formulaire.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Code");
        Formulaire.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 121, 23));

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
        Formulaire.add(codeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 19, 266, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        Formulaire.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 121, 23));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Client");
        Formulaire.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 121, 23));

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
        Formulaire.add(butAjout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

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
        Formulaire.add(butModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

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
        Formulaire.add(butSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

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
        Formulaire.add(butAffich, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        dateText.setBackground(new java.awt.Color(51, 51, 51));
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setDateFormatString("d-MM-yyyy");
        dateText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateText.setMinSelectableDate(new java.util.Date(1514764888000L));
        Formulaire.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 266, 30));

        butExportation.setBackground(new java.awt.Color(51, 51, 51));
        butExportation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butExportation.setForeground(new java.awt.Color(255, 255, 255));
        butExportation.setText("Exporter les Commandes de la journée sous Excel");
        butExportation.setToolTipText("");
        butExportation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExportation.setFocusPainted(false);
        butExportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExportationMouseClicked(evt);
            }
        });
        Formulaire.add(butExportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 420, 40));

        butVisual.setBackground(new java.awt.Color(51, 51, 51));
        butVisual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butVisual.setForeground(new java.awt.Color(255, 255, 255));
        butVisual.setText("Visualiser les Commandes d'une journée");
        butVisual.setToolTipText("");
        butVisual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVisual.setFocusPainted(false);
        butVisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butVisualMouseClicked(evt);
            }
        });
        Formulaire.add(butVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 420, 40));

        textRecherche.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        Formulaire.add(textRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 373, 30));

        Rechercher.setBackground(new java.awt.Color(51, 51, 51));
        Rechercher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Rechercher.setText("Rechercher");
        Rechercher.setFocusPainted(false);
        Rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechercherMouseClicked(evt);
            }
        });
        Formulaire.add(Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, -1));

        buttonGroup1.add(radioCode);
        radioCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioCode.setForeground(new java.awt.Color(51, 51, 51));
        radioCode.setSelected(true);
        radioCode.setText("Code");
        radioCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioCodeFocusGained(evt);
            }
        });
        radioCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioCodeMouseClicked(evt);
            }
        });
        Formulaire.add(radioCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        buttonGroup1.add(radioNumCli);
        radioNumCli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioNumCli.setForeground(new java.awt.Color(51, 51, 51));
        radioNumCli.setText("Numero du Client");
        radioNumCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioNumCliFocusGained(evt);
            }
        });
        Formulaire.add(radioNumCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        buttonGroup1.add(radioDate);
        radioDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioDate.setForeground(new java.awt.Color(51, 51, 51));
        radioDate.setText("Date");
        radioDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radioDateFocusGained(evt);
            }
        });
        Formulaire.add(radioDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rechercher par :");
        Formulaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        dateRecherche.setDateFormatString("yyyy-MM-dd");
        Formulaire.add(dateRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, 221, 30));

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
                "Code", "Date", "Numero Client"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
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

        Formulaire.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 778, 348));

        comboClient.setMaximumRowCount(10);
        comboClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selectionner un client" }));
        comboClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientActionPerformed(evt);
            }
        });
        Formulaire.add(comboClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 266, 30));

        totalPan.add(Formulaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 590));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        totalPan.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1280, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(totalPan, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(totalPan, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        GesCom_Menu.cli.setSize(1280, 707);
        GesCom_Menu.cli.setVisible(true);
        GesCom_Menu.prod.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.cli);
    }//GEN-LAST:event_backMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        GesCom_Menu.prod.setSize(1280, 707);
        GesCom_Menu.prod.setVisible(true);
        GesCom_Menu.cli.setVisible(false);
        GesCom_Menu.com.setVisible(false);
        GesCom_Menu.liv.setVisible(false);
        GesCom_Menu.ref.setVisible(false);
        GesCom_Menu.four.setVisible(false);
        GesCom_Menu.fact.setVisible(false);
        GesCom_Menu.menuPanel.add(GesCom_Menu.prod);
    }//GEN-LAST:event_nextMouseClicked

    private void butAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAjoutMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }
        if (getDateText() != null) {
            dateText.setBackground(Color.green);
        } else if (getDateText() == null) {
            dateText.setBackground(Color.red);
        }
        if (comboClient.getSelectedIndex() != 0) {
            comboClient.setBackground(Color.green);
        } else if (comboClient.getSelectedIndex() == 0) {
            comboClient.setBackground(Color.red);
        }
        if (!getCodeText().equals("") && getDateText() != null && comboClient.getSelectedIndex() != 0) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous Ajouter cet element?", "Ajout", choix, JOptionPane.WARNING_MESSAGE);
            SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
            String date = spf.format(getDateText());
            String query = "INSERT INTO " + tableDB + "  VALUES ('" + getCodeText() + "','" + date + "'," + comboClient.getSelectedIndex() + ")";
            if (result == 0) {
                Application.getDB().executeUpdate(query);
                cc.AffichageData(requeteCommandeAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                dateText.setBackground(Color.WHITE);
                comboClient.setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_butAjoutMouseClicked

    private void butModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butModifMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }
        if (getDateText() != null) {
            dateText.setBackground(Color.green);
        } else if (getDateText() == null) {
            dateText.setBackground(Color.red);
        }
        if (comboClient.getSelectedIndex() != 0) {
            comboClient.setBackground(Color.green);
        } else if (comboClient.getSelectedIndex() == 0) {
            comboClient.setBackground(Color.red);
        }
        if (!getCodeText().equals("") && getDateText() != null && comboClient.getSelectedIndex() != 0) {
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer la modification?", "Modification", choix, JOptionPane.WARNING_MESSAGE);
            SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
            String date = spf.format(getDateText());
            String query = "UPDATE  " + tableDB + " SET  codeCom='" + getCodeText() + "',dateCom='" + date + "',  codeCli='" + comboClient.getSelectedIndex() + "' WHERE  codeCom =" + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query);
                cc.AffichageData(requeteCommandeAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                dateText.setBackground(Color.WHITE);
                comboClient.setBackground(Color.WHITE);
            }
        }

    }//GEN-LAST:event_butModifMouseClicked

    private void butSuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSuppMouseClicked
        if (!getCodeText().equals("")) {
            codeText.setBackground(Color.green);
            int choix = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirmer Annulation de cette commande?", "Annulation", choix, JOptionPane.WARNING_MESSAGE);
            String query2 = "DELETE FROM  " + tableDB + "  WHERE codeCom = " + getCodeText();
            if (result == 0) {
                Application.getDB().executeUpdate(query2);
                cc.AffichageData(requeteCommandeAll, table);
                Reinitialiser();
            } else {
                codeText.setBackground(Color.WHITE);
                dateText.setBackground(Color.WHITE);
                comboClient.setBackground(Color.WHITE);
            }
        } else if (getCodeText().equals("")) {
            codeText.setBackground(Color.red);
        }

    }//GEN-LAST:event_butSuppMouseClicked

    private void butAffichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAffichMouseClicked
        cc.AffichageData(requeteCommandeAll, table);
    }//GEN-LAST:event_butAffichMouseClicked

    private void RechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercherMouseClicked
        String requeteCommandeRecher;
        String code = "codeCom";
        String date = "dateCom";
        String codeCli = "codeCli";
        if (getRechercherText().length() > 0 || dateRecherche.getDate() != null) {
            if (radioCode.isSelected() == true && textRecherche.isEnabled()) {
                requeteCommandeRecher = "Select * from " + tableDB + " where " + code + " LIKE '%" + getRechercherText() + "%'";
                cc.AffichageData(requeteCommandeRecher, table);
            }
            if (radioNumCli.isSelected() == true && textRecherche.isEnabled()) {
                requeteCommandeRecher = "Select * from " + tableDB + " where " + codeCli + " LIKE '%" + getRechercherText() + "%'";
                cc.AffichageData(requeteCommandeRecher, table);
            }
            if (radioDate.isSelected() == true && dateRecherche.isEnabled()) {
                SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
                String dateF = spf.format(dateRecherche.getDate());
                requeteCommandeRecher = "Select * from " + tableDB + " where " + date + "='" + dateF + "'";
                cc.AffichageData(requeteCommandeRecher, table);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saisir les informations a rechercher", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RechercherMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Reinitialiser();
        int i = table.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
        codeText.setText(mode.getValueAt(i, 0).toString());
        dateText.setDate((Date) mode.getValueAt(i, 1));
        comboClient.setSelectedIndex((int) mode.getValueAt(i, 2));
    }//GEN-LAST:event_tableMouseClicked

    private void radioCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioCodeMouseClicked


    }//GEN-LAST:event_radioCodeMouseClicked

    private void radioCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioCodeFocusGained
        textRecherche.setEnabled(true);
        dateRecherche.setEnabled(false);
    }//GEN-LAST:event_radioCodeFocusGained

    private void radioDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioDateFocusGained
        dateRecherche.setEnabled(true);
        textRecherche.setEnabled(false);
    }//GEN-LAST:event_radioDateFocusGained

    private void radioNumCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radioNumCliFocusGained
        textRecherche.setEnabled(true);
        dateRecherche.setEnabled(false);
    }//GEN-LAST:event_radioNumCliFocusGained

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
            WritableSheet mySheet = myexcel.createSheet("Feuille des Commandes", 0);
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

    private void textRechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRechercheKeyTyped
        int limit = 3;
        if (textRecherche.getText().length() == limit) {
            evt.consume();
        }
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP uniquement les numeors ", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_textRechercheKeyTyped

    private void textRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRechercheMouseClicked
        textRecherche.setBackground(Color.white);
    }//GEN-LAST:event_textRechercheMouseClicked

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

    private void codeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeTextMouseClicked
        codeText.setBackground(Color.WHITE);
    }//GEN-LAST:event_codeTextMouseClicked

    private void comboClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientActionPerformed
        System.out.println(comboClient.getSelectedIndex() + " = " + comboClient.getSelectedItem().toString());
        comboClient.setBackground(Color.white);
    }//GEN-LAST:event_comboClientActionPerformed
    //les Methodes 

    //les getteur
    public String getCodeText() {
        return codeText.getText();
    }

    public Date getDateText() {
        return dateText.getDate();
    }

    public String getNumeroCliText() {
        return "" + comboClient.getSelectedItem();
    }

    public String getRechercherText() {
        return textRecherche.getText();
    }

    //Reinitialisation
    public void Reinitialiser() {
        codeText.setText("");
        dateText.setDate(null);
        comboClient.setSelectedIndex(0);
        codeText.setBackground(Color.WHITE);
        comboClient.setBackground(Color.WHITE);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulaire;
    private javax.swing.JButton Rechercher;
    private javax.swing.JLabel back;
    private javax.swing.JButton butAffich;
    private javax.swing.JButton butAjout;
    private javax.swing.JButton butExportation;
    private javax.swing.JButton butModif;
    private javax.swing.JButton butSupp;
    private javax.swing.JButton butVisual;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codeText;
    private javax.swing.JComboBox<String> comboClient;
    private com.toedter.calendar.JDateChooser dateRecherche;
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JPanel entete_pan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel next;
    private javax.swing.JRadioButton radioCode;
    private javax.swing.JRadioButton radioDate;
    private javax.swing.JRadioButton radioNumCli;
    private javax.swing.JTable table;
    private javax.swing.JTextField textRecherche;
    private javax.swing.JPanel totalPan;
    // End of variables declaration//GEN-END:variables
}
