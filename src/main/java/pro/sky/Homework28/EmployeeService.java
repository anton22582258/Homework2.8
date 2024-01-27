package pro.sky.Homework28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public interface EmployeeService {

    Employee add(String firstName, String lastName, double salary, int department) throws EmployeeAlreadyAddedInListException;

    Employee remove(String firstName, String lastName, double salary, int department) throws EmployeeNotFoundException;

    Employee find(String firstName, String lastName, double salary, int department) throws EmployeeNotFoundException;

    public Collection<Employee> getAll();

    public String createKey(String firstName, String lastName);

}
