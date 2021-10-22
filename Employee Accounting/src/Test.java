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
    EmployeeService.printEmployees(service.getByName("Serhii"));
    System.out.println();
    System.out.println("-----------------Sort by name-----------------");
    service.sortByName();
    service.printEmployees();
    System.out.println();
    System.out.println("-----------------Sort by name and salary-----------------");
    service.sortByNameAndSalary();
    service.printEmployees();
    System.out.println();
    System.out.println("---------------edit-------------------");
    EmployeeService.printEmployees(service.edit(service.getById(1)));
    System.out.println();
    System.out.println("----------------printEmployees / edit------------------");
    service.printEmployees();
    System.out.println();
    System.out.println("----------------remove------------------");
    System.out.println("Removed " + service.remove((1L)));
    System.out.println();
    System.out.println("----------------printEmployees - remove------------------");
    service.printEmployees();
    System.out.println();
    System.out.println("----------------add------------------");
    System.out.println(service.add(EmployeeFactory.generateEmployees()[0]));
    System.out.println();
    System.out.println("----------------printEmployees + add------------------");
    service.printEmployees();
    System.out.println();
    System.out.println();




    }
}
