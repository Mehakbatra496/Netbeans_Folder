/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;
import java.awt.*;
/**
 *
 * @author mehak
 */
public class A1_Label extends Frame
{
        
    public static void main(String[] args) 
        {
        Frame f= new Frame("Student Form");
        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.LEFT,10,10 ));
        f.pack();
        f.setSize(400, 300);
        Label l1= new Label("Enter Roll No.", Label.LEFT);
        Label l2= new Label("Enter Name", Label.LEFT);
        
         TextField t1= new TextField(30);
         TextField t2= new TextField(30);
         Button b1= new Button("SUBMIT");
                 
           f.add(l1);
           f.add(t1);
           f.add(l2);
           f.add(t2);           
           f.add(b1);

         }

}