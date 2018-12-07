package jfx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class jatek2 extends javax.swing.JFrame {
    private File f0;
    private final ArrayList<String> sentences = new ArrayList<>();
    private final ArrayList<String> options = new ArrayList<>();
    private int vel;
    private int optAW;
    private int pontok = 0;
    public jatek2() {
        initComponents();
        init();
        makeTask();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 196, 180));

        jButton1.setText("Kilép");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);

        jButton2.setText("Mehet!");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Töröl");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Pontok száma:");

        jLabel15.setText("A következő szavakból rakj ki egy helyes mondatot!");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Szókirakó");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)
                                    .addGap(62, 62, 62)
                                    .addComponent(jButton2))
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4))))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 342, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel16)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        main m1=new main(); 
        m1.show(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        torol();
        makeTask();
    }//GEN-LAST:event_jButton2MouseClicked
    private boolean jLB1Checked = false;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(jLB1Checked == false){
            jTextField1.setText(jTextField1.getText() + jLabel1.getText());
            jLB1Checked = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel1MouseClicked
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        torol();
    }//GEN-LAST:event_jButton3ActionPerformed
    private boolean jLB1Checked1 = false;
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(jLB1Checked1 == false){
            jTextField1.setText(jTextField1.getText() + jLabel2.getText());
            jLB1Checked1 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel2MouseClicked
    private boolean jLB1Checked2 = false;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(jLB1Checked2 == false){
            jTextField1.setText(jTextField1.getText() + jLabel3.getText());
            jLB1Checked2 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel3MouseClicked
    private boolean jLB1Checked3 = false;
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(jLB1Checked3 == false){
            jTextField1.setText(jTextField1.getText() + jLabel4.getText());
            jLB1Checked3 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel4MouseClicked
    private boolean jLB1Checked4 = false;
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(jLB1Checked4 == false){
            jTextField1.setText(jTextField1.getText() + jLabel5.getText());
            jLB1Checked4 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel5MouseClicked
    private boolean jLB1Checked5 = false;
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(jLB1Checked5 == false){
            jTextField1.setText(jTextField1.getText() + jLabel6.getText());
            jLB1Checked5 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel6MouseClicked
    private boolean jLB1Checked6 = false;
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(jLB1Checked6 == false){
            jTextField1.setText(jTextField1.getText() + jLabel7.getText());
            jLB1Checked6 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel7MouseClicked
    private boolean jLB1Checked7 = false;
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(jLB1Checked7 == false){
            jTextField1.setText(jTextField1.getText() + jLabel8.getText());
            jLB1Checked7 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel8MouseClicked
    private boolean jLB1Checked8 = false;
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(jLB1Checked8 == false){
            jTextField1.setText(jTextField1.getText() + jLabel9.getText());
            jLB1Checked8 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel9MouseClicked
    private boolean jLB1Checked9 = false;
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(jLB1Checked9 == false){
            jTextField1.setText(jTextField1.getText() + jLabel10.getText());
            jLB1Checked9 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel10MouseClicked
    private boolean jLB1Checked10 = false;
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(jLB1Checked10 == false){
            jTextField1.setText(jTextField1.getText() + jLabel11.getText());
            jLB1Checked10 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel11MouseClicked
    private boolean jLB1Checked11 = false;
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(jLB1Checked11 == false){
            jTextField1.setText(jTextField1.getText() + jLabel12.getText());
            jLB1Checked11 = true;
        }
        checkTask();
    }//GEN-LAST:event_jLabel12MouseClicked
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jatek2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jatek2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jatek2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jatek2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jatek2().setVisible(true);
            }
        });
    }
    private void readLines() throws IOException
    { 
        FileReader fr=new FileReader(f0);
        BufferedReader br=new BufferedReader(fr);
        while(br.ready()){
            sentences.add(br.readLine());
        }
        br.close();
        fr.close();
    }
    public void init(){
        jLabel13.setText("");
        optAW = 0;
        f0=new File("mondatok.txt");
            try{
            readLines();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    private void torol(){
        jTextField1.setText("");
        jLabel13.setText("");
        jLB1Checked = false;
        jLB1Checked1 = false;
        jLB1Checked2 = false;
        jLB1Checked3 = false;
        jLB1Checked4 = false;
        jLB1Checked5 = false;
        jLB1Checked6 = false;
        jLB1Checked7 = false;
        jLB1Checked8 = false;
        jLB1Checked9 = false;
        jLB1Checked10 = false;
        jLB1Checked11 = false;
}
    public void makeTask(){
        optAW = 0;
        Random rnd=new Random();
        vel=rnd.nextInt(sentences.size());
        options.clear();
        String szo="";
        for (int i=0;i<sentences.get(vel).length();i++){
            if(sentences.get(vel).charAt(i)!=' ')
            {
                szo+=sentences.get(vel).charAt(i);
            } else {
                options.add(szo + " ");
                optAW++;
                szo="";
            }
        }
        options.add(szo);  
        optAW++;
        while(options.size()<12){
            options.add("");
        }
        int db = 0;
        ArrayList<Integer> vel2List = new ArrayList<>();
        do{
            int vel2 = 0;
            do{
                vel2 = rnd.nextInt(12);
            }while(vel2List.contains(vel2));
            switch(vel2){
                case 0:
                    jLabel1.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 1:
                    jLabel2.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 2:
                    jLabel3.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 3:
                    jLabel4.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 4:
                    jLabel5.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 5:
                    jLabel6.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 6:
                    jLabel7.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 7:
                    jLabel8.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 8:
                    jLabel9.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 9:
                    jLabel10.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 10:
                    jLabel11.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
                case 11:
                    jLabel12.setText(options.get(db));
                    vel2List.add(vel2);
                    db++;
                    break;
            }
        }while(db<12);
}
    public void checkTask(){
        int db = 0;
        if(jLB1Checked == true) db++;
        if(jLB1Checked1 == true) db++;
        if(jLB1Checked2 == true) db++;
        if(jLB1Checked3 == true) db++;
        if(jLB1Checked4 == true) db++;
        if(jLB1Checked5 == true) db++;
        if(jLB1Checked6 == true) db++;
        if(jLB1Checked7 == true) db++;
        if(jLB1Checked8 == true) db++;
        if(jLB1Checked9 == true) db++;
        if(jLB1Checked10 == true) db++;
        if(jLB1Checked11 == true) db++;
        if(db == optAW){
            if(jTextField1.getText().equals(sentences.get(vel))){
                pontok += 5;
                jLabel14.setText("Pontok száma: " + pontok);
                jLabel13.setText("A válasz helyes!");
            } else {
                jLabel13.setText("A válasz helytelen!");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
