public class Employee {
    //id, name, age, salary, gender, fixedBugs, defaultBugRate
    int id;
    String name;
    int age;
    int salary;
    String gender;
    int fixedBugs;
    double defaultBugRate = 1.5;
    int count = 0;

    Employee() {
        System.out.println("Creation of employee in progress!");
    }
    Employee(int id, String name, int age, int salary, String gender, int findBugs, int defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
        count++;
    }


    }
