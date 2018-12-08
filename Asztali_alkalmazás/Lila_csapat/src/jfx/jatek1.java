package jfx;

import java.awt.Color;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class jatek1 extends javax.swing.JFrame {
   
    private File f0;
    private File f1;
    private static ArrayList<String> sentences = new ArrayList<>();
    private static ArrayList<String> sentencesAW = new ArrayList<>();
    private static ArrayList<String> options = new ArrayList<>();
    public jatek1() {
        initComponents();
        init();
        makeTask();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstAWRG = new javax.swing.ButtonGroup();
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

        jLabel1.setText("Válaszd ki a helyes megoldást!");

        jButton1.setText("Mehet!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        firstTLB.setText("jLabel2");

        jButton2.setText("Kilép");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Pontok száma: ");

        firstAWRG.add(firstAWfourRB);
        firstAWfourRB.setText("jRadioButton4");
        firstAWfourRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWfourRBMouseClicked(evt);
            }
        });

        firstAWRG.add(firstAWoneRB);
        firstAWoneRB.setText("jRadioButton1");
        firstAWoneRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWoneRBMouseClicked(evt);
            }
        });

        firstAWRG.add(firstAWthreeRB);
        firstAWthreeRB.setText("jRadioButton3");
        firstAWthreeRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWthreeRBMouseClicked(evt);
            }
        });

        firstAWRG.add(firstAWtwoRB);
        firstAWtwoRB.setText("jRadioButton2");
        firstAWtwoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstAWtwoRBMouseClicked(evt);
            }
        });

        firstAWLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstAWLB.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstAWoneRB)
                            .addComponent(firstAWtwoRB)
                            .addComponent(firstAWfourRB)
                            .addComponent(firstAWthreeRB))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                            .addComponent(firstTLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(firstAWLB))
                                .addGap(0, 292, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static int pont=0;
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
    private  void readLines2() throws IOException
    {
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        while(br.ready()){
            sentencesAW.add(br.readLine());
        }
        br.close();
        fr.close();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        makeTask();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        main m1=new main();
        m1.show(true);     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void firstAWoneRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWoneRBMouseClicked
        if(options.get(0) == firstAWoneRB.getText()){
            pont+=5;
            jLabel3.setText("Pontok száma: "+pont);
            firstAWLB.setForeground(Color.green);
            firstAWLB.setText("A válasz helyes!");
        } else {
            firstAWLB.setForeground(Color.red);
            firstAWLB.setText("A válasz helytelen!");
        }
    }//GEN-LAST:event_firstAWoneRBMouseClicked
    private void firstAWtwoRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWtwoRBMouseClicked
        if(options.get(0) == firstAWtwoRB.getText()){
            pont+=5;
            jLabel3.setText("Pontok száma: "+pont);
            firstAWLB.setForeground(Color.green);
            firstAWLB.setText("A válasz helyes!");
        } else {
            firstAWLB.setForeground(Color.red);
            firstAWLB.setText("A válasz helytelen!");
        }
    }//GEN-LAST:event_firstAWtwoRBMouseClicked
    private void firstAWthreeRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWthreeRBMouseClicked
        if(options.get(0) == firstAWthreeRB.getText()){
            pont+=5;
            jLabel3.setText("Pontok száma: "+pont);
            firstAWLB.setForeground(Color.green);
            firstAWLB.setText("A válasz helyes!");
        } else {
            firstAWLB.setForeground(Color.red);
            firstAWLB.setText("A válasz helytelen!");
        }
    }//GEN-LAST:event_firstAWthreeRBMouseClicked
    private void firstAWfourRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstAWfourRBMouseClicked
        if(options.get(0) == firstAWfourRB.getText()){
            pont+=5;
            jLabel3.setText("Pontok száma: "+pont);
            firstAWLB.setForeground(Color.green);
            firstAWLB.setText("A válasz helyes!");
        } else {
            firstAWLB.setForeground(Color.red);
            firstAWLB.setText("A válasz helytelen!");
        }
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
                new jatek1().setVisible(true);
            }
        });
    }
    public void init(){
        f0=new File("kerdesek.txt");
        f1=new File("valaszok.txt");
        try{
            readLines();
        } catch(IOException e) {
            e.printStackTrace();
        }
        try{
            readLines2();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void makeTask(){
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
    // End of variables declaration//GEN-END:variables
}
