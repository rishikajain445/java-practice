package JavaConcept.Collection.ComparatorAndComparablePractice;

public class Student implements Comparable<Student>{

    int id;
    String name;
    String dept;

    Student(int id, String name, String dept)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public int compareTo(Student st) {
        return this.name.compareTo(st.name);
    }
}
