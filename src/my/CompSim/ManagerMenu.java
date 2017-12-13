/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

import java.util.*;
import static my.CompSim.CompanySimulator.event;
import static my.CompSim.CompanySimulator.userChoice;

/**
 *
 * @author FavaroJohn
 */
public class ManagerMenu
{

    public ManagerMenu()
    {
        
        //createManagerObjects(manager);
        //System.out.println("ID: " + id + "\nName: " + name + "\nAddress: " + address);

    }

    public void createManagerObjects(ArrayList<Manager> manager)
    {
        for (Manager m : manager)
        {
            if (m.hired)
            {
                System.out.println("HIRED MANAGERS");
                ArrayList<Manager> hiredManagers = new ArrayList<Manager>();
                hiredManagers.add(m);
                manager.remove(m);
                printManager(hiredManagers);

                //Copy hired to hiredArray
            } else
            {
                break;
            }

        }
        System.out.println("\nAVAILABLE FOR HIRE");
        printManager(manager);
        System.out.println("========MENU========");
        System.out.println("1. Return to Employees");
        System.out.println("2. Hire Managers");
        System.out.println("3. Fire Managers");
        System.out.print("\nPlease enter choice: ");
    }

    public void printManager(ArrayList<Manager> manager)
    {
        //str = (Manager)managerIt.next();
        for (Manager m : manager)
        {
            System.out.println("ID: " + m.id + " | Name: " + m.name + "\nPosition: " + m.position
                    + " | Department: " + m.department + "\nYears with Company: " + m.hired
                    + " | Skill Rating: " + m.skillRating + "\nSalary: " + m.salary
                    + " | Education Level: " + m.educationLevel + "\nAddress: " + m.address + "\n");
        }
    }

    public void printHiredManager(ArrayList<Manager> manager)
    {
        //str = (Manager)managerIt.next();
        menuHeader();
        System.out.println("HIRED MANAGERS");

        if (manager.isEmpty())
        {
            System.out.println("No Hired Managers!\n");
        }

        for (Manager m : manager)
        {
            if (manager.isEmpty())
            {
                break;
            } else
            {
                System.out.println("ID: " + m.id + " | Name: " + m.name + "\nPosition: " + m.position
                        + " | Department: " + m.department + "\nYears with Company: " + m.hired
                        + " | Skill Rating: " + m.skillRating + "\nSalary: " + m.salary
                        + " | Education Level: " + m.educationLevel + "\nAddress: " + m.address + "\n");
            }
        }
        menuChoices();
    }
    
    public void printHiredManagerAlt(ArrayList<Manager> manager)
    {
        //str = (Manager)managerIt.next();
        menuHeader();
        System.out.println("HIRED MANAGERS");

        if (manager.isEmpty())
        {
            System.out.println("No Hired Managers!\n");
        }

        for (Manager m : manager)
        {
            if (manager.isEmpty())
            {
                break;
            } else
            {
                System.out.println("Choice: " + manager.indexOf(m) + " | ID: " + m.id 
                        + " | Name: " + m.name + "\nPosition: " + m.position
                        + " | Department: " + m.department + "\nYears with Company: " + m.hired
                        + " | Skill Rating: " + m.skillRating + "\nSalary: " + m.salary
                        + " | Education Level: " + m.educationLevel + "\nAddress: " + m.address + "\n");
            }
        }
        hireFireMenu();
    }
    
    public void printAvailableManager(ArrayList<Manager> manager, String userChoice, Scanner input)
    {
        //str = (Manager)managerIt.next();
        int choice;
        menuHeader();
        System.out.println("AVAILABLE MANAGERS\n");

        if (manager.isEmpty())
        {
            System.out.println("No AVAILABLE Managers!\n");
        }

        for (Manager m : manager)
        {
            if (manager.isEmpty())
            {
                break;
            } else
            {
                System.out.println("Choice: " + manager.indexOf(m)+ " | ID: " + m.id + " | Name: " + m.name + "\nPosition: " + m.position
                        + " | Department: " + m.department + "\nYears with Company: " + m.hired
                        + " | Skill Rating: " + m.skillRating + "\nSalary: " + m.salary
                        + " | Education Level: " + m.educationLevel + "\nAddress: " + m.address + "\n");
            }
        }
        hireFireMenu();
    }

    public void menuChoices()
    {
        System.out.println("========MENU========");
        System.out.println("1. Return to Employees");
        System.out.println("2. Hire Managers");
        System.out.println("3. Fire Managers");
        System.out.print("\nPlease enter choice: ");
    }
    
    public void menuHeader()
    {
        System.out.println("========MANAGERS========");
    }
    
    public void hireFireMenu()
    {
        //System.out.println("========MENU========");
        
        //System.out.println("Type exit Manager");
        System.out.println("================================");
        System.out.print("\nPlease enter ID or type \"exit\": ");
    }
    
    public void hireManager(ArrayList<Manager> availableManager, ArrayList<Manager> hiredManager, int index, AccountSummary acct)
    {
        availableManager.get(index).setHired(true);
        double availableCash = acct.getAvailableCash();
        System.out.println("" + availableCash);
        acct.setAvailableCash(availableCash - availableManager.get(index).salary);
        
        double newCash = acct.getAvailableCash();
        System.out.println("" + newCash);
        System.out.println(availableManager.get(index).name +" Hired! " + availableManager.get(index).hired + "\n");
        hiredManager.add(availableManager.remove(index));
    }
    
    public void fireManager(ArrayList<Manager> hiredManager, ArrayList<Manager> availableManager, int index, AccountSummary acct)
    {
        hiredManager.get(index).setHired(false);
        double availableCash = acct.getAvailableCash();
        System.out.println("" + availableCash);
        acct.setAvailableCash(availableCash + hiredManager.get(index).salary);
        
        double newCash = acct.getAvailableCash();
        System.out.println("" + newCash);
        System.out.println(hiredManager.get(index).name +" Fired! " + hiredManager.get(index).hired + "\n");
        availableManager.add(hiredManager.remove(index));
        
    }
}
