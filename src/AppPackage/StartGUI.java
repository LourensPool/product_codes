/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Point;
import javax.swing.text.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Lourens
 */
public class StartGUI extends javax.swing.JFrame {

    /**
     * Creates new form StartGUI
     */
    public StartGUI() {
        
        initComponents(); 
        selectG();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGF = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jButtonShowProperties = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonGF2 = new javax.swing.JRadioButton();
        jRadioButtonGF3 = new javax.swing.JRadioButton();
        jRadioButtonGF8 = new javax.swing.JRadioButton();
        jButtonShowInfo = new javax.swing.JButton();
        jButtonGenCW = new javax.swing.JButton();
        jButtonSendZero = new javax.swing.JButton();
        jButtonRowDecode = new javax.swing.JButton();
        jButtonColumnDecode = new javax.swing.JButton();
        jRowBox = new javax.swing.JComboBox<>();
        jColumnBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        pGG = new javax.swing.JTextField();
        pBB = new javax.swing.JTextField();
        Gilbert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1920, 1080));

        jButtonShowProperties.setText("Show Properties");
        jButtonShowProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowPropertiesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("X PRODUCT CODES");

        buttonGroupGF.add(jRadioButtonGF2);
        jRadioButtonGF2.setSelected(true);
        jRadioButtonGF2.setText("GF 2");
        jRadioButtonGF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGF2ActionPerformed(evt);
            }
        });

        buttonGroupGF.add(jRadioButtonGF3);
        jRadioButtonGF3.setText("GF 3");
        jRadioButtonGF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGF3ActionPerformed(evt);
            }
        });

        buttonGroupGF.add(jRadioButtonGF8);
        jRadioButtonGF8.setText("GF 8");
        jRadioButtonGF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGF8ActionPerformed(evt);
            }
        });

        jButtonShowInfo.setText("Show Info Words");
        jButtonShowInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowInfoActionPerformed(evt);
            }
        });

        jButtonGenCW.setText("Generate Codewords");
        jButtonGenCW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenCWActionPerformed(evt);
            }
        });

        jButtonSendZero.setText("Send All Zero Word");
        jButtonSendZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendZeroActionPerformed(evt);
            }
        });

        jButtonRowDecode.setText("Decode Row");
        jButtonRowDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRowDecodeActionPerformed(evt);
            }
        });

        jButtonColumnDecode.setText("Decode Column");
        jButtonColumnDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColumnDecodeActionPerformed(evt);
            }
        });

        jRowBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(7; 4; 3)", "(8; 2; 5)" }));
        jRowBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRowBoxActionPerformed(evt);
            }
        });

        jColumnBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(7; 4; 3)", "(8; 2; 5)" }));
        jColumnBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColumnBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Row Code");

        jLabel4.setText("Column Code");

        jButton1.setText("Add manual errors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jTextArea2.setColumns(19);
        jTextArea2.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jTextArea3.setColumns(10);
        jTextArea3.setFont(new java.awt.Font("Ubuntu Light", 0, 25)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane2.setViewportView(jTextArea3);

        jTextArea4.setColumns(10);
        jTextArea4.setFont(new java.awt.Font("Ubuntu Light", 0, 25)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane3.setViewportView(jTextArea4);

        jTextArea5.setColumns(10);
        jTextArea5.setFont(new java.awt.Font("Ubuntu Light", 0, 25)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        pGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGGActionPerformed(evt);
            }
        });

        pBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBBActionPerformed(evt);
            }
        });

        Gilbert.setText("Send Gilbert");
        Gilbert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GilbertActionPerformed(evt);
            }
        });

        jLabel2.setText("Probability to stay in the good state");

        jLabel5.setText("Probability to stay in the error state");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRowBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jColumnBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonShowProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonGF2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonGF3)
                        .addGap(49, 49, 49)
                        .addComponent(jRadioButtonGF8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonShowInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenCW, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRowDecode))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonColumnDecode)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pBB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pGG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonSendZero, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gilbert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonColumnDecode)
                    .addComponent(jButtonRowDecode)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonGF2)
                            .addComponent(jRadioButtonGF3)
                            .addComponent(jRadioButtonGF8))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRowBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jColumnBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(50, 50, 50)
                                .addComponent(jButtonShowProperties))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonShowInfo)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonGenCW))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSendZero)
                        .addGap(9, 9, 9)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(pGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gilbert)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
 
    GFx objGF2 = new GFx (2);
    GFx objGF3 = new GFx (3);
    GFx objGF8 = new GFx (8);
    
    Integer [][] G_7_4_3 = new Integer[][] { {1,0,0,0,1,1,1}, {0,1,0,0,1,1,0}, {0,0,1,0,1,0,1}, {0,0,0,1,0,1,1} };
    Integer [][] G_8_2_5 = new Integer [][] { {1,0,1,1,1,1,0,0}, {0,1,1,1,0,0,1,1} };
   
    
    public int getSelectedGF (){
        String str = "";
        char lastChar;
        int GF = 0;
        
        for (Enumeration <AbstractButton> buttons = buttonGroupGF.getElements(); buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();
            
            if (button.isSelected()){
                str = button.getText();
                lastChar = str.charAt(str.length() -1);
                GF = Character.getNumericValue(lastChar);
                //System.out.println("Selected GF = " + GF);
                return GF;
            }
        }
        //System.out.println("-1, getSelectedGF() failed");
        return -1;
        
    }
    
    public void selectG () {
        
        if (jRowBox.getSelectedItem() == "(7; 4; 3)") {
            objGF2.setG(G_7_4_3, 7, 4, 3);
        } else if (jRowBox.getSelectedItem() == "(8; 2; 5)"){
            objGF2.setG(G_8_2_5, 8, 2, 5);
        }
        
        if (jColumnBox.getSelectedItem() == "(7; 4; 3)") {
            objGF2.setGColumn(G_7_4_3, 7, 4, 3);
        } else if (jColumnBox.getSelectedItem() == "(8; 2; 5)"){
            objGF2.setGColumn(G_8_2_5, 8, 2, 5);
        }
        
    }
     
    private void jButtonShowPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowPropertiesActionPerformed
        // TODO add your handling code here:
        int GF = getSelectedGF();
        String str = "";
        
        if (GF < 0){
            return;
        }
        else if (GF == 2){
            str += objGF2.printProperties();
            str += "\nROW MATRIX = \n" + objGF2.printG();
            str += "\nCOLUMN MATRIX = \n" + objGF2.printArray(objGF2.getGColumn());
            jTextArea1.setText(str);
        } else if (GF == 3){
            jTextArea1.setText(objGF3.printProperties());
        } else if (GF == 8){
            jTextArea1.setText(objGF8.printProperties());
        }    
    }//GEN-LAST:event_jButtonShowPropertiesActionPerformed
   
    
    private void jRadioButtonGF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGF2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jRadioButtonGF2ActionPerformed

    private void jRadioButtonGF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGF3ActionPerformed

    private void jRadioButtonGF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGF8ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jRadioButtonGF8ActionPerformed

    private void jButtonShowInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowInfoActionPerformed
        // TODO add your handling code here:
        
        // Previous actions 
        //jButtonShowPropertiesActionPerformed(evt);
        
        int GF = getSelectedGF ();
        if (GF < 0 ){
            return;
        } else if (GF == 2){
            objGF2.generateInfo();
            objGF2.generateInfoColumn();
            
            // Info prints.
            Integer[][] infoColumn = objGF2.getInfoColumn();
            Integer[][] infoRow = objGF2.getInfo();

            String str2 = "Amount of infowords = " + infoRow.length;
            str2 += "\nLength of infoword = " + infoRow[0].length + "\n\n";
           
            if (Arrays.deepEquals(infoColumn, infoRow) == true){
//                System.out.println("equal:" +  Arrays.deepEquals(infoColumn, infoRow));
                String stringInfo = objGF2.printArray(infoRow);
                str2 += "INFO WORDS (row and column): \n" + stringInfo;
            } else {
                String rowInfo = objGF2.printArray(infoRow);
                String colInfo = objGF2.printArray(infoColumn);
                
                str2 += "INFO WORDS (row): \n" + rowInfo + '\n';
                str2 += "INFO WORDS (column): \n" + colInfo;
            }
         
            jTextArea2.setText(str2);
        } else if (GF == 3){   
            String str3 = "Amount of infowords = " + objGF3.getInfo().length;
            str3 += "\nLength of infoword = " + objGF3.getInfo()[0].length + "\n\n";
            jTextArea2.setText(str3 + objGF3.printArray(objGF3.getInfo()));
              
        } else if (GF == 8){
            objGF8.generateInfoGF8();
            
            String str8 = "Amount of infowords = " + objGF8.getInfo().length;
            str8 += "\nLength of infoword = " + objGF8.getInfo()[0].length + "\n\n";
            jTextArea2.setText(str8 + objGF8.printArray(objGF8.getInfo() ));
            
            // Scroll to top. 
            jScrollPane2.getViewport().setViewPosition(new Point(0,0));
            
            DefaultCaret caret = (DefaultCaret) jTextArea2.getCaret();
            caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        }        
    }//GEN-LAST:event_jButtonShowInfoActionPerformed

    private void jButtonGenCWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenCWActionPerformed
        // TODO add your handling code here:
        // Prev actions
        //jButtonShowInfoActionPerformed(evt);
        
        int GF = getSelectedGF ();
        if (GF < 0 ){
            return;
        } else if (GF == 2){
            objGF2.generateCW();
            String str2 = "";
            str2 += "Length of a codeword = " + objGF2.getCW()[0].length;
            
            str2 += "\n\n" + objGF2.printArray(objGF2.getCW());
            
            // Column with (7,4,4) test
            objGF2.generateCWColumn();
            str2 += "\n\nCOLUMN CODEWORD: \n\n" + objGF2.printArray(objGF2.getCWColumn());
                
            jTextArea2.setText(str2);
        } else if (GF == 3){
            objGF3.generateCW();
            String str3 = "";
            str3 += "Length of a codeword = " + objGF3.getCW()[0].length;
            jTextArea2.setText(str3 + "\n\n" + objGF3.printArray(objGF3.getCW()));
        } else if (GF == 8){
            objGF8.generateCWGF8();
            String str8 = "";
            str8 += "Length of a codeword = " + objGF8.getCW()[0].length;
            
            jTextArea2.setText(str8 + "\n\n" + objGF8.printArray(objGF8.getCW()));
            
            jScrollPane2.getViewport().setViewPosition(new Point(0,0));
            DefaultCaret caret = (DefaultCaret) jTextArea2.getCaret();
            caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        }           
    }//GEN-LAST:event_jButtonGenCWActionPerformed

    
    private void jButtonSendZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendZeroActionPerformed
        // TODO add your handling code here:
        // Prev actions
        jButtonShowPropertiesActionPerformed(evt);
        jButtonShowInfoActionPerformed(evt);
        jButtonGenCWActionPerformed(evt);
        
        
        int GF = getSelectedGF ();       
