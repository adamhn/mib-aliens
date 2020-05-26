/*
 * Copyright (C) 2020 by Adam Hassan - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Adam Hassan <adamhassan@pm.me>, May 2020
 */
package mib.SubFrames;

/**
 *
 * @author Adam Hassan <adamhassan@pm.me>
 */
public class AddAgentFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddAgentFrame
     */
    public AddAgentFrame() {
        initComponents();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        addNewAlien = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox1.setText("Administrat�r");

        addNewAlien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNewAlien.setText("L�gg till Agent");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(labelForNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelForPhoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(phoneTextField)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addNewAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(addNewAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
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
                new AddAgentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewAlien;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel labelForNameField;
    private javax.swing.JLabel labelForPhoneTextField;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JSeparator seperator1;
    // End of variables declaration//GEN-END:variables
}
