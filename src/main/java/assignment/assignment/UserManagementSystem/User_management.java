/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.UserManagementSystem;

import assignment.assignment.Tenant.Tenant;

/**
 *
 * @author user
 */
public class User_management extends javax.swing.JFrame {

    /**
     * Creates new form User_management
     */
    public User_management() {
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

        ManageProfilePanel = new javax.swing.JPanel();
        ViewProfileBTN = new javax.swing.JButton();
        ManageUserPanel = new javax.swing.JPanel();
        SearchUserBTN = new javax.swing.JButton();
        DeleteUserBTN = new javax.swing.JButton();
        AddUserBTN = new javax.swing.JButton();
        ModifyUserBTN = new javax.swing.JButton();
        ManageTenantPanel = new javax.swing.JPanel();
        SearchTenantBTN = new javax.swing.JButton();
        ViewTenantBTN = new javax.swing.JButton();
        ModifyTenantBTN = new javax.swing.JButton();
        AddTenantBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageProfilePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Profile"));

        ViewProfileBTN.setText("View Profile");
        ViewProfileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProfileBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageProfilePanelLayout = new javax.swing.GroupLayout(ManageProfilePanel);
        ManageProfilePanel.setLayout(ManageProfilePanelLayout);
        ManageProfilePanelLayout.setHorizontalGroup(
            ManageProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageProfilePanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(ViewProfileBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageProfilePanelLayout.setVerticalGroup(
            ManageProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageProfilePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ViewProfileBTN)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        ManageUserPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage User"));

        SearchUserBTN.setText("Search User");

        DeleteUserBTN.setText("Delete User");

        AddUserBTN.setText("Add User");
        AddUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserBTNActionPerformed(evt);
            }
        });

        ModifyUserBTN.setText("Modify User");

        javax.swing.GroupLayout ManageUserPanelLayout = new javax.swing.GroupLayout(ManageUserPanel);
        ManageUserPanel.setLayout(ManageUserPanelLayout);
        ManageUserPanelLayout.setHorizontalGroup(
            ManageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ModifyUserBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(AddUserBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(ManageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteUserBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(SearchUserBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageUserPanelLayout.setVerticalGroup(
            ManageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUserBTN)
                    .addComponent(SearchUserBTN))
                .addGap(41, 41, 41)
                .addGroup(ManageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyUserBTN)
                    .addComponent(DeleteUserBTN))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        ManageTenantPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Resident/Tenant"));

        SearchTenantBTN.setText("Search Tenant");

        ViewTenantBTN.setText("View Tenant");

        ModifyTenantBTN.setText("Modify Tenant");
        ModifyTenantBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyTenantBTNActionPerformed(evt);
            }
        });

        AddTenantBTN.setText("Add Tenant");

        javax.swing.GroupLayout ManageTenantPanelLayout = new javax.swing.GroupLayout(ManageTenantPanel);
        ManageTenantPanel.setLayout(ManageTenantPanelLayout);
        ManageTenantPanelLayout.setHorizontalGroup(
            ManageTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTenantPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ModifyTenantBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddTenantBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(ManageTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchTenantBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTenantBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        ManageTenantPanelLayout.setVerticalGroup(
            ManageTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTenantPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(ManageTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTenantBTN)
                    .addComponent(SearchTenantBTN))
                .addGap(35, 35, 35)
                .addGroup(ManageTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyTenantBTN)
                    .addComponent(ViewTenantBTN))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ManageUserPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageTenantPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageProfilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManageProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageTenantPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModifyTenantBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyTenantBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyTenantBTNActionPerformed

    private void ViewProfileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProfileBTNActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ViewProfileBTNActionPerformed

    private void AddUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddUserBTNActionPerformed

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
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTenantBTN;
    private javax.swing.JButton AddUserBTN;
    private javax.swing.JButton DeleteUserBTN;
    private javax.swing.JPanel ManageProfilePanel;
    private javax.swing.JPanel ManageTenantPanel;
    private javax.swing.JPanel ManageUserPanel;
    private javax.swing.JButton ModifyTenantBTN;
    private javax.swing.JButton ModifyUserBTN;
    private javax.swing.JButton SearchTenantBTN;
    private javax.swing.JButton SearchUserBTN;
    private javax.swing.JButton ViewProfileBTN;
    private javax.swing.JButton ViewTenantBTN;
    // End of variables declaration//GEN-END:variables
}
