package main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bishoykamel
 */
public class Exams extends javax.swing.JFrame {

    /**
     * Creates new form Exams
     */
    public Exams() {
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        switchButton4 = new swing.SwitchButton();
        switchButton5 = new swing.SwitchButton();
        comboBoxSuggestion4 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion5 = new combo_suggestion.ComboBoxSuggestion();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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

        switchButton3.setForeground(new java.awt.Color(240, 240, 240));
        switchButton3.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(switchButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(678, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(162, 162, 162)))
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
                        .addGap(288, 288, 288)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(switchButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(637, Short.MAX_VALUE)))
        );

        tabbedPaneCustom1.addTab("Sophomore", jPanel3);

        jPanel4.setBackground(new java.awt.Color(243, 243, 243));

        jPanel7.setBackground(new java.awt.Color(255, 251, 218));

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

        comboBoxSuggestion4.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion4.setEditable(false);
        comboBoxSuggestion4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data Structures", "Electronic Circuits", "Numerical", "Signals", "Computer Architecture", "Creative Thinking" }));
        comboBoxSuggestion4.setEnabled(false);
        comboBoxSuggestion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion4ActionPerformed(evt);
            }
        });

        comboBoxSuggestion5.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion5.setEditable(false);
        comboBoxSuggestion5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Database", "Communication", "Measure", "Power & Machines", "MP_MC", "Operations Research" }));
        comboBoxSuggestion5.setEnabled(false);
        comboBoxSuggestion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion5ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel20.setText("First Term:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel21.setText("Second Term:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(switchButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(678, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(170, 170, 170)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(switchButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(comboBoxSuggestion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(switchButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(642, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneCustom1.addTab("Junior", jPanel4);

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
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
                        .addGap(52, 52, 52)
                        .addComponent(switchButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(163, 163, 163))))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(678, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(158, 158, 158)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(switchButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(comboBoxSuggestion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(switchButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(257, 257, 257)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(639, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
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
                        .addGap(51, 51, 51)
                        .addComponent(switchButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSuggestion9, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(678, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(153, 153, 153)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(switchButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(comboBoxSuggestion8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(switchButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(639, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSuggestion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion3ActionPerformed

    private void comboBoxSuggestion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion10ActionPerformed

    private void comboBoxSuggestion11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion11ActionPerformed

    private void comboBoxSuggestion12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion12ActionPerformed

    private void comboBoxSuggestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion2ActionPerformed

    private void comboBoxSuggestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion1ActionPerformed

    private void comboBoxSuggestion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion4ActionPerformed

    private void comboBoxSuggestion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion5ActionPerformed

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

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion2.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1pYy4SoBRYHxdyrxiT20ZjMvSbqq2HyaG/view?usp=drivesdk").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1pQoLlMqXAkV_5JXePM1klWFrYT2NmF7V/view?usp=drivesdk").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1pRlBRTd-UghLnUrpcc0IyHY8Ji1Ud9lK/view?usp=drivesdk").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1pYeJZUw87eyz9XpVYMIeDNEbAz8HxVF9/view?usp=drivesdk").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://www.proprofs.com/quiz-school/story.php?title=english-test-technical-writing").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1pT3V2W7ZhVvuw9UvzYMjVmh6iSJKhV2O/view?usp=drivesdk").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                                    
    }
    
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        if (comboBoxSuggestion1.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1RTVqbkw6lN_eAx9odwLJ2EKV2uSXTMdf?usp=drive_link").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1RTVqbkw6lN_eAx9odwLJ2EKV2uSXTMdf?usp=drive_link").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1RTVqbkw6lN_eAx9odwLJ2EKV2uSXTMdf?usp=drive_link").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1RTVqbkw6lN_eAx9odwLJ2EKV2uSXTMdf?usp=drive_link").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1RTVqbkw6lN_eAx9odwLJ2EKV2uSXTMdf?usp=drive_link").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1RTVqbkw6lN_eAx9odwLJ2EKV2uSXTMdf?usp=drive_link").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel2MousePressed
/*
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel1MousePressed
*/
    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion4.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion4.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion4.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion4.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion4.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion4.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
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
    }//GEN-LAST:event_jLabel5MousePressed

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

    private void switchButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton3MousePressed
        // TODO add your handling code here:
        if(switchButton3.isSelected()){
            comboBoxSuggestion2.setEnabled(false);
        }
        else {
            comboBoxSuggestion2.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton3MousePressed

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
            comboBoxSuggestion4.setEnabled(false);
        }
        else {
            comboBoxSuggestion4.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton5MousePressed

    private void switchButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton4MousePressed
        // TODO add your handling code here:
        if(switchButton4.isSelected()){
            comboBoxSuggestion5.setEnabled(false);
        }
        else {
            comboBoxSuggestion5.setEnabled(true);
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
            java.util.logging.Logger.getLogger(Exams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exams().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion1;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion2;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion4;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion5;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion6;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion7;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion8;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
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
