package employeedatabase;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patricia
 */
public class SaveFrame extends javax.swing.JFrame {

    private int sex;
    private int employeeNumber;
    private String fName;
    private String lName;
    private int workLoc;
    private double dRate;
    private double yrIncome;
    private double salary;
    private double hrWage;
    private double hrWeek;
    private double wkYear;

    /**
     * Creates new form SaveFrame
     */
    public SaveFrame() {
        initComponents();

        try {
            PrintWriter writer = new PrintWriter("EmployeeDatabaseArchive.txt", "UTF-8");

            for (int x = 0; x < MyHashTable.numOfBuckets(); x++) {

                for (int y = 0; y < MyHashTable.buckets[x].size(); y++) {

                    EmployeeInfo employee = MyHashTable.buckets[x].get(y);

                    employeeNumber = employee.getEmpNumber();
                    fName = employee.getFirstName();
                    lName = employee.getLastName();
                    yrIncome = employee.calcAnnualIncome();
                    dRate = employee.getDedustionsRate() * 100;
                    sex = employee.getSex();
                    workLoc = employee.getWorkLocation();

                    if (employee.empType().equals("f")) {

                        salary = employee.getAnnualIncome();

                        writer.println("f@" + employeeNumber + "@" + fName + "@" + lName + "@" + dRate + "@" + sex + "@" + workLoc + "@" + salary + "@" + yrIncome);

                    }
                    
                    else if (employee.empType().equals("p")){
                        hrWage = employee.getHourlyWage();
                        hrWeek = employee.getHoursPerWeek();
                        wkYear = employee.getWeeksPerYear();
                        
                        writer.println("p@" + employeeNumber + "@" + fName + "@" + lName + "@" + dRate + "@" + sex + "@" + workLoc + "@" + hrWage + "@" + hrWeek + "@" + wkYear + "@" + yrIncome);
                    }
                }

            }

            writer.close();
        } catch (Exception e) {
            // do something
        }

        TimedExit();

    }

    Timer timer = new Timer();
    TimerTask exitApp = new TimerTask() {
        public void run() {
            dispose();
            new MainMenu().setVisible(true);
            new SaveSuccessfulFrame().setVisible(true);
        }
    };

    public void TimedExit() {
        timer.schedule(exitApp, new Date(System.currentTimeMillis() + 5 * 1000));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeedatabase/tumblr_n6bu3cJbUA1raoul2o1_500.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 440, 300));

        jLabel2.setFont(new java.awt.Font("Extrude", 0, 48)); // NOI18N
        jLabel2.setText("SAVING...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(SaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
