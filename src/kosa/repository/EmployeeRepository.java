package kosa.repository;

import kosa.customer.Customer;
import kosa.employee.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeRepository {

    private static final Map<Long, Employee> store = new HashMap<>();
    private static long sequence = 0L;


    public Employee findById(long id) {
        return store.get(id);
    }


    public Employee save(Employee employee){
        employee.setEmployeeId(++sequence);
        store.put(employee.getEmployeeId(), employee);
        return employee;
    }

    public List<Employee> findByName(String name){
        List<Employee> employees = store.values().stream().filter(e -> e.getName().equals(name))
                .collect(Collectors.toList());
        
        return employees;
    }


    public void deleteEmployee(Employee employee){
        store.remove(employee.getEmployeeId());
    }

    public List<Employee> findAll(){
        List<Employee> employees = store.values().stream().collect(Collectors.toList());
        return employees;
    }

}
