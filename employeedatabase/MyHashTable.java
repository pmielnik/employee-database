package employeedatabase;

/*

NAME:                              Patricia Mielnik
STUDENT NUMBER:                    571443


ICS4U0-A, October 31, 2016

THIS FILE IS PART OF THE PROGRAM: Employee Database

*/

import java.util.*;


public class MyHashTable
{
    protected static ArrayList < EmployeeInfo >[] buckets; // buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
    private static int numOfBuckets = 0;
    private static int numOfEmployees = 0; 




    // CONSTRUCTOR: Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.
    public MyHashTable (int howManyBuckets)
    {
        // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList [howManyBuckets];
        numOfBuckets = howManyBuckets;

        for (int x = 0 ; x < howManyBuckets ; x++)
        {
            buckets [x] = new ArrayList < EmployeeInfo >(); // Instantiate the ArrayList for bucket x.
        }
    }

    // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
    public int calcBucket (int keyValue)
    {
        return (keyValue % buckets.length);
    }

    public boolean addEmployee (EmployeeInfo theEmployee)
    {
        int bucketNum = calcBucket (theEmployee.getEmpNumber ());
        
        numOfEmployees ++;

        return buckets [bucketNum].add (theEmployee);
    }

    //returns a number that states which number in the list the employee is
    public int searchEmployee (int employeeNum)
    {
        int bucketNum = calcBucket (employeeNum);
        int numInList = 0;

       
        for (int x = 0; x < buckets[bucketNum].size(); x++)
        {
            numInList++;

            EmployeeInfo employee = buckets[bucketNum].get(x);

            if (employee.getEmpNumber () == employeeNum)
            {
                return numInList;
            }
        }
        return -1;
    }

    //removes an employee from the hash table and return said employee
    public EmployeeInfo removeEmployee (int employeeNum)
    {
        int bucketNum = calcBucket (employeeNum);
        
        int listNum = searchEmployee(employeeNum); 

        if (listNum < 0)
        {
        	return null;
        }
        
        else
        {
        	EmployeeInfo employee = buckets [bucketNum].remove (listNum-1);
        	
        	return employee; 
        }
    }

    // Print the employee numbers for the employees stored in each bucket's ArrayList
    public void displayContents ()
    {
        for (int x = 0 ; x < numOfBuckets ; x++)
        {
        	System.out.println();
        	System.out.println("BUCKET " + x );

            //Iterator it = buckets [x].iterator ();

            for (int y = 0; y < buckets[x].size() ; y++) 
            {
        		EmployeeInfo employee = buckets[x].get(y);
                
                System.out.print(employee.getFirstName () + " " + employee.getLastName() + " EMPLOYEE NUMBER: " + employee.getEmpNumber ());
                
                //prints sex
                
                if (employee.getSex() == 0)
                {
                	System.out.print(" GENDER: male ");
                }
                
                else if (employee.getSex() == 1 )
                {
                	System.out.print(" GENDER: female ");
                }
                
                else if (employee.getSex() == 2 )
                {
                	System.out.print(" GENDER: other ");
                }
                
                //prints work location
                
                if (employee.getWorkLocation() == 0)
                {
                	System.out.print("CITY: Missauga");
                }
                
                else if (employee.getWorkLocation() == 1)
                {
                	System.out.print("CITY: Ottawa");
                }
                
                else if (employee.getWorkLocation() == 2)
                {
                	System.out.print("CITY: Kitchener");
                }
                
                System.out.println(" SALARY: $" + employee.calcAnnualIncome());
            }
        }
    }
    
    public static int numOfEmp (){
        return numOfEmployees;
    }
    
    public static int numOfBuckets (){
        return numOfBuckets;
    }
} // end class MyHashTable