import java.util.Random;

public class Test {
    public static void main(String[] args) {
    EmployeeFactory employeeFactory = new EmployeeFactory();
    Employee[] employees = EmployeeFactory.generateEmployees(7);
    EmployeeService employeeService = new EmployeeService(EmployeeFactory.generateEmployees(7));
    employeeService.printEmployees();
    System.out.println("Salary to be paid this month - " + employeeService.calculateSalary() + " USD");
    System.out.println("Bonuses to be paid this month - " + employeeService.calculateBonus() + " USD");
    System.out.println("Sum to be paid this month - " + employeeService.calculateSalaryBonus() + " USD");
    //System.out.println();



    }
}
