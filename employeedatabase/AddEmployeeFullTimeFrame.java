package employeedatabase;

import java.awt.Color;
import java.awt.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patricia
 */
public class AddEmployeeFullTimeFrame extends javax.swing.JFrame {

    private static EmployeeInfo employee;
    private int sex = -1;
    private int employeeNumber;
    private String fName;
    private String lName;
    private int workLoc = -1;
    private double dRate;
    private double yrSalary;

    /**
     * Creates new form AddEmployeeFrameFull
     */
    public AddEmployeeFullTimeFrame() {
        initComponents();

    }

    public static EmployeeInfo returnEmployee() {
        return employee;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empSexButton = new javax.swing.ButtonGroup();
        fEmpPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        empNumber = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        workLocation = new javax.swing.JComboBox<>();
        deducRate = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        button_return = new javax.swing.JButton();
        percentSymbol = new javax.swing.JLabel();
        dollarSign = new javax.swing.JLabel();
        button_complete = new javax.swing.JButton();
        empNumError = new javax.swing.JLabel();
        lNameError = new javax.swing.JLabel();
        fNameError = new javax.swing.JLabel();
        dRateError = new javax.swing.JLabel();
        aSalaryError = new javax.swing.JLabel();
        sexError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        fEmpPanel.setBackground(java.awt.Color.lightGray);

        title.setFont(new java.awt.Font("Avenir Next", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(102, 102, 102));
        title.setText("ADD FULL TIME EMPLOYEE");

        empNumber.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        empNumber.setForeground(java.awt.Color.lightGray);
        empNumber.setText("Employee Number");
        empNumber.setFocusable(false);
        empNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empNumberFocusLost(evt);
            }
        });
        empNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                makeFocusable(evt);
            }
        });

        firstName.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        firstName.setForeground(java.awt.Color.lightGray);
        firstName.setText("First Name");
        firstName.setFocusable(false);
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });
        firstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                makeFocusable(evt);
            }
        });

        lastName.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        lastName.setForeground(java.awt.Color.lightGray);
        lastName.setText("Last Name");
        lastName.setFocusable(false);
        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });
        lastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                makeFocusable(evt);
            }
        });

        empSexButton.add(male);
        male.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        male.setForeground(java.awt.Color.darkGray);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        empSexButton.add(female);
        female.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        female.setForeground(java.awt.Color.darkGray);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        empSexButton.add(other);
        other.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        other.setForeground(java.awt.Color.darkGray);
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });

        workLocation.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        workLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Work Location (select one)", "Mississauga", "Toronto", "Ottawa" }));
        workLocation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                workLocationFocusLost(evt);
            }
        });

        deducRate.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        deducRate.setForeground(java.awt.Color.lightGray);
        deducRate.setText("Deductions Rate");
        deducRate.setFocusable(false);
        deducRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                deducRateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                deducRateFocusLost(evt);
            }
        });
        deducRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                makeFocusable(evt);
            }
        });

        salary.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        salary.setForeground(java.awt.Color.lightGray);
        salary.setText("Annual Salary");
        salary.setFocusable(false);
        salary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salaryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                salaryFocusLost(evt);
            }
        });
        salary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                makeFocusable(evt);
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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnMouseEntered(evt);
            }
        });
        button_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_returnActionPerformed(evt);
            }
        });

        percentSymbol.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        percentSymbol.setForeground(java.awt.Color.darkGray);
        percentSymbol.setText("%");

        dollarSign.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        dollarSign.setForeground(java.awt.Color.darkGray);
        dollarSign.setText("$");

        button_complete.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        button_complete.setForeground(new java.awt.Color(255, 255, 255));
        button_complete.setText("COMPLETE");
        button_complete.setBorderPainted(false);
        button_complete.setContentAreaFilled(false);
        button_complete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        button_complete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_complete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completeMouseEntered(evt);
            }
        });
        button_complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_completeActionPerformed(evt);
            }
        });

        empNumError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        empNumError.setForeground(java.awt.Color.lightGray);
        empNumError.setText("invalid input");

        lNameError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        lNameError.setForeground(java.awt.Color.lightGray);
        lNameError.setText("please input a name");

        fNameError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        fNameError.setForeground(java.awt.Color.lightGray);
        fNameError.setText("please input a name");

        dRateError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        dRateError.setForeground(java.awt.Color.lightGray);
        dRateError.setText("invalid input");

        aSalaryError.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        aSalaryError.setForeground(java.awt.Color.lightGray);
        aSalaryError.setText("invalid input");

        sexError.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        sexError.setForeground(java.awt.Color.lightGray);
        sexError.setText("please select one:");

        javax.swing.GroupLayout fEmpPanelLayout = new javax.swing.GroupLayout(fEmpPanel);
        fEmpPanel.setLayout(fEmpPanelLayout);
        fEmpPanelLayout.setHorizontalGroup(
            fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fEmpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fEmpPanelLayout.createSequentialGroup()
                        .addComponent(dollarSign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fEmpPanelLayout.createSequentialGroup()
                                .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(salary)
                                        .addComponent(firstName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(empNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(deducRate))
                                    .addGroup(fEmpPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empNumError)
                                            .addComponent(dRateError)
                                            .addComponent(aSalaryError))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentSymbol))
                            .addGroup(fEmpPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fNameError)
                                    .addComponent(lNameError))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fEmpPanelLayout.createSequentialGroup()
                                .addComponent(workLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(fEmpPanelLayout.createSequentialGroup()
                                .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(male)
                                    .addComponent(female)
                                    .addComponent(other)
                                    .addComponent(sexError))
                                .addContainerGap())))
                    .addGroup(fEmpPanelLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE))))
            .addGroup(fEmpPanelLayout.createSequentialGroup()
                .addComponent(button_return, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fEmpPanelLayout.createSequentialGroup()
                    .addContainerGap(402, Short.MAX_VALUE)
                    .addComponent(button_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        fEmpPanelLayout.setVerticalGroup(
            fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fEmpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fEmpPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(empNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empNumError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fNameError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNameError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deducRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dRateError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dollarSign)))
                    .addGroup(fEmpPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(sexError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(other)
                        .addGap(18, 18, 18)
                        .addComponent(workLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aSalaryError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(button_return, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(fEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fEmpPanelLayout.createSequentialGroup()
                    .addContainerGap(303, Short.MAX_VALUE)
                    .addComponent(button_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_returnActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_button_returnActionPerformed

    private void returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnMouseEntered
        // TODO add your handling code here:
        button_return.setForeground(Color.darkGray);
    }//GEN-LAST:event_returnMouseEntered

    private void returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnMouseExited
        // TODO add your handling code here:
        button_return.setForeground(Color.white);
    }//GEN-LAST:event_returnMouseExited

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

    private void empNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empNumberFocusGained
        // TODO add your handling code here:
        empNumError.setForeground(Color.lightGray);
        if (empNumber.getText().equals("Employee Number")) {
            empNumber.setText("");
            empNumber.setForeground(Color.darkGray);
            empNumber.setFont(empNumber.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_empNumberFocusGained

    private void empNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empNumberFocusLost
        // TODO add your handling code here:
        if (empNumber.getText().equals("")) {
            empNumber.setText("Employee Number");
            empNumber.setForeground(Color.lightGray);
            empNumber.setFont(empNumber.getFont().deriveFont(Font.ITALIC));
        }
        try {
            employeeNumber = Integer.parseInt(empNumber.getText());
        } catch (Exception e) {
            empNumError.setForeground(Color.red);
        }
        
        MyHashTable hashTable = EmployeeDatabase.returnHashTable();
        
        if (hashTable.searchEmployee(employeeNumber) != -1){
            empNumError.setForeground(Color.red);
        }
    }//GEN-LAST:event_empNumberFocusLost

    private void firstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusGained
        // TODO add your handling code here:
        lNameError.setForeground(Color.lightGray);
        if (firstName.getText().equals("First Name")) {
            firstName.setText("");
            firstName.setForeground(Color.darkGray);
            firstName.setFont(firstName.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_firstNameFocusGained

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
        // TODO add your handling code here:
        if (firstName.getText().equals("")) {
            firstName.setText("First Name");
            firstName.setForeground(Color.lightGray);
            firstName.setFont(firstName.getFont().deriveFont(Font.ITALIC));
        }
        if (firstName.getText().equals("First Name")) {
            fNameError.setForeground(Color.red);
        }
    }//GEN-LAST:event_firstNameFocusLost

    private void lastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusGained
        // TODO add your handling code here:
        fNameError.setForeground(Color.lightGray);
        if (lastName.getText().equals("Last Name")) {
            lastName.setText("");
            lastName.setForeground(Color.darkGray);
            lastName.setFont(lastName.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_lastNameFocusGained

    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost
        // TODO add your handling code here:
        if (lastName.getText().equals("")) {
            lastName.setText("Last Name");
            lastName.setForeground(Color.lightGray);
            lastName.setFont(lastName.getFont().deriveFont(Font.ITALIC));
        }
        if (lastName.getText().equals("Last Name")) {
            lNameError.setForeground(Color.red);
        }
    }//GEN-LAST:event_lastNameFocusLost

    private void deducRateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deducRateFocusGained
        // TODO add your handling code here:
        dRateError.setForeground(Color.lightGray);
        if (deducRate.getText().equals("Deductions Rate")) {
            deducRate.setText("");
            deducRate.setForeground(Color.darkGray);
            deducRate.setFont(deducRate.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_deducRateFocusGained

    private void deducRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deducRateFocusLost
        // TODO add your handling code here:
        if (deducRate.getText().equals("")) {
            deducRate.setText("Deductions Rate");
            deducRate.setForeground(Color.lightGray);
            deducRate.setFont(deducRate.getFont().deriveFont(Font.ITALIC));
        }
        try {
            dRate = Double.parseDouble(deducRate.getText()) / 100;
        } catch (Exception e) {
            dRateError.setForeground(Color.red);
        }
        if (deducRate.getText().equals("Deductions Rate")) {
            dRateError.setForeground(Color.red);
        }
    }//GEN-LAST:event_deducRateFocusLost

    private void salaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salaryFocusGained
        // TODO add your handling code here:
        aSalaryError.setForeground(Color.lightGray);
        if (salary.getText().equals("Annual Salary")) {
            salary.setText("");
            salary.setForeground(Color.darkGray);
            salary.setFont(salary.getFont().deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_salaryFocusGained

    private void salaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salaryFocusLost
        // TODO add your handling code here:
        if (salary.getText().equals("")) {
            salary.setText("Annual Salary");
            salary.setForeground(Color.lightGray);
            salary.setFont(salary.getFont().deriveFont(Font.ITALIC));
        }
        try {
            yrSalary = Double.parseDouble(salary.getText());
        } catch (Exception e) {
            aSalaryError.setForeground(Color.red);
        }
        if (salary.getText().equals("Annual Salary")) {
            aSalaryError.setForeground(Color.red);
        }
    }//GEN-LAST:event_salaryFocusLost

    private void completeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeMouseExited
        // TODO add your handling code here:
        button_complete.setForeground(Color.white);
    }//GEN-LAST:event_completeMouseExited

    private void completeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeMouseEntered
        // TODO add your handling code here:
        button_complete.setForeground(Color.darkGray);
    }//GEN-LAST:event_completeMouseEntered

    private void button_completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_completeActionPerformed
        // TODO add your handling code here:
        int error = 0;
        
        MyHashTable hashTable = EmployeeDatabase.returnHashTable();
        
        int search = hashTable.searchEmployee(employeeNumber);

        if (employeeNumber < 0){
            empNumError.setForeground(Color.red);
            error = 1;
        }
        
        if (search != -1) {
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
        if (empNumber.getText().equals("Employee Number")) {
            empNumError.setForeground(Color.red);
            error = 1;
        }
        if (deducRate.getText().equals("Deductions Rate")) {
            dRateError.setForeground(Color.red);
            error = 1;
        }
        if (salary.getText().equals("Annual Salary")) {
            aSalaryError.setForeground(Color.red);
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

        if (error != 1) {

            fName = firstName.getText();
            lName = lastName.getText();

            try {
                employee = new FullTimeEmployee(employeeNumber, fName, lName, sex, workLoc, dRate, yrSalary);

                

                hashTable.addEmployee(employee);

                dispose();
                new MainMenu().setVisible(true);
                new AddSuccessfulFrame().setVisible(true);
                
            } catch (Exception e) {
                //idk
            }
        }

    }//GEN-LAST:event_button_completeActionPerformed

    private void makeFocusable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makeFocusable
        // TODO add your handling code here:
        empNumber.setFocusable(true);
        firstName.setFocusable(true);
        lastName.setFocusable(true);
        deducRate.setFocusable(true);
        workLocation.setFocusable(true);
        salary.setFocusable(true);
    }//GEN-LAST:event_makeFocusable

    private void workLocationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workLocationFocusLost
        // TODO add your handling code here:
        if (workLocation.getSelectedItem() == "Toronto") {
            workLoc = 0;
        } else if (workLocation.getSelectedItem() == "Mississauga") {
            workLoc = 1;
        } else if (workLocation.getSelectedItem() == "Ottawa") {
            workLoc = 2;
        } else {
            workLoc = -1;
        }

        if (workLoc == -1) {
            workLocation.setForeground(Color.red);
        }
    }//GEN-LAST:event_workLocationFocusLost

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
            java.util.logging.Logger.getLogger(AddEmployeeFullTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFullTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFullTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFullTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeFullTimeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aSalaryError;
    private javax.swing.JButton button_complete;
    private javax.swing.JButton button_return;
    private javax.swing.JLabel dRateError;
    private javax.swing.JTextField deducRate;
    private javax.swing.JLabel dollarSign;
    private javax.swing.JLabel empNumError;
    private javax.swing.JTextField empNumber;
    private javax.swing.ButtonGroup empSexButton;
    private javax.swing.JPanel fEmpPanel;
    private javax.swing.JLabel fNameError;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel lNameError;
    private javax.swing.JTextField lastName;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private javax.swing.JLabel percentSymbol;
    private javax.swing.JTextField salary;
    private javax.swing.JLabel sexError;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> workLocation;
    // End of variables declaration//GEN-END:variables
}