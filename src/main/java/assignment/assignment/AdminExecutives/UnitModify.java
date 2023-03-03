/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.AdminExecutives;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class UnitModify extends javax.swing.JFrame {

    /**
     * Creates new form Unitmodify
     */
    public UnitModify() {
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

        backBTN = new javax.swing.JButton();
        accountexecutivesearchPANEL = new javax.swing.JPanel();
        searchidLABEL = new javax.swing.JLabel();
        searchidTF = new javax.swing.JTextField();
        searchidBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        unitmodifyLABEL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        unitmodifyTABLE = new javax.swing.JTable();
        viewunitBTN = new javax.swing.JButton();
        modifyBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        accountexecutivesearchPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        searchidLABEL.setText("Search Tenant ID:");

        searchidBTN.setText("SearchID");
        searchidBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchidBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountexecutivesearchPANELLayout = new javax.swing.GroupLayout(accountexecutivesearchPANEL);
        accountexecutivesearchPANEL.setLayout(accountexecutivesearchPANELLayout);
        accountexecutivesearchPANELLayout.setHorizontalGroup(
            accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountexecutivesearchPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountexecutivesearchPANELLayout.createSequentialGroup()
                        .addComponent(searchidLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountexecutivesearchPANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchidBTN)))
                .addContainerGap())
        );
        accountexecutivesearchPANELLayout.setVerticalGroup(
            accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountexecutivesearchPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchidLABEL)
                    .addComponent(searchidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchidBTN)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        unitmodifyLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unitmodifyLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitmodifyLABEL.setText("Unit Modify");

        unitmodifyTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TenantID", "UserID", "Phone", "UnitNo", "UnitIssueDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(unitmodifyTABLE);

        viewunitBTN.setText("View Unit");
        viewunitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewunitBTNActionPerformed(evt);
            }
        });

        modifyBTN.setText("Modify");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unitmodifyLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(backBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accountexecutivesearchPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(modifyBTN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(viewunitBTN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deleteBTN)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitmodifyLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewunitBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(accountexecutivesearchPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(modifyBTN)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        UnitManagementMenu UnitManagementMenu = new UnitManagementMenu();
        this.dispose();
        UnitManagementMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void viewunitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewunitBTNActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("src/main/java/assignment/assignment/TxtFile/TenantInfo.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            DefaultTableModel model = (DefaultTableModel) unitmodifyTABLE.getModel();
            model.setRowCount(0);
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                    Object[] row = { data[0], data[1],data[2], data[3], data[4]};
                    model.addRow(row);
                
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_viewunitBTNActionPerformed

    private void searchidBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchidBTNActionPerformed
        // TODO add your handling code here:
        String searchUserID = searchidTF.getText();
        DefaultTableModel model = (DefaultTableModel) unitmodifyTABLE.getModel();
        int rowCount = model.getRowCount();
        boolean userFound = false;
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 0).equals(searchUserID)) {
                unitmodifyTABLE.setRowSelectionInterval(i, i);
                userFound = true;
                break;
            }
        }
        if (!userFound) {
            JOptionPane.showMessageDialog(this, "User with ID " + searchUserID + " not found!");
        }
    }//GEN-LAST:event_searchidBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        int selectedRow = unitmodifyTABLE.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) unitmodifyTABLE.getModel();
            model.removeRow(selectedRow);
            // save the updated data back to the file
            try (FileWriter fw = new FileWriter("TenantInfo.txt");
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter pw = new PrintWriter(bw)) {
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        pw.print(model.getValueAt(i, j));
                        if (j != model.getColumnCount() - 1) {
                            pw.print(";");
                        }
                    }
                    pw.println();
                }
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(UnitModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountexecutivesearchPANEL;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyBTN;
    private javax.swing.JButton searchidBTN;
    private javax.swing.JLabel searchidLABEL;
    private javax.swing.JTextField searchidTF;
    private javax.swing.JLabel unitmodifyLABEL;
    private javax.swing.JTable unitmodifyTABLE;
    private javax.swing.JButton viewunitBTN;
    // End of variables declaration//GEN-END:variables
}
