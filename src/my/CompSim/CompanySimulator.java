/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

import java.util.*;

/**
 *
 * @author FavaroJohn
 */
public class CompanySimulator
{

    public static String userChoice = "";
    public static String event;
    public static double availableCash;
    public static double availableCredit;
    public static double totalDebt;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        // Establish new Account Summary Object
        AccountSummary acctSumm = new AccountSummary(5000.00, 2000.00, 0);
        // Create manager objects
        Manager manager1 = new Manager(1, "Susan", "123 Fake St", false, 7, 500.00, "Human Resources", "Manager", "B.A.");
        Manager manager2 = new Manager(2, "Tom", "123 Fake St", false, 7, 500.00, "IT", "Manager", "B.S.");
        Manager manager3 = new Manager(3, "Bill", "123 Fake St", false, 7, 500.00, "Sales", "Manager", "B.S.");
        // Create manager arraylists and add manager objects
        ArrayList<Manager> availableManagers = new ArrayList<Manager>();
        ArrayList<Manager> hiredManagers = new ArrayList<Manager>();
        availableManagers.add(manager1);
        availableManagers.add(manager2);
        availableManagers.add(manager3);

        RegularEmployee employee1 = new RegularEmployee(7, "Jill", "123 Fake St", false, 8, 250.00, "IT", "Programmer");
        RegularEmployee employee2 = new RegularEmployee(8, "Jack", "123 Fake St", false, 7, 250.00, "Sales", "Salesman");
        RegularEmployee employee3 = new RegularEmployee(9, "Beth", "123 Fake St", false, 5, 250.00, "Ops", "Analyst");
        
        ArrayList<RegularEmployee> availableEmployees = new ArrayList<RegularEmployee>();
        ArrayList<RegularEmployee> hiredEmployees = new ArrayList<RegularEmployee>();
        availableEmployees.add(employee1);
        availableEmployees.add(employee2);
        availableEmployees.add(employee3);
        
        event = "0";

        while (running)
        {
            switch (event)
            {
                case "0":
                    mainMenu();
                    event = "1";
                    break;
                case "1":
                    switch (userChoice = input.next())
                    {
                        case "1":
                            System.out.println("Financial selected.\n");
                            System.out.println("Available Cash: $" + acctSumm.getAvailableCash());
                            System.out.println("Available Credit: $" + acctSumm.getAvailabeCredit());
                            System.out.println("Total Debt: $" + acctSumm.getTotalDebt());
                            event = "2";
                            break;
                        case "2":
                            System.out.println("Inventory selected.\n");
                            break;
                        case "3":
                            System.out.println("Employees selected.\n");
                            event = "3";
                            break;
                        case "4":
                            //acctSum.endBusinessDay();
                            event = "0";
                            break;
                        case "5":
                            running = false;
                            break;
                    }
                    break;
                //END CASE "1"
                case "2":
                    //Create new Finances Menu Object
                    FinanceMenu finMenu = new FinanceMenu();

                    switch (userChoice = input.next())
                    {
                        case "1":
                            System.out.println("Main Menu selected.\n");
                            event = "0";
                            break;
                    }

                    break;
                case "3":
                    EmployeesMenu empMen = new EmployeesMenu();

                    switch (userChoice = input.next())
                    {
                        case "1":
                            System.out.println("Managers selected.\n");
                            event = "3A";
                            break;
                        case "2":
                            System.out.println("Regular selected.\n");
                            event = "3B";
                            break;
                        case "3":
                            System.out.println("Main Menu selected.\n");
                            event = "0";
                            break;
                    }
                    break;
                case "3A":
                    ManagerMenu manMenu = new ManagerMenu();
                    manMenu.printHiredManager(hiredManagers);

                    switch (userChoice = input.next())
                    {
                        case "1":
                            System.out.println("Employees selected.\n");
                            event = "3";
                            break;
                        case "2":
                            System.out.println("Hire managers selected.\n");
                            manMenu.printAvailableManager(availableManagers, userChoice, input);
                            
                            userChoice = input.next();
                            if(userChoice.equalsIgnoreCase("exit"))
                            {
                                System.out.println("Returning to Manager Menu\n");
                                event = "3A";
                            } else {
                                int hireChoice = Integer.parseInt(userChoice);
                            manMenu.hireManager(availableManagers, hiredManagers, hireChoice, acctSumm);
                            event = "3A";
                            }
                            break;
                        case "3":
                            System.out.println("Fire managers selected.\n");
                            manMenu.printHiredManagerAlt(hiredManagers);
                            
                            userChoice = input.next();
                            if(userChoice.equalsIgnoreCase("exit"))
                            {
                                System.out.println("Returning to Manager Menu\n");
                                event = "3A";
                            } else {
                            int fireChoice = Integer.parseInt(userChoice);
                            manMenu.fireManager(hiredManagers, availableManagers, fireChoice, acctSumm);
                            event = "3A";
                            }
                            break;
                    }
                    break;
                case "3B":
                    RegularEmployeesMenu empMenu = new RegularEmployeesMenu();
                    empMenu.printHiredEmployee(hiredEmployees);

                    switch (userChoice = input.next())
                    {
                        case "1":
                            System.out.println("Employees selected.\n");
                            event = "3";
                            break;
                        case "2":
                            System.out.println("Hire employees selected.\n");
                            empMenu.printAvailableEmployee(availableEmployees, userChoice, input);
                            
                            userChoice = input.next();
                            if(userChoice.equalsIgnoreCase("exit"))
                            {
                                System.out.println("Returning to Regular Employee Menu\n");
                                event = "3B";
                            } else {
                                int hireChoice = Integer.parseInt(userChoice);
                            empMenu.hireEmployee(availableEmployees, hiredEmployees, hireChoice, acctSumm);
                            event = "3B";
                            }
                            break;
                        case "3":
                            System.out.println("Fire employees selected.\n");
                            empMenu.printHiredEmployeeAlt(hiredEmployees);
                            
                            userChoice = input.next();
                            if(userChoice.equalsIgnoreCase("exit"))
                            {
                                System.out.println("Returning to Regular Employee Menu\n");
                                event = "3B";
                            } else {
                            int fireChoice = Integer.parseInt(userChoice);
                            empMenu.fireEmployee(hiredEmployees, availableEmployees, fireChoice, acctSumm);
                            event = "3B";
                            }
                            break;
                    }
                    break;
            }
        }
        System.out.println("Thanks for playing!");
        //}
    }//End Main

    public static void mainMenu()
    {
        System.out.println("========COMPANY SIMULATOR========");
        System.out.println("\t====MAIN MENU====");
        System.out.println("\t1.Financial");
        System.out.println("\t2.Inventory");
        System.out.println("\t3.Employees");
        System.out.println("\t4.End Business Day");
        System.out.println("\t5.Exit");
        System.out.print("\nPlease enter menu choice: ");
    }
}//End Class
