package jfx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jatek2_nehez extends javax.swing.JFrame {
    public static int pontok = 0;
    private final File f0 = new File("mondatok_nehez.txt");
    private final ArrayList<String> sentences = new ArrayList<>();
    private final ArrayList<String> options = new ArrayList<>();
    private final ArrayList<String> input = new ArrayList<>();
    private static int indexL1 = -1;
    private int indexL2 = -1;
    private int indexL3 = -1;
    private int indexL4 = -1;
    private int indexL5 = -1;
    private int indexL6 = -1;
    private int indexL7 = -1;
    private int indexL8 = -1;
    private int indexL9 = -1;
    private int indexL10 = -1;
    private int indexL11 = -1;
    private int indexL12 = -1;
    private boolean jLB1Checked1 = false;
    private boolean jLB1Checked2 = false;
    private boolean jLB1Checked3 = false;
    private boolean jLB1Checked4 = false;
    private boolean jLB1Checked5 = false;
    private boolean jLB1Checked6 = false;
    private boolean jLB1Checked7 = false;
    private boolean jLB1Checked8 = false;
    private boolean jLB1Checked9 = false;
    private boolean jLB1Checked10 = false;
    private boolean jLB1Checked11 = false;
    private boolean jLB1Checked12 = false;
    private int inputI = 0;
    private int vel;
    private int optAW;
    private boolean mehet = false;
    public jatek2_nehez() throws IOException {
        initComponents();
        mehet = init();
        if(mehet == true)
            makeTask();
    }
    public boolean init() throws IOException{
        jLabel13.setText("");
        optAW = 0;
        if(fileReadMethod(f0)!=true) return false;
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
        jLB1Checked12 = false;
        return true;
    }
    private boolean fileReadMethod(File f) throws IOException
    { 
        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
            while(br.ready()){
                sentences.add(br.readLine());
            }
        } catch(IOException e) {
            return false;
        }
        return true;
    }
    public void removeText(int index){
        input.remove(index);
        for (int i = index; i < inputI; i++) {
            if(i == indexL1)indexL1--;
            if(i == indexL2)indexL2--;
            if(i == indexL3)indexL3--;
            if(i == indexL4)indexL4--;
            if(i == indexL5)indexL5--;
            if(i == indexL6)indexL6--;
            if(i == indexL7)indexL7--;
            if(i == indexL8)indexL8--;
            if(i == indexL9)indexL9--;
            if(i == indexL10)indexL10--;
            if(i == indexL11)indexL11--;
            if(i == indexL12)indexL12--;
        }
        inputI--;
        writeInPutList();      
    }
    public void writeInPutList(){
        jTextField1.setText("");
        for (int i = 0; i < input.size(); i++) {
            jTextField1.setText(jTextField1.getText()+input.get(i)+superscript(i+""));
        }
    }
    public void checkTask(){                                                    // JAVÍTÁSRA SZORUL !!!
        int db = 0;
        if((boolean)jLB1Checked1 == true) db++;
        if((boolean)jLB1Checked2 == true) db++;
        if((boolean)jLB1Checked3 == true) db++;
        if((boolean)jLB1Checked4 == true) db++;
        if((boolean)jLB1Checked5 == true) db++;
        if((boolean)jLB1Checked6 == true) db++;
        if((boolean)jLB1Checked7 == true) db++;
        if((boolean)jLB1Checked8 == true) db++;
        if((boolean)jLB1Checked9 == true) db++;
        if((boolean)jLB1Checked10 == true) db++;
        if((boolean)jLB1Checked11 == true) db++;
        if((boolean)jLB1Checked12 == true) db++;
        if(db == optAW){
            String valasz = "";
            for (int i = 0; i < input.size(); i++) {
                valasz+= input.get(i);
            }
            if( valasz.equals(sentences.get(vel))){
                pontok += 5;
                jLabel14.setText("Pontok száma: " + pontok);
                jLabel13.setText("A válasz helyes!");
            } else {
                jLabel13.setText("A válasz helytelen!");
            }
        }
    }
    public void makeTask(){                                                     // HIÁNYZIK ATINAK !!!
        input.clear();
        indexL2 = -1;
        indexL3 = -1;
        indexL4 = -1;
        indexL5 = -1;
        indexL6 = -1;
        indexL7 = -1;
        indexL8 = -1;
        indexL9 = -1;
        indexL10 = -1;
        indexL11 = -1;
        indexL12 = -1;
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
        jLB1Checked12 = false;
        jTextField1.setText("");
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
    public String superscript(String str) {
        str = str.replaceAll("0", "⁰");
        str = str.replaceAll("1", "¹");
        str = str.replaceAll("2", "²");
        str = str.replaceAll("3", "³");
        str = str.replaceAll("4", "⁴");
        str = str.replaceAll("5", "⁵");
        str = str.replaceAll("6", "⁶");
        str = str.replaceAll("7", "⁷");
        str = str.replaceAll("8", "⁸");
        str = str.replaceAll("9", "⁹");         
        return str;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(504, 332));

        jPanel1.setBackground(new java.awt.Color(243, 196, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(504, 332));

        jLabel2.setForeground(new java.awt.Color(85, 22, 13));
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(85, 22, 13));
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(85, 22, 13));
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(243, 196, 180));
        jButton1.setForeground(new java.awt.Color(85, 22, 13));
        jButton1.setText("Vissza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(85, 22, 13));
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(85, 22, 13));
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(85, 22, 13));
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(85, 22, 13));
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(85, 22, 13));
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(85, 22, 13));
        jLabel9.setText("jLabel9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(85, 22, 13));
        jLabel10.setText("jLabel10");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(85, 22, 13));
        jLabel11.setText("jLabel11");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(85, 22, 13));
        jLabel12.setText("jLabel12");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(85, 22, 13));

        jButton2.setBackground(new java.awt.Color(243, 196, 180));
        jButton2.setForeground(new java.awt.Color(85, 22, 13));
        jButton2.setText("Mehet!");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(85, 22, 13));
        jLabel14.setText("Pontok száma:");

        jLabel15.setForeground(new java.awt.Color(85, 22, 13));
        jLabel15.setText("A következő szavakból rakj ki egy helyes mondatot!");

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Mondatalkotós játék (nehezebb)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel15)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)))
                        .addComponent(jButton1))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(37, 37, 37))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12))
                    .addGap(33, 33, 33)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        main m1=new main(); 
        m1.show(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(mehet == true)
            makeTask();
    }//GEN-LAST:event_jButton2MouseClicked
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(jLB1Checked1 == false){
            indexL1 = inputI;
            inputI++;
            input.add(jLabel1.getText());
            writeInPutList();
            jLB1Checked1 = true;
        } else {
            removeText(indexL1);
            jLB1Checked1 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel1MouseClicked
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(jLB1Checked2 == false){
            indexL2 = inputI;
            inputI++;
            input.add(jLabel2.getText());
            writeInPutList();
            jLB1Checked2 = true;
        } else {
            removeText(indexL2);
            jLB1Checked2 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel2MouseClicked
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(jLB1Checked3 == false){
            indexL3 = inputI;
            inputI++;
            input.add(jLabel3.getText());
            writeInPutList();
            jLB1Checked3 = true;
        } else {
            removeText(indexL3);
            jLB1Checked3 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel3MouseClicked
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(jLB1Checked4 == false){
            indexL4 = inputI;
            inputI++;
            input.add(jLabel4.getText());
            writeInPutList();
            jLB1Checked4 = true;
        } else {
            removeText(indexL4);
            jLB1Checked4 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel4MouseClicked
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(jLB1Checked5 == false){
            indexL5 = inputI;
            inputI++;
            input.add(jLabel5.getText());
            writeInPutList();
            jLB1Checked5 = true;
        } else {
            removeText(indexL5);
            jLB1Checked5 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel5MouseClicked
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(jLB1Checked6 == false){
            indexL6 = inputI;
            inputI++;
            input.add(jLabel6.getText());
            writeInPutList();
            jLB1Checked6 = true;
        } else {
            removeText(indexL6);
            jLB1Checked6 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel6MouseClicked
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(jLB1Checked7 == false){
            indexL7 = inputI;
            inputI++;
            input.add(jLabel7.getText());
            writeInPutList();
            jLB1Checked7 = true;
        } else {
            removeText(indexL7);
            jLB1Checked7 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel7MouseClicked
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(jLB1Checked8 == false){
            indexL8 = inputI;
            inputI++;
            input.add(jLabel8.getText());
            writeInPutList();
            jLB1Checked8 = true;
        } else {
            removeText(indexL8);
            jLB1Checked8 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel8MouseClicked
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(jLB1Checked9 == false){
            indexL9 = inputI;
            inputI++;
            input.add(jLabel9.getText());
            writeInPutList();
            jLB1Checked9 = true;
        } else {
            removeText(indexL9);
            jLB1Checked9 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel9MouseClicked
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(jLB1Checked10 == false){
            indexL10 = inputI;
            inputI++;
            input.add(jLabel10.getText());
            writeInPutList();
            jLB1Checked10 = true;
        } else {
            removeText(indexL10);
            jLB1Checked10 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel10MouseClicked
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(jLB1Checked11 == false){
            indexL11 = inputI;
            inputI++;
            input.add(jLabel11.getText());
            writeInPutList();
            jLB1Checked11 = true;
        } else {
            removeText(indexL11);
            jLB1Checked11 = false;
        }
        checkTask();
    }//GEN-LAST:event_jLabel11MouseClicked
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(jLB1Checked12 == false){
            indexL12 = inputI;
            inputI++;
            input.add(jLabel12.getText());
            writeInPutList();
            jLB1Checked12 = true;
        } else {
            removeText(indexL12);
            jLB1Checked12 = false;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jatek2_nehez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new jatek2_nehez().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(jatek2_nehez.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
