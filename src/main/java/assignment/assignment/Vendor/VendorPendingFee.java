/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.Vendor;

import assignment.assignment.Tenant.TenantPendingFee;
import assignment.assignment.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TeD
 */
public class VendorPendingFee extends javax.swing.JFrame {

    /**
     * Creates new form VendorPendingFee
     */
    private User user;
    public VendorPendingFee(User user) {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        VendorPendingFee = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        VendorViewPendingFee = new javax.swing.JButton();
        VendorClosePendingFee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VendorPendingFee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PaymnetID", "Unit Number", "Payment Amount", "Paid Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VendorPendingFee);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Pending Fee");

        VendorViewPendingFee.setText("View Pending Fee");
        VendorViewPendingFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorViewPendingFeeActionPerformed(evt);
            }
        });

        VendorClosePendingFee.setText("Back");
        VendorClosePendingFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorClosePendingFeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(VendorViewPendingFee)
                        .addGap(127, 127, 127)
                        .addComponent(VendorClosePendingFee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VendorViewPendingFee)
                    .addComponent(VendorClosePendingFee))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VendorViewPendingFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorViewPendingFeeActionPerformed
        File file = new File("src/main/java/assignment/assignment/TxtFile/PendingFee.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            DefaultTableModel model = (DefaultTableModel) VendorPendingFee.getModel();
            
            Object [] dataRows = br.lines().toArray();
            for (int i = 1; i < dataRows.length; i++){
                String rec = dataRows[i].toString();
                String [] dataRow = rec.split(";");
                String [] tempArray = new String[4];
                tempArray[0] = dataRow[0];
                tempArray[1] = dataRow[2];
                tempArray[2] = dataRow[3];
                tempArray[3] = dataRow[4];
                model.addRow(tempArray);
            }
            br.close();
            
        } catch (IOException ex) {
            Logger.getLogger(TenantPendingFee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VendorViewPendingFeeActionPerformed

    private void VendorClosePendingFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorClosePendingFeeActionPerformed
        new VendorPaymentPage(user).setVisible(true);
        dispose();
    }//GEN-LAST:event_VendorClosePendingFeeActionPerformed

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
            java.util.logging.Logger.getLogger(VendorPendingFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorPendingFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorPendingFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorPendingFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new VendorPendingFee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VendorClosePendingFee;
    private javax.swing.JTable VendorPendingFee;
    private javax.swing.JButton VendorViewPendingFee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
