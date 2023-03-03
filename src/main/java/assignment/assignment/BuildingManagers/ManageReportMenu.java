/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.BuildingManagers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ManageReportMenu extends javax.swing.JFrame {

    /**
     * Creates new form managereportmenu
     */
    public ManageReportMenu() {
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

        generatereportPANEL = new javax.swing.JPanel();
        generateBTN = new javax.swing.JButton();
        reporttypeLABEL = new javax.swing.JLabel();
        reporttypeCOMBO = new javax.swing.JComboBox<>();
        managereportLABEL = new javax.swing.JLabel();
        viewreportBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generatereportPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Generate Report"));

        generateBTN.setText("Generate");
        generateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBTNActionPerformed(evt);
            }
        });

        reporttypeLABEL.setText("Report Type: ");

        reporttypeCOMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Team Structures", "Operations And Budget Planning", "Executive Users" }));
        reporttypeCOMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporttypeCOMBOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout generatereportPANELLayout = new javax.swing.GroupLayout(generatereportPANEL);
        generatereportPANEL.setLayout(generatereportPANELLayout);
        generatereportPANELLayout.setHorizontalGroup(
            generatereportPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generatereportPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reporttypeLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reporttypeCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generatereportPANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateBTN)
                .addContainerGap())
        );
        generatereportPANELLayout.setVerticalGroup(
            generatereportPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generatereportPANELLayout.createSequentialGroup()
                .addGroup(generatereportPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reporttypeLABEL)
                    .addComponent(reporttypeCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        managereportLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        managereportLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managereportLABEL.setText("Manage Report");

        viewreportBTN.setText("View Report");
        viewreportBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewreportBTNActionPerformed(evt);
            }
        });

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(managereportLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewreportBTN)
                            .addComponent(generatereportPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(managereportLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generatereportPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewreportBTN)
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reporttypeCOMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporttypeCOMBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporttypeCOMBOActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        BuildingManagerMenu BuildingManangerMenu = new BuildingManagerMenu();
        this.dispose();
        BuildingManangerMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void viewreportBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewreportBTNActionPerformed
        // TODO add your handling code here:
        ViewReport ViewReport = new ViewReport();
        this.dispose();
        ViewReport.setVisible(true);
    }//GEN-LAST:event_viewreportBTNActionPerformed

    private void generateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBTNActionPerformed
        // Read the selected report type from reporttypeCOMBO
        String selectedReportType = reporttypeCOMBO.getSelectedItem().toString();

        // If the selected report type is "Team Structures", count the total number of teams and append it to ReportInfo.txt
        if (selectedReportType.equals("Team Structures")) {
            int totalTeams = 0;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/TeamStructureInfo.txt"));
                String line;
                // Start counting from row 2
                reader.readLine(); // Skip the header row
                while ((line = reader.readLine()) != null) {
                    if (line.split(";")[0].trim().length() > 0) {
                        totalTeams++;
                    }
                }
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                return;
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/ReportInfo.txt"));
                List<String> lines = new ArrayList<String>();
                String line;
                boolean headerLine = true;
                while ((line = reader.readLine()) != null) {
                    if (headerLine) {
                        headerLine = false;
                        continue; // Skip the header line
                    }
                    lines.add(line);
                }
                reader.close();
                int reportID = 0;
                if (lines.size() > 0) {
                    reportID = Integer.parseInt(lines.get(lines.size() - 1).split(";")[0].substring(8,11));
                }
                reportID++;
                String reportIDStr = "ReportID" + String.format("%03d", reportID);
                LocalDate reportDate = LocalDate.now();
                String reportDateStr = reportDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
                String newLine = reportIDStr + ";Team Structure;" + reportDateStr + ";" + totalTeams + ";null;null;null;null";
                lines.add(newLine);
                BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/ReportInfo.txt"));
                writer.write("ReportID;ReportType;ReportDate;TotalTeams;TotalFundAllocated;TotalMaintenance;TotalAccountExecutive;TotalBuildingExecutive"); // Add the header line
                writer.newLine();
                for (String l : lines) {
                    writer.write(l);
                    writer.newLine();
                }
                JOptionPane.showMessageDialog(this, "Report generated successfully!", "Report Generation", JOptionPane.INFORMATION_MESSAGE);
                writer.close();
            } catch (IOException ex) {
            }
        }else if (selectedReportType.equals("Executive Users")) {
            int totalAccountExecutives = 0;
            int totalBuildingExecutives = 0;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/UserInfo.txt"));
                String line;
                // Start counting from row 2
                reader.readLine(); // Skip the header row
                while ((line = reader.readLine()) != null) {
                    String[] columns = line.split(";");
                    if (columns[2].trim().equals("accountexecutive")) {
                        totalAccountExecutives++;
                    } else if (columns[2].trim().equals("buildingexecutive")) {
                        totalBuildingExecutives++;
                    }
                }
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                return;
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/ReportInfo.txt"));
                List<String> lines = new ArrayList<String>();
                String line;
                boolean headerLine = true;
                while ((line = reader.readLine()) != null) {
                    if (headerLine) {
                        headerLine = false;
                        continue; // Skip the header line
                    }
                    lines.add(line);
                }
                reader.close();
                int reportID = 0;
                if (lines.size() > 0) {
                    reportID = Integer.parseInt(lines.get(lines.size() - 1).split(";")[0].substring(8,11));
                }
                reportID++;
                String reportIDStr = "ReportID" + String.format("%03d", reportID);
                LocalDate reportDate = LocalDate.now();
                String reportDateStr = reportDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
                String newLine = reportIDStr + ";Executive Users;" + reportDateStr + ";null;null;null;" + totalAccountExecutives + ";" + totalBuildingExecutives;
                lines.add(newLine);
                BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/ReportInfo.txt"));
                writer.write("ReportID;ReportType;ReportDate;TotalTeams;TotalFundAllocated;TotalMaintenance;TotalAccountExecutive;TotalBuildingExecutive"); // Add the header line
                writer.newLine();
                for (String l : lines) {
                    writer.write(l);
                    writer.newLine();
                }
                writer.close();
                JOptionPane.showMessageDialog(this, "Report generated successfully!", "Report Generation", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
            }
        }else if (selectedReportType.equals("Operations And Budget Planning")) {
            double totalFundAllocation = 0;
            double totalMaintenance = 0;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/OperationsandBudgetPlanning.txt"));
                String line;
                // Start counting from row 2
                reader.readLine(); // Skip the header row
                while ((line = reader.readLine()) != null) {
                    String[] arr = line.split(";");
                    if (arr[1].trim().equals("Fund Allocation")) {
                        totalFundAllocation += Double.parseDouble(arr[7]);
                    } else if (arr[1].trim().equals("Maintenance")) {
                        totalMaintenance += Double.parseDouble(arr[7]);
                    }
                }
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                return;
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/ReportInfo.txt"));
                List<String> lines = new ArrayList<String>();
                String line;
                boolean headerLine = true;
                while ((line = reader.readLine()) != null) {
                    if (headerLine) {
                        headerLine = false;
                        continue; // Skip the header line
                    }
                    lines.add(line);
                }
                reader.close();
                int reportID = 0;
                if (lines.size() > 0) {
                    reportID = Integer.parseInt(lines.get(lines.size() - 1).split(";")[0].substring(8,11));
                }
                reportID++;
                String reportIDStr = "ReportID" + String.format("%03d", reportID);
                LocalDate reportDate = LocalDate.now();
                String reportDateStr = reportDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
                String newLine = reportIDStr + ";Operations And Budget Planning;" + reportDateStr + ";null;" + totalFundAllocation + ";" + totalMaintenance + ";null;null";
                lines.add(newLine);
                BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/main/java/assignment/assignment/TxtFile/ReportInfo.txt"));
                writer.write("ReportID;ReportType;ReportDate;TotalTeams;TotalFundAllocated;TotalMaintenance;TotalAccountExecutive;TotalBuildingExecutive"); // Add the header line
                writer.newLine();
                for (String l : lines) {
                    writer.write(l);
                    writer.newLine();
                }
                writer.close();
                JOptionPane.showMessageDialog(this, "Report generated successfully!", "Report Generation", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_generateBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ManageReportMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReportMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReportMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReportMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReportMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton generateBTN;
    private javax.swing.JPanel generatereportPANEL;
    private javax.swing.JLabel managereportLABEL;
    private javax.swing.JComboBox<String> reporttypeCOMBO;
    private javax.swing.JLabel reporttypeLABEL;
    private javax.swing.JButton viewreportBTN;
    // End of variables declaration//GEN-END:variables

    private void appendToFile(String newLine, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
