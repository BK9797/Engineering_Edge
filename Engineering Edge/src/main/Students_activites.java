package main;


import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author proxc
 */
public class Students_activites extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    public Students_activites() {
        initComponents();
        show(position);
       }
    int position=0;
    //pixels
   public String[] takeimage()
    {
    File f=new File(getClass().getResource("/pixels").getFile());
    String[] Images = f.list();
    return Images;
    }
    
    public void show(int index)
{
    String [] Images=takeimage();
    String img=Images[index];
    ImageIcon icon =new ImageIcon(getClass().getResource("/pixels/"+img));
    Image image=icon.getImage().getScaledInstance(picture.getWidth(),picture.getHeight(),Image.SCALE_SMOOTH);
    picture.setIcon(new ImageIcon (image));
}
 //IEEE
    public String[] Takeimage()
    {
    File f=new File(getClass().getResource("/IEEE").getFile());
    String[] Images = f.list();
    return Images;
    }
     public void Show(int index)
{
    String [] Images=Takeimage();
    String img=Images[index];
    ImageIcon icon =new ImageIcon(getClass().getResource("/IEEE/"+img));
    Image image=icon.getImage().getScaledInstance(picture1.getWidth(),picture1.getHeight(),Image.SCALE_SMOOTH);
    picture1.setIcon(new ImageIcon (image));
}
 //ICPC
   public String[] takeImage()
    {
    File f=new File(getClass().getResource("/ICPC").getFile());
    String[] Images = f.list();
    return Images;
    }
    
    public void sHow(int index)
{
    String [] Images=takeImage();
    String img=Images[index];
    ImageIcon icon =new ImageIcon(getClass().getResource("/ICPC/"+img));
    Image image=icon.getImage().getScaledInstance(picture2.getWidth(),picture2.getHeight(),Image.SCALE_SMOOTH);
    picture2.setIcon(new ImageIcon (image));
}
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneCustom1 = new raven.tabbed.TabbedPaneCustom();
        jPanel2 = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        imageAvatar1 = new swing.ImageAvatar();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        picture1 = new javax.swing.JLabel();
        next1 = new javax.swing.JLabel();
        previous1 = new javax.swing.JLabel();
        imageAvatar5 = new swing.ImageAvatar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        picture2 = new javax.swing.JLabel();
        next2 = new javax.swing.JLabel();
        previous2 = new javax.swing.JLabel();
        imageAvatar6 = new swing.ImageAvatar();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(700, 250));

        tabbedPaneCustom1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(255, 236, 158));
        tabbedPaneCustom1.setUnselectedColor(new java.awt.Color(255, 251, 218));

        jPanel2.setBackground(new java.awt.Color(255, 251, 218));

        picture.setBackground(new java.awt.Color(51, 51, 255));
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixels/pixels14.jpg"))); // NOI18N

        next.setBackground(new java.awt.Color(255, 251, 218));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/right arrow.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leftarrow.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previousMousePressed(evt);
            }
        });

        imageAvatar1.setGradientColor1(new java.awt.Color(255, 251, 218));
        imageAvatar1.setGradientColor2(new java.awt.Color(255, 251, 218));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/pixels.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/instgram icon1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/face icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("through many tracks such as academic track, competitions track,camp ");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("aims to spread the engineering science, to create a productive community");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Pixels is a student activity at faculty of engineering Helwan University");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("track, Juniors track and Projects track.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(392, 392, 392))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(47, 47, 47)))
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(previous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(picture)
                        .addGap(132, 132, 132)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next)
                    .addComponent(jLabel4))
                .addGap(261, 261, 261)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(239, 239, 239))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel17)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(previous))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(next))
                            .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Pixels", jPanel2);

        jPanel9.setBackground(new java.awt.Color(255, 251, 218));

        picture1.setBackground(new java.awt.Color(51, 51, 255));
        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IEEE/IEEE1.png"))); // NOI18N

        next1.setBackground(new java.awt.Color(255, 251, 218));
        next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/right arrow.png"))); // NOI18N
        next1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                next1MousePressed(evt);
            }
        });

        previous1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leftarrow.png"))); // NOI18N
        previous1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previous1MousePressed(evt);
            }
        });

        imageAvatar5.setGradientColor1(new java.awt.Color(255, 251, 218));
        imageAvatar5.setGradientColor2(new java.awt.Color(255, 251, 218));
        imageAvatar5.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/IEEE.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("IEEE ComSoc Helwan Student Chapter is a new step which guide you");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("in a community of professionals with a common interest in advancing");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("all computer, communications and networking technologies and  techniques.");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/instgram icon1.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/face icon.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previous1)
                .addGap(132, 132, 132)
                .addComponent(picture1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(next1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(imageAvatar5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(505, 505, 505))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE))
                        .addGap(228, 228, 228))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(imageAvatar5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(previous1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(next1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(picture1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("IEEE", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 251, 218));

        picture2.setBackground(new java.awt.Color(51, 51, 255));
        picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICPC/ICPC2.jpg"))); // NOI18N

        next2.setBackground(new java.awt.Color(255, 251, 218));
        next2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/right arrow.png"))); // NOI18N
        next2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                next2MousePressed(evt);
            }
        });

        previous2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leftarrow.png"))); // NOI18N
        previous2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previous2MousePressed(evt);
            }
        });

        imageAvatar6.setGradientColor1(new java.awt.Color(255, 251, 218));
        imageAvatar6.setGradientColor2(new java.awt.Color(255, 251, 218));
        imageAvatar6.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/ICPC.jpg"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setText("FEHU - CPC is the Community for the Faculty of Engineering , Helwan");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setText("University (FEHU) International Collegiate Programming Contest (ICPC)");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setText("FEHU-CPC is an extra-curricular, competitive programming Community");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setText("of the Faculty of Engineering at Helwan University in Egypt.");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/instgram icon1.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/face icon.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(imageAvatar6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(505, 505, 505))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1347, Short.MAX_VALUE)
                                .addGap(61, 61, 61))
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(260, 260, 260))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(previous2)
                .addGap(181, 181, 181)
                .addComponent(picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(next2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageAvatar6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(previous2))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(next2))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("FEHU-CPC", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void next1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MousePressed
        // IEEE
         new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.picture1.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(900,200, 1,2,picture1);
        }
        position=position+1;
        if(position>=Takeimage().length){
            position=Takeimage().length-1;
        }
        Show(position);
    }//GEN-LAST:event_next1MousePressed

    private void previous1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous1MousePressed
        // IEEE
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.picture1.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(900,200, 1,2,picture1);
        }
        position=position-1;
        if(position<0){
            position=0;
        }
        Show(position);
        
    }//GEN-LAST:event_previous1MousePressed

    private void next2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next2MousePressed
        // ICPC
         new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.picture2.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(900,200, 1,2,picture2);
        }
        position=position+1;
        if(position>=takeImage().length){
            position=takeImage().length-1;
        }
        sHow(position);
    }//GEN-LAST:event_next2MousePressed

    private void previous2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous2MousePressed
        // ICPC
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.picture2.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(900,200, 1,2,picture2);
        }
        position=position-1;
        if(position<0){
            position=0;
        }
        sHow(position);
        
    }//GEN-LAST:event_previous2MousePressed

    private void previousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMousePressed
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.picture.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(900,200, 1,2,picture);
        }
        position=position-1;
        if(position<0){
            position=0;
        }
        show(position);
    }//GEN-LAST:event_previousMousePressed

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.picture.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(900,200, 1,2,picture);
        }
        position=position+1;
        if(position>=takeimage().length){
            position=takeimage().length-1;
        }
        show(position);
    }//GEN-LAST:event_nextMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/pixelsegypt/").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/ieeehsb").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel23MousePressed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/ieee_hsb/").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/PixelsEgyptOrg").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/ICPC.FEHU").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel29MousePressed

    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/icpcnews/").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Students_activites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel28MousePressed
         
    
    
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
            java.util.logging.Logger.getLogger(Students_activites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students_activites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students_activites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students_activites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students_activites().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar imageAvatar1;
    private swing.ImageAvatar imageAvatar5;
    private swing.ImageAvatar imageAvatar6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel next;
    private javax.swing.JLabel next1;
    private javax.swing.JLabel next2;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel picture1;
    private javax.swing.JLabel picture2;
    private javax.swing.JLabel previous;
    private javax.swing.JLabel previous1;
    private javax.swing.JLabel previous2;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables
}
