package service;

import domain.Employee;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }


    public void Save(Employee employee){
        employeeRepository.save(employee);
    }

//    public Employee update(Employee employee){
//        return employeeRepository.
//    }

    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }
}
