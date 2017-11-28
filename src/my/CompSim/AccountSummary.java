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
public class AccountSummary extends Finances {
    
    protected static String summary;
    
    public AccountSummary(double availableCash, double availableCredit, double totalDebt)
    {
        super(availableCash, availableCredit, totalDebt);
        this.summary = summary;
        
    }
    
    public String getSummary()
    {
        return this.summary;
    }
    
    public void setSummary(String summary)
    {
        this.summary = summary;
    }
}
