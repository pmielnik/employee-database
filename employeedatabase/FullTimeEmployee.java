package employeedatabase;

/*

NAME:                              Patricia Mielnik
STUDENT NUMBER:                    571443


ICS4U0-A, October 31, 2016

THIS FILE IS PART OF THE PROGRAM: Employee Database

*/

public class FullTimeEmployee extends EmployeeInfo {
	
	private double yearlySalary;
	
	public FullTimeEmployee(int empNum, String fName, String lName, int sexx, int workLoc, double deducRate, double yrSalary) {
		super(empNum, fName, lName, sexx, workLoc, deducRate);
		// TODO Auto-generated constructor stub
		
		yearlySalary = yrSalary;
	}
	
	public double calcAnnualIncome ()
	{
		return ( Math.round((yearlySalary * (1 - deductionsRate)) * 100)/100);
	}
        
        public String empType (){
            return "f";
        }
        
        public double getAnnualIncome() {
            return yearlySalary;
        }

}
