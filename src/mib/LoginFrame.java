package mib;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mib.Helpers.Validate;

import oru.inf.InfDB;
import oru.inf.InfException;

import javax.swing.JOptionPane;

/**
 *
 * @author adahass
 */
public class LoginFrame extends javax.swing.JFrame {

    private static InfDB db;
    
    /**
     * Creates new form Login
     */
    public LoginFrame(InfDB db) {
        initComponents();
        this.db = db;
        
        this.setTitle("MiB - Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        loginButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MiB - Login");
        jLabel1.setAlignmentY(0.0F);

        usernameTextField.setToolTipText("Enter your username");
        usernameTextField.setAlignmentX(0.0F);
        usernameTextField.setAlignmentY(0.0F);
        usernameTextField.setName(""); // NOI18N

        passwordTextField.setToolTipText("Enter your password");
        passwordTextField.setAlignmentX(0.0F);
        passwordTextField.setAlignmentY(0.0F);

        jSeparator1.setAlignmentX(0.0F);
        jSeparator1.setAlignmentY(0.0F);

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginButton.setText("Logga in");
        loginButton.setAlignmentY(0.0F);
        loginButton.setContentAreaFilled(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameLabel.setText("Ange ID");
        usernameLabel.setAlignmentY(0.0F);

        passwordLabel.setText("Lösenord");
        passwordLabel.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Copyright © 2020 Men in Black. Alla rättigheter förbehålls.");

        loginType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Som Agent", "Som Alien" }));
        loginType.setToolTipText("");
        loginType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(loginType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(364, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:

        if (Validate.isTextEmpty(usernameTextField) && Validate.isTextEmpty(passwordTextField)) {
            String usernameID = usernameTextField.getText();
            String password = new String(passwordTextField.getPassword());
            
            if (String.valueOf(loginType.getSelectedItem()) == "Som Agent") {                
                try {
                    if (password.equals(db.fetchSingle("SELECT LOSENORD FROM AGENT where Agent_ID=" + usernameID))) {
                        if (db.fetchSingle("SELECT ADMINISTRATOR FROM AGENT WHERE AGENT_ID =" + usernameID).equals("J")){
                            this.dispose();
                            new AgentFrame(db, usernameID, true).setVisible(true);
                            return;
                        }
                        
                        this.dispose();
                        new AgentFrame(db, usernameID, false).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ditt Agent ID eller lösenord är fel.");
                    }
                } catch (InfException exception) {
                    JOptionPane.showMessageDialog(null, "Någonting gick fel med databasuppkopplingen.");
                    System.out.println("Felet är: " + exception.getMessage());
                }
            } else if (String.valueOf(loginType.getSelectedItem()) == "Som Alien") {
                System.out.println("Alien vald");
                try {
                    if (password.equals(db.fetchSingle("SELECT LOSENORD FROM ALIEN where Alien_ID=" + usernameID))) {
                        this.dispose();
                        new AlienFrame(db, usernameID).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ditt Alien ID eller lösenord är fel.");
                    }
                } catch (InfException exception) {
                    JOptionPane.showMessageDialog(null, "Någonting gick fel med databasuppkopplingen.");
                    System.out.println("Felet är: " + exception.getMessage());
                }
            }
            

            
            
//            System.out.println(password);
//            String statement = "select * from agent where losenord='" + password + "'";
//            System.out.println(statement);
//            try {
//                HashMap<String, String> agent = idb.fetchRow(statement);
//                
//                
//                for (Object value : agent.values()) {
//                    System.out.println(value.toString());
//                }
//                
//            } catch (InfException e) {
//                JOptionPane.showMessageDialog(null, "Query could not be executed.");
//                System.out.println(e);
//            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTypeActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButton;
    private javax.swing.JComboBox<String> loginType;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
