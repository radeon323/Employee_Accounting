import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
    EmployeeFactory employeeFactory = new EmployeeFactory();
    Employee[] employees = EmployeeFactory.generateEmployees();
    EmployeeService employeeService = new EmployeeService(EmployeeFactory.generateEmployees());
    //employeeFactory.generateEmployees();

    employeeService.printEmployees();
    System.out.println("Salary to be paid this month - " + employeeService.calculateSalary() + " USD");
    System.out.println("Bonuses to be paid this month - " + employeeService.calculateBonus() + " USD");
    System.out.println("Sum to be paid this month - " + employeeService.calculateSalaryBonus() + " USD");
    EmployeeService.printEmployees(employeeService.getById(1));
    System.out.println(Arrays.toString(employeeService.getByName("Serhii")));

    System.out.println("Sorted by name " +  Arrays.toString(employeeService.sortByName()));
    System.out.println("Sorted by name and salary " +  Arrays.toString(employeeService.sortByNameAndSalary()));

    EmployeeService.printEmployees(employeeService.edit(employeeService.getById(1)));
    System.out.println("Removed " + employeeService.remove((1L)));
    //System.out.println();



    }
}
