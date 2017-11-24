/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

import java.util.Scanner;

/**
 *
 * @author FavaroJohn
 */
public class CompanySimulator
{

    public static String userChoice = "";
    public static String event;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        event = "0";

        while (running)
        {
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
                                System.out.println("Financial Chosen!\n");
                                event = "2";
                                break;
                            case "2":
                                System.out.println("Inventory Chosen!\n");
                                break;
                            case "3":
                                System.out.println("Employees Chosen!\n");
                                event = "3";
                                break;
                        }
                        break;
                    //END CASE "1"
                    case "2":
                        //Create new Finances Menu Object
                        FinanceMenu finMenu = new FinanceMenu();
                        
                        switch(userChoice = input.next())
                        {
                            case "1":
                                System.out.println("Main Menu Chosen!\n");
                                event = "0";
                                break;
                        }
                        
                        break;
                    case "3":
                        EmployeesMenu empMen = new EmployeesMenu();

                        switch (userChoice = input.next())
                        {
                            case "1":
                                System.out.println("Managers Chosen!\n");
                                ManagerMenu manMenu = new ManagerMenu();

                                switch (userChoice = input.next())
                                {
                                    case "1":
                                        event = "2";
                                        break;
                                }
                                break;
                            case "2":
                                System.out.println("Regular chosen!\n");
                                break;
                        }
                        break;
                }
            }
        }
    }//End Main

    public static void mainMenu()
    {
        System.out.println("========COMPANY SIMULATOR========");
        System.out.println("\t====MAIN MENU====");
        System.out.println("\t1.Financial");
        System.out.println("\t2.Inventory");
        System.out.println("\t3.Employees");
        System.out.print("\nPlease enter menu choice: ");
    }
}//End Class
