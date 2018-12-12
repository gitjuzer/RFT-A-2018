package jfx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public final class jatek3 extends javax.swing.JFrame {
    public static int pontok = 0;
    private final File f0 = new File("egyenletek.txt");
    private final File f1 = new File("egyenletek_valaszok.txt");
    private final ArrayList<String> equation = new ArrayList<>();
    private final ArrayList<String> eqAW = new ArrayList<>();
    private final ArrayList<String> options = new ArrayList<>();
    private int vel1 = -1;
    private int vel2 = -1;
    private int vel3 = -1;
    private int vel4 = -1;
    private int vel5 = -1;
    private int helyes = 0;
    private boolean hely1 = false;
    private boolean hely2 = false;
    private boolean hely3 = false;
    private boolean hely4 = false;
    private boolean hely5 = false;
    private boolean mehet = false;
           
    public jatek3() {
        initComponents();
        mehet = init();
        if(mehet == true)
            makeTask();
    }
    public boolean init(){
        if(fileReadMethod(f0,true)!= true) return false;
        if(fileReadMethod(f1,false)!= true) return false;
        
        return true;
    }
    public boolean fileReadMethod(File f,boolean egyen){
        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
            while(br.ready()){
                if(egyen == true)
                    equation.add(br.readLine());
                else eqAW.add(br.readLine());
            }
        } catch(IOException e) {
            return false;
        }
        return true;
    }
    public void makeTask(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        helyes = 0;
        jLabel8.setText("Helyesek száma: "+ helyes);   
        hely1 = false;
        hely2 = false;
        hely3 = false;
        hely4 = false;
        hely5 = false;
        int db = 0;
        Random rnd = new Random();
        ArrayList<Integer> velList = new ArrayList<>();
        options.clear();
        do{
            vel1 = rnd.nextInt(equation.size());
            vel2 = rnd.nextInt(equation.size());
            vel3 = rnd.nextInt(equation.size());
            vel4 = rnd.nextInt(equation.size());
            vel5 = rnd.nextInt(equation.size());
        }while( (vel1 == vel2) ||
                (vel1 == vel3) ||
                (vel1 == vel4) ||
                (vel1 == vel5) ||
                (vel2 == vel3) ||
                (vel2 == vel4) ||
                (vel2 == vel5) ||
                (vel3 == vel4) ||
                (vel3 == vel5) ||
                (vel4 == vel5));
        options.add(equation.get(vel1));
        options.add(equation.get(vel2));
        options.add(equation.get(vel3));
        options.add(equation.get(vel4));
        options.add(equation.get(vel5));
        jLabel2.setText(options.get(0));
        jLabel3.setText(options.get(1));
        jLabel4.setText(options.get(2));
        jLabel5.setText(options.get(3));
        jLabel6.setText(options.get(4));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 196, 180));

        jPanel1.setBackground(new java.awt.Color(243, 196, 180));

        jButton1.setBackground(new java.awt.Color(243, 196, 180));
        jButton1.setForeground(new java.awt.Color(85, 22, 13));
        jButton1.setText("Vissza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(85, 22, 13));
        jLabel1.setText("Írd be a megfelelő számot angolul!");

        jLabel3.setForeground(new java.awt.Color(85, 22, 13));
        jLabel3.setText("jLabel3");

        jLabel2.setForeground(new java.awt.Color(85, 22, 13));
        jLabel2.setText("jLabel2");

        jLabel4.setForeground(new java.awt.Color(85, 22, 13));
        jLabel4.setText("jLabel4");

        jLabel5.setForeground(new java.awt.Color(85, 22, 13));
        jLabel5.setText("jLabel5");

        jLabel6.setForeground(new java.awt.Color(85, 22, 13));
        jLabel6.setText("jLabel6");

        jTextField1.setForeground(new java.awt.Color(85, 22, 13));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setForeground(new java.awt.Color(85, 22, 13));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(85, 22, 13));
        jLabel7.setText("Pontok száma: ");

        jTextField3.setForeground(new java.awt.Color(85, 22, 13));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setForeground(new java.awt.Color(85, 22, 13));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setForeground(new java.awt.Color(85, 22, 13));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(85, 22, 13));

        jButton2.setBackground(new java.awt.Color(243, 196, 180));
        jButton2.setForeground(new java.awt.Color(85, 22, 13));
        jButton2.setText("Mehet!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Számolós játék");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel9)
                .addGap(0, 228, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel8)
                    .addGap(0, 426, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(178, 178, 178)
                    .addComponent(jLabel8)
                    .addContainerGap(97, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        main m1=new main();
        m1.show(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(mehet == true)
            makeTask();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if(jTextField1.getText().equals(eqAW.get(vel1)))
        {
            helyes++;
            hely1 = true;
            pontok+=5;
            jLabel7.setText("Pontok száma: "+ pontok);
            jLabel8.setText("Helyesek száma: "+ helyes);        
        }
        else if(hely1 == true){
            helyes--;
            hely1 = false;
            jLabel8.setText("Helyesek száma: "+ helyes);
        }
        if(helyes == 5)
            jLabel8.setText("Mindegyik válasz helyes!");
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        if(jTextField2.getText().equals(eqAW.get(vel2)))
        {
            helyes++;
            hely2 = true;
            pontok+=5;
            jLabel7.setText("Pontok száma: "+ pontok);
            jLabel8.setText("Helyesek száma: "+ helyes);        
        }
        else if(hely2 == true){
            helyes--;
            hely2 = false;
            jLabel8.setText("Helyesek száma: "+ helyes);
        }
        if(helyes == 5)
            jLabel8.setText("Mindegyik válasz helyes!");
    }//GEN-LAST:event_jTextField2ActionPerformed
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        if(jTextField3.getText().equals(eqAW.get(vel3)))
        {
            helyes++;
            hely3 = true;
            pontok+=5;
            jLabel7.setText("Pontok száma: "+ pontok);
            jLabel8.setText("Helyesek száma: "+ helyes);        
        }
        else if(hely3 == true){
            helyes--;
            hely3 = false;
            jLabel8.setText("Helyesek száma: "+ helyes);
        }
        if(helyes == 5)
            jLabel8.setText("Mindegyik válasz helyes!");
    }//GEN-LAST:event_jTextField3ActionPerformed
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        if(jTextField4.getText().equals(eqAW.get(vel4)))
        {
            helyes++;
            hely4 = true;
            pontok+=5;
            jLabel7.setText("Pontok száma: "+ pontok);
            jLabel8.setText("Helyesek száma: "+ helyes);        
        }
        else if(hely4 == true){
            helyes--;
            hely1 = false;
            jLabel8.setText("Helyesek száma: "+ helyes);
        }
        if(helyes == 5)
            jLabel8.setText("Mindegyik válasz helyes!");
    }//GEN-LAST:event_jTextField4ActionPerformed
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        if(jTextField5.getText().equals(eqAW.get(vel5)))
        {
            helyes++;
            hely5 = true;
            pontok+=5;
            jLabel7.setText("Pontok száma: "+ pontok);
            jLabel8.setText("Helyesek száma: "+ helyes);        
        }
        else if(hely5 == true){
            helyes--;
            hely5 = false;
            jLabel8.setText("Helyesek száma: "+ helyes);
        }
        if(helyes == 5)
            jLabel8.setText("Mindegyik válasz helyes!");
    }//GEN-LAST:event_jTextField5ActionPerformed
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
            java.util.logging.Logger.getLogger(jatek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jatek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jatek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jatek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jatek3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
