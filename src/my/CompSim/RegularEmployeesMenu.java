/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FavaroJohn
 */
public class RegularEmployeesMenu
{
    public RegularEmployeesMenu()
    {
        
    }
    public void createRegularEmployeeObjects(ArrayList<RegularEmployee> employee)
    {
        for (RegularEmployee e : employee)
        {
            if (e.hired)
            {
                System.out.println("HIRED EMPLOYEES");
                ArrayList<RegularEmployee> hiredEmployees = new ArrayList<RegularEmployee>();
                hiredEmployees.add(e);
                employee.remove(e);
                printEmployee(hiredEmployees);

                //Copy hired to hiredArray
            } else
            {
                break;
            }

        }
        System.out.println("\nAVAILABLE FOR HIRE");
        printEmployee(employee);
        System.out.println("========MENU========");
        System.out.println("1. Return to Employees");
        System.out.println("2. Hire Employees");
        System.out.println("3. Fire Employees");
        System.out.print("\nPlease enter choice: ");
    }

    public void printEmployee(ArrayList<RegularEmployee> employee)
    {
        //str = (RegularEmployee)employeeIt.next();
        for (RegularEmployee e : employee)
        {
            System.out.println("ID: " + e.id + " | Name: " + e.name + "\nPosition: " + e.position
                    + " | " + "\nYears with Company: " + e.hired
                    + " | Skill Rating: " + e.skillRating + "\nSalary: " + e.salary
                    + " | " + "\nAddress: " + e.address + "\n");
        }
    }

    public void printHiredEmployee(ArrayList<RegularEmployee> employee)
    {
        //str = (RegularEmployee)employeeIt.next();
        menuHeader();
        System.out.println("HIRED EMPLOYEES");

        if (employee.isEmpty())
        {
            System.out.println("No Hired Employees!\n");
        }

        for (RegularEmployee e : employee)
        {
            if (employee.isEmpty())
            {
                break;
            } else
            {
                System.out.println("ID: " + e.id + " | Name: " + e.name + "\nPosition: " + e.position
                        + " | "  + "\nYears with Company: " + e.hired
                        + " | Skill Rating: " + e.skillRating + "\nSalary: " + e.salary
                        + " | "+ "\nAddress: " + e.address + "\n");
            }
        }
        menuChoices();
    }
    
    public void printHiredEmployeeAlt(ArrayList<RegularEmployee> employee)
    {
        //str = (RegularEmployee)employeeIt.next();
        menuHeader();
        System.out.println("HIRED EMPLOYEES");

        if (employee.isEmpty())
        {
            System.out.println("No Hired Employees!\n");
        }

        for (RegularEmployee e : employee)
        {
            if (employee.isEmpty())
            {
                break;
            } else
            {
                System.out.println("Choice: " + employee.indexOf(e) + " | ID: " + e.id 
                        + " | Name: " + e.name + "\nPosition: " + e.position
                        + " | " + "\nYears with Company: " + e.hired
                        + " | Skill Rating: " + e.skillRating + "\nSalary: " + e.salary
                        + " | " + "\nAddress: " + e.address + "\n");
            }
        }
        hireFireMenu();
    }
    
    public void printAvailableEmployee(ArrayList<RegularEmployee> employee, String userChoice, Scanner input)
    {
        //str = (RegularEmployee)employeeIt.next();
        int choice;
        menuHeader();
        System.out.println("AVAILABLE EMPLOYEES\n");

        if (employee.isEmpty())
        {
            System.out.println("No AVAILABLE Employees!\n");
        }

        for (RegularEmployee e : employee)
        {
            if (employee.isEmpty())
            {
                break;
            } else
            {
                System.out.println("Choice: " + employee.indexOf(e)+ " | ID: " + e.id + " | Name: " + e.name + "\nPosition: " + e.position
                        + " | "  + "\nYears with Company: " + e.hired
                        + " | Skill Rating: " + e.skillRating + "\nSalary: " + e.salary
                        + " | "+ "\nAddress: " + e.address + "\n");
            }
        }
        hireFireMenu();
    }

    public void menuChoices()
    {
        System.out.println("========MENU========");
        System.out.println("1. Return to Employees");
        System.out.println("2. Hire Employees");
        System.out.println("3. Fire Employees");
        System.out.print("\nPlease enter choice: ");
    }
    
    public void menuHeader()
    {
        System.out.println("========EMPLOYEES========");
    }
    
    public void hireFireMenu()
    {
        //System.out.println("========MENU========");
        
        //System.out.println("Type exit RegularEmployee");
        System.out.println("================================");
        System.out.print("\nPlease enter ID or type \"exit\": ");
    }
    
    public void hireEmployee(ArrayList<RegularEmployee> availableEmployee, ArrayList<RegularEmployee> hiredEmployee, int index, AccountSummary acct)
    {
        double salary = availableEmployee.get(index).salary;
        availableEmployee.get(index).setHired(true);
        double availableCash = acct.getAvailableCash();
        System.out.println("" + availableCash);
        acct.setAvailableCash(availableCash - salary);
        
        
        double newCash = acct.getAvailableCash();
        System.out.println("" + newCash);
        double skillRating = availableEmployee.get(index).skillRating;
        System.out.println(skillRating/100);
        acct.setAvailableCash(newCash + ((skillRating / 100) * newCash));
        double prodAdd = ((skillRating / 100) * newCash);
        DecimalFormat decFormat = new DecimalFormat("#.##");
        double adjustedCash = acct.getAvailableCash();
        System.out.println("===TRANSACTION RECEIPT===\n" + "Available Cash: " + availableCash 
        + "\nSalary Deduction: " + salary + "\nProductivity Addition: " + decFormat.format(prodAdd) + "\n=====================\nAdjusted Cash: " + adjustedCash);
        System.out.println(availableEmployee.get(index).name +" Hired! " + availableEmployee.get(index).hired + "\n");
        hiredEmployee.add(availableEmployee.remove(index));
    }
    
    public void fireEmployee(ArrayList<RegularEmployee> hiredEmployee, ArrayList<RegularEmployee> availableEmployee, int index, AccountSummary acct)
    {
        hiredEmployee.get(index).setHired(false);
        double availableCash = acct.getAvailableCash();
        System.out.println("" + availableCash);
        acct.setAvailableCash(availableCash + hiredEmployee.get(index).salary);
        
        double newCash = acct.getAvailableCash();
        System.out.println("" + newCash);
        System.out.println(hiredEmployee.get(index).name +" Fired! " + hiredEmployee.get(index).hired + "\n");
        availableEmployee.add(hiredEmployee.remove(index));   
    }
}

