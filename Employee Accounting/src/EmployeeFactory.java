import java.util.Random;


public class EmployeeFactory {

    static String[] position = {"Designer", "Developer", "Manager"};
    static String[] male = {"Oleksandr", "Mykhailo", "Serhii", "Danylo", "Stepan"};
    static String[] female = {"Yevheniia", "Tetyana", "Nadiia"};

    static String[] addArrays() {
        String[] allEmployees = new String[male.length + female.length];
        int count = 0;
        for (String s : male) {
            allEmployees[count] = s;
            count++;
        }
        for (String s : female) {
            allEmployees[count] = s;
            count++;
        }
        return allEmployees;
    }


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


    // generate ID
    public static int indexOf(String name){
        String[] namesOfEmployees = addArrays();
        for(int index = 0; index < namesOfEmployees.length; index++){
            if(namesOfEmployees[index].contains(name)){
                return index;
            }
        }
        return -1;
    }



   public static Employee generateEmployee() {
        String name = generateName();
        int id = indexOf(name);
        String gender = generateGender(name);
        int age = generateAge();
        int salary = generateSalary();
        int fixedBugs = generateFixedBugs();
        int defaultBugRate = generateDefaultBugRate();
        return  new Employee(id, name, age, salary, gender, fixedBugs, defaultBugRate);
    }

    public static Employee[] generateEmployees() {
        Random random = new Random();
        int size = addArrays().length;
        int count = 1;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            employees[i] = generateEmployee();

            double rate = random.nextInt(5);
            int workedDays = random.nextInt(30);
            String randomPosition = position[random.nextInt(position.length)];

            switch (randomPosition) {
                case "Designer" -> employees[i] = new Designer(generateEmployee().id, generateEmployee().name, generateEmployee().age, generateEmployee().salary, generateEmployee().gender, rate, workedDays);
                case "Developer" -> employees[i] = new Developer(generateEmployee().id, generateEmployee().name, generateEmployee().age, generateEmployee().salary, generateEmployee().gender, generateEmployee().fixedBugs);
                case "Manager" -> employees[i] = new Manager(generateEmployee().id, generateEmployee().name, generateEmployee().age, generateEmployee().salary, generateEmployee().gender);
            }

            employees[i].id = count;
            count++;
        }
        return employees;
    }

}
