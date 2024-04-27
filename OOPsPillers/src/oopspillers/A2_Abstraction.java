/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopspillers;

/**
 *
 * @author mehak
 */

class Account
{
        String holderName;
        int age;
        private double balance;
        
        public double getDetails()
             {
                 
                 return balance;
             }
}
 
public class A2_Abstraction {
    public static void main(String[] args) 
    {
        
        Account ac= new Account();
        System.out.println(ac.holderName);
        System.out.println(ac.age);
        
        double bal=ac.getDetails();
        System.out.println(bal);
        
    }
}
