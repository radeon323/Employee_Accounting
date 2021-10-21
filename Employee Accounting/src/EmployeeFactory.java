import java.util.Random;


public class EmployeeFactory {

    static String[] position = {"Designer", "Developer", "Manager"};
    static String[] male = {"Oleksandr", "Mykhailo", "Serhii", "Danylo", "Stepan"};
    static String[] female = {"Yevheniia", "Tetyana", "Nadiia"};


    static int random(int min, int max) {
        int delta = max - min;
        double random = Math.random();
        return (int) (random * delta + min);
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


    static String generateGender(String name) {
        for (String value : male) {
            if (name.contains(value)) {
                return "male";
            }
        }
        return "female";
    }


    static int generateAge(){
        return random(18, 60);
    }


    static int generateSalary(){
        return random(800, 3000);
    }


    static int generateFixedBugs(){
        return random(0, 30);
    }


    static int generateDefaultBugRate(){
        return random(0, 5);
    }


    public static Employee[] generateEmployees() {
        Random random = new Random();
        int size = male.length + female.length;
        int id = 0;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            String name = generateName();
            id++;
            String gender = generateGender(name);
            int age = generateAge();
            int salary = generateSalary();
            int fixedBugs = generateFixedBugs();
            int defaultBugRate = generateDefaultBugRate();

            double rate = random.nextInt(5);
            int workedDays = random.nextInt(30);
            String randomPosition = position[random.nextInt(position.length)];

            switch (randomPosition) {
                case "Designer" -> employees[i] = new Designer(id, name, age, salary, gender, rate, workedDays);
                case "Developer" -> employees[i] = new Developer(id, name, age, salary, gender, fixedBugs);
                case "Manager" -> employees[i] = new Manager(id, name, age, salary, gender);
            }
        }
    return employees;
}

}
