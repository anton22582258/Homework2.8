package pro.sky.Homework28.service;

import pro.sky.Homework28.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee minSalaryFind(int departmentId);

    Employee maxSalaryFind(int departmentId);

    List<Employee> getEmployeesByDepartment(int departmentId);

    Map<Integer, List<Employee>> getEmployeesGrouped();
}


