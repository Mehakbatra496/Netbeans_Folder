/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling2;
import java.util.Scanner;
/**
 *
 * @author mehak
 */
public class E2_IllegalStateException {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    sc.close();
   int k= sc.nextInt();
        System.out.println(k);
        
    }
}
