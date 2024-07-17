package pro.sky25.service;

import pro.sky25.entity.Employee;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
}
