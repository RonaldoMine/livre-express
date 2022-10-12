package Views;

import java.awt.Color;
import java.awt.Image;

/**
 *
 * @author MINE
 */
public class Launcher_GesCom extends javax.swing.JFrame {

    public Launcher_GesCom() {
        initComponents();
        panel.setBackground(new Color(0, 0, 0, 200));
        Image IIcone;
        IIcone = getToolkit().getImage("src/LE_img/icons8_Cardboard_Box_50px.png");
        this.setIconImage(IIcone);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        labText = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Cardboard_Box_50px.png"))); // NOI18N
        jLabel2.setText("LivreExpress");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 400, 60));

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setForeground(new java.awt.Color(102, 102, 102));
        progressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        progressBar.setBorderPainted(false);
        progressBar.setEnabled(false);
        progressBar.setFocusable(false);
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 570, 10));

        labText.setBackground(new java.awt.Color(51, 51, 51));
        labText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labText.setForeground(new java.awt.Color(255, 255, 255));
        labText.setText("Chargement des fichiers....");
        jPanel1.add(labText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 460, 20));

        panel.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 470, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 320));

        setSize(new java.awt.Dimension(465, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher_GesCom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labText;
    private javax.swing.JPanel panel;
    public javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
