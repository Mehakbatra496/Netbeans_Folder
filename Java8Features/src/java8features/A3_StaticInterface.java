package java8features;

interface Inter1
{
    static void fun()
    {
        System.out.println("I am static");
    }
}

public class A3_StaticInterface
{
    public static void main(String[] args) 
    {
        
        Inter1 i1;
        Inter1.fun();   //call it by interface name as it is a static method
        
    }
}