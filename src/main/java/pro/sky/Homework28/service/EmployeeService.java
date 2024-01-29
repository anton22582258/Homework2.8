package pro.sky.Homework28.service;

import pro.sky.Homework28.Employee;
import pro.sky.Homework28.exception.EmployeeAlreadyAddedInListException;
import pro.sky.Homework28.exception.EmployeeNotFoundException;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName, double salary, int department) throws EmployeeAlreadyAddedInListException;

    Employee remove(String firstName, String lastName, double salary, int department) throws EmployeeNotFoundException;

    Employee find(String firstName, String lastName, double salary, int department) throws EmployeeNotFoundException;

    public Collection<Employee> getAll();

    public String createKey(String firstName, String lastName);

}
