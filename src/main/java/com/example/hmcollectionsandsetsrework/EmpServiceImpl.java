package com.example.hmcollectionsandsetsrework;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    public final List<Employee> employeeList;

    public EmpServiceImpl(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public Employee add(String name, String surname) {
        Employee employee = new Employee(name, surname);
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
        return null;
    }

    @Override
    public Employee find(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employeeList.contains(employee)) {
            return employee;
        }
        return null;
    }
}
