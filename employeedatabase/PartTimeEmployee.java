package employeedatabase;

/*

NAME:                              Patricia Mielnik
STUDENT NUMBER:                    571443


ICS4U0-A, October 31, 2016

THIS FILE IS PART OF THE PROGRAM: Employee Database

 */
public class PartTimeEmployee extends EmployeeInfo {

    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    public PartTimeEmployee(int empNum, String fName, String lName, int sexx, int workLoc, double deducRate, double hrWage, double hrWeek, double wkYear) {
        super(empNum, fName, lName, sexx, workLoc, deducRate);
        // TODO Auto-generated constructor stub

        hourlyWage = hrWage;
        hoursPerWeek = hrWeek;
        weeksPerYear = wkYear;
    }

    public double calcAnnualIncome() {
        return ((double) Math.round((hourlyWage * hoursPerWeek * weeksPerYear * (1 - deductionsRate)) * 100) / 100);
    }

    public String empType() {
        return "p";
    }

    double getHourlyWage() {
        return hourlyWage;
    }

    double getHoursPerWeek() {
        return hoursPerWeek;
    }

    double getWeeksPerYear() {
        return weeksPerYear;
    }

}
