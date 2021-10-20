import java.util.Random;

public class Developer extends Employee {

    Random random = new Random();

    private int fixedBugs;

    public Developer(int id, String name, int age, int salary, String gender, int fixedBugs) {
        super(id, name, age, salary, gender);
        this.fixedBugs = fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    @Override
    public double salary() {
        return super.salary() + fixedBugs * 2.50 * (random.nextBoolean() ? 2 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + ", position: developer, fixedBugs: " + fixedBugs;
    }
}