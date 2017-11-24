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
public abstract class Employee 
{
    protected int id;
    protected String name;
    protected String address;
    protected int yearsEmployed;
    protected int skillRating;
    protected double salary;
    protected String position;
    
    public Employee(int id, String name, String address, int yearsEmployed, int skillRating, double salary, String position) 
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.yearsEmployed = yearsEmployed;
        this.skillRating = skillRating;
        this.salary = salary;
        this.position = position;
    }
    /*GETTER METHODS*/
    public int getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public int getYearsEmployed()
    {
        return this.yearsEmployed;
    }
    
    public int getSkillRating()
    {
        return this.skillRating;       
    }
    
    public double getSalary()
    {
        return this.salary;
    }
    
    public String getPosition()
    {
        return this.position;
    }
    
    /*SETTER METHODS*/
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAddress(String address) 
    {
        this.address = address;
    }
    
    public void setYearsEmployed(int yearsEmployed) 
    {
        this.yearsEmployed = yearsEmployed;
    }
    
    public void setSkillRating(int skillRating) 
    {
        this.skillRating = skillRating;
    }
    
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    
    public void setPosition(String position) 
    {
        this.position = position;
    }
}
