package cfwijava.linkedlist;

import java.util.*;

public class LlDemo {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        list.add(new Student(1, "John", 85));
        list.add(new Student(2, "Alice", 90));
        list.add(new Student(3, "Bob", 78));
        list.add(new Student(4, "Eve", 92));
        list.add(new Student(5, "Charlie", 80));

        Collections.sort(list); 
        display(list);
    }

    static void display(List<Student> list) {
        for (Student s : list) {
            System.out.println("ID: " + s.sid + ", Name: " + s.sname + ", Marks: " + s.smarks);
        }
    }
}