//        double p = getProbability ();
        
        if (GF < 0 ){
            return;
        } else if (GF == 2){
            objGF2.fillZero();
            jTextArea3.setText(objGF2.printArray(objGF2.getSent()));
            jTextArea4.setText(objGF2.printArray(objGF2.getSent()));
            jTextArea5.setText(objGF2.printArray(objGF2.getSent()));
            
        } else if (GF == 3){
            //JOptionPane.showMessageDialog(null, "Before objGF3.fillZero(). CWColumn.length = " );
            //objGF3.generateCW_GF3(objGF3.getInfo(), objGF3.getG(), objGF3.getCW(), false);
            objGF3.fillZero();
            //JOptionPane.showMessageDialog(null, "After objGF3.fillZero()");
            jTextArea3.setText(objGF3.printArray(objGF3.getSent()));
            jTextArea4.setText(objGF3.printArray(objGF3.getSent()));
            jTextArea5.setText(objGF3.printArray(objGF3.getSent()));
        } else if (GF == 8){
            //objGF8.fillTest();
            objGF8.fillZero();
            jTextArea3.setText(objGF8.printArray(objGF8.getSent()));
        }          
        
             
    }//GEN-LAST:event_jButtonSendZeroActionPerformed

    private void jButtonRowDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRowDecodeActionPerformed
        // TODO add your handling code here:
        int GF = getSelectedGF ();
        if (GF < 0 ){
            return;
        } else if (GF == 2){
            objGF2.rowDecode();
            jTextArea4.setText(objGF2.printArray(objGF2.getSent()));
        } else if (GF == 3){
            objGF3.rowDecode();
            jTextArea4.setText(objGF3.printArray(objGF3.getSent()));
        } else if (GF == 8){
            objGF8.rowDecode();
            jTextArea4.setText(objGF8.printArray(objGF8.getSent()));
        }      
    }//GEN-LAST:event_jButtonRowDecodeActionPerformed

    private void jButtonColumnDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColumnDecodeActionPerformed

        int GF = getSelectedGF ();
        if (GF < 0 ){
            return;
        } else if (GF == 2){
            objGF2.columnDecode();
            jTextArea5.setText(objGF2.printArray(objGF2.getSent()));
        } else if (GF == 3){
            objGF3.columnDecode();
            jTextArea5.setText(objGF3.printArray(objGF3.getSent()));
        } else if (GF == 8){
            objGF8.columnDecode();
            jTextArea5.setText(objGF8.printArray(objGF8.getSent()));
        }      
    }//GEN-LAST:event_jButtonColumnDecodeActionPerformed

    private double getPGG () {
        String str = pGG.getText();
        
        if (str.isEmpty() == false){
            double p = Double.parseDouble(str);
            return p;
        } else {
            return -1.0;
        }

    }
    
    private double getPBB () {
        String str = pBB.getText();
        
        if (str.isEmpty() == false){
            double p = Double.parseDouble(str);
            return p;
        } else {
            return -1.0;
        }
    }
    
     
    
    
    
    private void jRowBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRowBoxActionPerformed
        // TODO add your handling code here:
        System.out.println("Selected item row = " + jRowBox.getSelectedItem());
        
        selectG();
        
        
        
    }//GEN-LAST:event_jRowBoxActionPerformed

    Integer[][] getUserErrors (){
        // Put errorString into array. 
        
        String errorString = jTextArea3.getText();
        String lines[] = errorString.split("\\r?\\n");
//        System.out.println(lines);
        
        int GF = getSelectedGF();
  
       
        GFx obj = null;
        if (GF == 2) {
            obj = objGF2;
        } else if (GF == 3) {
            obj = objGF3;
        } else if (GF == 8){
            obj = objGF8;
        }
     
        Integer[][] oldSend = obj.getSent();
        int rows = oldSend.length;
        int columns = oldSend[0].length;
        Integer[][] userErrors = new Integer[rows][columns];
        
        for (int row=0; row < rows; row++){
            System.out.println(lines[row]);
        }

        // Fill new userError array
        for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
                char userInput = lines[row].charAt(column);
                int value  = Character.getNumericValue(userInput);
                userErrors[row][column] = value;
            }
        }
        return userErrors;
    }
    
    private void setTextSent(int GF){
        if (GF < 0 ){
            return;
        } else if (GF == 2){
            jTextArea3.setText(objGF2.printArray(objGF2.getSent()));
            jTextArea4.setText(objGF2.printArray(objGF2.getSent()));
            jTextArea5.setText(objGF2.printArray(objGF2.getSent()));
            
        } else if (GF == 3){
            jTextArea3.setText(objGF3.printArray(objGF3.getSent()));
            jTextArea4.setText(objGF3.printArray(objGF3.getSent()));
            jTextArea5.setText(objGF3.printArray(objGF3.getSent()));
        } else if (GF == 8){
            //objGF8.fillTest();
            jTextArea3.setText(objGF8.printArray(objGF8.getSent()));
            jTextArea4.setText(objGF8.printArray(objGF8.getSent()));
            jTextArea5.setText(objGF8.printArray(objGF8.getSent()));
        }          
    }
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Prev actions
        //jButtonGenCWActionPerformed(evt);

        // Print user induced errors
        objGF2.setSent(getUserErrors());
        objGF3.setSent(getUserErrors());
        objGF8.setSent(getUserErrors());
        
        setTextSent(getSelectedGF());
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jColumnBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jColumnBoxActionPerformed
        // TODO add your handling code here:
        selectG();
    }//GEN-LAST:event_jColumnBoxActionPerformed

    private void pGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGGActionPerformed
        String str = pGG.getText();
        double pGG = Double.parseDouble(str);
        
        if (pGG < 0 || pGG > 1.0){
            System.out.println("P must be between 0 and 1.0 and is: " + pGG);
            JOptionPane.showMessageDialog(null, "P must be between 0 and 1.0 and is: " + pGG);
        }  
    }//GEN-LAST:event_pGGActionPerformed

    private void GilbertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GilbertActionPerformed
        // TODO add your handling code here:
        // Prev actions.
        jButtonGenCWActionPerformed(evt);
         
        double pGG = getPGG();
        double pBB = getPBB();
        boolean validInput = true;
        
