import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
    Employee[] employees = EmployeeFactory.generateEmployees();
    EmployeeService service = new EmployeeService(employees);


    System.out.println("----------------printEmployees------------------");
    service.printEmployees();
    System.out.println();
    System.out.println("----------------------------------");
    System.out.println("Salary to be paid this month - " + service.calculateSalary() + " USD");
    System.out.println("Bonuses to be paid this month - " + service.calculateBonus() + " USD");
    System.out.println("Sum to be paid this month - " + service.calculateSalaryBonus() + " USD");
    System.out.println();
    System.out.println("-----------------getById-----------------");
    EmployeeService.printEmployees(service.getById(1));
    System.out.println();
    System.out.println("-----------------getByName-----------------");
    System.out.println(Arrays.toString(service.getByName("Serhii")));
    System.out.println();
    System.out.println("-----------------Sort by name-----------------");
    System.out.println(Arrays.toString(service.sortByName()));
    System.out.println();
    System.out.println("-----------------Sort by name and salary-----------------");
    System.out.println(Arrays.toString(service.sortByNameAndSalary()));
    System.out.println();
    System.out.println("---------------edit-------------------");
    EmployeeService.printEmployees(service.edit(service.getById(1)));
    System.out.println();
    System.out.println("----------------remove------------------");
    System.out.println("Removed " + service.remove((1L)));
    System.out.println();
    System.out.println("----------------printEmployees------------------");
    service.printEmployees();
    System.out.println();
    System.out.println("----------------add------------------");
    System.out.println(service.add(service.getById(2)));
    System.out.println();
    System.out.println("----------------printEmployees------------------");
    service.printEmployees();
        System.out.println();
        System.out.println();
        //System.out.println(employees[0].getName());
        //System.out.println(EmployeeFactory.indexOf(employees, "Oleksandr"));
        //System.out.println(EmployeeFactory.addArrays());



    }
}
