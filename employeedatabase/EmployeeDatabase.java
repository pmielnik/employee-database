/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public class EmployeeDatabase {

    private static MyHashTable hashTable = new MyHashTable (2);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenu main = new MainMenu();
        main.setVisible(true);
        
        autoload();
    }


    public static MyHashTable returnHashTable() {
        return hashTable;
    }
    
   
    private static void autoload() {
        class MyCustomFilter extends javax.swing.filechooser.FileFilter {

            @Override
            public boolean accept(File file) {
                // Allow only directories, or files with ".txt" extension
                return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                // This description will be displayed in the dialog,
                // hard-coded = ugly, should be done via I18N
                return "Text documents (*.txt)";
            }
        }

        
            
                ArrayList employeeInfo = new ArrayList< String>();

                try (BufferedReader br = new BufferedReader(new FileReader("EmployeeDatabaseArchive.txt"))) {
                    StringBuilder sb = new StringBuilder();
                    String line = br.readLine();

                    while (line != null) {
                        sb.append(line);
                        sb.append(System.lineSeparator());
                        employeeInfo.add(line);
                        line = br.readLine();
                    }
                } catch (Exception e) {

                }
                for (int i = 0; i < employeeInfo.size(); i++) {
                    String strEmpInfo = employeeInfo.get(i).toString();
                    int start;

                    String type = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                    start = strEmpInfo.indexOf("@") + 1;
                    strEmpInfo = strEmpInfo.substring(start);

                    String empNum = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                    start = strEmpInfo.indexOf("@") + 1;
                    strEmpInfo = strEmpInfo.substring(start);

                    String fName = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                    start = strEmpInfo.indexOf("@") + 1;
                    strEmpInfo = strEmpInfo.substring(start);

                    String lName = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                    start = strEmpInfo.indexOf("@") + 1;
                    strEmpInfo = strEmpInfo.substring(start);

                    String dRate = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                    start = strEmpInfo.indexOf("@") + 1;
                    strEmpInfo = strEmpInfo.substring(start);

                    String sex = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                    start = strEmpInfo.indexOf("@") + 1;
                    strEmpInfo = strEmpInfo.substring(start);

                    String workLoc = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                    start = strEmpInfo.indexOf("@") + 1;
                    strEmpInfo = strEmpInfo.substring(start);

                    int iEmpNum = Integer.parseInt(empNum);
                    double dDRate = Double.parseDouble(dRate)/100;
                    int iSex = Integer.parseInt(sex);
                    int iWorkLoc = Integer.parseInt(workLoc);

                    if (type.equals("f")) {
                        String salary = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                        start = strEmpInfo.indexOf("@") + 1;
                        strEmpInfo = strEmpInfo.substring(start);

                        double dSalary = Double.parseDouble(salary);
                        FullTimeEmployee newEmp = new FullTimeEmployee(iEmpNum, fName, lName, iSex, iWorkLoc, dDRate, dSalary);
                        String income = strEmpInfo.substring(0);

                        MyHashTable hashTable = EmployeeDatabase.returnHashTable();

                        hashTable.addEmployee(newEmp);

                        //System.out.println(type + " " + empNum + " " + fName + " " + lName + " " + dRate + " " + sex + " " + workLoc + " " + salary + " " + income);
                    } else if (type.equals("p")) {
                        String hrWage = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                        start = strEmpInfo.indexOf("@") + 1;
                        strEmpInfo = strEmpInfo.substring(start);

                        String hrWeek = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                        start = strEmpInfo.indexOf("@") + 1;
                        strEmpInfo = strEmpInfo.substring(start);

                        String wkYear = strEmpInfo.substring(0, strEmpInfo.indexOf("@"));
                        start = strEmpInfo.indexOf("@") + 1;
                        strEmpInfo = strEmpInfo.substring(start);
                        double dHrWage = Double.parseDouble(hrWage);
                        double dHrWeek = Double.parseDouble(hrWeek);
                        double dWkYear = Double.parseDouble(wkYear);

                        String income = strEmpInfo.substring(0);
                        PartTimeEmployee newEmp = new PartTimeEmployee(iEmpNum, fName, lName, iSex, iWorkLoc, dDRate, dHrWage, dHrWeek, dWkYear);

                        MyHashTable hashTable = EmployeeDatabase.returnHashTable();

                        hashTable.addEmployee(newEmp);
                    }

                }
    } 
}

