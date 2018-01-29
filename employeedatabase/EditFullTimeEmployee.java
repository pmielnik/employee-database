/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

import static employeedatabase.EditEmployeeSearchFrame.getEmpNum;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Megan
 */
public class EditFullTimeEmployee extends javax.swing.JFrame {
    private static EmployeeInfo employee;
    MyHashTable hashTable = EmployeeDatabase.returnHashTable();
    private int sex;
    private int employeeNumber;
    private String fName;
    private String lName;
    private int workLoc;
    private double dRate;
    private double yrSalary;
    private int originalEmpNum;
    /**
     * Creates new form EditFullTimeEmployee
     */
    public EditFullTimeEmployee() {
        int bucketNum = hashTable.calcBucket(EditEmployeeSearchFrame.getEmpNum());
            for (int x = 0; x < EditEmployeeSearchFrame.returnSearch(); x++) {

            employee = hashTable.buckets[bucketNum].get(x);
        }
        originalEmpNum = employee.getEmpNumber();
        sex = employee.getSex();
        workLoc = employee.getWorkLocation();
        employeeNumber = employee.getEmpNumber();
        fName = employee.getFirstName();
        lName = employee.getLastName();
        dRate = (employee.getDedustionsRate())*100;
        yrSalary = employee.getAnnualIncome();
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        empNum = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        workLocation = new javax.swing.JComboBox<>();
        deducRate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        button_complete = new javax.swing.JButton();
        button_return = new javax.swing.JButton();
        empNumError = new javax.swing.JLabel();
        dRateError = new javax.swing.JLabel();
        fNameError = new javax.swing.JLabel();
        lNameError = new javax.swing.JLabel();
        yrlySalary = new javax.swing.JTextField();
        yrSalaryError = new javax.swing.JLabel();
        sexError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);

