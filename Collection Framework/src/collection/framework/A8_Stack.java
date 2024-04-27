package collection.framework;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;


public class A8_Stack 
{
public static void main(String[] args) 
    {   
        Stack s1= new Stack();
        s1.add(1);
        s1.add(2);
        s1.add(15);
        s1.push("mhk");
        s1.push("yu");
       
        A8_Stack s3= new A8_Stack();      
        Stack s2= new Stack();
        
        s2.add(45);
        s2.add(395);

        
//        s2.push(s1);
//        s1.push(s2);
//        System.out.println(s2);
//        System.out.println(s1.pop());
//        System.out.println(s1.pop());

//        System.out.println(s2.lastElement());
//        s1.push(s2);
//        s1.push(s3);

//        Enumeration e1=s1.elements();
//
//        System.out.println(e1.hasMoreElements());
//        
//        while(e1.hasMoreElements())
//        {
//            System.out.println(e1.nextElement());
//        }

        
//        Iterator i1=s1.iterator();

        ListIterator l1= s1.listIterator();
        
       while(l1.hasNext())
       {
//           System.out.println(l1.next());
           l1.next();
       }
       
        while(l1.hasPrevious())
       {
           System.out.println(l1.previous());
       }
//        
//        while (i1.hasNext())
//        {
            
//            if(i1.next().equals(6))
//            {
//                
//
//            }
//                System.out.println( i1.next());
            
//            System.out.println( i1.next());

//        }
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//
//        System.out.println(s1.empty());
////        System.out.println(s1.);
//        System.out.println();
//        Object[] arr= s1.toArray();
//        
//        
//        System.out.println(s3);
//        System.out.print("Array elements are ");

        
//        for(int i=0 ; i<arr.length; i++)
//        System.out.print(arr[i]+" ");
    }
}