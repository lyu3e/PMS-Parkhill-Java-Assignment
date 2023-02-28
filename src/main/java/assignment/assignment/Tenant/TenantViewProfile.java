package assignment.assignment.Tenant;

import assignment.assignment.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class TenantViewProfile extends javax.swing.JFrame {
    
    private User user;
    private Tenant tenant;
    public TenantViewProfile(User user) {
        
        this.user = user;
        initComponents();
        getInfo("Tenant");

    }
    
    private void getInfo(String role) {
    // Read the text file
    Scanner sc = null;
    
    File file = new File(role + "Info.txt");
    try {
        sc = new Scanner(file);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    // Get the user's info
    while (sc.hasNextLine()) {
        String line = sc.nextLine();
        String[] splitLine = line.split(":");
        if (splitLine[1].equals(Integer.toString(user.getUserId()))) {
            tenant = new Tenant(user.getUserId(), user.getPassword(), role, user.getName(), user.getEmail(), splitLine[0], splitLine[2], splitLine[3]);
            TenantID.setText(Integer.toString(user.getUserId()));
            TenantProfileName.setText(user.getName());
            TenantProfileEmail.setText(user.getEmail());
            TenantProfilePhone.setText(tenant.getPhone());
            TenantProfilePassword.setText(user.getPassword());
        }
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TenantUpdateProfile = new javax.swing.JButton();
        TenantID = new javax.swing.JTextField();
        TenantProfileName = new javax.swing.JTextField();
        TenantProfileEmail = new javax.swing.JTextField();
        TenantProfilePhone = new javax.swing.JTextField();
        TenantProfilePassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID : ");

        jLabel3.setText("Phone :");

        jLabel4.setText("Name : ");

        jLabel5.setText("Email :");

        jLabel6.setText("Password :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Profile");

        TenantUpdateProfile.setText("Update");
        TenantUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantUpdateProfileActionPerformed(evt);
            }
        });

        TenantID.setEditable(false);
        TenantID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantIDActionPerformed(evt);
            }
        });

        TenantProfileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantProfileNameActionPerformed(evt);
            }
        });

        TenantProfileEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantProfileEmailActionPerformed(evt);
            }
        });

        TenantProfilePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantProfilePhoneActionPerformed(evt);
            }
        });

        TenantProfilePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantProfilePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TenantUpdateProfile)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TenantID)
                        .addComponent(TenantProfileName)
                        .addComponent(TenantProfileEmail)
                        .addComponent(TenantProfilePhone)
                        .addComponent(TenantProfilePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TenantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TenantProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TenantProfileEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TenantProfilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TenantProfilePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TenantUpdateProfile)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TenantIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantIDActionPerformed

    private void TenantProfileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantProfileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantProfileNameActionPerformed

    private void TenantProfileEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantProfileEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantProfileEmailActionPerformed

    private void TenantProfilePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantProfilePhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantProfilePhoneActionPerformed

    private void TenantProfilePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantProfilePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantProfilePasswordActionPerformed

    private void TenantUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantUpdateProfileActionPerformed
        File file = new File("src/main/java/assignment/assignment/TxtFile/TenantInfo.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String tenantId = tenant.getTenantID();
            String userid = Integer.toString(user.getUserId());
            String phone = TenantProfilePhone.getText();
            String unitNumber = tenant.getUnitNumber();
            String colHeadings = tenantId + ":" + userid + ":" + phone + ":" + unitNumber;
            
            bw.write(colHeadings + "\n");
            showMessageDialog(null, "Update successful");
            
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(TenantViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        file = new File("src/main/java/assignment/assignment/TxtFile/UserInfo.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String userid = Integer.toString(user.getUserId());
            String name = TenantProfileName.getText();
            String password = TenantProfilePassword.getText();
            String email = TenantProfileEmail.getText();
            String colHeadings = userid + ":" + name + ":" + password + ":" + email + ":tenant" ;
            
            bw.write(colHeadings + "\n");
            showMessageDialog(null, "Update successful");
            
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(TenantViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TenantUpdateProfileActionPerformed

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
            java.util.logging.Logger.getLogger(TenantViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TenantID;
    private javax.swing.JTextField TenantProfileEmail;
    private javax.swing.JTextField TenantProfileName;
    private javax.swing.JTextField TenantProfilePassword;
    private javax.swing.JTextField TenantProfilePhone;
    private javax.swing.JButton TenantUpdateProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
