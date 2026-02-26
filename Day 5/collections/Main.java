package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alice", 85));
        students.add(new Student(2, "Bob", 92));
        students.add(new Student(3, "Charlie", 78));

        System.out.println("Original List:");
        display(students);

        // Sort by marks ascending
        students.sort(Comparator.comparingInt(Student::getMarks));
        System.out.println("\nSorted by Marks (Ascending):");
        display(students);

        // Sort by marks descending
        students.sort(Comparator.comparingInt(Student::getMarks).reversed());
        System.out.println("\nSorted by Marks (Descending):");
        display(students);

        // Sort by name
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("\nSorted by Name:");
        display(students);
    }

    public static void display(List<Student> students) {
        for(Student s : students) {
            System.out.println(s);
        }
    }
}