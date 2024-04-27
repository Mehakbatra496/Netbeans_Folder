/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_operations;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A3_WriteToFile {
    public static void main(String[] args) {
                String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/File-Operation/A1";
                String st="My name is Mehak Batra";
        try {
            FileWriter fw=new FileWriter(file);
            fw.write(st);
            fw.close();
            
            System.out.println("Data Written Successfully ");
        } catch (Exception e) {
        }
        
    }
    
}
