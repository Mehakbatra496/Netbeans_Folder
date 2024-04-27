package awt;
import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener
{
    
    int count=0;
    public static void main(String[] args) {
        
        Frame f1= new Frame();
        Label l1= new Label("Count");
        TextField t1= new TextField(10);
        Button b1= new Button("Count");
        
        f1.setVisible(true);
        f1.setSize(400, 300);
        
        FlowLayout fl1= new FlowLayout(FlowLayout.CENTER);
        f1.setLayout(fl1);
        f1.add(l1);
        f1.add(t1);
        f1.add(b1);
        
        
        ButtonCountListener btn=new ButtonCountListener();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

class ButtonCountListener implements ActionListener
{
    public void actionPerformed(ActionEvent ev)
    {
        
    }
}