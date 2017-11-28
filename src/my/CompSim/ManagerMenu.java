/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

import java.util.ArrayList;

/**
 *
 * @author FavaroJohn
 */
public class ManagerMenu {

    public ManagerMenu() {
        System.out.println("========MANAGERS========");
        System.out.println("===HIRED===");
        //createManagerObjects(manager);
        //System.out.println("ID: " + id + "\nName: " + name + "\nAddress: " + address);

    }

    public void createManagerObjects(Manager[] manager) {
        //Manager manager1 = new Manager(1, "Susan", "123 Fake St", 8, 7, 42.50, "Manager", "Human Resources", "B.A.");
        Manager[] hiringPool = new Manager[2];

        for (int i = 0; i < hiringPool.length; i++) {
            hiringPool[i] = manager[i];
        }

        //String name = manager.getName();
        //int id = manager.getId();
        //String address = manager.getAddress();
        printManager(hiringPool);
    }

    public void printManager(Manager[] manager) {
        for (int i = 0; i < manager.length; i++) {
            String name = manager[i].getName();
            int id = manager[i].getId();
            String department = manager[i].getDepartment();
            String position = manager[i].getPosition();

            int yearsEmployed = manager[i].getYearsEmployed();
            int skillRating = manager[i].getSkillRating();
            double salary = manager[i].getSalary();
            String educationLevel = manager[i].getEducationLevel();
            String address = manager[i].getAddress();

            System.out.println("ID: " + id + " | Name: " + name + "\nPosition: " + position
                    + " | Department: " + department + "\nYears with Company: " + yearsEmployed
                    + " | Skill Rating: " + skillRating + "\nSalary: " + salary
                    + " | Education Level: " + educationLevel + "\nAddress: " + address + "\n\n");
        }
        System.out.println("========MENU========");
        System.out.println("1. Return to Employees");
        System.out.print("\nPlease enter choice: ");
        //String print = "ID: " + id + "/nName: " + name;
        //return print;
    }
}
