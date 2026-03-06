import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCompare {

    static class Student {

        int age;
        String name;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

    }

    public static void main(String[] args) {

        Comparator<Student> comp = ( s1,  s2) -> {
                if (s1.name.length() < s2.name.length()) {
                    return -1;
                } else if (s1.name.length() > s2.name.length()) {
                    return 1;
                } else {
                    return 0;
                }
            };
        // public int compare(Student s1, Student s2) {
            //     if (s1.age < s2.age) {
            //         return -1;
            //     } else if (s1.age > s2.age) {
            //         return 1;
            //     } else {
            //         return 0;
            //     }
            // }

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Alice", 22));
        studs.add(new Student("Bob", 20));
        studs.add(new Student("Charlie", 21));

        Collections.sort(studs,comp);

        for (Student s : studs) {
            s.display();
        }
    }
}
