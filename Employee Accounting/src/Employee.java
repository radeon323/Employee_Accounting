public class Employee {
    //id, name, age, salary, gender, fixedBugs, defaultBugRate
    int id;
    String name;
    int age;
    int salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;
    int count = 1;

    Employee() {
        System.out.println("Creation of employee in progress!");
    }

    Employee(int id, String name, int age, int salary, String gender, int fixedBugs, double defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    @Override
    public String toString() {
        String info = "Employee " +
                "id = 000" + id +
                ", name = " + name +
                ", gender = " + gender +
                ", age = " + age +
                ", salary = " + salary + " USD";
                //", fixedBugs = " + fixedBugs +
                //", defaultBugRate = " + defaultBugRate;
        return info;
    }

    public double salary() {
        return salary;
    }

    private double defaultBugRate() {
        return defaultBugRate;
    }

    private double fixedBugs() {
        return fixedBugs;
    }

    double calculateBonus(){
        return ((int)(fixedBugs()/defaultBugRate()) * 100);
    }

    public String getName() {
        return name;
    }



}
