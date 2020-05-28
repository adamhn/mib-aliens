/*
 * Copyright (C) 2020 by Adam Hassan - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Adam Hassan <adamhassan@pm.me>, May 2020
 */
package mib.SubFrames;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

import oru.inf.InfDB;
import oru.inf.InfException;

import mib.Helpers.Validate;
import mib.Helpers.Constant;

/**
 *
 * @author Adam Hassan <adamhassan@pm.me>
 */
public class AddAlienFrame extends javax.swing.JFrame {

    private static InfDB db;
    private static Random randGenerator = new Random();
    
    /**
     * Creates new form AddAlien
     */
    public AddAlienFrame(InfDB db) {
        initComponents();
        
        AddAlienFrame.db = db;
        
        this.setTitle("MiB - L�gg till Alien");
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
        labelForNameField = new javax.swing.JLabel();
        addNewAlien = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        labelForPhoneTextField = new javax.swing.JLabel();
        labelForRaceComboBox = new javax.swing.JLabel();
        raceComboBox = new javax.swing.JComboBox<>();
        nameTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLabel.setText("MiB - L�gg till Alien");
        mainTitleLabel.setAlignmentY(0.0F);

        seperator1.setAlignmentX(0.0F);
        seperator1.setAlignmentY(0.0F);

        labelForNameField.setText("Namn");
        labelForNameField.setAlignmentY(0.0F);

        addNewAlien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNewAlien.setText("L�gg till Alien");
        addNewAlien.setAlignmentY(0.0F);
        addNewAlien.setContentAreaFilled(false);
        addNewAlien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addNewAlien.setFocusPainted(false);
        addNewAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAlienchangePasswordActionPerformed(evt);
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

        labelForPhoneTextField.setText("Telefon (friviligt)");
        labelForPhoneTextField.setAlignmentY(0.0F);

        labelForRaceComboBox.setText("Ras");
        labelForRaceComboBox.setAlignmentY(0.0F);

        raceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Worm", "Squid", "Boglodite" }));

        jLabel1.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(labelForNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelForRaceComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(raceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelForPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(addNewAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelForNameField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelForPhoneTextField)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(raceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelForRaceComboBox)
                        .addComponent(jLabel1)))
                .addGap(40, 40, 40)
                .addComponent(addNewAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewAlienchangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewAlienchangePasswordActionPerformed
        if (Validate.isTextEmpty(nameTextField)&& Validate.isTextEmpty(phoneTextField)) {
        
            String name = nameTextField.getText();
            String phone = phoneTextField.getText();
            String password = new String(passwordTextField.getPassword());
            
            int randomNr = new Random().nextInt(10) + 1; // random number between 1-10
                    
            try { 
                if (Validate.isPasswordLengthCorrect(passwordTextField)) {
                    int newAlienID = Integer.parseInt(db.getAutoIncrement("ALIEN", "ALIEN_ID"));

                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                    String registerDate = dateFormat.format(new Date());

                    int place = randGenerator.nextInt(Integer.parseInt(db.fetchSingle("SELECT COUNT(PLATS_ID) FROM PLATS"))) + 1;                   
                    String placeName = db.fetchSingle("SELECT BENAMNING FROM PLATS WHERE PLATS_ID = " + place);
                    String area = db.fetchSingle("SELECT FINNS_I FROM PLATS WHERE PLATS_ID = " + place);

                    int responsibleAgentID = Integer.parseInt(db.fetchSingle("SELECT FIRST 1 AGENT_ID, COUNT(ANSVARIG_AGENT) FROM AGENT LEFT JOIN ALIEN ON ANSVARIG_AGENT = AGENT_ID WHERE OMRADE = " + area + " GROUP BY AGENT_ID ORDER BY COUNT(*) ASC"));
                    String responsibleAgent = db.fetchSingle("SELECT NAMN FROM AGENT WHERE AGENT_ID = " + responsibleAgentID);

                    db.insert("INSERT INTO ALIEN VALUES("+ newAlienID + ", \'" + registerDate + "\' , \'" + password + "\', \'" + name +"\', \'" + phone + "\', " + place + ", " + responsibleAgentID + ")");
                    
                    String raceQuery = "";
                    
                    if (raceComboBox.getSelectedItem().toString().equals("Worm")){
                        raceQuery = "INSERT INTO WORM VALUES (" + newAlienID + ")";
                    } else if (raceComboBox.getSelectedItem().toString().equals("Squid")) {
                        raceQuery = "INSERT INTO SQUID VALUES (" + newAlienID + ", " + randomNr + ")";
                    } else if (raceComboBox.getSelectedItem().toString().equals("Boglodite")){
                        raceQuery = "INSERT INTO BOGLODITE VALUES (" + newAlienID + ", " + randomNr + ")";
                    }
                    
                    db.insert(raceQuery);
                    
                    JOptionPane.showMessageDialog(null, "Ny alien registrerad!" +
                           "\nNamn: " + name +
                           "\nAlienID: " + newAlienID + 
                           "\nL�senord: " + password + 
                           "\nTelefon: " + phone + 
                           "\nRegistreringsdatum: " + registerDate + 
                           "\nTilldelad plats: " + placeName + 
                           "\nAnsvarig agent: " + responsibleAgent);

                    AddAlienFrame.this.dispose();
                } 
            } catch (InfException exception) {
                JOptionPane.showMessageDialog(null, Constant.ERROR_DATABASE);
                System.out.println(exception.getMessage());
            }
        }
    }//GEN-LAST:event_addNewAlienchangePasswordActionPerformed

    private void cancelButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtoncancelActionPerformed
        AddAlienFrame.this.dispose();
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
            java.util.logging.Logger.getLogger(AddAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAlienFrame(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewAlien;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelForNameField;
    private javax.swing.JLabel labelForPhoneTextField;
    private javax.swing.JLabel labelForRaceComboBox;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JComboBox<String> raceComboBox;
    private javax.swing.JSeparator seperator1;
    // End of variables declaration//GEN-END:variables
}
