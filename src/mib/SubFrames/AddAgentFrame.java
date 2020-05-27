/*
 * Copyright (C) 2020 by Adam Hassan - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Adam Hassan <adamhassan@pm.me>, May 2020
 */
package mib.SubFrames;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import mib.Helpers.Constant;
import mib.Helpers.Validate;

/**
 *
 * @author Adam Hassan <adamhassan@pm.me>
 */
public class AddAgentFrame extends javax.swing.JFrame {

    private static InfDB db;
    private static Random randGenerator = new Random();
    
    /**
     * Creates new form AddAgentFrame
     */
    public AddAgentFrame(InfDB db) {
        initComponents();
        
        this.db = db;
        this.setTitle("MiB - L�gg till Agent");
        
        setAreaComboBox();
    }
    
    /**
     * Fills area combo box with all areas retrieved from database.
     */
    @SuppressWarnings("unchecked")    
    private void setAreaComboBox(){
        DefaultComboBoxModel areas = new DefaultComboBoxModel();
        try{
            ArrayList<String> areasList = db.fetchColumn("SELECT BENAMNING FROM OMRADE");
            for (String omrade : areasList){
                areas.addElement(omrade);
            }
            areaComboBox.setModel(areas);
            areaComboBox.setSelectedIndex(1);
        }
        catch(InfException undantag){
            System.out.println(undantag);
        }
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
        nameTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        labelForPhoneTextField = new javax.swing.JLabel();
        labelForNameField = new javax.swing.JLabel();
        areaComboBox = new javax.swing.JComboBox<>();
        adminCheckBox = new javax.swing.JCheckBox();
        addNewAgentButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLabel.setText("MiB - L�gg till Agent");
        mainTitleLabel.setAlignmentY(0.0F);

        seperator1.setAlignmentX(0.0F);
        seperator1.setAlignmentY(0.0F);

        labelForPhoneTextField.setText("Telefon (friviligt)");
        labelForPhoneTextField.setAlignmentY(0.0F);

        labelForNameField.setText("Namn");
        labelForNameField.setAlignmentY(0.0F);

        adminCheckBox.setText("Administrat�r");

        addNewAgentButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNewAgentButton.setText("L�gg till Agent");
        addNewAgentButton.setAlignmentY(0.0F);
        addNewAgentButton.setContentAreaFilled(false);
        addNewAgentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addNewAgentButton.setFocusPainted(false);
        addNewAgentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAgentButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        cancelButton.setText("Avbryt");
        cancelButton.setAlignmentY(0.0F);
        cancelButton.setContentAreaFilled(false);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelButton.setFocusPainted(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtoncancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Omr�de");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(186, 186, 186))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(addNewAgentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(128, 128, 128)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(labelForNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelForPhoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelForNameField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelForPhoneTextField)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addNewAgentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(428, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Validate required input fields and register new agent with next available AgentID 
     * We get the next available ID by using InfDB:s getAutoIncrement() method.
     * Randomize password
     * Display information for the new AgentID upon successful register
     * @param evt 
     */
    private void addNewAgentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewAgentButtonActionPerformed
       if (Validate.isTextEmpty(nameTextField) && Validate.isTextEmpty(phoneTextField) &&
            Validate.isNameLengthCorrect(nameTextField) && Validate.isPhoneLengthCorrect(phoneTextField)){                
            
            String admin;
            String isAdmin;
            if (adminCheckBox.getSelectedObjects() == null){
                admin = "N";
                isAdmin = "Nej";
            }
            else{
                admin = "J";
                isAdmin = "Ja";
            }

            try{
                int newAgentID = Integer.parseInt(db.getAutoIncrement("AGENT", "AGENT_ID"));

                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date newDate = new Date();
                String employmentDate = dateFormat.format(newDate);

                String password = "" + randGenerator.nextInt(10) + randGenerator.nextInt(10) + randGenerator.nextInt(10) +randGenerator.nextInt(10) +randGenerator.nextInt(10) + randGenerator.nextInt(10);
                String name = nameTextField.getText();
                String phone = phoneTextField.getText();

                int areaIDs = Integer.parseInt(db.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = '" + areaComboBox.getSelectedItem().toString() + "'"));
                String area = db.fetchSingle("SELECT BENAMNING FROM OMRADE WHERE OMRADES_ID = " + areaIDs);
                System.out.println(2);
                
                db.insert("INSERT INTO AGENT VALUES("+ newAgentID + ", \'" + name + "\' , \'" + phone + "\', \'" + employmentDate + "\', \'" + admin + "\', \'" + password + "\', " + areaIDs + ")");
                System.out.println(3);
                
                JOptionPane.showMessageDialog(null, "Ny agent registrerad!" +
                    "\n\nNamn: " + name + 
                    "\n\nAgentID: " + newAgentID + 
                    "\nL�senord: " + password + 
                    "\nTelefon: " + phone + 
                    "\n\nAnst�llningsdatum: " + employmentDate + 
                    "\nOmr�de: " + area + 
                    "\nAdministrat�r: " + isAdmin);
                AddAgentFrame.this.dispose();
            }
            catch(InfException exception){
                JOptionPane.showMessageDialog(null, Constant.ERROR_DATABASE);
                System.out.println(exception.getMessage());
            }
                
        }
    }//GEN-LAST:event_addNewAgentButtonActionPerformed

    private void cancelButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtoncancelActionPerformed
        AddAgentFrame.this.dispose();
    }//GEN-LAST:event_cancelButtoncancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddAgentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAgentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAgentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAgentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAgentFrame(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewAgentButton;
    private javax.swing.JCheckBox adminCheckBox;
    private javax.swing.JComboBox<String> areaComboBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelForNameField;
    private javax.swing.JLabel labelForPhoneTextField;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JSeparator seperator1;
    // End of variables declaration//GEN-END:variables
}
