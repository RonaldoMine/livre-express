package Views;

import App.Application;
import javax.swing.JOptionPane;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GesCom_Menu extends javax.swing.JFrame {

    public static GesCom_Client cli = new GesCom_Client();
    public static GesCom_Commande com = new GesCom_Commande();
    public static GesCom_Produit prod = new GesCom_Produit();
    public static GesCom_Reference ref = new GesCom_Reference();
    public static GesCom_Fournisseur four = new GesCom_Fournisseur();
    public static GesCom_Livraison liv = new GesCom_Livraison();
    public static GesCom_Facture fact = new GesCom_Facture();
    public static GesCom_About about = new GesCom_About();

    public GesCom_Menu() {
        initComponents();
        nomUser.setText(Application.getDU().getNom() + ", " + Application.getDU().getAdmin());
        backpan.setBackground(new Color(0, 0, 0, 200));
        Image IIcone;
        IIcone = getToolkit().getImage("src/LE_img/icons8_Cardboard_Box_50px.png");
        this.setIconImage(IIcone);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        panBackgroung.setBackground(new Color(0, 0, 0, 200));
        panCli.setBackground(new Color(0, 0, 0, 200));
        panCom.setBackground(new Color(0, 0, 0, 200));
        panProd.setBackground(new Color(0, 0, 0, 200));
        panRef.setBackground(new Color(0, 0, 0, 200));
        panFour.setBackground(new Color(0, 0, 0, 200));
        panFour.setBackground(new Color(0, 0, 0, 200));
        panLiv.setBackground(new Color(0, 0, 0, 200));
        panFact.setBackground(new Color(0, 0, 0, 200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entetePan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labReduire = new javax.swing.JLabel();
        labFermer = new javax.swing.JLabel();
        backpan = new javax.swing.JPanel();
        nomUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        panBackgroung = new javax.swing.JPanel();
        panProd = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panLiv = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panFour = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panCom = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panRef = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panCli = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panFact = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        imgBackgroung = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        slideShow = new javax.swing.JLabel();
        labCli = new javax.swing.JLabel();
        labCom = new javax.swing.JLabel();
        labProd = new javax.swing.JLabel();
        labRef = new javax.swing.JLabel();
        labFact = new javax.swing.JLabel();
        labFour = new javax.swing.JLabel();
        labLiv = new javax.swing.JLabel();
        labAc = new javax.swing.JLabel();
        labAbout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        entetePan.setBackground(new java.awt.Color(0, 0, 0));
        entetePan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Cardboard_Box_50px.png"))); // NOI18N
        jLabel2.setText("LivreExpress");
        entetePan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 49));

        labReduire.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        labReduire.setForeground(new java.awt.Color(255, 255, 255));
        labReduire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labReduire.setText("-");
        labReduire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labReduire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labReduireMouseClicked(evt);
            }
        });
        entetePan.add(labReduire, new org.netbeans.lib.awtextra.AbsoluteConstraints(1206, 0, 20, 41));

        labFermer.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        labFermer.setForeground(new java.awt.Color(255, 255, 255));
        labFermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Close_Window_48px.png"))); // NOI18N
        labFermer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labFermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labFermerMouseClicked(evt);
            }
        });
        entetePan.add(labFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1232, 0, -1, -1));

        backpan.setBackground(new java.awt.Color(0, 0, 0));
        backpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomUser.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        nomUser.setForeground(new java.awt.Color(255, 255, 255));
        nomUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Male_User_32px.png"))); // NOI18N
        nomUser.setText("Nom de l'utilisaeur");
        backpan.add(nomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 6, 460, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Sign_Out_32px.png"))); // NOI18N
        jLabel7.setToolTipText("Se déconnecter");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        backpan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, 30));

        entetePan.add(backpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        entetePan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 50));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panBackgroung.setBackground(new java.awt.Color(0, 0, 0));
        panBackgroung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panProd.setBackground(new java.awt.Color(51, 51, 51));
        panProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panProd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panProdMouseMoved(evt);
            }
        });
        panProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panProdMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panProdMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PRODUIT");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Buying_48px_1.png"))); // NOI18N

        javax.swing.GroupLayout panProdLayout = new javax.swing.GroupLayout(panProd);
        panProd.setLayout(panProdLayout);
        panProdLayout.setHorizontalGroup(
            panProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProdLayout.createSequentialGroup()
                .addGroup(panProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProdLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panProdLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panProdLayout.setVerticalGroup(
            panProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(37, 37, 37))
        );

        panBackgroung.add(panProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, 180));

        panLiv.setBackground(new java.awt.Color(51, 51, 51));
        panLiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panLiv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panLivMouseMoved(evt);
            }
        });
        panLiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panLivMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panLivMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("LIVRAISON");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Delivery_50px.png"))); // NOI18N

        javax.swing.GroupLayout panLivLayout = new javax.swing.GroupLayout(panLiv);
        panLiv.setLayout(panLivLayout);
        panLivLayout.setHorizontalGroup(
            panLivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLivLayout.createSequentialGroup()
                .addGroup(panLivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLivLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panLivLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panLivLayout.setVerticalGroup(
            panLivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLivLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addGap(35, 35, 35))
        );

        panBackgroung.add(panLiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, -1, 190));

        panFour.setBackground(new java.awt.Color(51, 51, 51));
        panFour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panFour.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panFourMouseMoved(evt);
            }
        });
        panFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panFourMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panFourMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("FOURNISSEUR");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Supplier_50px.png"))); // NOI18N

        javax.swing.GroupLayout panFourLayout = new javax.swing.GroupLayout(panFour);
        panFour.setLayout(panFourLayout);
        panFourLayout.setHorizontalGroup(
            panFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFourLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel15))
            .addGroup(panFourLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panFourLayout.setVerticalGroup(
            panFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFourLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addGap(38, 38, 38))
        );

        panBackgroung.add(panFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 190));

        panCom.setBackground(new java.awt.Color(51, 51, 51));
        panCom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panCom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panComMouseMoved(evt);
            }
        });
        panCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panComMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panComMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("COMMANDE");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Move_Stock_50px.png"))); // NOI18N

        javax.swing.GroupLayout panComLayout = new javax.swing.GroupLayout(panCom);
        panCom.setLayout(panComLayout);
        panComLayout.setHorizontalGroup(
            panComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panComLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panComLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        panComLayout.setVerticalGroup(
            panComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panComLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(38, 38, 38))
        );

        panBackgroung.add(panCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 250, 190));

        panRef.setBackground(new java.awt.Color(51, 51, 51));
        panRef.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panRef.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panRefMouseMoved(evt);
            }
        });
        panRef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panRefMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panRefMouseExited(evt);
            }
        });
        panRef.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("REFERENCE");
        panRef.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Change_User_64px.png"))); // NOI18N
        panRef.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, -1));

        panBackgroung.add(panRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 240, 190));

        panCli.setBackground(new java.awt.Color(51, 51, 51));
        panCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panCli.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panCliMouseMoved(evt);
            }
        });
        panCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panCliMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panCliMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CLIENT");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_User_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout panCliLayout = new javax.swing.GroupLayout(panCli);
        panCli.setLayout(panCliLayout);
        panCliLayout.setHorizontalGroup(
            panCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCliLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        panCliLayout.setVerticalGroup(
            panCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCliLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(37, 37, 37))
        );

        panBackgroung.add(panCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 190));

        panFact.setBackground(new java.awt.Color(51, 51, 51));
        panFact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panFact.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panFactMouseMoved(evt);
            }
        });
        panFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panFactMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panFactMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("FACTURE");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Money_50px_1.png"))); // NOI18N

        javax.swing.GroupLayout panFactLayout = new javax.swing.GroupLayout(panFact);
        panFact.setLayout(panFactLayout);
        panFactLayout.setHorizontalGroup(
            panFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFactLayout.createSequentialGroup()
                .addGroup(panFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFactLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17))
                    .addGroup(panFactLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panFactLayout.setVerticalGroup(
            panFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFactLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(37, 37, 37)
                .addComponent(jLabel17)
                .addGap(26, 26, 26))
        );

        panBackgroung.add(panFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 250, 190));

        menuPanel.add(panBackgroung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        imgBackgroung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/milky-way-2695569_1280.jpg"))); // NOI18N
        menuPanel.add(imgBackgroung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1290, 710));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slideShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slideShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Menu_32px.png"))); // NOI18N
        slideShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slideShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slideShowMouseClicked(evt);
            }
        });
        jPanel4.add(slideShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        labCli.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labCli.setText("Client");
        labCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCliMouseClicked(evt);
            }
        });
        jPanel4.add(labCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 70, 40));

        labCom.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labCom.setText("Commande");
        labCom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labComMouseClicked(evt);
            }
        });
        jPanel4.add(labCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 130, 40));

        labProd.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labProd.setText("Produit");
        labProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labProdMouseClicked(evt);
            }
        });
        jPanel4.add(labProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 80, 40));

        labRef.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labRef.setText("Reference");
        labRef.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labRef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labRefMouseClicked(evt);
            }
        });
        jPanel4.add(labRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 110, 40));

        labFact.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labFact.setText("Facture");
        labFact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labFactMouseClicked(evt);
            }
        });
        jPanel4.add(labFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 80, 40));

        labFour.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labFour.setText("Fournisseur");
        labFour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labFourMouseClicked(evt);
            }
        });
        jPanel4.add(labFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 130, 40));

        labLiv.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labLiv.setText("Livraison");
        labLiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labLiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labLivMouseClicked(evt);
            }
        });
        jPanel4.add(labLiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 100, 40));

        labAc.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LE_img/icons8_Home_48px_1.png"))); // NOI18N
        labAc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labAc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labAcMouseMoved(evt);
            }
        });
        labAc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labAcMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labAcMouseExited(evt);
            }
        });
        jPanel4.add(labAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 50, 40));

        labAbout.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labAbout.setText("About");
        labAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labAboutMouseClicked(evt);
            }
        });
        jPanel4.add(labAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(entetePan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(entetePan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1280, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labReduireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labReduireMouseClicked
        this.setState(WIDTH);
    }//GEN-LAST:event_labReduireMouseClicked

    private void labFermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labFermerMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter?", "Quitter", dialog, JOptionPane.WARNING_MESSAGE);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_labFermerMouseClicked

    private void slideShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideShowMouseClicked
        AnimationClass anim = new AnimationClass();
        //animation du label Acceuil
        anim.jLabelYDown(-90, 0, 35, 3, labAc);
        anim.jLabelYUp(0, -90, 35, 3, labAc);

        AnimationClass animC = new AnimationClass();
        //animation du label Client
        animC.jLabelYDown(-90, 0, 30, 3, labCli);
        animC.jLabelYUp(0, -90, 30, 3, labCli);

        AnimationClass animCo = new AnimationClass();
        //animation du label Commande
        animCo.jLabelYDown(-90, 0, 25, 3, labCom);
        animCo.jLabelYUp(0, -90, 25, 3, labCom);

        AnimationClass animP = new AnimationClass();
        //animation du label Produit
        animP.jLabelYDown(-90, 0, 20, 3, labProd);
        animP.jLabelYUp(0, -90, 20, 3, labProd);

        AnimationClass animR = new AnimationClass();
        //animation du label Reference
        animR.jLabelYDown(-90, 0, 15, 3, labRef);
        animR.jLabelYUp(0, -90, 15, 3, labRef);

        AnimationClass animF = new AnimationClass();
        //animation du label Fournisseur
        animF.jLabelYDown(-90, 0, 10, 3, labFour);
        animF.jLabelYUp(0, -90, 10, 3, labFour);

        AnimationClass animL = new AnimationClass();
        //animation du label Livraison
        animL.jLabelYDown(-90, 0, 5, 3, labLiv);
        animL.jLabelYUp(0, -90, 5, 3, labLiv);

        AnimationClass animFac = new AnimationClass();
        //animation du label Facture
        animFac.jLabelYDown(-90, 0, 3, 3, labFact);
        animFac.jLabelYUp(0, -90, 3, 3, labFact);

        AnimationClass animAbout = new AnimationClass();
        //animation du label Facture
        animAbout.jLabelYDown(-90, 0, 2, 3, labAbout);
        animAbout.jLabelYUp(0, -90, 2, 3, labAbout);

    }//GEN-LAST:event_slideShowMouseClicked

    private void labAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAcMouseClicked
        Visibilite(true);
        menuPanel.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);

    }//GEN-LAST:event_labAcMouseClicked

    private void panCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panCliMouseClicked
        Visibilite(false);
        cli.setSize(1280, 707);
        cli.setVisible(true);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(cli);
    }//GEN-LAST:event_panCliMouseClicked

    private void labCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCliMouseClicked
        Visibilite(false);
        cli.setSize(1280, 707);
        cli.setVisible(true);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(cli);
    }//GEN-LAST:event_labCliMouseClicked

    private void labComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labComMouseClicked
        Visibilite(false);
        com.setSize(1280, 707);
        com.setVisible(true);
        cli.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(com);
    }//GEN-LAST:event_labComMouseClicked

    private void panComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panComMouseClicked
        Visibilite(false);
        com.setSize(1280, 707);
        com.setVisible(true);
        cli.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(com);
    }//GEN-LAST:event_panComMouseClicked

    private void panProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panProdMouseClicked
        Visibilite(false);
        prod.setSize(1280, 707);
        prod.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(prod);
    }//GEN-LAST:event_panProdMouseClicked

    private void labProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labProdMouseClicked
        Visibilite(false);
        prod.setSize(1280, 707);
        prod.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(prod);
    }//GEN-LAST:event_labProdMouseClicked

    private void labRefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labRefMouseClicked
        Visibilite(false);
        ref.setSize(1280, 707);
        ref.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(ref);
    }//GEN-LAST:event_labRefMouseClicked

    private void panFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panFourMouseClicked
        Visibilite(false);
        four.setSize(1280, 707);
        four.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(four);
    }//GEN-LAST:event_panFourMouseClicked

    private void labFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labFourMouseClicked
        Visibilite(false);
        four.setSize(1280, 707);
        four.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(four);
    }//GEN-LAST:event_labFourMouseClicked

    private void panLivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panLivMouseClicked
        Visibilite(false);
        liv.setSize(1280, 707);
        liv.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(liv);
    }//GEN-LAST:event_panLivMouseClicked

    private void labLivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLivMouseClicked
        Visibilite(false);
        liv.setSize(1280, 707);
        liv.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(liv);
    }//GEN-LAST:event_labLivMouseClicked

    private void panFactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panFactMouseClicked
        Visibilite(false);
        fact.setSize(1280, 707);
        fact.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        menuPanel.add(fact);
    }//GEN-LAST:event_panFactMouseClicked

    private void labFactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labFactMouseClicked
        Visibilite(false);
        fact.setSize(1280, 707);
        fact.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        ref.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        menuPanel.add(fact);
    }//GEN-LAST:event_labFactMouseClicked

    private void panRefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panRefMouseClicked
        Visibilite(false);
        ref.setSize(1280, 707);
        ref.setVisible(true);
        cli.setVisible(false);
        com.setVisible(false);
        prod.setVisible(false);
        four.setVisible(false);
        liv.setVisible(false);
        fact.setVisible(false);
        menuPanel.add(ref);
    }//GEN-LAST:event_panRefMouseClicked

    private void labAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAboutMouseClicked
        ImageIcon img = new ImageIcon("");
        JOptionPane.showMessageDialog(null, about, "About", 0, img);

    }//GEN-LAST:event_labAboutMouseClicked

    private void panCliMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panCliMouseMoved
        panCli.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_panCliMouseMoved

    private void panCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panCliMouseExited
        panCli.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_panCliMouseExited

    private void panComMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panComMouseMoved
        panCom.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_panComMouseMoved

    private void panComMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panComMouseExited
        panCom.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_panComMouseExited

    private void panRefMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panRefMouseMoved
        panRef.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_panRefMouseMoved

    private void panRefMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panRefMouseExited
        panRef.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_panRefMouseExited

    private void panFourMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panFourMouseMoved
        panFour.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_panFourMouseMoved

    private void panFourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panFourMouseExited
        panFour.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_panFourMouseExited

    private void panProdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panProdMouseMoved
        panProd.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_panProdMouseMoved

    private void panProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panProdMouseExited
        panProd.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_panProdMouseExited

    private void panLivMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panLivMouseMoved
        panLiv.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_panLivMouseMoved

    private void panLivMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panLivMouseExited
        panLiv.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_panLivMouseExited

    private void panFactMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panFactMouseMoved
        panFact.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_panFactMouseMoved

    private void panFactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panFactMouseExited
        panFact.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_panFactMouseExited

    private void labAcMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAcMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_labAcMouseMoved

    private void labAcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAcMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labAcMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Application.getDU().removeData();
        this.dispose();
        new GesCom_SignUp().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked
    public void Visibilite(boolean v) {
        panCli.setVisible(v);
        panCom.setVisible(v);
        panRef.setVisible(v);
        panFour.setVisible(v);
        panLiv.setVisible(v);
        panProd.setVisible(v);
        panFact.setVisible(v);
        panBackgroung.setVisible(v);
        imgBackgroung.setVisible(v);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GesCom_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new GesCom_Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backpan;
    private javax.swing.JPanel entetePan;
    protected static javax.swing.JLabel imgBackgroung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labAbout;
    private javax.swing.JLabel labAc;
    private javax.swing.JLabel labCli;
    private javax.swing.JLabel labCom;
    private javax.swing.JLabel labFact;
    private javax.swing.JLabel labFermer;
    private javax.swing.JLabel labFour;
    private javax.swing.JLabel labLiv;
    private javax.swing.JLabel labProd;
    private javax.swing.JLabel labReduire;
    private javax.swing.JLabel labRef;
    protected static javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nomUser;
    protected static javax.swing.JPanel panBackgroung;
    protected static javax.swing.JPanel panCli;
    protected static javax.swing.JPanel panCom;
    protected static javax.swing.JPanel panFact;
    protected static javax.swing.JPanel panFour;
    protected static javax.swing.JPanel panLiv;
    protected static javax.swing.JPanel panProd;
    protected static javax.swing.JPanel panRef;
    private javax.swing.JLabel slideShow;
    // End of variables declaration//GEN-END:variables
}
