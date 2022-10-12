package Views;

import Controller.LoginController;
import Models.Users;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MINE
 */
public class GesCom_SignUp extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public GesCom_SignUp() {
        initComponents();
        overLay.setBackground(new Color(0, 0, 0, 200));
        Image IIcone;
        IIcone = getToolkit().getImage("src/LE_img/icons8_Cardboard_Box_50px.png");
        this.setIconImage(IIcone);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        overLay = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioSouvernir = new javax.swing.JRadioButton();
        buttonValid = new javax.swing.JButton();
        imgBackgroung = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Close_Window_48px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 24, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Cardboard_Box_50px.png"))); // NOI18N
        jLabel2.setText("LivreExpress");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        overLay.setBackground(new java.awt.Color(0, 0, 0));
        overLay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(57, 113, 130));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_User_38px.png"))); // NOI18N
        jLabel1.setText("Identifiant");
        overLay.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, -1));

        textId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textId.setForeground(new java.awt.Color(51, 51, 51));
        textId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textId.setBorder(null);
        textId.setCaretColor(new java.awt.Color(51, 51, 51));
        overLay.add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 329, 40));

        textPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textPassword.setForeground(new java.awt.Color(51, 51, 51));
        textPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textPassword.setBorder(null);
        textPassword.setCaretColor(new java.awt.Color(51, 51, 51));
        overLay.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 329, 40));

        jLabel5.setBackground(new java.awt.Color(57, 113, 130));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Password_36px.png"))); // NOI18N
        jLabel5.setText("Mot de Passe");
        overLay.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Gestion de commandes");
        overLay.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        radioSouvernir.setBackground(new java.awt.Color(255, 255, 255));
        radioSouvernir.setForeground(new java.awt.Color(53, 53, 53));
        radioSouvernir.setText("Se souvenir de moi");
        overLay.add(radioSouvernir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        buttonValid.setBackground(new java.awt.Color(102, 102, 255));
        buttonValid.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        buttonValid.setForeground(new java.awt.Color(255, 255, 255));
        buttonValid.setText("Valider");
        buttonValid.setBorderPainted(false);
        buttonValid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonValid.setFocusPainted(false);
        buttonValid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonValidMouseClicked(evt);
            }
        });
        buttonValid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonValidActionPerformed(evt);
            }
        });
        overLay.add(buttonValid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 329, 54));

        jPanel2.add(overLay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 440));

        imgBackgroung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        imgBackgroung.setText("jLabel3");
        jPanel2.add(imgBackgroung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter?", "Quitter", dialog, JOptionPane.WARNING_MESSAGE);
        if (result == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(WIDTH);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void buttonValidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonValidMouseClicked
        if (connexion(textId, textPassword,radioSouvernir.isSelected())) {
            this.dispose();
            GesCom_Menu menu = new GesCom_Menu();
            menu.setVisible(true);
        }
    }//GEN-LAST:event_buttonValidMouseClicked

    private void buttonValidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonValidActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed
    private boolean connexion(JTextField login, JPasswordField password , boolean  souvenir) {
        boolean returnCon = false;
        if (!login.getText().isEmpty() && !password.getText().isEmpty()) {
            Users user = new Users(login.getText(), password.getText());
            LoginController ensc = new LoginController();
            int resulat = ensc.checkLogin(user, souvenir);
            switch (resulat) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Connexion éffectuée");
                    returnCon = true;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ce login n'existe pas");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Votre mot de passe est incorrect");
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez renseigner tous les champs");
        }
        return returnCon;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GesCom_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GesCom_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GesCom_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GesCom_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GesCom_SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buttonValid;
    private javax.swing.JLabel imgBackgroung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel overLay;
    private javax.swing.JRadioButton radioSouvernir;
    private javax.swing.JTextField textId;
    private javax.swing.JPasswordField textPassword;
    // End of variables declaration//GEN-END:variables
}
