package assignment.assignment.Vendor;

import assignment.assignment.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class VendorViewProfile extends javax.swing.JFrame {

    /**
     * Creates new form IncidentUpdateForm
     */
    private User user;
    private Vendor vendor;
    int count;
    int correctline;
    public VendorViewProfile(User user) {
        
        this.user = user;
        getInfo(user);
        initComponents();
        setLocationRelativeTo(null);
        String userid = Integer.toString(user.getUserId());
        VendorID.setText(userid);
        VendorProfileName.setText(user.getName());
        VendorProfileEmail.setText(user.getEmail());
        VendorProfilePhone.setText(vendor.getPhone());
        VendorProfilePassword.setText(user.getPassword());
    }
    
    public void getInfo(User user) {
        try {
            File file = new File("src/main/java/assignment/assignment/TxtFile/TenantInfo.txt");         
            BufferedReader br = new BufferedReader(new FileReader(file));    
            String line;            

            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(";");
                if (splitLine[1].equals(Integer.toString(user.getUserId()))) {
                    this.vendor = new Vendor(user.getUserId(), user.getPassword(), user.getRole(),
                            user.getName(), user.getEmail(), splitLine[0], splitLine[2], splitLine[3]) {};
                    correctline = count;
                } else {
                    count++;
                }
            }
            br.close();
        }catch (IOException e) {
            System.out.println("fail");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        VendorUpdateProfile = new javax.swing.JButton();
        VendorID = new javax.swing.JTextField();
        VendorProfileEmail = new javax.swing.JTextField();
        VendorProfilePhone = new javax.swing.JTextField();
        VendorProfilePassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        VendorProfileName = new javax.swing.JTextField();
        BackOutProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID :");

        jLabel3.setText("Email :");

        jLabel4.setText("Name :");

        jLabel6.setText("Phone :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Profile");

        VendorUpdateProfile.setText("Update");
        VendorUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorUpdateProfileActionPerformed(evt);
            }
        });

        VendorID.setEditable(false);

        jLabel7.setText("Password :");

        BackOutProfile.setText("Back");
        BackOutProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackOutProfileActionPerformed(evt);
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VendorUpdateProfile)
                        .addGap(18, 18, 18)
                        .addComponent(BackOutProfile))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(VendorID)
                        .addComponent(VendorProfileEmail)
                        .addComponent(VendorProfilePhone)
                        .addComponent(VendorProfilePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(VendorProfileName)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VendorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VendorProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VendorProfileEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VendorProfilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(VendorProfilePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VendorUpdateProfile)
                    .addComponent(BackOutProfile))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VendorUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorUpdateProfileActionPerformed
        File file = new File("src/main/java/assignment/assignment/TxtFile/VendorInfo.txt");
        try {
            File temp = File.createTempFile("temp-file", ".tmp");
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            BufferedReader br = new BufferedReader(new FileReader(file));
            String vendorid = vendor.getVendorID();
            String userid = Integer.toString(user.getUserId());
            String phone = VendorProfilePhone.getText();
            String unitNumber = vendor.getUnitnumber();
            String colHeadings = vendorid + ";" + userid + ";" + phone + ";" + unitNumber;
            
            String line = "";
            while((line = br.readLine()) != null){
                if (correctline == 0){
                    bw.write(colHeadings + "\n");
                    correctline = 9999;
                } else {
                    bw.write(line + "\n");
                    correctline--;
                }
            }
            
            bw.close();
            br.close();
            file.delete();
            temp.renameTo(file);
            
        } catch (IOException ex) {
            Logger.getLogger(VendorViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        file = new File("src/main/java/assignment/assignment/TxtFile/UserInfo.txt");
        try {
            File tempfile = File.createTempFile("temp-file1", ".tmp");
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempfile));
            BufferedReader br = new BufferedReader(new FileReader(file));
            String userid = Integer.toString(user.getUserId());
            String name = VendorProfileName.getText();
            String password = VendorProfilePassword.getText();
            String email = VendorProfileEmail.getText();
            String colHeadings = userid + ";" + password + ";vendor;" + name + ";" + email ;
            
            String line = "";
            while((line = br.readLine()) != null){
                String[] splitLine = line.split(";");
                if (splitLine[0].equals(userid)){
                    bw.write(colHeadings + "\n");
                } else {
                    bw.write(line + "\n");
                }
            }
            
            bw.close();
            br.close();
            file.delete();
            tempfile.renameTo(file);
            showMessageDialog(null, "Update successful");
            
        } catch (IOException ex) {
            Logger.getLogger(VendorViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VendorUpdateProfileActionPerformed

    private void BackOutProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackOutProfileActionPerformed
        new VendorMainFrame(user).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackOutProfileActionPerformed

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
            java.util.logging.Logger.getLogger(VendorViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new VendorViewProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackOutProfile;
    private javax.swing.JTextField VendorID;
    private javax.swing.JTextField VendorProfileEmail;
    private javax.swing.JTextField VendorProfileName;
    private javax.swing.JTextField VendorProfilePassword;
    private javax.swing.JTextField VendorProfilePhone;
    private javax.swing.JButton VendorUpdateProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
