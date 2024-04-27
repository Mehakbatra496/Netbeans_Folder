/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopspillers;

import javax.security.auth.AuthPermission;

/**
 *
 * @author mehak
 */

class Person
{
   public String name;
   public int age;
}

class Student extends Person{
    public String course;
    public String grade;
    
    public Student(String name, int age, String course, String grade)
    {
        this.name=name;
        this.age=age;
        this.course=course;
        this.grade=grade;
    }
    
    public void getStudentDetails()
    {
        System.out.println("Details are ----------------------------------------");
        System.out.println(name +"\n"+ age+"\n"+ course+"\n"+ grade);
        System.out.println("");
    }
    
}

public class A1_Inheritance 
{
    public static void main(String[] args) 
    {
        Student s1= new Student("Ankush", 25, "BBA", "B+");
        Student s2= new Student("Karan", 36, "MBA", "A");
        s1.getStudentDetails();
        s2.getStudentDetails();
        
    }
    
}
