package ComparatorAndComparablePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main (String[] args)
    {
        Student s1 = new Student(1,"Rishika","Cse");
        Student s2 = new Student(2,"Lavish","Electrical");
        Student s3 = new Student(3,"Atishay","Mechanical");
        List<Student> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);

        Collections.sort(l1);
        Collections.sort(l1,(a,b)->a.dept.compareTo(b.dept));
        l1.forEach(s -> System.out.println(s.name +" "+ s.dept));
         Collections.sort(l1,(a,b)->a.id-b.id);
        l1.forEach(s -> System.out.println(s.name +" "+ s.dept +" "+s.id));
        Collections.sort(l1,(a,b)->b.id- a.id);
        l1.forEach(s -> System.out.println(s.name +" "+ s.dept +" "+s.id));


        //---------------------------------------------------------------------

        Teacher t1 = new Teacher(10,"Anisha","HomeScience");
        Teacher t2 = new Teacher(11,"shampy","science");
        Teacher t3 = new Teacher(12, "nagma", "Maths");
        Teacher t4= new Teacher(13, "nagma", "Hindi");
        Teacher t5= new Teacher(13, null, "Hindi");
        List<Teacher> l2 = new ArrayList<>();
        l2.add(t1);
        l2.add(t2);
        l2.add(t3);
        l2.add(t4);
        l2.add(t5);
        Collections.sort(l2,(a,b)->a.empId - b.empId);
        Comparator<Teacher> c1 = Comparator.comparing((a)->a.name);

        Comparator<Teacher> c2 = Comparator.comparing((Teacher a) -> a.name).reversed().thenComparing(a->a.dept);
        Collections.sort(l2,c2);
        Collections.sort(l2,(a,b)->a.dept.compareTo(b.dept));
        Collections.sort(l2,(a,b)->b.dept.compareTo(a.dept));
        Collections.sort(l2,(a,b)->a.name.compareTo(b.name));
        Comparator<Teacher> c3 = Comparator.comparing((Teacher a)-> a.name,Comparator.nullsLast(String::compareTo));// for null value sort as well
        Collections.sort(l2,c3);




    }
}
