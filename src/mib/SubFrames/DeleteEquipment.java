/*
 * Copyright (C) 2020 by Adam Hassan - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Adam Hassan <adamhassan@pm.me>, May 2020
 */
package mib.SubFrames;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

import mib.Helpers.Validate;
import mib.Helpers.Constant;

/**
 *
 * @author Adam Hassan <adamhassan@pm.me>
 */
public class DeleteEquipment extends javax.swing.JFrame {

    private static InfDB db;
    
    /**
     * Creates new form DeleteEquipment
     */
    public DeleteEquipment(InfDB db) {
        initComponents();
        
        this.db = db;
        
        this.setTitle("MiB - Ta bort Utrustning");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitleLabel = new javax.swing.JLabel();
        seperator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        equipmentTextField = new javax.swing.JTextField();
        searchAlien = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        chooseEquipmentComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        removeEquipment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLabel.setText("MiB - Ta bort Utrustning");
        mainTitleLabel.setAlignmentY(0.0F);

        seperator1.setAlignmentX(0.0F);
        seperator1.setAlignmentY(0.0F);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setText("S�k Utrustning");

        equipmentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentTextFieldActionPerformed(evt);
            }
        });

        searchAlien.setText("S�k");
        searchAlien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchAlien.setContentAreaFilled(false);
        searchAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAlienActionPerformed(evt);
            }
        });

        jLabel6.setText("V�lj Utrustning");

        chooseEquipmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("S�k Alien");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(equipmentTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chooseEquipmentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(equipmentTextField)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseEquipmentComboBox))
                .addContainerGap())
        );

        removeEquipment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        removeEquipment.setText("Ta bort Utrustning");
        removeEquipment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 2));
        removeEquipment.setContentAreaFilled(false);
        removeEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEquipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(524, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Searches for an alien with matching text from text field
     * @param evt 
     */
    @SuppressWarnings("unchecked")
    private void searchAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAlienActionPerformed
        equipmentTextFieldActionPerformed(evt);
    }//GEN-LAST:event_searchAlienActionPerformed

    /**
     * Removes an equipment from combo box
     * @param evt 
     */
    @SuppressWarnings("unchecked")
    private void removeEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEquipmentActionPerformed
        if (Validate.isTextEmpty(equipmentTextField) && Validate.isComboBoxEmpty(chooseEquipmentComboBox)){
            String[] chosenEquipment = chooseEquipmentComboBox.getSelectedItem().toString().split(" ");
            int equipmentID = Integer.parseInt(chosenEquipment[1]);
            
            try {
                String equipmentType = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + equipmentID);

                if (equipmentType != null){
                    db.delete("DELETE FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + equipmentID);
                }
                
                equipmentType = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM TEKNIK WHERE UTRUSTNINGS_ID = " + equipmentID);
                
                if(equipmentType != null){
                    db.delete("DELETE FROM TEKNIK WHERE UTRUSTNINGS_ID = " + equipmentID);
                }
                
                equipmentType = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM VAPEN WHERE UTRUSTNINGS_ID = " + equipmentID);
                
                if(equipmentType != null){
                    db.delete("DELETE FROM VAPEN WHERE UTRUSTNINGS_ID = " + equipmentID);
                }    
                db.delete("DELETE FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID  = " + equipmentID);
                db.delete("DELETE FROM UTRUSTNING WHERE UTRUSTNINGS_ID  = " + equipmentID);

                JOptionPane.showMessageDialog(null, "Utrustningen �r borttagen.");
                DeleteEquipment.this.dispose();
            } catch (InfException exception){
                JOptionPane.showMessageDialog(null, Constant.ERROR_DATABASE);
                System.out.println(exception.getMessage());
            }
        }
    }//GEN-LAST:event_removeEquipmentActionPerformed

    /**
     * Finds equipment with specified input name and populates data
     * in equipment combo box
     * @param evt 
     */
    private void equipmentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentTextFieldActionPerformed
        if (Validate.isTextEmpty(equipmentTextField)){
            try {
                ArrayList<HashMap<String, String>> searchResult = db.fetchRows("SELECT * FROM UTRUSTNING WHERE BENAMNING = \'" + equipmentTextField.getText() + "\'");

                if (searchResult == null){
                    JOptionPane.showMessageDialog(null, "Det finns ingen utrustning med det namnet.");
                    equipmentTextField.requestFocus();
                } else {
                    DefaultComboBoxModel equipmentToComboBox = new DefaultComboBoxModel();
                    for(HashMap utrustning : searchResult){
                        String equipmentInfo = "ID: " + utrustning.get("UTRUSTNINGS_ID") + " | Namn: " + utrustning.get("BENAMNING");
                        String equipmentType = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        if (equipmentType != null){
                            equipmentInfo += " | Kommunikation | �verf�ringsteknik: " + db.fetchSingle("SELECT OVERFORINGSTEKNIK FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        }
                        equipmentType = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        if(equipmentType != null){
                            equipmentInfo += " | Teknik | Kraftk�lla: " + db.fetchSingle("SELECT KRAFTKALLA FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        }
                        equipmentType = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        if(equipmentType != null){
                            equipmentInfo += " | Vapen | Kaliber: " + db.fetchSingle("SELECT KALIBER FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        }

                        equipmentToComboBox.addElement(equipmentInfo);
                    }
                    chooseEquipmentComboBox.setModel(equipmentToComboBox);
                }
            }
            catch(InfException exception){
                JOptionPane.showMessageDialog(null, Constant.ERROR_DATABASE);
                System.out.println(exception.getMessage());
            }
        }
    }//GEN-LAST:event_equipmentTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteEquipment(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseEquipmentComboBox;
    private javax.swing.JTextField equipmentTextField;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JButton removeEquipment;
    private javax.swing.JButton searchAlien;
    private javax.swing.JSeparator seperator1;
    // End of variables declaration//GEN-END:variables
}