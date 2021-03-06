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


    public static Employee[] generateEmployees() {
        Random random = new Random();
        int size = male.length + female.length;
        int id = 0;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            String name = generateName();
            id++;
            String gender = generateGender(name);
            int age = random(18, 60);
            int salary = random(800, 3000);
            int fixedBugs = random(0, 30);
            int defaultBugRate = random(0, 5);

            double rate = random(1, 5);
            int workedDays = random(22, 31);
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
