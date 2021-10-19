import java.util.Random;
import java.util.Arrays;


public class EmployeeFactory {

    static String[] male = {"Oleksandr", "Mykhailo", "Serhii", "Danylo", "Stepan"};
    static String[] female = {"Yevheniia", "Tetyana", "Nadiia"};

    static String[] addArrays() {
        String[] all = new String[male.length + female.length];
        int count = 0;
        for (int i = 0; i < male.length; i++) {
            all[count] = male[i];
            count++;
        }
        for (int i = 0; i < female.length; i++) {
            all[count] = female[i];
            count++;
        }
        return all;
    }




    static int random(int min, int max) {
        int delta = max - min;
        double random = Math.random();
        return (int) (random * delta + min);
    }

    static int generateId(){
        return new Random().nextInt(male.length + female.length);
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



    public static Employee[] generateEmployees() {
        int size = male.length + female.length;
        int count = 1;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            employees[i] = generateEmployee();
            employees[i].id = count;
            count++;
        }

        return employees;
    }


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

        //int id = 0;
        //int id = generateId();
        String name = generateName();
        int id = indexOf(name);
        String gender = generateGender(name);
        int age = generateAge();
        int salary = generateSalary();
        int fixedBugs = generateFixedBugs();
        int defaultBugRate = generateDefaultBugRate();
        return new Employee(id, name, age, salary, gender, fixedBugs, defaultBugRate);
        //return new Employee(id++, name, age, salary, gender, fixedBugs, defaultBugRate);
    }

}
