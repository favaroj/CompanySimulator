/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

/**
 *
 * @author john
 */
public abstract class Finances {
    protected double availableCash;
    protected double availableCredit;
    protected double totalDebt;
    
    public Finances(double availableCash, double availableCredit, double totalDebt)
    {
        this.availableCash = availableCash;
        this.availableCredit = availableCredit;
        this.totalDebt = totalDebt;
    }
    
    public double getAvailableCash()
    {
        return this.availableCash;
    }
    
    public double getAvailabeCredit()
    {
        return this.availableCredit;
    }
    
    public double getTotalDebt()
    {
        return this.totalDebt;
    }
    
    public void setAvailableCash(double availableCash)
    {
        this.availableCash = availableCash;
    }
    
    public void setAvailableCredit(double availableCredit)
    {
        this.availableCredit = availableCredit;
    }
    
    public boolean hasFunds()
    {
        if(this.getAvailableCash() > 0)
        {
            return true;
        } else {
            return false;
        }
    }
}
