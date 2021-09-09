package openmrs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author EVANS
 */
public class MainPanel extends javax.swing.JFrame {

    DefaultTableModel model;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public static String PName;

    public MainPanel() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("KENYA EMR - Trust Doctors Centre Mwananchi");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        queue = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        admit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientTable.setForeground(new java.awt.Color(0, 0, 153));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Gender", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Patient");

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        queue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        queue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "OPD", "IPD" }));
        queue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Queue");

        admit.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        admit.setText("ADMIT");
        admit.setEnabled(false);
        admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(queue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admit, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(queue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(admit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueActionPerformed
        // TODO add your handling code here:
        retreave();
    }//GEN-LAST:event_queueActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        String query = search.getText();
        filter(query);
    }//GEN-LAST:event_searchKeyReleased

    private void admitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitActionPerformed
        // TODO add your handling code here:
        if (patientTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "No one is selected..!!!\n Please select a row to admit.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            admit();
        }
    }//GEN-LAST:event_admitActionPerformed

    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            try {
                int index = patientTable.getSelectedRow();
                String PID = patientTable.getValueAt(index, 0).toString();
                PName = patientTable.getValueAt(index, 1).toString();

                String sql = "SELECT * FROM patient WHERE PatientId ='" + PID + "'";
                con = DriverManager.getConnection("jdbc:mysql://localhost/openmrs", "root", "");
                pst = con.prepareStatement(sql);
                
                rs = pst.executeQuery();
                if(rs.next()){
                  String sttus = rs.getString("status");
                  if(sttus.equals("IPD")){
                   JOptionPane.showMessageDialog(null, "This Patient is Already Admitted \nand can't access OPD Services.","Alert",JOptionPane.WARNING_MESSAGE);
                  }
                  else{
                  new OPDServices(null, true).show();  
                  }
                }
                
                
            } catch (Exception ex) {
            }

        }
    }//GEN-LAST:event_patientTableMouseClicked
    JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(this, "Confirm that you want to Log Out", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            Main dash = new Main();
            dash.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    public final void retreave() {
        try {
            String sttus = queue.getSelectedItem().toString();
            String sql = "SELECT * FROM patient WHERE status ='" + sttus + "'";
            con = DriverManager.getConnection("jdbc:mysql://localhost/openmrs", "root", "");
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            model = (DefaultTableModel) patientTable.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String Name = rs.getString(2);
                String PID = rs.getString(1);
                String DOB = rs.getString(4);
                String Gender = rs.getString(5);
                String Loctn = rs.getString(3);

                model.addRow(new String[]{PID, Name, DOB, Gender, Loctn});
                //status.setSelectedIndex(0);
            }
            if (sttus.equals("OPD")) {
                admit.setEnabled(true);
            } else {
                admit.setEnabled(false);
            }

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, x);
        }

    }

    private void filter(String query1) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        patientTable.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query1));
    }

    public void admit() {
        try {
            int index = patientTable.getSelectedRow();
            String pid = patientTable.getValueAt(index, 0).toString();
            String name = patientTable.getValueAt(index, 1).toString();

            String sql1 = "SELECT * FROM patient WHERE PatientId='" + pid + "'";
            con = DriverManager.getConnection("jdbc:mysql://localhost/openmrs", "root", "");
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            if (rs.next()) {
                String initialStatus = rs.getString("status");
                if (initialStatus.equals("IPD")) {
                    JOptionPane.showMessageDialog(null, "The Member is already admitted..");
                } else {
                    String sttus = "IPD";
                    String sql = "UPDATE patient SET status = '" + sttus + "'  WHERE PatientId='" + pid + "'";
                    int result = JOptionPane.showConfirmDialog(this, "Are you sure to Admit\n   {  " + name + " }...??");
                    if (result == JOptionPane.OK_OPTION) {
                        try {
                            pst.execute(sql);
                            retreave();
                            JOptionPane.showMessageDialog(null, "Patient successifully Admitted...");
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }
                    }
                }
            }

        } catch (SQLException e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JComboBox<String> queue;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
