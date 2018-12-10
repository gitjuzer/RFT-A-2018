package jfx;

import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class jatek1 extends javax.swing.JFrame {
    public static int pont = 0;
    private final File f0 = new File("kerdesek.txt");
    private final File f1 = new File("valaszok.txt");
    private final ArrayList<String> sentences = new ArrayList<>();
    private final ArrayList<String> sentencesAW = new ArrayList<>();
    private final ArrayList<String> options = new ArrayList<>();
    private boolean mehet = false;
    public jatek1() throws IOException {
        initComponents();
        mehet = init();
        if(mehet == true)
            makeTask();
    }
    public boolean init() throws IOException{
        if(fileReadMethod(f0,true)!= true) return false;
        if(fileReadMethod(f1,false)!= true) return false;
        if(sentences.size()*4 != sentencesAW.size()) return false;
        firstAWoneRB.setSelected(false);
        firstAWtwoRB.setSelected(false);
        firstAWthreeRB.setSelected(false);
        firstAWfourRB.setSelected(false);
        return true;
    }
    private boolean fileReadMethod(File f,boolean senten) throws IOException
    {
        try(FileReader fr = new FileReader(f)) {
            BufferedReader br=new BufferedReader(fr);
            while(br.ready()){
                if(senten == true)
                    sentences.add(br.readLine());
                else sentencesAW.add(br.readLine());
            }
            br.close();      
        } catch(IOException e){
            return false;
        }    
        return true;
    }
    public void makeTask(){
        firstAWoneRB.setSelected(false);
        firstAWtwoRB.setSelected(false);
        firstAWthreeRB.setSelected(false);
        firstAWfourRB.setSelected(false);
        firstAWLB.setText("");
        Random rnd=new Random();
        int sen = rnd.nextInt(sentences.size());
        firstTLB.setText(sentences.get(sen));
        options.clear();
        options.add(sentencesAW.get(sen*4));
        options.add(sentencesAW.get(sen*4+1));
        options.add(sentencesAW.get(sen*4+2));
        options.add(sentencesAW.get(sen*4+3));
        int db = 0;
        ArrayList<Integer> velList = new ArrayList<>();
        do{
            int vel = 0;
            do{
                vel = rnd.nextInt(4);
            }while(velList.contains(vel));
            switch(vel){
                case 0:
                    firstAWoneRB.setText(options.get(db));
                    velList.add(vel);
                    db++;
                    break;
                case 1:
                    firstAWtwoRB.setText(options.get(db));
                    velList.add(vel);
                    db++;
                    break;
                case 2:
                    firstAWthreeRB.setText(options.get(db));
                    velList.add(vel);
                    db++;
                    break;
                case 3:
                    firstAWfourRB.setText(options.get(db));
                    velList.add(vel);
                    db++;
                    break;
            }
        }while(db<4);
    }
    public void RadioButtonCheck(String text){
        if(options.get(0) == text){
            pont+=5;
            jLabel3.setText("Pontok száma: " + pont);
            firstAWLB.setForeground(Color.green);
            firstAWLB.setText("A válasz helyes!");
        } else {
            firstAWLB.setForeground(Color.red);
            firstAWLB.setText("A válasz helytelen!");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstAWRG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        firstTLB = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        firstAWfourRB = new javax.swing.JRadioButton();
        firstAWoneRB = new javax.swing.JRadioButton();
        firstAWthreeRB = new javax.swing.JRadioButton();
        firstAWtwoRB = new javax.swing.JRadioButton();
        firstAWLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(243, 196, 180));

        jLabel1.setForeground(new java.awt.Color(85, 22, 13));
        jLabel1.setText("Válaszd ki a helyes megoldást!");

        jButton1.setBackground(new java.awt.Color(243, 196, 180));
        jButton1.setForeground(new java.awt.Color(85, 22, 13));
        jButton1.setText("Mehet!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        firstTLB.setForeground(new java.awt.Color(85, 22, 13));
        firstTLB.setText("jLabel2");

        jButton2.setBackground(new java.awt.Color(243, 196, 180));
        jButton2.setForeground(new java.awt.Color(85, 22, 13));
        jButton2.setText("Vissza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(85, 22, 13));
        jLabel3.setText("Pontok száma: ");

        firstAWfourRB.setBackground(new java.awt.Color(243, 196, 180));
        firstAWRG.add(firstAWfourRB);
        firstAWfourRB.setForeground(new java.awt.Color(85, 22, 13));
        firstAWfourRB.setText("jRadioButton4");
        firstAWfourRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWfourRBMouseClicked(evt);
            }
        });

        firstAWoneRB.setBackground(new java.awt.Color(243, 196, 180));
        firstAWRG.add(firstAWoneRB);
        firstAWoneRB.setForeground(new java.awt.Color(85, 22, 13));
        firstAWoneRB.setText("jRadioButton1");
        firstAWoneRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWoneRBMouseClicked(evt);
            }
        });

        firstAWthreeRB.setBackground(new java.awt.Color(243, 196, 180));
        firstAWRG.add(firstAWthreeRB);
        firstAWthreeRB.setForeground(new java.awt.Color(85, 22, 13));
        firstAWthreeRB.setText("jRadioButton3");
        firstAWthreeRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWthreeRBMouseClicked(evt);
            }
        });

        firstAWtwoRB.setBackground(new java.awt.Color(243, 196, 180));
        firstAWRG.add(firstAWtwoRB);
        firstAWtwoRB.setForeground(new java.awt.Color(85, 22, 13));
        firstAWtwoRB.setText("jRadioButton2");
        firstAWtwoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWtwoRBMouseClicked(evt);
            }
        });

        firstAWLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstAWLB.setForeground(new java.awt.Color(85, 22, 13));
        firstAWLB.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstAWoneRB)
                                .addComponent(firstAWtwoRB)
                                .addComponent(firstAWfourRB)
                                .addComponent(firstAWthreeRB))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                        .addComponent(firstTLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(firstAWLB))
                            .addGap(292, 292, 292)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(firstTLB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(firstAWoneRB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(firstAWtwoRB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(firstAWthreeRB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(firstAWfourRB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(firstAWLB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(35, 35, 35)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(mehet == true)
            makeTask();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        main m1=new main();
        m1.show(true);     
    }//GEN-LAST:event_jButton2ActionPerformed
    private void firstAWoneRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWoneRBMouseClicked
        RadioButtonCheck(firstAWoneRB.getText());
    }//GEN-LAST:event_firstAWoneRBMouseClicked
    private void firstAWtwoRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWtwoRBMouseClicked
        RadioButtonCheck(firstAWtwoRB.getText());
    }//GEN-LAST:event_firstAWtwoRBMouseClicked
    private void firstAWthreeRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWthreeRBMouseClicked
        RadioButtonCheck(firstAWthreeRB.getText());
    }//GEN-LAST:event_firstAWthreeRBMouseClicked
    private void firstAWfourRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWfourRBMouseClicked
        RadioButtonCheck(firstAWfourRB.getText());
    }//GEN-LAST:event_firstAWfourRBMouseClicked
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
            java.util.logging.Logger.getLogger(jatek1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jatek1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jatek1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jatek1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new jatek1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(jatek1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firstAWLB;
    private javax.swing.ButtonGroup firstAWRG;
    private javax.swing.JRadioButton firstAWfourRB;
    private javax.swing.JRadioButton firstAWoneRB;
    private javax.swing.JRadioButton firstAWthreeRB;
    private javax.swing.JRadioButton firstAWtwoRB;
    private javax.swing.JLabel firstTLB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
