package assignment.assignment.SecurityManagementSystem;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author leeyu
 */
public class SecurityManagementSystem extends javax.swing.JFrame {

    /**
     * Creates new form SecuritySystem
     */
    public SecurityManagementSystem() {
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

        manageVisitorPassBtn = new javax.swing.JButton();
        manageVisitorEntry = new javax.swing.JButton();
        manageIncident = new javax.swing.JButton();
        checkpointCheckIn = new javax.swing.JButton();
        manageVisitorPassBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageVisitorEntry1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        manageIncident1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageVisitorPassBtn.setText("View Visitor Pass");
        manageVisitorPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVisitorPassBtnActionPerformed(evt);
            }
        });

        manageVisitorEntry.setText("Visitor Entry Form");
        manageVisitorEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVisitorEntryActionPerformed(evt);
            }
        });

        manageIncident.setText("Record Incident");

        checkpointCheckIn.setText("Checkpoint Check-in");

        manageVisitorPassBtn1.setText("Search Visitor Pass");
        manageVisitorPassBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVisitorPassBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Security Guard");

        manageVisitorEntry1.setText("Visitor Departure Form");
        manageVisitorEntry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVisitorEntry1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        manageIncident1.setText("Update Incident");
        manageIncident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageIncident1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageVisitorPassBtn)
                            .addComponent(manageVisitorEntry)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageIncident))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageIncident1)
                            .addComponent(manageVisitorEntry1)
                            .addComponent(manageVisitorPassBtn1)
                            .addComponent(checkpointCheckIn))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageVisitorPassBtn1)
                    .addComponent(manageVisitorPassBtn))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageVisitorEntry)
                    .addComponent(manageVisitorEntry1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageIncident)
                    .addComponent(manageIncident1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkpointCheckIn)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageVisitorPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVisitorPassBtnActionPerformed
        // TODO add your handling code here:
        VisitorPassView vpView = new VisitorPassView();
        vpView.setVisible(true);
        dispose();
    }//GEN-LAST:event_manageVisitorPassBtnActionPerformed

    private void manageVisitorPassBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVisitorPassBtn1ActionPerformed
        // TODO add your handling code here:
        VisitorPassSearch vpSearch = new VisitorPassSearch();
        vpSearch.setVisible(true);
        dispose();
    }//GEN-LAST:event_manageVisitorPassBtn1ActionPerformed

    private void manageVisitorEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVisitorEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageVisitorEntryActionPerformed

    private void manageVisitorEntry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVisitorEntry1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageVisitorEntry1ActionPerformed

    private void manageIncident1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageIncident1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageIncident1ActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecurityManagementSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkpointCheckIn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageIncident;
    private javax.swing.JButton manageIncident1;
    private javax.swing.JButton manageVisitorEntry;
    private javax.swing.JButton manageVisitorEntry1;
    private javax.swing.JButton manageVisitorPassBtn;
    private javax.swing.JButton manageVisitorPassBtn1;
    // End of variables declaration//GEN-END:variables
}
