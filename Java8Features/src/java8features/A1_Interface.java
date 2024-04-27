package java8features;
class A1_Interface
{
    public static void main(String[] args)
    {
        A a= new A();
        a.m2();
    }
}

interface I1
{

//    void m1();
    default void m2()
    {
        System.out.println("hi");
    }
}

class A implements I1
{
    public void m1()
    {
        
    }
//    public void m2()
//    {
//        System.out.println("hello");
//    }
}