package concurrency_io;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {

        try {

            Student student = new Student("Alice", 90);

            // Serialize object
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("student.ser"));

            out.writeObject(student);
            out.close();

            System.out.println("Object serialized successfully.");

            // Deserialize object
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("student.ser"));

            Student s = (Student) in.readObject();

            System.out.println("Deserialized object: " + s);

            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}