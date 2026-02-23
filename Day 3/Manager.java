public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);  // Calls parent constructor
        this.teamSize = teamSize;
    }

    @Override
    public void calculateBonus() {
        double bonus = getSalary() * 0.20;
        System.out.println("Manager Bonus: " + bonus);
    }

    public void manageTeam() {
        System.out.println("Managing a team of " + teamSize + " members.");
    }
}
