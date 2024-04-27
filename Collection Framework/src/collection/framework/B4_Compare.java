    package collection.framework;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.TreeSet;
    
    class Student implements Comparable<Student>
    {       
        int rollno;
        String name;
        
        public Student(int rollno, String name)
        {
            this.rollno=rollno;
            this.name=name;
        }
    
        @Override
         public int compareTo(Student st)
         {
             System.out.println(this.name.compareTo(st.name));
             return this.name.compareTo(st.name);
         }
        
        @Override
        public String toString()
        {
            return rollno+"-"+name;
        }       
    }

    public class B4_Compare
    {
        public static void main(String[] args)
        {
            Student s1=new Student(101, "aaa");
            Student s2=new Student(102, "fff");
            Student s3=new Student(103, "ddd");
            Student s4=new Student(104, "kkk");
            Student s5=new Student(105, "eee"); 
            
//            System.out.println(s1.compareTo(s5));

            TreeSet ts=new TreeSet();
            ts.add(s1);
            ts.add(s2);
            ts.add(s3);
            ts.add(s4);
            ts.add(s5);
            System.out.println(ts);
        }
    }
