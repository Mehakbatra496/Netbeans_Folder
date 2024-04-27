package collection.framework;

public class A3_Clone  
{
    
}

 class CloneClass implements Cloneable
{
     public static void main(String[] args) throws CloneNotSupportedException
    {
        
    CloneClass c1= new CloneClass("Mhk", 20);
    CloneClass c2= (CloneClass)c1.clone();
    c1.fun();
    c2.fun();
    
    }
    String name; int age;
    CloneClass(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    
    void fun()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println();
    }
        
}