//        JOptionPane.showMessageDialog(null, "pGG = " + pGG + "pBB = " + pBB);
        
        // pGG and pBB are set to -1.0 if user imput is empty.
        if (pGG < 0.0 || pBB < 0.0){
            validInput = false;
            JOptionPane.showMessageDialog(null, "At least one of the probability fields is EMPTY. Please input a value between 0.0 and 1.0.");
        }
        
        // check if user inputted a chance between 0 and 1. 
        if (validInput == true && (pGG < 0 || pGG > 1.0)){
            System.out.println("P must be between 0 and 1.0 and is: " + pGG);
            JOptionPane.showMessageDialog(null, "P must be between 0 and 1.0 and is: " + pGG);
            validInput = false;
        }
        
        if (validInput == true && (pBB < 0 || pBB > 1.0)){
            System.out.println("P must be between 0 and 1.0 and is: " + pBB);
            JOptionPane.showMessageDialog(null, "P must be between 0 and 1.0 and is: " + pBB);
            validInput = false;
        }
        
        if (validInput == true){
            int GF = getSelectedGF ();       
        
            if (GF < 0 ){
                return;
            } else if (GF == 2){
                objGF2.fillGilbert(pGG, pBB);
                jTextArea3.setText(objGF2.printArray(objGF2.getSent()));
                jTextArea4.setText(objGF2.printArray(objGF2.getSent()));
                jTextArea5.setText(objGF2.printArray(objGF2.getSent()));
            } else if (GF == 3){
                objGF3.fillGilbert(pGG, pBB);
                jTextArea3.setText(objGF3.printArray(objGF3.getSent()));
                jTextArea4.setText(objGF3.printArray(objGF3.getSent()));
                jTextArea5.setText(objGF3.printArray(objGF3.getSent()));
            } else if (GF == 8){
                //objGF8.fillTest();
                objGF8.fillGilbert(pGG, pBB);
                jTextArea3.setText(objGF8.printArray(objGF8.getSent()));
                jTextArea4.setText(objGF8.printArray(objGF8.getSent()));
                jTextArea5.setText(objGF8.printArray(objGF8.getSent()));
            }
        }
    }//GEN-LAST:event_GilbertActionPerformed

    private void pBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBBActionPerformed
        // TODO add your handling code here:
        String str = pBB.getText();
        double pBB = Double.parseDouble(str);
        
        if (pBB < 0 || pBB > 1.0){
            System.out.println("P must be between 0 and 1.0 and is: " + pBB);
            JOptionPane.showMessageDialog(null, "P must be between 0 and 1.0 and is: " + pBB);
        }
    }//GEN-LAST:event_pBBActionPerformed

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
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gilbert;
    private javax.swing.ButtonGroup buttonGroupGF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonColumnDecode;
    private javax.swing.JButton jButtonGenCW;
    private javax.swing.JButton jButtonRowDecode;
    private javax.swing.JButton jButtonSendZero;
    private javax.swing.JButton jButtonShowInfo;
    private javax.swing.JButton jButtonShowProperties;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jColumnBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JRadioButton jRadioButtonGF2;
    private javax.swing.JRadioButton jRadioButtonGF3;
    private javax.swing.JRadioButton jRadioButtonGF8;
    private javax.swing.JComboBox<String> jRowBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField pBB;
    private javax.swing.JTextField pGG;
    // End of variables declaration//GEN-END:variables
}
