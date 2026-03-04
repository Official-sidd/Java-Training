package collections;

import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Alice", 85),
            new Student(2, "Bob", 92),
            new Student(3, "Charlie", 78)
        );

        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Sort by marks ascending (Stream)
        System.out.println("\nSorted by Marks (Ascending):");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks))
                .forEach(System.out::println);

        // Sort by marks descending
        System.out.println("\nSorted by Marks (Descending):");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .forEach(System.out::println);

        // Filter students with marks > 80
        System.out.println("\nStudents with Marks > 80:");
        students.stream()
                .filter(s -> s.getMarks() > 80)
                .forEach(System.out::println);

        // Find first student with marks > 80 using Optional
        Optional<Student> topper =
                students.stream()
                        .filter(s -> s.getMarks() > 80)
                        .findFirst();

        topper.ifPresent(s -> System.out.println("\nTopper Found: " + s));

        // Date & Time API
        System.out.println("\nCurrent Date: " + LocalDate.now());
        System.out.println("Current Time: " + LocalTime.now());
    }
}