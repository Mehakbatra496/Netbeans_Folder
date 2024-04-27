package jdbc5;

import java.util.Comparator;
import java.util.TreeSet;

class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollno + "-" + name;
    }
}

class SortByInsertionOrder implements Comparator<Student> {
    private int insertionOrder = 0;

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno) * Integer.compare(s1.hashCode(), s2.hashCode());
    }
}

public class Test4 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new SortByInsertionOrder());
        Student s1 = new Student(101, "deepak");
        Student s2 = new Student(102, "deepesh");
        Student s3 = new Student(103, "rahul");
        Student s4 = new Student(104, "amit");
        Student s5 = new Student(105, "priya");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println(students);
    }
}
