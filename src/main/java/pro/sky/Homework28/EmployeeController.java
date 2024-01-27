package pro.sky.Homework28;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/all")
    public Collection<Employee> all() {
        return employeeService.getAll();
    }

    @GetMapping(path = "/add")
    public Employee add(String firstName, String lastName, double salary, int department) throws EmployeeAlreadyAddedInListException {
        return employeeService.add(firstName, lastName, salary, department);
    }

    @GetMapping(path = "/remove")
    public Employee remove(String firstName, String lastName, double salary, int department) throws EmployeeNotFoundException {
        return employeeService.remove(firstName, lastName, salary, department);
    }

    @GetMapping(path = "/find")
    public Employee find(String firstName, String lastName, double salary, int department) throws EmployeeNotFoundException {
        return employeeService.find(firstName, lastName, salary, department);
    }


}



