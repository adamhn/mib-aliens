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
import mib.Helpers.Constant;
import oru.inf.InfDB;
import oru.inf.InfException;
import mib.Helpers.Validate;

/**
 *
 * @author Adam Hassan <adamhassan@pm.me>
 */
public class DeleteAlienFrame extends javax.swing.JFrame {

    private static InfDB db;
    
    /**
     * Creates new form DeleteAlienFrame
     */
    public DeleteAlienFrame(InfDB db) {
        initComponents();
        
        this.db = db;
    }
    
    /**
     * Removes all information about an alien
     * @param alienID
     * @param race 
     */
    @SuppressWarnings("unchecked")
    private void removeAlien(int alienID, String race){
        try{
            db.delete("DELETE FROM " + race + " WHERE ALIEN_ID = " + alienID);
            db.delete("DELETE FROM ALIEN WHERE ALIEN_ID = " + alienID);    
        }
        catch(InfException exception){
            JOptionPane.showMessageDialog(null, Constant.ERROR_REMOVING_ALIEN);
            System.out.println(exception.getMessage());
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
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchNameTextField2 = new javax.swing.JTextField();
        searchAliens2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        chooseAlienComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        removeAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLabel.setText("MiB - �ndra Alien");
        mainTitleLabel.setAlignmentY(0.0F);

        seperator1.setAlignmentX(0.0F);
        seperator1.setAlignmentY(0.0F);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setText("Ange Namn");

        searchAliens2.setText("S�k Alien");
        searchAliens2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchAliens2.setContentAreaFilled(false);
        searchAliens2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAliens2ActionPerformed(evt);
            }
        });

        jLabel6.setText("V�lj Alien");

        chooseAlienComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(searchNameTextField2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchAliens2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chooseAlienComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchNameTextField2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchAliens2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseAlienComboBox2))
                .addContainerGap())
        );

        removeAlien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        removeAlien.setText("Ta bort Alien");
        removeAlien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 2));
        removeAlien.setContentAreaFilled(false);
        removeAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(440, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Searches for an alien name and populates it in combo box
     * for selection
     * @param evt 
     */
    @SuppressWarnings("unchecked")
    private void searchAliens2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAliens2ActionPerformed
        try {
            ArrayList<HashMap<String,String>> aliens = db.fetchRows("SELECT * FROM ALIEN WHERE NAMN = '" + searchNameTextField2.getText() + "'");
            DefaultComboBoxModel searchedAliensToComboBox = new DefaultComboBoxModel();

            if (aliens == null){
                searchedAliensToComboBox.addElement("-");
            } else {
                for(HashMap alien : aliens){
                    String race = "Boglodite";
                    String raceIdentifier = db.fetchSingle("SELECT ANTAL_BOOGIES FROM BOGLODITE WHERE ALIEN_ID = " + alien.get("ALIEN_ID"));
                    if(raceIdentifier == null){
                        race = "Squid";
                        raceIdentifier = db.fetchSingle("SELECT ANTAL_ARMAR FROM SQUID WHERE ALIEN_ID = " + alien.get("ALIEN_ID"));
                        if (raceIdentifier == null){
                            race = "Worm";
                        }
                    }

                    String everyAlien = "AlienID: " + alien.get("ALIEN_ID") + " | Plats: " +  db.fetchSingle("SELECT BENAMNING FROM PLATS WHERE PLATS_ID = " + alien.get("PLATS")) + " | Ras: " + race;
                    if (race.equals("Boglodite")){
                        everyAlien += " | Antal boogies: " + raceIdentifier;
                    }
                    else if(race.equals("Squid")){
                        everyAlien += " | Antal armar: " + raceIdentifier;
                    }
                    searchedAliensToComboBox.addElement(everyAlien);
                }
            }
            chooseAlienComboBox2.setModel(searchedAliensToComboBox);
        } catch(InfException exception){
            JOptionPane.showMessageDialog(null, Constant.ERROR_DATABASE);
            System.out.println(exception.getMessage());
        }
    }//GEN-LAST:event_searchAliens2ActionPerformed

    /**
     * Removes a selected alien from combo box
     * @param evt 
     */
    @SuppressWarnings("unchecked")
    private void removeAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAlienActionPerformed
        if (Validate.isTextFieldAndComboFilled(searchNameTextField2, chooseAlienComboBox2)){
            String[] alienSearch = chooseAlienComboBox2.getSelectedItem().toString().split(" ");
            int alienID = Integer.parseInt(alienSearch[1]);
            String oldRace = alienSearch[7];

            removeAlien(alienID, oldRace);
            JOptionPane.showMessageDialog(null, "Alien har raderats!");
            searchNameTextField2.setText("");
            DeleteAlienFrame.this.dispose();
        }
    }//GEN-LAST:event_removeAlienActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteAlienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteAlienFrame(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseAlienComboBox2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JButton removeAlien;
    private javax.swing.JButton searchAliens2;
    private javax.swing.JTextField searchNameTextField2;
    private javax.swing.JSeparator seperator1;
    // End of variables declaration//GEN-END:variables
}