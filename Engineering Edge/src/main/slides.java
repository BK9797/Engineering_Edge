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
public class slides extends javax.swing.JFrame {

    /**
     * Creates new form slides
     */
    public slides() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        switchButton10 = new swing.SwitchButton();
        switchButton11 = new swing.SwitchButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        comboBoxSuggestion15 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion16 = new combo_suggestion.ComboBoxSuggestion();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        switchButton12 = new swing.SwitchButton();
        switchButton13 = new swing.SwitchButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        comboBoxSuggestion10 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion17 = new combo_suggestion.ComboBoxSuggestion();
        jPanel11 = new javax.swing.JPanel();
        switchButton14 = new swing.SwitchButton();
        switchButton15 = new swing.SwitchButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        comboBoxSuggestion18 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion19 = new combo_suggestion.ComboBoxSuggestion();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
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
                        .addGap(50, 50, 50)
                        .addComponent(switchButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(switchButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(switchButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Sophomore", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 251, 218));

        switchButton10.setForeground(new java.awt.Color(240, 240, 240));
        switchButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton10MousePressed(evt);
            }
        });

        switchButton11.setForeground(new java.awt.Color(240, 240, 240));
        switchButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton11MousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel19.setText("First Term:");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel26.setText("Second Term:");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });

        comboBoxSuggestion15.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion15.setEditable(false);
        comboBoxSuggestion15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data Structures", "Electronic Circuits", "Numerical", "Signals", "Computer Architecture", "Creative Thinking" }));
        comboBoxSuggestion15.setEnabled(false);
        comboBoxSuggestion15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion15ActionPerformed(evt);
            }
        });

        comboBoxSuggestion16.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion16.setEditable(false);
        comboBoxSuggestion16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Database", "Communication", "Measure", "Power & Machines", "MP_MC", "Operations Research" }));
        comboBoxSuggestion16.setEnabled(false);
        comboBoxSuggestion16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion16ActionPerformed(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel43MousePressed(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel44MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(7, 7, 7)
                        .addComponent(switchButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(switchButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 644, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxSuggestion15, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion16, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)))
                .addGap(49, 49, 49))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(switchButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(switchButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(271, 271, 271)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(comboBoxSuggestion15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(430, 430, 430)
                        .addComponent(comboBoxSuggestion16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Junior", jPanel6);

        jPanel10.setBackground(new java.awt.Color(255, 251, 218));

        switchButton12.setForeground(new java.awt.Color(240, 240, 240));
        switchButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton12MousePressed(evt);
            }
        });

        switchButton13.setForeground(new java.awt.Color(240, 240, 240));
        switchButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton13MousePressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel31.setText("First Term:");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel32.setText("Second Term:");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel33MousePressed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel34MousePressed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel35MousePressed(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel36MousePressed(evt);
            }
        });

        comboBoxSuggestion10.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion10.setEditable(false);
        comboBoxSuggestion10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer network", "Digital signal", "Software engineering", "Linear systems & Control", "Engineering economics", "VLSI" }));
        comboBoxSuggestion10.setEnabled(false);
        comboBoxSuggestion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion10ActionPerformed(evt);
            }
        });

        comboBoxSuggestion17.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion17.setEditable(false);
        comboBoxSuggestion17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Operating Systems", "Digital Control Systems", "Artificial Intelligenece", "Parallel & Distributed Systems", "Project Management", "Elective Course" }));
        comboBoxSuggestion17.setEnabled(false);
        comboBoxSuggestion17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(switchButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(comboBoxSuggestion10, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBoxSuggestion17, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)))
                .addGap(61, 61, 61))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(switchButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(comboBoxSuggestion10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(comboBoxSuggestion17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addGap(322, 322, 322)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(switchButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Senior 1", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 251, 218));

        switchButton14.setForeground(new java.awt.Color(240, 240, 240));
        switchButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton14MousePressed(evt);
            }
        });

        switchButton15.setForeground(new java.awt.Color(240, 240, 240));
        switchButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchButton15MousePressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel37.setText("First Term:");

        jLabel38.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel38.setText("Second Term:");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel39MousePressed(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-drive-150.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel40MousePressed(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel41MousePressed(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-classroom-150.png"))); // NOI18N
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel42MousePressed(evt);
            }
        });

        comboBoxSuggestion18.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion18.setEditable(false);
        comboBoxSuggestion18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Network", "Control", "Dsp", "CI", "AI" }));
        comboBoxSuggestion18.setEnabled(false);
        comboBoxSuggestion18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion18ActionPerformed(evt);
            }
        });

        comboBoxSuggestion19.setBackground(new java.awt.Color(255, 236, 158));
        comboBoxSuggestion19.setEditable(false);
        comboBoxSuggestion19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Security", "Systems", "Compiler", "Control", "Computer Vision" }));
        comboBoxSuggestion19.setEnabled(false);
        comboBoxSuggestion19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(switchButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxSuggestion18, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                    .addComponent(comboBoxSuggestion19, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(169, 169, 169)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addGap(279, 279, 279)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel41))))
                .addGap(68, 68, 68))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(switchButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(comboBoxSuggestion18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(comboBoxSuggestion19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(switchButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Senior 2", jPanel11);

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

    private void comboBoxSuggestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion2ActionPerformed

    private void comboBoxSuggestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion1ActionPerformed

    private void comboBoxSuggestion15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion15ActionPerformed

    private void comboBoxSuggestion16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion16ActionPerformed

    private void comboBoxSuggestion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion10ActionPerformed

    private void comboBoxSuggestion17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion17ActionPerformed

    private void comboBoxSuggestion18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion18ActionPerformed

    private void comboBoxSuggestion19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion19ActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion2.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1a1VaJEosmU3aSLQO-x6JCELZDklXPoIT").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1Qw5c4667a_kq48NhW6q65esz3CcL2aLw").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1Rda31USZU19qp2fjkB02lpCXDqhRi0zc").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1Xhc6a4XXaqoeaRGj5uFlt3s_xp5SCGZn").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1Z7Zsm944MD4CbQbsaEg_vZXUrqd8zA9B").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1qQr4A9w_sQ5Ry8Dvre0Cf_q48U-FIIZ1").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion1.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/14WCkCOvdFGr_Oouy7jTmFM4GvsdtnZ0o").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1Xn_3Oo7aEGk7KIpqdIXDNok2vXfUXv2s").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/13L9-sA4RmmW62ztD2CcSanoRB3pzhTsA").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1973-zyDu6Mqpbn2qAZpMwmkQCYkixoP4").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1XZtVf8OSzXOMIRFCt3T_pa1YSMrkNklc").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1-5IPlLainfA0DbWlXqviUf34TLWKPl9S").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion15.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jLabel28MousePressed

    private void jLabel43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion16.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jLabel43MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion2.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://classroom.google.com/c/NjMwMjYxNDY4OTk0").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://classroom.google.com/c/NjI3MDU1NTUwNTI5").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion2.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://classroom.google.com/c/NTUyMDgzOTI3NTQx").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion1.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://classroom.google.com/c/NjYzNTg3OTg4NTI5").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://classroom.google.com/c/NjI3MDU1NTUwNTI5").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://classroom.google.com/c/NjY2Nzg1NDEwMDU0").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion1.getSelectedIndex() == 5) {
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

    private void jLabel34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MousePressed
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
    }//GEN-LAST:event_jLabel34MousePressed

    private void jLabel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion17.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel33MousePressed

    private void jLabel40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion18.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel40MousePressed

    private void jLabel39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion19.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel39MousePressed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion15.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion15.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel29MousePressed

    private void jLabel44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion16.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion16.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel44MousePressed

    private void jLabel35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MousePressed
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
    }//GEN-LAST:event_jLabel35MousePressed

    private void jLabel36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion17.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion17.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel36MousePressed

    private void jLabel41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion18.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion18.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel41MousePressed

    private void jLabel42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MousePressed
        // TODO add your handling code here:
        if (comboBoxSuggestion19.getSelectedIndex() == 0) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 1) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 2) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 3) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 4) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (comboBoxSuggestion19.getSelectedIndex() == 5) {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URL("https://github.com/BK9797/Engineering_Edge").toURI());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel42MousePressed

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

    private void switchButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton11MousePressed
        // TODO add your handling code here:
        if(switchButton11.isSelected()){
            comboBoxSuggestion15.setEnabled(false);
        }
        else {
            comboBoxSuggestion15.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton11MousePressed

    private void switchButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton10MousePressed
        // TODO add your handling code here:
        if(switchButton10.isSelected()){
            comboBoxSuggestion16.setEnabled(false);
        }
        else {
            comboBoxSuggestion16.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton10MousePressed

    private void switchButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton13MousePressed
        // TODO add your handling code here:
        if(switchButton13.isSelected()){
            comboBoxSuggestion10.setEnabled(false);
        }
        else {
            comboBoxSuggestion10.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton13MousePressed

    private void switchButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton12MousePressed
        // TODO add your handling code here:
        if(switchButton12.isSelected()){
            comboBoxSuggestion17.setEnabled(false);
        }
        else {
            comboBoxSuggestion17.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton12MousePressed

    private void switchButton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton15MousePressed
        // TODO add your handling code here:
        if(switchButton15.isSelected()){
            comboBoxSuggestion18.setEnabled(false);
        }
        else {
            comboBoxSuggestion18.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton15MousePressed

    private void switchButton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton14MousePressed
        // TODO add your handling code here:
        if(switchButton14.isSelected()){
            comboBoxSuggestion19.setEnabled(false);
        }
        else {
            comboBoxSuggestion19.setEnabled(true);
        }
    }//GEN-LAST:event_switchButton14MousePressed

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
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slides().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion1;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion10;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion15;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion16;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion17;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion18;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion19;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private swing.SwitchButton switchButton10;
    private swing.SwitchButton switchButton11;
    private swing.SwitchButton switchButton12;
    private swing.SwitchButton switchButton13;
    private swing.SwitchButton switchButton14;
    private swing.SwitchButton switchButton15;
    private swing.SwitchButton switchButton2;
    private swing.SwitchButton switchButton3;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables

    //End of the code :):)
}
