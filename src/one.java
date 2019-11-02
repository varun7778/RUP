
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Varun Anusheel
 */
public class one extends javax.swing.JFrame {
public static int money=10000;
int type;
    /**
     * Creates new form one
     */
    public one() {
        initComponents();
        btn_1.setBackground(new Color(41,57,80));
        ind_1.setOpaque(true);
        //btn_4.setBackground(new Color(30,39,46));
        btn_2.setBackground(new Color(30,39,46));
        btn_3.setBackground(new Color(30,39,46));
        btn_5.setBackground(new Color(30,39,46));
        btn_6.setBackground(new Color(30,39,46));
        jLabel60.setVisible(false);
        jLabel61.setVisible(false);
        jLabel62.setVisible(false);
        jLabel59.setVisible(false);
        jLabel58.setVisible(false);
        jLabel64.setVisible(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_5.setOpaque(false);
        ind_6.setOpaque(false);
        jPanel9.setVisible(true);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jLayeredPane1.setVisible(false);
        jLabel65.setVisible(false);
        jLabel66.setVisible(false);
        jPanel16.setVisible(false);
        jPanel24.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel13 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel33 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel81 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel85 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Side_panel = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_5 = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btn_7 = new javax.swing.JPanel();
        ind_7 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Birch Std", 0, 80)); // NOI18N
        jLabel9.setText("RAILWAY BOOKINGS");

        jLabel10.setFont(new java.awt.Font("Birch Std", 0, 80)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("WELCOME TO ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel14MouseDragged(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 40, 50));

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel13.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 10, 20));

        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.setText("Peter England");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField3MousePressed(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, -1));

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField4.setText("Payment");
        jTextField4.setBorder(null);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField4MousePressed(evt);
            }
        });
        jPanel13.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, -1));

        jTextField11.setBackground(new java.awt.Color(240, 240, 240));
        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField11.setText("www.PeterEnglandtesting.com");
        jTextField11.setBorder(null);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField11MousePressed(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 270, 40));

        jTextField12.setBackground(new java.awt.Color(240, 240, 240));
        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField12.setText("This is just a brief description of the Ad that is being shown");
        jTextField12.setBorder(null);
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField12MouseReleased(evt);
            }
        });
        jPanel13.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 93, 370, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ads.png"))); // NOI18N
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 54, -1, 30));
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 50));

        jLayeredPane3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 520, 130));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        jLabel24.setText("BOOK");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel42.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel42.setText("Your Ticket");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jComboBox1.setMaximumRowCount(40);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To", "Item 2", "Item 3", "Item 4", "Item 5", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, -1));

        jComboBox2.setMaximumRowCount(40);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From", "Item 2", "Item 3", "Item 4", "Item 5", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Classes", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, -1));

        jCheckBox1.setBackground(new java.awt.Color(153, 204, 255));
        jCheckBox1.setText("Student");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(153, 204, 255));
        jCheckBox2.setText("Journalist");
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton2.setText("Find a Train");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 120, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/station.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jPanel4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 30));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jPanel4.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 174, -1, 30));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jPanel4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 30));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jPanel4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, 40));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 270, 230, -1));

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 300, 460));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 174, -1, -1));
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 68, -1, -1));

        jLabel43.setFont(new java.awt.Font("Painting With Chocolate", 0, 110)); // NOI18N
        jLabel43.setText("Booking");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 170));

        jLabel44.setFont(new java.awt.Font("Painting With Chocolate", 0, 110)); // NOI18N
        jLabel44.setText("Railway");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 150));

        jLayeredPane3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel70.setText("FEEL FREE TO");
        jPanel24.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 180, -1));

        jLabel71.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel71.setText("IF YOU");
        jPanel24.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 90, -1));

        jLabel72.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel72.setText("STILL HAVE ANY");
        jPanel24.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 230, -1));

        jLabel73.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel73.setText("QUERIES LEFT");
        jPanel24.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 180, -1));

        jButton3.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        jButton3.setText("CONTACT US");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel68MousePressed(evt);
            }
        });
        jPanel32.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel33.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 420, 80));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel67MousePressed(evt);
            }
        });
        jPanel31.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel33.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 420, 80));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel48MousePressed(evt);
            }
        });
        jPanel30.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel33.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 420, 80));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel69MousePressed(evt);
            }
        });
        jPanel29.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel33.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 420, 80));

        jLayeredPane2.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 610));

        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel74MousePressed(evt);
            }
        });
        jPanel35.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 420, 80));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel75MousePressed(evt);
            }
        });
        jPanel36.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel34.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 420, 80));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel37.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel78MousePressed(evt);
            }
        });
        jPanel37.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, -1));

        jPanel34.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 420, 230));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel77MousePressed(evt);
            }
        });
        jPanel38.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel34.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 420, 80));

        jLayeredPane2.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 610));

        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel79MousePressed(evt);
            }
        });
        jPanel40.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 420, 80));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel80MousePressed(evt);
            }
        });
        jPanel41.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel39.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 420, 80));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel42.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel81MousePressed(evt);
            }
        });
        jPanel42.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, -1));

        jPanel39.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 420, 230));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel82MousePressed(evt);
            }
        });
        jPanel43.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel39.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 420, 80));

        jLayeredPane2.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 610));

        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel83MousePressed(evt);
            }
        });
        jPanel45.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel44.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 420, 80));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel84MousePressed(evt);
            }
        });
        jPanel46.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel44.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 420, 80));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel47.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel85MousePressed(evt);
            }
        });
        jPanel47.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, -1));

        jPanel44.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 420, 230));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel86MousePressed(evt);
            }
        });
        jPanel48.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel44.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 420, 80));

        jLayeredPane2.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 610));

        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel87MousePressed(evt);
            }
        });
        jPanel50.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel49.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 420, 80));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel88MousePressed(evt);
            }
        });
        jPanel51.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel49.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 420, 80));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel52.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, -1));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel89MousePressed(evt);
            }
        });
        jPanel52.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, -1));

        jPanel49.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 420, 230));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel90MousePressed(evt);
            }
        });
        jPanel53.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 30, -1));

        jPanel49.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 420, 80));

        jLayeredPane2.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 610));

        jPanel24.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 610));

        jLayeredPane3.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Nueva Std", 0, 60)); // NOI18N
        jLabel28.setText("Current Balance:");
        jPanel15.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel50.setFont(new java.awt.Font("Nueva Std", 0, 60)); // NOI18N
        jLabel50.setText(money+"/-");
        jPanel15.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 40)); // NOI18N
        jButton1.setText("Add Money");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Nueva Std", 0, 36)); // NOI18N
        jLabel51.setText("Amount:");
        jPanel22.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 60));

        jTextField5.setFont(new java.awt.Font("Nueva Std", 0, 36)); // NOI18N
        jPanel22.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 260, -1));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel23MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel23MousePressed(evt);
            }
        });

        jLabel57.setText("3500");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel57)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, 40));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel27MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel27MousePressed(evt);
            }
        });

        jLabel55.setText("2500");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel55)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 40));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel28MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel28MousePressed(evt);
            }
        });

        jLabel56.setText("3000");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel56)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 40));

        jLabel52.setFont(new java.awt.Font("Nueva Std", 0, 36)); // NOI18N
        jLabel52.setText("Enter UPI ID:");
        jPanel22.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 40));

        jTextField6.setFont(new java.awt.Font("Nueva Std", 0, 36)); // NOI18N
        jPanel22.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 400, -1));

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 40)); // NOI18N
        jButton4.setText("Add Money");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jPanel22.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 30, 40));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jPanel22.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 30, 40));

        jPanel15.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 910, 420));

        jLayeredPane1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

        jLayeredPane3.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(870, 510));
        jPanel16.setMinimumSize(new java.awt.Dimension(870, 510));
        jPanel16.setPreferredSize(new java.awt.Dimension(870, 510));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 153, 153));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel18MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel18MousePressed(evt);
            }
        });
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Food-Waiter-icon.png"))); // NOI18N
        jPanel18.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel38.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel38.setText("meals");
        jPanel18.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 240, 100));

        jPanel20.setBackground(new java.awt.Color(102, 255, 102));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel20MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel20MousePressed(evt);
            }
        });
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/train_1.png"))); // NOI18N
        jPanel20.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel36.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel36.setText("All trains");
        jPanel20.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jPanel16.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 240, 110));

        jPanel19.setBackground(new java.awt.Color(102, 204, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel19MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel19MousePressed(evt);
            }
        });
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel33.setText("all stations");
        jPanel19.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/station.png"))); // NOI18N
        jPanel19.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel16.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 240, 110));

        jLayeredPane3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(870, 510));
        jPanel6.setPreferredSize(new java.awt.Dimension(870, 510));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel19.setText("Get more Info");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 38, -1, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 240, 110));

        jPanel11.setBackground(new java.awt.Color(102, 255, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel20.setText("Terms & Conditions");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terms.png"))); // NOI18N
        jPanel11.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 270, 110));

        jPanel12.setBackground(new java.awt.Color(255, 255, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel12MousePressed(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel21.setText("Advertising");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apply.png"))); // NOI18N
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel34.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel34.setText("Apply for");
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 50));

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 240, 110));

        jLayeredPane3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(870, 510));
        jPanel3.setPreferredSize(new java.awt.Dimension(870, 510));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel14.setText("PNR status");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/monitor-loading-progress-icon.png"))); // NOI18N
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 240, 90));

        jPanel7.setBackground(new java.awt.Color(102, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel17.setText("Cancel Booking");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-icon.png"))); // NOI18N
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 240, 110));

        jPanel8.setBackground(new java.awt.Color(102, 255, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel18.setText("Previous Bookings");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 18, -1, 60));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 240, 110));

        jPanel26.setBackground(new java.awt.Color(255, 153, 153));
        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel26MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel26MousePressed(evt);
            }
        });
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel53.setText("User Information");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jPanel26.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 240, 100));

        jLayeredPane3.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

        getContentPane().add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 910, 610));

        Side_panel.setBackground(new java.awt.Color(30, 39, 46));
        Side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(41, 57, 80));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setPreferredSize(new java.awt.Dimension(3, 45));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("HOME");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(btn_1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        Side_panel.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 137, 120, -1));

        btn_2.setBackground(new java.awt.Color(30, 39, 46));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 45));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("PROFILE");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap())
        );

        Side_panel.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));

        btn_3.setBackground(new java.awt.Color(30, 39, 46));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 45));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("PROMOTION");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
        );

        Side_panel.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, -1));

        btn_5.setBackground(new java.awt.Color(30, 39, 46));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_5MousePressed(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 45));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("INFORMATION");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap())
        );

        Side_panel.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 120, -1));

        btn_6.setBackground(new java.awt.Color(30, 39, 46));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
        });

        ind_6.setOpaque(false);
        ind_6.setPreferredSize(new java.awt.Dimension(3, 45));

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("eWALLET");

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap())
        );

        Side_panel.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel46MousePressed(evt);
            }
        });
        Side_panel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_7.setBackground(new java.awt.Color(30, 39, 46));
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_7MousePressed(evt);
            }
        });

        ind_7.setOpaque(false);
        ind_7.setPreferredSize(new java.awt.Dimension(3, 45));

        javax.swing.GroupLayout ind_7Layout = new javax.swing.GroupLayout(ind_7);
        ind_7.setLayout(ind_7Layout);
        ind_7Layout.setHorizontalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_7Layout.setVerticalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(240, 240, 240));
        jLabel47.setText("FAQ'S");

        javax.swing.GroupLayout btn_7Layout = new javax.swing.GroupLayout(btn_7);
        btn_7.setLayout(btn_7Layout);
        btn_7Layout.setHorizontalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        btn_7Layout.setVerticalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addContainerGap())
        );

        Side_panel.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 120, -1));

        getContentPane().add(Side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 121, 720));
        Side_panel.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(102, 102, 102));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel21MousePressed(evt);
            }
        });
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Login");
        jPanel21.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User-Interface-Login-icon.png"))); // NOI18N
        jPanel21.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout(1).png"))); // NOI18N
        jPanel21.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 20, 50, 50));

        jLabel64.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Logout");
        jPanel21.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, -1));

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 80, 110));

        jPanel25.setBackground(new java.awt.Color(102, 102, 102));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel25MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel25MousePressed(evt);
            }
        });
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register_1.png"))); // NOI18N
        jPanel25.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Register");
        jPanel25.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jPanel1.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 90, 110));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel49MousePressed(evt);
            }
        });
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 910, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:
        btn_1.setBackground(new Color(41,57,80)); 
        ind_1.setOpaque(true);
        btn_2.setBackground(new Color(30,39,46));
        btn_3.setBackground(new Color(30,39,46));
        btn_5.setBackground(new Color(30,39,46));
        btn_7.setBackground(new Color(30,39,46));
        ind_7.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_5.setOpaque(false);
        ind_6.setOpaque(false);
        btn_6.setBackground(new Color(30,39,46));
        jPanel9.setVisible(true);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jLayeredPane1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel24.setVisible(false);
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        // TODO add your handling code here:
        btn_2.setBackground(new Color(41,57,80)); 
        ind_2.setOpaque(true);
        btn_1.setBackground(new Color(30,39,46));
        btn_3.setBackground(new Color(30,39,46));
        btn_5.setBackground(new Color(30,39,46));
        ind_1.setOpaque(false);
        btn_7.setBackground(new Color(30,39,46));
        ind_7.setOpaque(false);
        ind_3.setOpaque(false);
        ind_5.setOpaque(false);
        ind_6.setOpaque(false);
        btn_6.setBackground(new Color(30,39,46));
       jPanel9.setVisible(false);
        jPanel3.setVisible(true);
        jPanel6.setVisible(false);
        jLayeredPane1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel24.setVisible(false);
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:
        btn_3.setBackground(new Color(41,57,80)); 
        ind_3.setOpaque(true);
        btn_1.setBackground(new Color(30,39,46));
        btn_2.setBackground(new Color(30,39,46));
        btn_5.setBackground(new Color(30,39,46));
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        btn_7.setBackground(new Color(30,39,46));
        ind_7.setOpaque(false);
        ind_5.setOpaque(false);
        ind_6.setOpaque(false);
        btn_6.setBackground(new Color(30,39,46));
        jPanel9.setVisible(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(true);
        jLayeredPane1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel24.setVisible(false);
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MousePressed
        // TODO add your handling code here:
        
        btn_5.setBackground(new Color(41,57,80));
        ind_5.setOpaque(true);
        btn_1.setBackground(new Color(30,39,46));
        btn_2.setBackground(new Color(30,39,46));
        btn_3.setBackground(new Color(30,39,46));
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        btn_7.setBackground(new Color(30,39,46));
        ind_7.setOpaque(false);
        ind_6.setOpaque(false);
        btn_6.setBackground(new Color(30,39,46));
        jPanel9.setVisible(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jLayeredPane1.setVisible(false);
        jPanel16.setVisible(true);
        jPanel24.setVisible(false);
    }//GEN-LAST:event_btn_5MousePressed

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        // TODO add your handling code here:
        btn_6.setBackground(new Color(41,57,80));
        ind_6.setOpaque(true);
        btn_1.setBackground(new Color(30,39,46));
        btn_2.setBackground(new Color(30,39,46));
        btn_3.setBackground(new Color(30,39,46));
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_5.setOpaque(false);
        btn_7.setBackground(new Color(30,39,46));
        ind_7.setOpaque(false);
        btn_5.setBackground(new Color(30,39,46));
        jPanel9.setVisible(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jPanel16.setVisible(false);
        jPanel24.setVisible(false);
        if(login.done==1)
        {
        jLayeredPane1.setVisible(true);
        jPanel22.setVisible(false);
        jLabel50.setText(String.valueOf(money));}
        else
        {
          JOptionPane.showMessageDialog(this, "You need to login to use eWallet", "Login",JOptionPane.ERROR_MESSAGE); 
          btn_1.setBackground(new Color(41,57,80)); 
        ind_1.setOpaque(true);
        //btn_4.setBackground(new Color(30,39,46));
        btn_2.setBackground(new Color(30,39,46));
        btn_3.setBackground(new Color(30,39,46));
        btn_5.setBackground(new Color(30,39,46));
        //ind_4.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_5.setOpaque(false);
        ind_6.setOpaque(false);
        btn_6.setBackground(new Color(30,39,46));
        jPanel9.setVisible(true);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jLayeredPane1.setVisible(false);
        jPanel16.setVisible(false);
        }
    }//GEN-LAST:event_btn_6MousePressed

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        // TODO add your handling code here:
        jPanel18.setBackground(new Color(255,177,153));
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited
        // TODO add your handling code here:
        jPanel18.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MousePressed

    private void jPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseEntered
        // TODO add your handling code here:
        jPanel21.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jPanel21MouseEntered

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
        // TODO add your handling code here:
        jPanel21.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel21MouseExited

    private void jPanel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseEntered
        // TODO add your handling code here:
        jPanel25.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jPanel25MouseEntered

    private void jPanel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseExited
        // TODO add your handling code here:
         jPanel25.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel25MouseExited

    private void jPanel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseEntered
        // TODO add your handling code here:
        jPanel26.setBackground(new Color(255,177,153));
    }//GEN-LAST:event_jPanel26MouseEntered

    private void jPanel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseExited
        // TODO add your handling code here:
        jPanel26.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jPanel26MouseExited

    private void jPanel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MousePressed
        // TODO add your handling code here:
        if(login.done==1)
        {
        userinfo newFrame=new userinfo();
        newFrame.setVisible(true);}
        else
        {
          JOptionPane.showMessageDialog(this, "You need to login to view your information", "Login",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_jPanel26MousePressed

    private void jPanel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MousePressed
        // TODO add your handling code here:
        if(login.done==1)
        {
            login.done=0;
            JOptionPane.showMessageDialog(this, "Logged Out!!!", "Logout",JOptionPane.INFORMATION_MESSAGE);
            jLabel58.setVisible(false);
            jLabel64.setVisible(false);
            jLabel45.setVisible(true);
            jLabel13.setVisible(true);
        }
        else
        {
        login newFrame=new login();
        newFrame.jPanel4.setVisible(false);
        newFrame.jPanel1.setVisible(true);
        newFrame.setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_jPanel21MousePressed

    private void jLabel46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Developed By: \n \t Varun Anusheel\n \t Jashwanth \n \t Viswa Varun \n \t Mithili", "Easter Egg 1",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jLabel46MousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int count=0;
        if(jComboBox2.getSelectedIndex()==0)
        {jLabel60.setVisible(true);count =1;}
        else
          jLabel60.setVisible(false);  
        if(jComboBox1.getSelectedIndex()==0)
        {jLabel61.setVisible(true);count =1;}
        else
          jLabel61.setVisible(false);
        //String d1  = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        if(((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty())
        {   jLabel62.setVisible(true);count = 1;}
        else
          jLabel62.setVisible(false);
        if(jComboBox3.getSelectedIndex()==0)
        {jLabel59.setVisible(true);count =1;}
        else
          jLabel59.setVisible(false);
      if (count==0)
      {
        trains newFrame=new trains();
        newFrame.setVisible(true);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
        jPanel10.setBackground(new Color(255,177,153));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        // TODO add your handling code here:
        jPanel10.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        // TODO add your handling code here:
        jPanel11.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        // TODO add your handling code here:
        jPanel11.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_jPanel11MouseExited

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        // TODO add your handling code here:
        jPanel12.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        // TODO add your handling code here:
        jPanel12.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseEntered
        // TODO add your handling code here:
        jPanel20.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_jPanel20MouseEntered

    private void jPanel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseExited
        // TODO add your handling code here:
        jPanel20.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_jPanel20MouseExited

    private void jPanel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseEntered
        // TODO add your handling code here:
        jPanel19.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_jPanel19MouseEntered

    private void jPanel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseExited
        // TODO add your handling code here:
        jPanel19.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_jPanel19MouseExited

    private void jPanel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MousePressed
        // TODO add your handling code her
        traininfo newFrame=new traininfo();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jPanel20MousePressed

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        // TODO add your handling code here:
        promotions newFrame=new promotions();
        newFrame.setVisible(true);
        newFrame.jPanel1.setVisible(true);
        newFrame.jPanel2.setVisible(false);
    }//GEN-LAST:event_jPanel11MousePressed

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        // TODO add your handling code here:
        promotions newFrame=new promotions();
        newFrame.setVisible(true);
        newFrame.jPanel1.setVisible(false);
        newFrame.jPanel2.setVisible(true);
    }//GEN-LAST:event_jPanel10MousePressed

    private void jPanel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MousePressed
        // TODO add your handling code here:
        stationinfo newFrame=new stationinfo();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jPanel19MousePressed

    private void jPanel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MousePressed
        // TODO add your handling code here:
        if(login.done==1)
        {
            JOptionPane.showMessageDialog(this, "You are already loggedin", "Login",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        login newFrame=new login();
        newFrame.jPanel4.setVisible(true);
        newFrame.jPanel1.setVisible(false);
        newFrame.jPanel5.setVisible(false);
        newFrame.jPanel6.setVisible(true);
        newFrame.jPanel7.setVisible(false);
        newFrame.setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_jPanel25MousePressed
int xx,xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MousePressed
        // TODO add your handling code here:
        if(login.done==1)
        {
        promotion newFrame=new promotion();
        newFrame.jPanel2.setVisible(true);
        newFrame.jPanel5.setVisible(false);
        newFrame.jPanel6.setVisible(true);
        newFrame.jPanel7.setVisible(false);
        newFrame.setVisible(true);}
        else
        {
          JOptionPane.showMessageDialog(this, "You need to login to apply for an Ad", "Login",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_jPanel12MousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
        pns_status newFrame=new pns_status();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jPanel5MousePressed

    private void jTextField3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MousePressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MousePressed
        // TODO add your handling code here:
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField4MousePressed

    private void jTextField11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MousePressed
        // TODO add your handling code here:
        jTextField11.setText("");
    }//GEN-LAST:event_jTextField11MousePressed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MousePressed
        // TODO add your handling code here:
        jTextField12.setText("");
    }//GEN-LAST:event_jTextField12MousePressed

    private void jTextField12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12MouseReleased

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        // TODO add your handling code here:
        jPanel13.setVisible(false);
    }//GEN-LAST:event_jLabel23MousePressed

    private void jPanel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel14MouseDragged

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel29MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
        if(login.done==1)
        {
        cacel newFrame=new cacel();
        newFrame.setVisible(true);}
        else
        {
          JOptionPane.showMessageDialog(this, "You need to login to cancel bookings", "Login",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        // TODO add your handling code here:
        if(login.done==1)
        {
        prevbook newFrame=new prevbook();
        newFrame.setVisible(true);}
        else
        {
          JOptionPane.showMessageDialog(this, "You need to login to view your previous bookings", "Login",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_jPanel8MousePressed

    private void jLabel49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MousePressed
        // TODO add your handling code here:
        String text=jTextField2.getText();
        if(text.equals("all trains"))
        {
        traininfo newFrame=new traininfo();
        newFrame.setVisible(true);
        }
        else if(text.equals("all stations"))
        {
        stationinfo newFrame=new stationinfo();
        newFrame.setVisible(true);
        }
            
        else if(text.equals("meals")) {
        }     
        else if(text.equals("info on promotion"))
        {
        promotions newFrame=new promotions();
        newFrame.setVisible(true);
        newFrame.jPanel1.setVisible(false);
        newFrame.jPanel2.setVisible(true);
        }
        else if(text.equals("t&c of promotion"))
        {
          promotions newFrame=new promotions();
        newFrame.setVisible(true);
        newFrame.jPanel1.setVisible(true);
        newFrame.jPanel2.setVisible(false);  
        }
        else if(text.equals("apply for ad"))
        {
           promotion newFrame=new promotion();
        newFrame.jPanel2.setVisible(true);
        newFrame.jPanel5.setVisible(false);
        newFrame.jPanel6.setVisible(true);
        newFrame.jPanel7.setVisible(false);
        newFrame.setVisible(true);
        }
        else if(jTextField2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Something", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel49MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel22.setVisible(true);
        jPanel13.setVisible(false);
        jButton1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int count =0;
        if(jTextField5.getText().isEmpty())
        {jLabel66.setVisible(true);count=1;}
        else
           jLabel66.setVisible(false);
        if(jTextField6.getText().isEmpty())
        {jLabel65.setVisible(true);count=1;}
        else
           jLabel65.setVisible(false);
        if(count ==0)
        {
            money = money + Integer.parseInt(jTextField5.getText());
           jLabel50.setText(String.valueOf(money));
           jPanel22.setVisible(false);
            jPanel13.setVisible(true);
            jButton1.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseEntered
        // TODO add your handling code here:
        jPanel27.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jPanel27MouseEntered

    private void jPanel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseEntered
        // TODO add your handling code here:
        jPanel28.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jPanel28MouseEntered

    private void jPanel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseEntered
        // TODO add your handling code here:
        jPanel23.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jPanel23MouseEntered

    private void jPanel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseExited
        // TODO add your handling code here:
        jPanel27.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel27MouseExited

    private void jPanel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseExited
        // TODO add your handling code here:
        jPanel28.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel28MouseExited

    private void jPanel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseExited
        // TODO add your handling code here:
        jPanel23.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel23MouseExited

    private void jPanel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MousePressed
        // TODO add your handling code here:
        jTextField5.setText("2500");
        type=1;
    }//GEN-LAST:event_jPanel27MousePressed

    private void jPanel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MousePressed
        // TODO add your handling code here:
        jTextField5.setText("3000");
        type=2;
    }//GEN-LAST:event_jPanel28MousePressed

    private void jPanel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MousePressed
        // TODO add your handling code here:
        jTextField5.setText("3500");
        type=3;
    }//GEN-LAST:event_jPanel23MousePressed

    private void btn_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MousePressed
        // TODO add your handling code here:
        btn_7.setBackground(new Color(41,57,80));
        ind_7.setOpaque(true);
        btn_1.setBackground(new Color(30,39,46));
        btn_5.setBackground(new Color(30,39,46));
        btn_2.setBackground(new Color(30,39,46));
        btn_3.setBackground(new Color(30,39,46));
        ind_1.setOpaque(false);
        ind_5.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_6.setOpaque(false);
        btn_6.setBackground(new Color(30,39,46));
        jPanel9.setVisible(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jLayeredPane1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel24.setVisible(true);
    }//GEN-LAST:event_btn_7MousePressed

    private void jLabel48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MousePressed
        // TODO add your handling code here:
        jPanel34.setVisible(true);
        jPanel33.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
        
    }//GEN-LAST:event_jLabel48MousePressed

    private void jLabel67MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(true);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel67MousePressed

    private void jLabel68MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(true);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel68MousePressed

    private void jLabel69MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(true);
    }//GEN-LAST:event_jLabel69MousePressed

    private void jLabel74MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(true);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel74MousePressed

    private void jLabel75MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(true);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel75MousePressed

    private void jLabel77MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(true);
    }//GEN-LAST:event_jLabel77MousePressed

    private void jLabel78MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(true);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel78MousePressed

    private void jLabel79MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(true);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel79MousePressed

    private void jLabel80MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(true);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel80MousePressed

    private void jLabel81MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(true);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel81MousePressed

    private void jLabel82MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(true);
    }//GEN-LAST:event_jLabel82MousePressed

    private void jLabel83MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(true);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel83MousePressed

    private void jLabel84MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(true);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel84MousePressed

    private void jLabel85MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(true);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel85MousePressed

    private void jLabel86MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(true);
    }//GEN-LAST:event_jLabel86MousePressed

    private void jLabel87MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(true);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel87MousePressed

    private void jLabel88MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(true);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel88MousePressed

    private void jLabel89MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(true);
        jPanel34.setVisible(false);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel89MousePressed

    private void jLabel90MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MousePressed
        // TODO add your handling code here:
        jPanel33.setVisible(false);
        jPanel34.setVisible(true);
        jPanel39.setVisible(false);
        jPanel44.setVisible(false);
        jPanel49.setVisible(false);
    }//GEN-LAST:event_jLabel90MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        contact newFrame=new contact();
        newFrame.jLabel15.setVisible(false);
        newFrame.jLabel5.setVisible(false);
        newFrame.jLabel6.setVisible(false);
        newFrame.jLabel7.setVisible(false);
        newFrame.jLabel8.setVisible(false);newFrame.jLabel14.setVisible(false);
        newFrame.jLabel9.setVisible(false);
        newFrame.jLabel10.setVisible(false);
        newFrame.jLabel11.setVisible(false);
        newFrame.jLabel12.setVisible(false);
        newFrame.jLabel13.setVisible(false);
        newFrame.jTextArea1.setVisible(false);
        newFrame.jScrollPane1.setVisible(false);
        newFrame.jLabel2.setVisible(false);
        newFrame.jLabel4.setVisible(false);
        newFrame.jButton1.setVisible(false);
        newFrame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(one.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(one.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(one.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(one.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new one().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Side_panel;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_5;
    private javax.swing.JPanel btn_6;
    private javax.swing.JPanel btn_7;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_5;
    private javax.swing.JPanel ind_6;
    private javax.swing.JPanel ind_7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    public static javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    public static javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    public static javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
