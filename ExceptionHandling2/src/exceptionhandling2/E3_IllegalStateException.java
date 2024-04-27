/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling2;
import java.lang.Thread;
/**
 *
 * @author mehak
 */
public class E3_IllegalStateException 
{
    public static void main(String[] args) 
    {
        MyThread mt= new MyThread();
        mt.start();        mt.start();

    }
}

class MyThread extends Thread
{   
   public void run()
    {
        System.out.println("I am running");
    }
}