/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.Adminexecutive;

/**
 *
 * @author user
 */
public class ComplaintNew extends javax.swing.JFrame {

    /**
     * Creates new form ComplaintNew
     */
    public ComplaintNew() {
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

        complaintnewPANEL = new javax.swing.JPanel();
        useridLABEL = new javax.swing.JLabel();
        subjectLABEL = new javax.swing.JLabel();
        nameLABEL = new javax.swing.JLabel();
        descriptionLABEL = new javax.swing.JLabel();
        useridTF = new javax.swing.JTextField();
        subjectTF = new javax.swing.JTextField();
        newBTN = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTA = new javax.swing.JTextArea();
        backBTN = new javax.swing.JButton();
        complaintnewLABEL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        complaintnewPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("New Complaint"));

        useridLABEL.setText("UserID :");

        subjectLABEL.setText("Subject :");

        nameLABEL.setText("Name :");

        descriptionLABEL.setText("Description :");

        newBTN.setText("New");

        descriptionTA.setColumns(20);
        descriptionTA.setRows(5);
        jScrollPane1.setViewportView(descriptionTA);

        javax.swing.GroupLayout complaintnewPANELLayout = new javax.swing.GroupLayout(complaintnewPANEL);
        complaintnewPANEL.setLayout(complaintnewPANELLayout);
        complaintnewPANELLayout.setHorizontalGroup(
            complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(complaintnewPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(useridLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(subjectLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descriptionLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useridTF)
                    .addComponent(subjectTF)
                    .addGroup(complaintnewPANELLayout.createSequentialGroup()
                        .addComponent(newBTN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nameTF)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        complaintnewPANELLayout.setVerticalGroup(
            complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(complaintnewPANELLayout.createSequentialGroup()
                .addGroup(complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useridLABEL)
                    .addComponent(useridTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectLABEL)
                    .addComponent(subjectTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLABEL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(complaintnewPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLABEL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newBTN)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        backBTN.setText("Back");

        complaintnewLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        complaintnewLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        complaintnewLABEL.setText("New Complaint");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complaintnewPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(complaintnewLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(backBTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBTN)
                    .addComponent(complaintnewLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complaintnewPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ComplaintNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel complaintnewLABEL;
    private javax.swing.JPanel complaintnewPANEL;
    private javax.swing.JLabel descriptionLABEL;
    private javax.swing.JTextArea descriptionTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLABEL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton newBTN;
    private javax.swing.JLabel subjectLABEL;
    private javax.swing.JTextField subjectTF;
    private javax.swing.JLabel useridLABEL;
    private javax.swing.JTextField useridTF;
    // End of variables declaration//GEN-END:variables
}