        jLabel7.setFont(new java.awt.Font("Avenir Next", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("EDIT FULL TIME EMPLOYEE");

        empNum.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        empNum.setForeground(java.awt.Color.darkGray);
        empNum.setText(getEmpNum());
        empNum.setToolTipText("");
        empNum.setFocusable(false);
        empNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empNumfocusG1(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empNumfocusL1(evt);
            }
        });
        empNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empNummakeFocusable(evt);
            }
        });

        firstName.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        firstName.setForeground(java.awt.Color.darkGray);
        firstName.setText(getFirstName());
        firstName.setFocusable(false);
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNamefocusG2(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNamefocusL2(evt);
            }
        });
        firstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                firstNamemakeFocusable(evt);
            }
        });

        lastName.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        lastName.setForeground(java.awt.Color.darkGray);
        lastName.setText(getLastName());
        lastName.setFocusable(false);
        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNamefocusG3(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNamefocusL3(evt);
            }
        });
        lastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastNamemakeFocusable(evt);
            }
        });

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        male.setForeground(java.awt.Color.darkGray);
        male.setSelected(getSexMale());
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        female.setForeground(java.awt.Color.darkGray);
        female.setSelected(getSexFemale());
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(other);
        other.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        other.setForeground(java.awt.Color.darkGray);
        other.setSelected(getSexOther());
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });

        workLocation.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        workLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Work Location (select one)", "Mississauga", "Toronto", "Ottawa" }));
        workLocation.setSelectedIndex(getWorkLoc());

        deducRate.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        deducRate.setForeground(java.awt.Color.darkGray);
        deducRate.setText(getDRate());
        deducRate.setFocusable(false);
        deducRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                deducRatefocusG4(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                deducRatefocusL4(evt);
            }
        });
        deducRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deducRatemakeFocusable(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel8.setForeground(java.awt.Color.darkGray);
        jLabel8.setText("%");

        jLabel9.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel9.setForeground(java.awt.Color.darkGray);
        jLabel9.setText("$");

        button_complete.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        button_complete.setForeground(new java.awt.Color(255, 255, 255));
        button_complete.setText("COMPLETE");
        button_complete.setBorderPainted(false);
        button_complete.setContentAreaFilled(false);
        button_complete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        button_complete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_complete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_completecompleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_completecompleteMouseExited(evt);
            }
        });
        button_complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_completeActionPerformed(evt);
            }
        });

        button_return.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        button_return.setForeground(new java.awt.Color(255, 255, 255));
        button_return.setText("RETURN");
        button_return.setBorderPainted(false);
        button_return.setContentAreaFilled(false);
        button_return.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_return.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_returnMouseExited(evt);
            }
        });
        button_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_returnActionPerformed(evt);
            }
        });

        empNumError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        empNumError.setForeground(java.awt.Color.lightGray);
        empNumError.setText("invalid input");

        dRateError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        dRateError.setForeground(java.awt.Color.lightGray);
        dRateError.setText("please input a number");

        fNameError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        fNameError.setForeground(java.awt.Color.lightGray);
        fNameError.setText("please input a name");

        lNameError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        lNameError.setForeground(java.awt.Color.lightGray);
        lNameError.setText("please input a name");

        yrlySalary.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        yrlySalary.setForeground(java.awt.Color.darkGray);
        yrlySalary.setText(getYrSalary());
        yrlySalary.setFocusable(false);
        yrlySalary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yrlySalaryfocusG4(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yrlySalaryfocusL4(evt);
            }
        });
        yrlySalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yrlySalarymakeFocusable(evt);
            }
        });

        yrSalaryError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        yrSalaryError.setForeground(java.awt.Color.lightGray);
        yrSalaryError.setText("please input an integer");

        sexError.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        sexError.setForeground(java.awt.Color.lightGray);
        sexError.setText("please select one:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(yrSalaryError)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(deducRate, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstName)
                                            .addComponent(lastName)
                                            .addComponent(empNum, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(empNumError)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(button_return)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lNameError)
                                            .addComponent(dRateError)
                                            .addComponent(fNameError))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(workLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(male)
                                        .addComponent(female)
                                        .addComponent(other)
                                        .addComponent(button_complete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sexError))
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yrlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empNumError)
                    .addComponent(sexError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fNameError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNameError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deducRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(4, 4, 4)
                        .addComponent(dRateError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(yrlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(other)
                        .addGap(18, 18, 18)
                        .addComponent(workLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yrSalaryError)
                        .addGap(105, 105, 105)
                        .addComponent(button_return)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

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

    //if text is "defaut text" (ex. employee number) sets text to "" and dark gray
    private void empNumfocusG1(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empNumfocusG1
        // TODO add your handling code here:
        empNumError.setForeground(Color.lightGray);
        if (empNum.getText().equals("Employee Number")) {
            empNum.setText("");
            empNum.setForeground(Color.darkGray);
            empNum.setFont(empNum.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_empNumfocusG1

    
    private void firstNamefocusG2(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNamefocusG2
        // TODO add your handling code here:
        fNameError.setForeground(Color.lightGray);
        if (firstName.getText().equals("First Name")) {
            firstName.setText("");
            firstName.setForeground(Color.darkGray);
            firstName.setFont(firstName.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_firstNamefocusG2
    
    private void lastNamefocusG3(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNamefocusG3
        // TODO add your handling code here:
        lNameError.setForeground(Color.lightGray);
        if (lastName.getText().equals("Last Name")) {
            lastName.setText("");
            lastName.setForeground(Color.darkGray);
            lastName.setFont(lastName.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_lastNamefocusG3

    private void deducRatefocusG4(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deducRatefocusG4
        // TODO add your handling code here:
        dRateError.setForeground(Color.lightGray);
        if (deducRate.getText().equals("Deduction Rate")) {
            deducRate.setText("");
            deducRate.setForeground(Color.darkGray);
            deducRate.setFont(deducRate.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_deducRatefocusG4
    
    private void yrlySalaryfocusG4(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yrlySalaryfocusG4
        // TODO add your handling code here:
        yrSalaryError.setForeground(Color.lightGray);
        if (yrlySalary.getText().equals("Yearly Salary")) {
            yrlySalary.setText("");
            yrlySalary.setForeground(Color.darkGray);
            yrlySalary.setFont(yrlySalary.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_yrlySalaryfocusG4

    //if no text resets to light gray and resets to "defaut text"
    //displays error if number given is invalid
    private void empNumfocusL1(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empNumfocusL1
        if (empNum.getText().equals("")) {
            empNum.setText("Employee Number");
            empNum.setForeground(Color.lightGray);
            empNum.setFont(empNum.getFont().deriveFont(Font.ITALIC));
        }
        try {
            Integer.parseInt(empNum.getText());
        } catch (Exception e) {
            empNumError.setForeground(Color.red);
        }
    }//GEN-LAST:event_empNumfocusL1
    
    private void firstNamefocusL2(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNamefocusL2
        // TODO add your handling code here:
        if (firstName.getText().equals("")) {
            firstName.setText("First Name");
            firstName.setForeground(Color.lightGray);
            firstName.setFont(firstName.getFont().deriveFont(Font.ITALIC));
        }
    }//GEN-LAST:event_firstNamefocusL2

    private void lastNamefocusL3(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNamefocusL3
        // TODO add your handling code here:
        if (lastName.getText().equals("")) {
            lastName.setText("Last Name");
            lastName.setForeground(Color.lightGray);
            lastName.setFont(lastName.getFont().deriveFont(Font.ITALIC));
        }
    }//GEN-LAST:event_lastNamefocusL3

    private void deducRatefocusL4(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deducRatefocusL4
        if (deducRate.getText().equals("")) {
            deducRate.setText("Deduction Rate");
            deducRate.setForeground(Color.lightGray);
            deducRate.setFont(deducRate.getFont().deriveFont(Font.ITALIC));
        }
        try {
            Double.parseDouble(deducRate.getText());
        } catch (Exception e) {
            dRateError.setForeground(Color.red);
        }
    }//GEN-LAST:event_deducRatefocusL4

    private void yrlySalaryfocusL4(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yrlySalaryfocusL4
        // TODO add your handling code here:
        if (yrlySalary.getText().equals("")) {
            yrlySalary.setText("Yearly Salary");
            yrlySalary.setForeground(Color.lightGray);
            yrlySalary.setFont(yrlySalary.getFont().deriveFont(Font.ITALIC));
        }
        try {
            Double.parseDouble(yrlySalary.getText());
        } catch (Exception e) {
            yrSalaryError.setForeground(Color.red);
        }
    }//GEN-LAST:event_yrlySalaryfocusL4

    private void empNummakeFocusable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empNummakeFocusable
        // TODO add your handling code here:
        empNum.setFocusable(true);
        firstName.setFocusable(true);
        lastName.setFocusable(true);
        deducRate.setFocusable(true);
        workLocation.setFocusable(true);
    }//GEN-LAST:event_empNummakeFocusable
    //makes everything focusable
    private void firstNamemakeFocusable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNamemakeFocusable
        // TODO add your handling code here:
        empNum.setFocusable(true);
        firstName.setFocusable(true);
        lastName.setFocusable(true);
        deducRate.setFocusable(true);
        workLocation.setFocusable(true);
    }//GEN-LAST:event_firstNamemakeFocusable

    private void lastNamemakeFocusable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNamemakeFocusable
        // TODO add your handling code here:
        empNum.setFocusable(true);
        firstName.setFocusable(true);
        lastName.setFocusable(true);
        deducRate.setFocusable(true);
        workLocation.setFocusable(true);
    }//GEN-LAST:event_lastNamemakeFocusable
    
    private void deducRatemakeFocusable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deducRatemakeFocusable
        // TODO add your handling code here:
        empNum.setFocusable(true);
        firstName.setFocusable(true);
        lastName.setFocusable(true);
        deducRate.setFocusable(true);
        workLocation.setFocusable(true);
    }//GEN-LAST:event_deducRatemakeFocusable
    
    private void yrlySalarymakeFocusable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yrlySalarymakeFocusable
        // TODO add your handling code here:
        yrlySalary.setFocusable(true);
    }//GEN-LAST:event_yrlySalarymakeFocusable
    
    //stores given sex in a variable as an integer
    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        sex = 0;
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        sex = 1;
    }//GEN-LAST:event_femaleActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        // TODO add your handling code here:
        sex = 2;
    }//GEN-LAST:event_otherActionPerformed

    //sets foreground to darkgray when mouse is entered
    private void button_completecompleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_completecompleteMouseEntered
        // TODO add your handling code here:
        button_complete.setForeground(Color.darkGray);
    }//GEN-LAST:event_button_completecompleteMouseEntered

    private void button_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_returnMouseEntered
        // TODO add your handling code here:
        button_return.setForeground(Color.darkGray);
    }//GEN-LAST:event_button_returnMouseEntered

    //sets foreground to white when mouse is exited
    private void button_completecompleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_completecompleteMouseExited
        // TODO add your handling code here:
        button_complete.setForeground(Color.white);
    }//GEN-LAST:event_button_completecompleteMouseExited

    private void button_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_returnMouseExited
        // TODO add your handling code here:
        button_return.setForeground(Color.white);
    }//GEN-LAST:event_button_returnMouseExited

    //returns to main menu if return button is pressed
    private void button_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_returnActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_button_returnActionPerformed

    
    private void button_completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_completeActionPerformed
        // TODO add your handling code here:
        //deletes employee to edit from hash table and adds new employee with changed variables
        int error = 0;
         try {
            employeeNumber = Integer.parseInt(empNum.getText());
        } catch (Exception e) {
            empNumError.setForeground(Color.red);
        }
        MyHashTable hashTable = EmployeeDatabase.returnHashTable();
        int search = hashTable.searchEmployee(employeeNumber);
        if (workLocation.getSelectedItem() == "Toronto") {
                    workLoc = 0;
                } else if (workLocation.getSelectedItem() == "Mississauga") {
                    workLoc = 1;
                } else if (workLocation.getSelectedItem() == "Ottawa") {
                    workLoc = 2;
                } else {
                    workLoc = -1;
        }
        try {
            yrSalary = Double.parseDouble(yrlySalary.getText());
        } catch (Exception e) {
            yrSalaryError.setForeground(Color.red);
        }
        try {
            dRate = Double.parseDouble(deducRate.getText()) / 100;
        } catch (Exception e) {
            dRateError.setForeground(Color.red);
        }
        
        //makes sure all of the variables inputted are valid and if not displays error message and does not continue
        if (employeeNumber < 0){
            empNumError.setForeground(Color.red);
            error = 1;
        }
        
        if (search != -1 && employeeNumber!= originalEmpNum) {
            empNumError.setForeground(Color.red);
            error=1;
        }
        
        if (firstName.getText().equals("First Name")) {
            fNameError.setForeground(Color.red);
            error = 1;
        }
        if (lastName.getText().equals("Last Name")) {
            lNameError.setForeground(Color.red);
            error = 1;
        }
        if (empNum.getText().equals("Employee Number")) {
            empNumError.setForeground(Color.red);
            error = 1;
        }
        if (deducRate.getText().equals("Deductions Rate")) {
            dRateError.setForeground(Color.red);
            error = 1;
        }
        if (yrlySalary.getText().equals("Annual Salary")) {
            yrSalaryError.setForeground(Color.red);
            error = 1;
        }
        if (workLoc == -1) {
            workLocation.setForeground(Color.red);
            error = 1;
        }
        if (sex == -1) {
            sexError.setForeground(Color.red);
            error = 1;
        }
        if (yrlySalary.equals("Yearly Salary"))
        {
            error=1;
            yrlySalary.setForeground(Color.red);
        }

        //adds new employee with inputted values
        if (error != 1) {
            hashTable.removeEmployee(originalEmpNum);

            fName = firstName.getText();
            lName = lastName.getText();

            try {
                employee = new FullTimeEmployee(employeeNumber, fName, lName, sex, workLoc, dRate, yrSalary);

                hashTable.addEmployee(employee);

                //returns to main menu
                dispose();
                new MainMenu().setVisible(true);
                new EditSuccessfulFrame().setVisible(true);
            } catch (Exception e) {
                //catches invalid inputes
            }
        }
    }//GEN-LAST:event_button_completeActionPerformed

    //returns variable values to display in text boxes when program is opened
    private String getEmpNum() {
        return Integer.toString(employeeNumber);
    }

    private String getFirstName() {
        return fName;
    }

    private String getLastName() {
        return lName;
    }

    private String getDRate() {
        return Double.toString(dRate);
    }

    //if no yearly salary sets text to default
    private String getYrSalary(){
        if (yrSalary == -1.0){
            yrlySalary.setText("Yearly Salary");
            yrlySalary.setForeground(Color.lightGray);
            yrlySalary.setFont(yrlySalary.getFont().deriveFont(Font.ITALIC));
            return ("Yearly Salary");
        }
        else{
            return Double.toString(yrSalary);
        }
    }
    
    //returns true or false to select the buttons needed to have auto selected
    private boolean getSexMale() {
        if (sex == 0){
            return (true);
        }
        else{
            return (false);
        }
    }
    private boolean getSexFemale() {
        if (sex == 1){
            return (true);
        }
        else{
            return (false);
        }
    }
    private boolean getSexOther() {
        if (sex == 2){
            return (true);
        }
        else{
            return (false);
        }
    }
    
    //returns the position of the work location in the drop down
    private int getWorkLoc(){
        return (workLoc+1);
    }
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
            java.util.logging.Logger.getLogger(EditFullTimeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFullTimeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFullTimeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFullTimeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFullTimeEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_complete;
    private javax.swing.JButton button_return;
    private javax.swing.JLabel dRateError;
    private javax.swing.JTextField deducRate;
    private javax.swing.JTextField empNum;
    private javax.swing.JLabel empNumError;
    private javax.swing.JLabel fNameError;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNameError;
    private javax.swing.JTextField lastName;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private javax.swing.JLabel sexError;
    private javax.swing.JComboBox<String> workLocation;
    private javax.swing.JLabel yrSalaryError;
    private javax.swing.JTextField yrlySalary;
    // End of variables declaration//GEN-END:variables
}
