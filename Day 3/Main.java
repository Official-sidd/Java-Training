public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Manager("Siddharth", 101, 80000, 5);
        Employee emp2 = new Developer("Rahul", 102, 60000, "Java");

        System.out.println("=== Manager Details ===");
        emp1.displayInfo();
        emp1.calculateBonus();

        System.out.println("\n=== Developer Details ===");
        emp2.displayInfo();
        emp2.calculateBonus();
    }
}
