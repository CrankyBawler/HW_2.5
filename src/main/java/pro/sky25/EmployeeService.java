package pro.sky25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {
    private static final int MAX_SIZE = 100;
    List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Бобров", "Ефим"),
            new Employee("Гуляев", "Тихон"),
            new Employee("Шашков", "Савели"),
            new Employee("Николаев", "Остап"),
            new Employee("Шаров", "Алексей"),
            new Employee("Вишнякова", "Дарья"),
            new Employee("Калашникова", "Астра"),
            new Employee("Беспалова", "Роксана"),
            new Employee("Лазарева", "Хильда"),
            new Employee("Уварова", "Дана")
    ));

    public void addEmpoyee(Employee employee) {
        employees.add(employee);

    }

    public void delEmployee(Employee employee) {
        employees.remove(employee);
    }

    public String getEmployee(Integer id) {
        final Employee employee;
        employee = employees.get(id);

        final String employeeDescriptoin = ""
                + employee.getFirstName() + " "
                + employee.getLastName();
        return employeeDescriptoin;


    }
}
