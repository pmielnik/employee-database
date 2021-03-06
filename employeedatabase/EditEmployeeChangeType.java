/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

import static employeedatabase.MyHashTable.buckets;
import java.awt.Color;

/**
 *
 * @author Megan
 */
public class EditEmployeeChangeType extends javax.swing.JFrame {
    private String sex;
    private String workLoc;
    /**
     * Creates new form EditEmployeeChangeType
     */
    public EditEmployeeChangeType() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        button_partTime = new javax.swing.JButton();
        button_fullTime1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("SELECT EMPLOYEE TYPE");

        button_partTime.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        button_partTime.setForeground(java.awt.Color.darkGray);
        button_partTime.setText("Part Time");
        button_partTime.setBorderPainted(false);
        button_partTime.setContentAreaFilled(false);
        button_partTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_partTimeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_partTimeMouseEntered(evt);
            }
        });
        button_partTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_partTimeActionPerformed(evt);
            }
        });

        button_fullTime1.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        button_fullTime1.setForeground(java.awt.Color.darkGray);
        button_fullTime1.setText("Full Time");
        button_fullTime1.setBorderPainted(false);
        button_fullTime1.setContentAreaFilled(false);
        button_fullTime1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_fullTime1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_fullTime1MouseEntered(evt);
            }
        });
        button_fullTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fullTime1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(button_partTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(button_fullTime1)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_partTime)
                    .addComponent(button_fullTime1))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //opens part time add employee form if part time is chosen
    private void button_partTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_partTimeActionPerformed
        // TODO add your handling code here:
        dispose();
        new EditPartTimeEmployee().setVisible(true);
    }//GEN-LAST:event_button_partTimeActionPerformed
    //opens full time add employee form if full time is chosen
    private void button_fullTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fullTime1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new EditFullTimeEmployee().setVisible(true);
    }//GEN-LAST:event_button_fullTime1ActionPerformed
    //changes text color to white when mouse is entered
    private void button_partTimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_partTimeMouseEntered
        // TODO add your handling code here:
        button_partTime.setForeground(Color.white);
    }//GEN-LAST:event_button_partTimeMouseEntered

    private void button_fullTime1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_fullTime1MouseEntered
        // TODO add your handling code here:
        button_fullTime1.setForeground(Color.white);
    }//GEN-LAST:event_button_fullTime1MouseEntered
    // changes text color to dark gray when mouse is exited
    private void button_partTimeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_partTimeMouseExited
        // TODO add your handling code here:
        button_partTime.setForeground(Color.darkGray);
    }//GEN-LAST:event_button_partTimeMouseExited

    private void button_fullTime1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_fullTime1MouseExited
        // TODO add your handling code here:
        button_fullTime1.setForeground(Color.darkGray);
    }//GEN-LAST:event_button_fullTime1MouseExited

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
            java.util.logging.Logger.getLogger(EditEmployeeChangeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeChangeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeChangeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeChangeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployeeChangeType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_fullTime1;
    private javax.swing.JButton button_partTime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
