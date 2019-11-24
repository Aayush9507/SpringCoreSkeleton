package service;

import entity.Employee;

public interface EmployeeService {

    void findAll();
    void findOne(String id);
    Employee create(Employee emp);
    Employee update(String id, Employee emp);
    void delete(String id);
}
