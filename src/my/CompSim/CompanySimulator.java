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
public class CompanySimulator {

    public static String userChoice = "";
    public static String event;
    public static double availableCash;
    public static double availableCredit;
    public static double totalDebt;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        AccountSummary acctSumm = new AccountSummary(5000.00, 2000.00, 0);

        event = "0";

        //while (running)
        //{
        while (running) {
            switch (event) {
                case "0":
                    mainMenu();
                    event = "1";
                    break;
                case "1":
                    switch (userChoice = input.next()) {
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
                            running = false;
                            break;
                    }
                    break;
                //END CASE "1"
                case "2":
                    //Create new Finances Menu Object
                    FinanceMenu finMenu = new FinanceMenu();

                    switch (userChoice = input.next()) {
                        case "1":
                            System.out.println("Main Menu selected.\n");
                            event = "0";
                            break;
                    }

                    break;
                case "3":
                    EmployeesMenu empMen = new EmployeesMenu();

                    switch (userChoice = input.next()) {
                        case "1":
                            System.out.println("Managers selected.\n");
                            ManagerMenu manMenu = new ManagerMenu();
                            Manager[] managerArray = new Manager[2];
                            boolean empty = true;
                            /*for (int i = 0; i < managerArray.length; i++) {
                                if (managerArray[i] != null) {
                                    empty = false;
                                    
                                    break;

                                } else {
                                    //System.out.println("" + empty);
                                }
                                
                            }*/
                            //System.out.println("" + empty);
                            if (empty) {
                                System.out.println("No Managers Hired!");
                                //userChoice = "1";
                                break;

                            } else {
                                Manager manager1 = new Manager(1, "Susan", "123 Fake St", 8, 7, 42.50, "Manager", "Human Resources", "B.A.");
                                Manager manager2 = new Manager(1, "Tom", "123 Fake St", 8, 7, 42.50, "Manager", "IT", "B.S.");

                                managerArray[0] = manager1;
                                managerArray[1] = manager2;
                                empty = false;
                                manMenu.createManagerObjects(managerArray);
                            }
                            switch (userChoice = input.next()) {
                                case "1":
                                    System.out.println("Employees selected.\n");
                                    event = "3";
                                    break;
                            }
                            break;
                        case "2":
                            System.out.println("Regular selected.\n");
                            break;
                        case "3":
                            System.out.println("Main Menu selected.\n");
                            event = "0";
                            break;
                    }
                    break;
            }
        }
        System.out.println("Thanks for playing!");
        //}
    }//End Main

    public static void mainMenu() {
        System.out.println("========COMPANY SIMULATOR========");
        System.out.println("\t====MAIN MENU====");
        System.out.println("\t1.Financial");
        System.out.println("\t2.Inventory");
        System.out.println("\t3.Employees");
        System.out.println("\t4.Exit");
        System.out.print("\nPlease enter menu choice: ");
    }
}//End Class
