/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopspillers.InheritancePractice;

/**
 *
 * @author mehak
 */

class Device
{
    void operate()
    {
        System.out.println("This Device can operate multiple tasks function");
    }
    
    void calculate()
    {
        System.out.println("I can calculate");
    }
}
class Smartphone extends Device
{
    void operate()
    {
        System.out.println("I can do call , calculate, capture.");
    }
    
    void makeCall()
    {
        System.out.println("I can make a call");
    }
     
}
class Laptop extends Device
{
    void operate()
    {
        System.out.println("I can do do online work , calculate multiple tasks.");
    }
    void doWork()
    {
        System.out.println("I can do online work");
    }
}

class ModernGadgets
{
    void showDetails(Device d)
    {
        d.operate();
        d.calculate();
//        d.makeCall();
    }
}

public class A1_Inheritance {
    public static void main(String[] args)
    {
        Smartphone s1= new Smartphone();
        Laptop l1= new Laptop();
        Device d1= new Smartphone();
     
        ModernGadgets m1= new ModernGadgets();
        m1.showDetails(d1);
        m1.showDetails(s1);
        m1.showDetails(l1);
           
    }
  
}
