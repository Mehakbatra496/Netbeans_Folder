/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling2;

/**
 *
 * @author mehak
 */
public class F3_SecurityException {
    public static void main(String[] args) {
        
        SecurityManager sm= new SecurityManager();
        System.setSecurityManager(sm);
        System.out.println(System.getProperty("os.name"));
    }
            }
