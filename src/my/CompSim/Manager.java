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
    protected String educationLevel;
    
    public Manager(int id, String name, String address, boolean hired, int skillRating, double salary, String department, String position, String educationLevel)
    {
        super(id, name, address, hired, skillRating, salary, department, position);
        
        this.educationLevel = educationLevel;
    }
    /*GETTERS*/
    public String getEducationLevel()
    {
        return this.educationLevel;
    }
    /*SETTERS*/
    public void setEducationLevel(String educationLevel)
    {
        this.educationLevel = educationLevel;
    }
}
