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
    protected boolean hired;
    protected int skillRating;
    protected double salary;
    protected String position;
    protected String department;

    public Employee(int id, String name, String address, boolean hired, int skillRating, double salary, String department, String position)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hired = hired;
        this.skillRating = skillRating;
        this.salary = salary;
        this.department = department;
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

    public boolean getHired()
    {
        return this.hired;
    }

    public int getSkillRating()
    {
        return this.skillRating;
    }

    public double getSalary()
    {
        return this.salary;
    }
    
    public String getDepartment()
    {
        return this.department;
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

    public void setHired(boolean hired)
    {
        this.hired = hired;
    }

    public void setSkillRating(int skillRating)
    {
        this.skillRating = skillRating;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }
}
