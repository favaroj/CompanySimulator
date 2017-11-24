/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CompSim;

import java.io.*;
import java.util.*;

/**
 *
 * @author FavaroJohn
 */
public class FinanceMenu 
{
    public FinanceMenu()
    {
        //System.out.println("========FINANCES========");
        readFinanceFile();
        System.out.println("====FINANCE MENU====");
        System.out.println("1. Main Menu");
        System.out.print("\nPlease enter menu choice: ");
    }
    
    public static void readFinanceFile() 
    {
        String strLine;
        try
        {
            FileInputStream financeStream = new FileInputStream("finances.txt");
            BufferedReader finBR = new BufferedReader(new InputStreamReader(financeStream));
            StringBuilder financeFileContent = new StringBuilder();
            
            while((strLine = finBR.readLine()) != null) 
            {
                System.out.println(strLine);
            }
        } 
        catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
