package Collection;

import java.util.HashMap;

public class test {
    public static void main (String []args )
    {
        HashMap<Student,Integer> h1= new HashMap<>();
        Student s1 = new Student(1, "Rishika");
        Student s2 = new Student(1,"lavish");
        h1.put(s1, 1);
        h1.put(s2,2);
        System.out.println(h1.size());
    }
}
