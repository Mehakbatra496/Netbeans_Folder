/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling2;

/**
 *
 * @author mehak
 */
public class CustomException {
    public static void main(String[] args) {
        
        CustomException ce=new CustomException();
        
        try
        {
            ce.findUser("abc");
        }
        catch (UserNotFound e) 
        {
            System.out.println("UserNotFound Exception caught");
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        
                    System.out.println("Print in every situation");

    }
    
    public void findUser(String uname) throws UserNotFound
    {
        if("mhk".equals(uname))
        {
            System.out.println("User Found : mhk");
        }
        else
//            throw new UserNotFound();   //method type 1
            throw new UserNotFound("String is this "+uname);   //method type 2

    }
}

class UserNotFound extends Exception
{
    public UserNotFound()
    {
        super("That user not found ");
    }
     public UserNotFound(String message)
    {
        super(message);
    }
    
}
