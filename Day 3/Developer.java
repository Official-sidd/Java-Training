public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    @Override
    public void calculateBonus() {
        double bonus = getSalary() * 0.10;
        System.out.println("Developer Bonus: " + bonus);
    }

    public void writeCode() {
        System.out.println("Writing code in " + programmingLanguage);
    }
}
