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
    //Employee getById(long);


    // возвращает сотрудника по заданному имени
    //Employee[] getByName(String);


    //Employee[] sortByName();


    // возвращают отсортированный массив с сотрудниками по критерию
    //Employee[] sortByNameAndSalary();


    // находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.
    //Employee edit(Employee);


    // находит сотрудника по id, и удаляет его из массива. Возвращает ссылку на удаленного сотрудника.
    //Employee remove(long id);
}
