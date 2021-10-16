import java.util.Random;
import java.util.Arrays;

public class EmployeeFactory {

    static String[] male = {"Oleksandr", "Mykhailo", "Serhii", "Danylo", "Stepan"};
    static String[] female = {"Yevheniia", "Tetyana", "Nadiia"};

    static int random(int min, int max) {
        int delta = max - min;
        double random = Math.random();
        return (int) (random * delta + min);
    }

    static int generateId(){
        return new Random().nextInt(00100) + 1 ;
    }

    static String generateName(){
        Random random = new Random();
        boolean state = random.nextBoolean();
        if (state) {
            return male[(int)(Math.random() * male.length)];
        }
        else {
            return female[(int)(Math.random() * female.length)];
        }
    }

    static String generateGender(String s) {
        for (String value : male) {
            if (s.contains(value)) {
                return "male";
            }
        }
        return "female";
    }

    static int generateAge(){
        int random = random(18, 60);
        return random;
    }

    static int generateSalary(){
        int random = random(800, 3000);
        return random;
    }

    static int generateFixedBugs(){
        int random = random(0, 30);
        return random;
    }
    static int generateDefaultBugRate(){
        int random = random(0, 5);
        return random;
    }



    public static Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static Employee generateEmployee() {
        int id = generateId();
        String name = generateName();
        String gender = generateGender(name);
        int age = generateAge();
        int salary = generateSalary();
        int fixedBugs = generateFixedBugs();
        int defaultBugRate = generateDefaultBugRate();
        return new Employee(id, name, age, salary, gender, fixedBugs, defaultBugRate);
    }

}
