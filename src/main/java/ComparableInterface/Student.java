package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * compare student objects by student name
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.getName());
    }
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("jame", 22, "james@gmail.com"));
        students.add(new Student("adam", 21, "adam@gmail.com"));
        students.add(new Student("john", 25, "john@gmail.com"));

        Student s1 = new Student("jame", 22, "james@gmail.com");
        Student s2 = new Student("john", 25, "john@gmail.com");
        System.out.println(s1.compareTo(s2));

        Collections.sort(students);
        /**
         * For example, if you have a list of Student objects and you call
         * Collections.sort(students),the compareTo() method that you have defined
         * in the Student class will be called multiple times during the sorting process.
         * The sorting algorithm will use the result of these comparisons to determine
         * the final sort order of the elements in the list.
         */
        for(Student s : students){
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getEmail());
        }
        /**
         * Collections.sort() and Arrays.sort() are both built-in Java methods for sorting
         * lists and arrays of objects.
         * These methods use the natural ordering of the objects to determine their sort order,
         * which is determined by the compareTo() method if the objects implement the Comparable
         * interface.
         * By implementing the Comparable interface and defining the compareTo() method, you are telling
         * Java how to compare and sort your objects based on their natural ordering. Without implementing
         * this interface, the Collections.sort() and Arrays.sort() methods would not know how to compare
         * and sort your objects.
         */
        //compare student by their age
        Collections.sort(students, new StudentCompareAge());
        for(Student s : students){
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getEmail());
        }
    }
}
