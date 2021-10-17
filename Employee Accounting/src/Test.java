import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
    EmployeeFactory employeeFactory = new EmployeeFactory();
    Employee[] employees = EmployeeFactory.generateEmployees();
    EmployeeService employeeService = new EmployeeService(EmployeeFactory.generateEmployees());
    EmployeeFactory.generateEmployees();
    employeeService.printEmployees();
    System.out.println("Salary to be paid this month - " + employeeService.calculateSalary() + " USD");
    System.out.println("Bonuses to be paid this month - " + employeeService.calculateBonus() + " USD");
    System.out.println("Sum to be paid this month - " + employeeService.calculateSalaryBonus() + " USD");
    System.out.println(employeeService.getById(1));
    System.out.println(Arrays.toString(employeeService.getByName("Serhii")));
    System.out.println(Arrays.toString(employeeService.sortByName()));
    System.out.println(Arrays.toString(employeeService.sortByNameAndSalary()));
    //System.out.println();



    }
}
