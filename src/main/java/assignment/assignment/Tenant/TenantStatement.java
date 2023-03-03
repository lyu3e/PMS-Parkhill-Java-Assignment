/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.Tenant;

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
public class TenantStatement extends javax.swing.JFrame {
    private User user;
    /**
     * Creates new form paymentHistory
     */
    public TenantStatement(User user) {
        this.user = user;
        
        try {
            File file = new File("src/main/java/assignment/assignment/TxtFile/TenantInfo.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(";");
                if (splitLine[1].equals(Integer.toString(user.getUserId()))) {
                    this.user = new Tenant(user.getUserId(), user.getPassword(), user.getRole(),
                            user.getName(), user.getEmail(), splitLine[0], splitLine[2], splitLine[3]) {};
                }
            }
            br.close();
        }catch (IOException e) {
            System.out.println("fail");
            }
        
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
        TenantStatement = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TenantViewStatement = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TenantStatement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Statement ID", "Issued Date", "Paid Date", "Paid Amount", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TenantStatement);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Statement");

        TenantViewStatement.setText("View Statement");
        TenantViewStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantViewStatementActionPerformed(evt);
            }
        });

        BackBTN.setText("Back");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
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
                        .addComponent(TenantViewStatement)
                        .addGap(127, 127, 127)
                        .addComponent(BackBTN))
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
                    .addComponent(TenantViewStatement)
                    .addComponent(BackBTN))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TenantViewStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantViewStatementActionPerformed
        try {
            String userid = Integer.toString(user.getUserId());
            File file = new File("src/main/java/assignment/assignment/TxtFile/Statement.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            DefaultTableModel model = (DefaultTableModel) TenantStatement.getModel();
            model.setRowCount(0);
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                    if (data[1].equals(userid)){
                        Object[] row = { data[0], data[2], data[3], data[4], data[5]};
                        model.addRow(row);
                    }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_TenantViewStatementActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        new TenantPaymentPage(user).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TenantStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JTable TenantStatement;
    private javax.swing.JButton TenantViewStatement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
