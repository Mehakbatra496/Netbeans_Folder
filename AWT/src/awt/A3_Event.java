/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;
import java.awt.*;  
import java.awt.event.*; 


class A3_Event extends Frame implements ActionListener
{  
    TextField tf;  
    A3_Event()
    {      //create components  
        tf=new TextField();  
                           tf.setBounds(60,50,170,20);  
        Button b=new Button("click me");  
                           b.setBounds(100,120,80,30);  

        //register listener  
        b.addActionListener(this);//passing current instance  
        //add components and set size, layout and visibility  
                    add(b);
                    add(tf);  
                    setSize(300,300);  
                    setLayout(null);  
                    setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e)
    {  
        tf.setText("Welcome");  
    }  
    public static void main(String args[])
    {  
        new A3_Event();  
    }    
}