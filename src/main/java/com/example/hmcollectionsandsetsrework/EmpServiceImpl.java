package com.example.hmcollectionsandsetsrework;

import com.example.hmcollectionsandsetsrework.exception.EmployeeAlreadyAddedException;
import com.example.hmcollectionsandsetsrework.exception.EmployeeNotFoundException;
import com.example.hmcollectionsandsetsrework.exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    public final List<Employee> employeeList;

    public EmpServiceImpl(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public Employee add(String name, String surname) {
        if (employeeList.size() >= 10) {
            throw new EmployeeStorageIsFullException("Нельзя добавить работника, привышен придел");
        }
        Employee employee = new Employee(name, surname);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employeeList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return new ArrayList<>(employeeList);
    }
}
