/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

/**
 *
 * @author FavaroJohn
 */
public class ManagerMenu
{
    public ManagerMenu()
    {
        System.out.println("========MANAGERS========");
        createManagerObjects();
        System.out.println("========MENU========");
        System.out.println("1. Return to Employees");
        System.out.print("\nPlease enter choice: ");
        System.out.print("");
        //System.out.println("ID: " + id + "\nName: " + name + "\nAddress: " + address);
       
    }
    
    public void createManagerObjects()
    {
        Manager manager = new Manager(1,"Susan", "123 Fake St", 8, 7, 42.50, "Manager", "Human Resources", "B.A.");
        //String name = manager.getName();
        //int id = manager.getId();
        //String address = manager.getAddress();
        printManager(manager);
    }
    
    public void printManager(Manager manager)
    {
        String name = manager.getName();
        int id = manager.getId();
        String department = manager.getDepartment();
        String position = manager.getPosition();
        int yearsEmployed = manager.getYearsEmployed();
        int skillRating = manager.getSkillRating();
        double salary = manager.getSalary();
        String educationLevel = manager.getEducationLevel();
        String address = manager.getAddress();
        
        //String print = "ID: " + id + "/nName: " + name;
        System.out.println("ID: " + id + " | Name: " + name + "\nPosition: " + position
        + " | Department: " + department + "\nYears with Company: " + yearsEmployed 
                + " | Skill Rating: " + skillRating + "\nSalary: " + salary 
                + " | Education Level: " + educationLevel + "\nAddress: " + address + "\n\n");
        //return print;
    }
}
