public class Manager extends Employee{

    Manager (int id, String name, int age, int salary, String gender){
        super(id, name, age, salary, gender);
    }

    @Override
    public String toString() {
        return super.toString() + ", position: manager ";
    }
}