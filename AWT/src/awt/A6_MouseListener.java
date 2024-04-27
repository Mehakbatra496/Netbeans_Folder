/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;
import java.awt.event.*;
import java.awt.*;
import java.util.EventObject;
import javax.swing.*;
/**
 *
 * @author mehak
 */
public class A6_MouseListener {
    public static void main(String[] args) {
        
        Form f= new Form();   
    } 
}

class Form implements ActionListener,MouseListener
{
    JFrame f1;
    JTextField t1;
        Button b1,b2;
    public Form() 
    {
        f1= new JFrame("Form");
        t1= new JTextField();
        b1=new Button("Click me");
        b2=new Button("Clear");
        
        f1.setVisible(true);
        f1.setSize(500, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.add(t1);
        t1.setBounds(100, 50, 100, 50);
        f1.add(b1);
        b1.setBounds(100, 150, 100, 50);

        f1.add(b2);
        b2.setBounds(100, 200, 100, 50);
        
        b1.addActionListener(this);
        b1.addMouseListener(this);
        
        b2.addActionListener(this);
        b2.addMouseListener(this);
    }   
    
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==b1)
        {        
            
//            JOptionPane.showInputDialog("Hi Mehak, Enter Your Query Here");
            t1.setText(JOptionPane.showInputDialog("Hi Mehak, Enter Your Query Here"));
            
        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
        }
    
    }
    
    public void mouseEntered(MouseEvent e)
    {
        if(e.getSource()==b1)
        {        
            b1.setBackground(Color.green);
        }
        else if(e.getSource()==b2)
        {
            b2.setBackground(Color.pink);
        }
    }
    
    public void mouseExited(MouseEvent e)
    {
         b1.setBackground(Color.gray);
        b2.setBackground(Color.gray);
    }
    public void mouseClicked(MouseEvent e)
    {
    }
    public void mousePressed(MouseEvent e)
    {
//        JOptionPane.showConfirmDialog(t1, e);
        
    }
     public void mouseReleased(MouseEvent e)
    {        
        b1.setBackground(Color.gray);
        b2.setBackground(Color.gray);
        System.out.println(e.isPopupTrigger());
        System.out.println(e.isPopupTrigger());

    }
//    pu
   
}