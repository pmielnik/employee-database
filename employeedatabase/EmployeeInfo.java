package employeedatabase;

/*

NAME:                              Patricia Mielnik
STUDENT NUMBER:                    571443


ICS4U0-A, October 31, 2016

THIS FILE IS PART OF THE PROGRAM: Employee Database

*/

public class EmployeeInfo
{
    private int empNumber; //will be the key value
    private String firstName;
    private String lastName;
    private int sex;
    private int workLocation;
    protected double deductionsRate;

    public EmployeeInfo (int empNum, String fName, String lName, int sexx, int workLoc, double deducRate)
    {
        empNumber = empNum;
        firstName = fName;
        lastName = lName; 
        sex = sexx;
        workLocation = workLoc; 
        deductionsRate = deducRate; 
        
    }

    //returns the employee number (key value)
    public int getEmpNumber ()
    {
        return (empNumber);
    }

    //returns the first name of the employee
    public String getFirstName ()
    {
        return (firstName);
    }
    
    //returns the last name of the employee
    public String getLastName ()
    {
        return (lastName);
    }

    //returns the sex of the employee
    public int getSex ()
    {
        return (sex);
    }

    //returns the work location of the employee
    public int getWorkLocation ()
    {
        return (workLocation);
    }
    
    //returns the deductions rate of the employee
    public double getDedustionsRate ()
    {
        return (deductionsRate);
    }

    // Setter method for employeeNumber attributes.
    public void setEmployeeNumber (int empNo)
    {
        if (empNo < 0)
        {
            return;
        }
        else
        {
            empNumber = empNo;
        }
    }
    
    public double calcAnnualIncome()
    {
    	return 0.0;
    }
    
    public String empType(){ 
        return "n";
    }

    double getAnnualIncome() {
        return -1.0;
    }

    double getHourlyWage() {
        return -1.0;
    }

    double getHoursPerWeek() {
        return -1.0;
    }

    double getWeeksPerYear() {
        return -1.0;
    }
}
