                                                                      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

/**
 *
 * @author Deepak
 */
public class A4_Login extends java.awt.Frame {

    /**
     * Creates new form Login
     */
    public A4_Login() {
        initComponents();
    }

    private void initComponents() 
     {
        label1 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setText("Enter Name");
        add(label1, java.awt.BorderLayout.CENTER);
        add(textField1, java.awt.BorderLayout.SOUTH);

        button1.setLabel("Login");
        add(button1, java.awt.BorderLayout.NORTH);

        pack();
    }
    
    private void exitForm(java.awt.event.WindowEvent evt)
    {
        System.exit(0);
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A4_Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Label label1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}