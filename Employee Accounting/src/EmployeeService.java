import java.util.*;

public class EmployeeService {


    //вывод на экран информации о сотрудниках

    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

     public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    // возвращает количество денег необходимое для выплаты зарплат для всех сотрудников в этом месяце
    // (пробегаем по всем сотрудникам, суммируем зарплату каждого с бонусом каждого)

    double calculateSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.salary();
        }
        return sum;
    }

    double calculateBonus() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.calculateBonus();
        }
        return sum;
    }

    double calculateSalaryBonus() {
        return calculateSalary() + calculateBonus();
    }


    //возвращает сотрудника по заданному id

    Employee getById(long id){
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }
        return null;
    }


    // возвращает сотрудника по заданному имени

    Employee[] getByName(String name) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Employee[] moreThanOne = new Employee[count];
        int index = 0;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                moreThanOne[index] = employee;
                index++;
            }
        }
        return moreThanOne;
    }

    // сортування по імені
    Employee[]  sortByName() {
        Arrays.sort(employees, Comparator.comparing(Employee::getName));
        return employees;
    }


    // возвращают отсортированный массив с сотрудниками по критерию
    Employee[] sortByNameAndSalary() {
        Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::salary));
        return employees;
    }


    // находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.
    //Employee edit(Employee);


    // находит сотрудника по id, и удаляет его из массива. Возвращает ссылку на удаленного сотрудника.
    //Employee remove(long id);
}
