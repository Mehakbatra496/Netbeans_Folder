/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;

/**
 *
 * @author mehak
 */


import java.io.*;
class DataThread extends Thread 
{
  String str = "MHk Batra";
  OutputStream ostream1;
  public DataThread(OutputStream ostream2) 
  {
    ostream1 = ostream2;
  }
  public void run() 
  {                      // purpose is to write to one end of pipe
    try 
    {
      System.out.println("Original Data: " + str);
      DataOutputStream dostream = new DataOutputStream(ostream1);
      dostream.writeBytes(str);
      dostream.close();
    }
    catch (IOException e) 
    {
      System.err.println("I/O problem occurred. " + e);
    }
  }
 }
public class B8_PipedInputStream 
{
  public static void main(String args[]) throws IOException 
  {                                                                                   
    PipedOutputStream postream = new PipedOutputStream();
    PipedInputStream pistream = new PipedInputStream(postream);
                                                               
    DataThread dt = new DataThread(postream);
    dt.start();
                                                               
    DataInputStream distream = new DataInputStream(pistream);
    String s1 = distream.readLine();
    distream.close();
  
    System.out.print("\nData toggled: ");
    for(int i = 0; i < s1.length(); i++)
    {
      char ch = s1.charAt(i);
      if(Character.isUpperCase(ch))
         System.out.print(Character.toLowerCase(ch));
      else if(Character.isLowerCase(ch))
         System.out.print(Character.toUpperCase(ch));
      else
         System.out.print(s1.charAt(i));
     }
   }
}
