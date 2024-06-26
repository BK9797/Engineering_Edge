package main;

/**
 *
 * @author bishoykamel
 */
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class video extends javax.swing.JFrame {

    /**
     * Creates new form video
     */
    public video() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneCustom1 = new raven.tabbed.TabbedPaneCustom();
        jPanel3 = new javax.swing.JPanel();
        switchButton2 = new swing.SwitchButton();
        switchButton3 = new swing.SwitchButton();
        comboBoxSuggestion2 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion1 = new combo_suggestion.ComboBoxSuggestion();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        switchButton4 = new swing.SwitchButton();
        switchButton5 = new swing.SwitchButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBoxSuggestion5 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion10 = new combo_suggestion.ComboBoxSuggestion();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        switchButton6 = new swing.SwitchButton();
        switchButton7 = new swing.SwitchButton();
        comboBoxSuggestion6 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion7 = new combo_suggestion.ComboBoxSuggestion();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        switchButton8 = new swing.SwitchButton();
        switchButton9 = new swing.SwitchButton();
        comboBoxSuggestion8 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion9 = new combo_suggestion.ComboBoxSuggestion();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(220, 80));

        tabbedPaneCustom1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(255, 236, 158));
        tabbedPaneCustom1.setUnselectedColor(new java.awt.Color(255, 236, 158));

        jPanel3.setBackground(new java.awt.Color(255, 251, 218));

        switchButton2.setForeground(new java.awt.Color(240, 240, 240));
        switchButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton2MousePressed(evt);
            }
        });
        switchButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                switchButton2KeyPressed(evt);
            }
        });

        switchButton3.setForeground(new java.awt.Color(240, 240, 240));
        switchButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchButton3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton3MousePressed(evt);
            }
        });

        comboBoxSuggestion2.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion2.setEditable(false);
        comboBoxSuggestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programming C++", "Electronics 1", "Maths 3", "Circuits", "Technical writting", "Discrete math" }));
        comboBoxSuggestion2.setEnabled(false);
        comboBoxSuggestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion2ActionPerformed(evt);
            }
        });

        comboBoxSuggestion1.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion1.setEditable(false);
        comboBoxSuggestion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Advanced progarmming (Java)", "Basic Electronics", "Satistics and probability", "Logic design", "Workshops", "Presentation skills" }));
        comboBoxSuggestion1.setEnabled(false);
        comboBoxSuggestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel17.setText("First Term:");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel16.setText("Second Term:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(switchButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(switchButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(749, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(157, 157, 157)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(switchButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(switchButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(686, Short.MAX_VALUE)))
        );

        tabbedPaneCustom1.addTab("Sophomore", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 251, 218));

        switchButton4.setForeground(new java.awt.Color(240, 240, 240));
        switchButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton4MousePressed(evt);
            }
        });

        switchButton5.setForeground(new java.awt.Color(240, 240, 240));
        switchButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton5MousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel18.setText("First Term:");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel19.setText("Second Term:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        comboBoxSuggestion5.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion5.setEditable(false);
        comboBoxSuggestion5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data Structures", "Electronic Circuits", "Numerical", "Signals", "Computer Architecture", "Creative Thinking" }));
        comboBoxSuggestion5.setEnabled(false);
        comboBoxSuggestion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion5ActionPerformed(evt);
            }
        });

        comboBoxSuggestion10.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion10.setEditable(false);
        comboBoxSuggestion10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Database", "Communication", "Measure", "Power & Machines", "MP_MC", "Operations Research" }));
        comboBoxSuggestion10.setEnabled(false);
        comboBoxSuggestion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(switchButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion10, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(749, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(157, 157, 157)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(switchButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(comboBoxSuggestion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(switchButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(686, Short.MAX_VALUE)))
        );

        tabbedPaneCustom1.addTab("Junior", jPanel6);

        jPanel5.setBackground(new java.awt.Color(243, 243, 243));

        jPanel8.setBackground(new java.awt.Color(255, 251, 218));

        switchButton6.setForeground(new java.awt.Color(240, 240, 240));
        switchButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton6MousePressed(evt);
            }
        });

        switchButton7.setForeground(new java.awt.Color(240, 240, 240));
        switchButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton7MousePressed(evt);
            }
        });

        comboBoxSuggestion6.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion6.setEditable(false);
        comboBoxSuggestion6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer network", "Digital signal", "Software engineering", "Linear systems & Control", "Engineering economics", "VLSI" }));
        comboBoxSuggestion6.setEnabled(false);
        comboBoxSuggestion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion6ActionPerformed(evt);
            }
        });

        comboBoxSuggestion7.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion7.setEditable(false);
        comboBoxSuggestion7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Operating Systems", "Digital Control Systems", "Artificial Intelligenece", "Parallel & Distributed Systems", "Project Management", "Elective Course" }));
        comboBoxSuggestion7.setEnabled(false);
        comboBoxSuggestion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion7ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel22.setText("First Term:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel23.setText("Second Term:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(switchButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(739, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(175, 175, 175)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(switchButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(comboBoxSuggestion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(switchButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(276, 276, 276)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(696, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneCustom1.addTab("Senior 1 ", jPanel5);

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));

        jPanel9.setBackground(new java.awt.Color(255, 251, 218));

        switchButton8.setForeground(new java.awt.Color(240, 240, 240));
        switchButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton8MousePressed(evt);
            }
        });

        switchButton9.setForeground(new java.awt.Color(240, 240, 240));
        switchButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton9MousePressed(evt);
            }
        });

        comboBoxSuggestion8.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion8.setEditable(false);
        comboBoxSuggestion8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Network", "Control", "Dsp", "CI", "AI" }));
        comboBoxSuggestion8.setEnabled(false);
        comboBoxSuggestion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion8ActionPerformed(evt);
            }
        });

        comboBoxSuggestion9.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion9.setEditable(false);
        comboBoxSuggestion9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Security", "Systems", "Compiler", "Control", "Computer Vision" }));
        comboBoxSuggestion9.setEnabled(false);
        comboBoxSuggestion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion9ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel24.setText("First Term:");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel25.setText("Second Term:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-youtube-logo-150.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(switchButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion9, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(168, 168, 168))))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(727, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(170, 170, 170)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(switchButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(comboBoxSuggestion8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(switchButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(268, 268, 268)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(696, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Senior 2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneCustom1.getAccessibleContext().setAccessibleName("Sophomore");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSuggestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion2ActionPerformed

    private void comboBoxSuggestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion1ActionPerformed

    private void comboBoxSuggestion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion6ActionPerformed

    private void comboBoxSuggestion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion7ActionPerformed

    private void comboBoxSuggestion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion8ActionPerformed

    private void comboBoxSuggestion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion9ActionPerformed

    private void comboBoxSuggestion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion5ActionPerformed

    private void comboBoxSuggestion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion10ActionPerformed

    private void switchButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton3MousePressed
        // TODO add your handling code here:
       if(switchButton3.isSelected()){
            comboBoxSuggestion2.setEnabled(false);
        }
        else {
            comboBoxSuggestion2.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton3MousePressed

    private void switchButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_switchButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchButton2KeyPressed

    private void switchButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_switchButton3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion2.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PLZNz7wrFA85D08q1syj411CXOUMfQsHHm&si=CiEPpFbIhYXakxXk").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtu.be/AcxDiesy-nI?si=7sCA7uU2OojtPv_D").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtu.be/n4qU00B3dtk?si=oyltqBZWsCzHhP-H").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PLm877Wx3hfJ37R7tf8KaLhYXBrKtCLjzy&si=f9CANZNHpfJQsbio").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PLQQXYjlu24Uje0aLsyiYntOx93b4gSB6d&si=0dsA4YrakKi4_SUp").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PLxIvc-MGOs6gZlMVYOOEtUHJmfUquCjwz&si=OGgWTx490nDTMlv5").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jLabel3MousePressed
    }
    
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion1.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PL1DUmTEdeA6K7rdxKiWJq6JIxTvHalY8f&si=BLHBfFBkBQMBg6oo").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtu.be/PS_p3O9q4YI?si=HRaspbAr7HAgJtYk").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PL8W6_asq_lTz2gfKJuTwIQ7OUjXYwRxYp&si=z4UK2Tg_Ra1iYNtG").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PLkOpA9uAb9H3e0isTeEqkR-W5PwV8OSTG&si=M1-2rPpad2PsabU6").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PLa4kqtM7SuFyf4P0EWHLpVGCxot0cAlPD&si=MRlGwsjc-kFR_N5C").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://youtube.com/playlist?list=PLHW3KAZhF3zV8ANjm6HCOecouHQIzfgKH&si=_1pWEt6IXKMadejV").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion5.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion5.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion5.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion5.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion5.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion5.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion10.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion10.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion10.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion10.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion10.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion10.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion6.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion6.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion6.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion6.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion6.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion6.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion7.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion7.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion7.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion7.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion7.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion7.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion8.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion8.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion8.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion8.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion8.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion8.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion9.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion9.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion9.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion9.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion9.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion9.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                
    }//GEN-LAST:event_jLabel9MousePressed

    private void switchButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton2MousePressed
        // TODO add your handling code here:
        if(switchButton2.isSelected()){
            comboBoxSuggestion1.setEnabled(false);
        }
        else {
            comboBoxSuggestion1.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton2MousePressed

    private void switchButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton5MousePressed
        // TODO add your handling code here:
        if(switchButton5.isSelected()){
            comboBoxSuggestion5.setEnabled(false);
        }
        else {
            comboBoxSuggestion5.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton5MousePressed

    private void switchButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton4MousePressed
        // TODO add your handling code here:
        if(switchButton4.isSelected()){
            comboBoxSuggestion10.setEnabled(false);
        }
        else {
            comboBoxSuggestion10.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton4MousePressed

    private void switchButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton7MousePressed
        // TODO add your handling code here:
        if(switchButton7.isSelected()){
            comboBoxSuggestion6.setEnabled(false);
        }
        else {
            comboBoxSuggestion6.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton7MousePressed

    private void switchButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton6MousePressed
        // TODO add your handling code here:
        if(switchButton6.isSelected()){
            comboBoxSuggestion7.setEnabled(false);
        }
        else {
            comboBoxSuggestion7.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton6MousePressed

    private void switchButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton9MousePressed
        // TODO add your handling code here:
        if(switchButton9.isSelected()){
            comboBoxSuggestion8.setEnabled(false);
        }
        else {
            comboBoxSuggestion8.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton9MousePressed

    private void switchButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton8MousePressed
        // TODO add your handling code here:
        if(switchButton8.isSelected()){
            comboBoxSuggestion9.setEnabled(false);
        }
        else {
            comboBoxSuggestion9.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton8MousePressed
    

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new video().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion1;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion10;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion2;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion5;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion6;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion7;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion8;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private swing.SwitchButton switchButton2;
    private swing.SwitchButton switchButton3;
    private swing.SwitchButton switchButton4;
    private swing.SwitchButton switchButton5;
    private swing.SwitchButton switchButton6;
    private swing.SwitchButton switchButton7;
    private swing.SwitchButton switchButton8;
    private swing.SwitchButton switchButton9;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables
}
