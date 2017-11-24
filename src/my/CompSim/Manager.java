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
public class Manager extends Employee
{
    protected String department;
    protected String educationLevel;
    
    public Manager(int id, String name, String address, int yearsEmployed, int skillRating, double salary, String position, String department, String educationLevel)
    {
        super(id, name, address, yearsEmployed, skillRating, salary, position);
        
        this.department = department;
        this.educationLevel = educationLevel;
    }
    /*GETTERS*/
    public String getDepartment()
    {
        return this.department;
    }
    
    public String getEducationLevel()
    {
        return this.educationLevel;
    }
    /*SETTERS*/
    public void setDepartment(String department)
    {
        this.department = department;
    }
    
    public void setEducationLevel(String educationLevel)
    {
        this.educationLevel = educationLevel;
    }
}
