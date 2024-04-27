/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author mehak
 */
public class A2_Frame 
{
    public static void main(String[] args) 
    {
        StudentForm sf = new StudentForm();
    }
}

class StudentForm extends  Frame implements ActionListener, WindowListener
{
    Label l3;
    TextField t1,t2; Button b1;
     StudentForm()
     {
         Frame f1= new Frame("Student Form");
         Label l1= new Label("Enter Name");
         Label l2= new Label("Enter Roll no.");
          l3=new Label();
          t1= new TextField();
          t2= new TextField();
          b1= new Button("SUBMIT");
         f1.setBackground(Color.lightGray);
         f1.setVisible(true);
         l3.setBackground(Color.yellow);
         l3.setVisible(false);
         
         b1.addActionListener(this);
         f1.addWindowListener(this);
         
         

//         b1.addActionListener(new ActionListener()
//         {  
//                public void actionPerformed(){  
//                l3.setText("hello");  
//        } 
//        });  
         f1.setSize(600,400);
         f1.setLayout(null);
         l1.setBounds(50, 40, 100, 20);
         l2.setBounds(50, 75, 100, 20);
         l3.setBounds(180, 330, 250, 50);

         t1.setBounds(180,40,180,20);
         t2.setBounds(180,75,180,20);
         b1.setBounds(140,150,80,50);
//         b1.setBounds(160, 120, 20, 5);
         b1.setBackground(Color.GREEN);
         
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        f1.add(l3);       
        
     }
     
    public void actionPerformed(ActionEvent e)
    {  
        l3.setVisible(true);
        t1.setText("");
        t2.setText("");
        b1.setEnabled(false);

      l3.setText("Your form has been submitted successfully");  
    }  
    
    public void windowClosing(WindowEvent w)
    {
                System.exit(0);
    }
     public void windowOpened(WindowEvent we){}

//    public void windowClosing(WindowEvent we){}

    public void windowClosed(WindowEvent we){}

    public void windowIconified(WindowEvent we){}

    public void windowDeiconified(WindowEvent we){}

    public void windowActivated(WindowEvent we){}

    public void windowDeactivated(WindowEvent we){}
}

